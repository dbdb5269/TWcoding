<?php
session_start();
if($_SESSION['id']=="") {
    echo "<script>alert('请通过正确的途径登录本系统！');location.href='login.php';</script>";//替换成要跳转的网址；
    exit;//终止程序继续执行
}
Date_default_timezone_set("PRC");
$date=date("Y-m-d H:i:s");
$id=$_SESSION['id'];
if(!isset($_GET['article_id'])&&($_POST['newtitle'])!=null){
    define('MYSQL_HOST','localhost:3306');
    define('MYSQL_USER','s404410905');
    define('MYSQL_PW','s404410905');

    $conn =  mysql_connect(MYSQL_HOST,MYSQL_USER,MYSQL_PW);
    if(!$conn){
        echo ('can not connect db');
    }

    mysql_select_db('s404410905');

    $title=$_POST['newtitle'];
    $content=$_POST['content'];
    $sql="insert into Article (author_id,title,content,created_time,last_update) values('$id','$title','$content','$date','$date')";

    mysql_query("set names utf8");
    mysql_query($sql);
    $select = "select LAST_INSERT_ID() as article_id";
    $result = mysql_query($select);
    $rows = mysql_fetch_row($result);
    mysql_close($conn);
    echo "<script>alert('发布成功');location.href=\"./index.php?article_id=".$rows[0]."\";</script>";

}
if($_POST['title']!=null){
    define('MYSQL_HOST','localhost:3306');
    define('MYSQL_USER','s404410905');
    define('MYSQL_PW','s404410905');
    $conn =  mysql_connect(MYSQL_HOST,MYSQL_USER,MYSQL_PW);
    if(!$conn){
        echo ('can not connect db');
    }
    mysql_select_db('s404410905');
    $id=$_POST['article_id'];
    $title=$_POST['title'];
    $content=$_POST['content'];
    $last_update=$date;

    $update = "update Article set title='".$_POST['title']."', content='".$_POST['content']."',last_update='".$date."' where id='".$_POST['article_id']."'";

    if(false==mysql_query($update)){
        echo 'shibai！';
    }
     mysql_query("set names utf8");
    mysql_query($update);
    echo "<script>alert('更新成功');location.href=\"./index.php?article_id=".$_POST['article_id']."\";</script>";


    mysql_close($database);


}



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
                <li><a href="login.php?clear=1">Logout</a></li>

            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>

<div class="container theme-showcase" role="main" style="margin-top: 5%;">
    <div class=" col-md-offset-4 col-md-4">
        <?php
        if(!isset($_GET['article_id'])){
            echo "<h1>发表新主题</h1> 
                <form action=\"home.php\" method=\"post\">
                标题:<input type=\"text\" class=\"form-control\" name=\"newtitle\" placeholder=\"标题\" >
                内容:<textarea  class=\"form-control\" name=\"content\" style=\"height: 200px\" placeholder=\"内容\"></textarea><br/>
                <input type=\"submit\" class=\"btn btn-success\" value=\"发布\"> |
                <a href=\"index.php\"><input type=\"button\" class=\"btn btn-danger\" value=\"返回\"></a>
                </form>";
        }
        else{
            define('MYSQL_HOST','localhost:3306');
            define('MYSQL_USER','s404410905');
            define('MYSQL_PW','s404410905');
            $conn =  mysql_connect(MYSQL_HOST,MYSQL_USER,MYSQL_PW);
            if(!$conn){
                echo ('can not connect db');
            }

            mysql_select_db('s404410905');
            $sql="SELECT * FROM Article where id=".$_GET['article_id'].";";
             mysql_query("set names utf8");
            $result=mysql_query($sql);
            $row=mysql_fetch_array($result);
            $title=$row['title'];

            echo "<h1>修改主题</h1> 
                <form action=\"home.php\" method=\"post\">
                标题:<input type=\"text\" class=\"form-control\" name=\"title\" value='$title'>
                内容:<textarea  class=\"form-control\" name=\"content\" style=\"height: 200px\">".$row['content']."</textarea><br/>
                <input type=\"hidden\" value=\"".$_GET['article_id']."\" name='article_id'>
                <input type=\"submit\" class=\"btn btn-success\" value=\"发布\"> |
                <a href=\"index.php\"><input type=\"button\" class=\"btn btn-danger\" value=\"返回\"></a>
                </form>";
        }
        ?>
    </div>
    

</div> <!-- /container -->


</body>
</html>
