<?php
session_start();
if($_SESSION['id']=="") {
  echo "<script>alert('请通过正确的途径登录本系统！');location.href='login.php';</script>";//替换成要跳转的网址；
  exit;//终止程序继续执行
}

$author_id=$_SESSION['id'];
define('MYSQL_HOST','localhost:3306');
define('MYSQL_USER','s404410905');
define('MYSQL_PW','s404410905');
$conn =  mysql_connect(MYSQL_HOST,MYSQL_USER,MYSQL_PW);
if(!$conn){
  echo ('can not connect db');
}

mysql_select_db('s404410905');

$sql="select Name from user where id=$author_id;";
mysql_query("set names utf8");
$result=mysql_query($sql);
$row=mysql_fetch_array($result);
mysql_close($conn);
$Name=$row['Name'];
Date_default_timezone_set("PRC");
$date=date("Y-m-d H:i:s");

?>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">

    <title>Theme Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <link href="theme.css" rel="stylesheet">
  </head>

  <body role="document">

    <!-- Fixed navbar -->
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <a class="navbar-brand" href="#">Mrdubo</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="index.php">Home</a></li>
            <li><a href="login.php?clear=1">logout</a></li>

          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container theme-showcase" role="main" style="margin-top: 5%;">


      <div class="col-md-12">

        <?php
        if(isset($_POST['response'])){

          define('MYSQL_HOST','localhost:3306');
          define('MYSQL_USER','s404410905');
          define('MYSQL_PW','s404410905');
          $conn =  mysql_connect(MYSQL_HOST,MYSQL_USER,MYSQL_PW);
          if(!$conn){
            echo ('can not connect db');
          }

          mysql_select_db('s404410905');
          $article_id=$_POST['article_id'];
          $message=$_POST['response'];
          $sql="insert into Response (article_id,user_id,message,timestamp)VALUES ('$article_id','$author_id','$message','$date')";
          $sql2="update Article set last_update='$date' where id='$article_id'";


          mysql_query("set names utf8");
          mysql_query($sql);
          mysql_query($sql2);
          mysql_close($conn);
          echo "<script>alert('回复成功！');location.href='index.php?article_id=".$_POST['article_id']."';</script>";
        }









        if(!isset($_GET['article_id'])){
          echo "<h3>welcome back $Name</h3>";
          echo "<h2 style=\"float:left\">您最近发表/被留言的文章</h2>";
          echo "<a href=\"home.php\"><button type=\"button\" class=\"btn btn-success\" style=\"float: right;margin-top: 2%\">发表新文章</button></a>";
          define('MYSQL_HOST','localhost:3306');
          define('MYSQL_USER','s404410905');
          define('MYSQL_PW','s404410905');
          $conn =  mysql_connect(MYSQL_HOST,MYSQL_USER,MYSQL_PW);
          if(!$conn){
            echo ('can not connect db');
          }

          mysql_select_db('s404410905');
          $sql="select * from(
                SELECT `Article`.*, `user`.`Name`, COUNT(`Response`.`id`) AS `count`
                FROM `Article`
                INNER JOIN `user` ON `Article`.`author_id`=`user`.`id`
                LEFT JOIN `Response` ON `Article`.`id`=`Response`.`article_id`
                GROUP BY `Article`.`id` ORDER BY `Article`.`last_update` DESC) COUNT where author_id=$author_id limit 5;";
          mysql_query("set names utf8");
          $result = mysql_query($sql);
          $sql2="SELECT `Article`.*, `user`.`Name`, COUNT(`Response`.`id`) AS `count`
                  FROM `Article`
                  INNER JOIN `user` ON `Article`.`author_id`=`user`.`id`
                  LEFT JOIN `Response` ON `Article`.`id`=`Response`.`article_id`
                  GROUP BY `Article`.`id` ORDER BY `Article`.`last_update` DESC";
          mysql_query("set names utf8");
          $result2= mysql_query($sql2);
          mysql_close($conn);
          echo "    <div class=\"row\">
                    <div class=\"col-md-12\">
                      <table class=\"table\">
                        <thead>
                            <tr>
                              <th>发表日期</th>
                              <th>Author</th>
                              <th>Title</th>
                              <th>回复</th>
                              <th>最后更新/回复</th>
                            </tr>
                        </thead>
                        <tbody>";

                        while($row = mysql_fetch_array($result)) {

                          echo "                <tr>
                           <td>".$row['created_time']."</td>
                           <td>".$row['Name']."</td>
                           <td><a href='index.php?article_id=".$row['id']."'>".$row['title']."</a> </td>
                           <td>".$row['count']."</td>
                           <td>".$row['last_update']."</td>
                           </tr>
                          ";

                        }
          echo"              </tbody>
                      </table>
                    </div>
                  </div>";

          echo "    <div class=\"row\">
                    <div class=\"col-md-12\">
                      <table class=\"table\">
                        <thead>
                            <tr>
                              <th>发表日期</th>
                              <th>Author</th>
                              <th>Title</th>
                              <th>回复</th>
                              <th>最后更新/回复</th>
                            </tr>
                        </thead>
                        <tbody>";
          while($row = mysql_fetch_array($result2)) {

            echo "                 <tr>
                           <td>".$row['created_time']."</td>
                           <td>".$row['Name']."</td>
                            <td><a href='index.php?article_id=".$row['id']."'>".$row['title']."</a> </td>
                           <td>".$row['count']."</td>
                           <td>".$row['last_update']."</td>
                           </tr>
                          ";

          }
          echo"              </tbody>
                      </table>
                    </div>
                  </div>";




        }else{
          if($_GET['delete']==1){
            $query = "select * from article where id = '".$_GET['article_id']."'";
            define('MYSQL_HOST','localhost:3306');
            define('MYSQL_USER','s404410905');
            define('MYSQL_PW','s404410905');
            $conn =  mysql_connect(MYSQL_HOST,MYSQL_USER,MYSQL_PW);
            if(!$conn){
              echo ('can not connect db');
            }

            mysql_select_db('s404410905');
            $result = mysql_query($query);
            

            
            $dele1 = "delete from Response where Response.article_id = '".$_GET['article_id']."'";
            mysql_query($dele1);
            if(false!==mysql_query($dele1)){
              echo 'response deleted succeed！';
            }
            $dele = "delete from Article where id = '".$_GET['article_id']."'";
            mysql_query($dele);
            mysql_close($conn);
            echo "<script>alert('删除成功');window.location.href=\"./index.php\"</script>";

          }
          $article_id=$_GET['article_id'];
          define('MYSQL_HOST','localhost:3306');
          define('MYSQL_USER','s404410905');
          define('MYSQL_PW','s404410905');
          $conn =  mysql_connect(MYSQL_HOST,MYSQL_USER,MYSQL_PW);
          if(!$conn){
            echo ('can not connect db');
          }

          mysql_select_db('s404410905');
          $sql="select * from(
                SELECT `Article`.*, `user`.`Name`, COUNT(`Response`.`id`) AS `count`
                FROM `Article`
                INNER JOIN `user` ON `Article`.`author_id`=`user`.`id`
                LEFT JOIN `Response` ON `Article`.`id`=`Response`.`article_id`
                GROUP BY `Article`.`id` ORDER BY `Article`.`last_update` DESC) COUNT where id=$article_id";

          $mes="select * from Response where article_id=$article_id ORDER BY timestamp DESC";
          mysql_query("set names utf8");
          $result= mysql_query($sql);
          $result2=mysql_query($mes);

          $row=mysql_fetch_array($result);
          $author=$row['author_id'];


          echo "   <div class='row'>   <div class=\"col-md-12\">
        <h2 style=\"float:left\">".$row['title']."</h2>";
        if($author==$author_id){
          echo "<a href=\"index.php?article_id=".$row['id']."&delete=1\"><button type=\"button\" class=\"btn btn-danger\" style=\"float: right;margin-top: 2%\">删除</button></a>
        <a href=\"home.php?article_id=".$row['id']."&modify=1\"><button type=\"button\" class=\"btn btn-info\" style=\"float: right;margin-top: 2%\">修改</button></a>";
        $real_name_sql="";

          
          mysql_close($conn);
        }


      echo"   
      </div>
      </div>
      <div class=\"col-md-12\"><p style=\"font-size:15px;color: #ababab;\">".$row['Name']." update is on ".$row['last_update']."</p></div>
      <hr class=\"featurette-divider\">
      </br>
      </br>
      </br>
      <div class=\"col-md-12\"><p style=\"font-size:15px\">".$row['content']."</p></div>
      
      </br>
      </br>
      </br>
      
        <h2 >Response</h2>
        <div class='row'>   
        <div class=\"col-md-12\">
        <form action='index.php' method='post'>
          <p style=\"float: left;font-size: 25px\">".$Name.":</p><input type='text' class='form-control' name=\"response\" placeholder=\"Give a comment to this article.\" style=\"width: 300px\">
          <input type=\"hidden\" value=\"".$_GET['article_id']."\" name='article_id'>
          <input type=\"submit\" value=\"提交\" class=\" btn btn-success\" > 
        </form>
        </div>
      </div>
      ";
          echo"
          <h3>Messages</h3>
                   <div >
                <table class=\"table table-striped\">
                  <tbody>
      ";

        while($row2 = mysql_fetch_array($result2)) {
          $message2=$row2['message'];
          $time=$row2['timestamp'];
          $user_id=$row2['user_id'];
          define('MYSQL_HOST','localhost:3306');
          define('MYSQL_USER','s404410905');
          define('MYSQL_PW','s404410905');
          $conn =  mysql_connect(MYSQL_HOST,MYSQL_USER,MYSQL_PW);
          if(!$conn){
            echo ('can not connect db');
          }

          mysql_select_db('s404410905');
          $name_id="select Name from user where id=$user_id";
          mysql_query("set names utf8");
          $result3= mysql_query($name_id);
          $row3=mysql_fetch_array($result3);
          $name=$row3['Name'];
          echo "            
 
                  <tr class=\"col-md-11\" style=\"margin-left: 5%\"><td class=\"col-md-1\" >
                      $name:
                    </td>
                    <td class=\"col-md-8\">
                      $message2
                    </td>
                    <td class=\"col-md-2\">
                     $time
                    </td></tr>


                    
";
        }
        echo "            </tbody>
                </table>
              </div>";
        }

        ?>
      </div>




    </div> <!-- /container -->




  </body>
</html>
