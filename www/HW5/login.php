<?php
session_start();
?>

<?php

extract($_POST);

$bool1=$Email&&$PassWord;
$bool2=!isset($Email)&&!isset($PassWord);
if(isset($_GET['clear']) && $_GET['clear'])
    session_destroy();
if($bool1){
    define('MYSQL_HOST','localhost:3306');
    define('MYSQL_USER','s404410905');
    define('MYSQL_PW','s404410905');
    $conn =  mysql_connect(MYSQL_HOST,MYSQL_USER,MYSQL_PW);
    if(!$conn){
        echo ('can not connect db');
    }

    mysql_select_db('s404410905');
    mysql_query("set names utf8");
    $result = mysql_query("select * from user where Email='".mysql_real_escape_string($Email)."'");
    $row = mysql_fetch_array($result);
    $num_rows =mysql_num_rows($result);
    if($num_rows==0){
        $error='此Email不存在';
    }
    else if($PassWord!=$row['Password']){
        $error='密码错误';
    }
    else{
        $_SESSION['id'] = $row['id'];
        mysql_close($conn);
        echo "<script>alert('login succeed');location.href=\"index.php\";</script>";
    }
}
else if($bool2){
    $error="";

}
else{
    $error='请输入所有的栏位';
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">

    <title>Theme Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.js"></script>
    <script src="js/myjs.js"></script>

    <link href="css/theme.css" rel="stylesheet">
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
                <li class="active"><a href="home.php">Home</a></li>
                <li><a href="login.php">Login</a></li>

            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>

<div class="container theme-showcase" role="main">

    <!-- Main jumbotron for a primary marketing message or call to action -->

    <div class="jumbotron">
        <h1>请输入Email与密码</h1>
        
        <form action="login.php" method="post">
            Email:<input type="text" class="form-control" name="Email" style="width: 300px">
            密码:<input type="password" class="form-control" name="PassWord" style="width: 300px"><br/>
            <input type="submit" class="btn btn-lg btn-success" value="登录">
        </form>
        <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
            register
        </button>

        <!-- Modal -->
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    
                    <div class="modal-body">
                        <div class="page-header">
                            <h1>注册新的账号</h1>
                        </div>

                        <form method="post" id="registerform" >
                            <div class="form-group">
                                <label>UserName</label><br/>
                                <input type="text" class="form-control" name="username" placeholder="UserName" id="exampleInputName2">
                            </div>
                            <div class="form-group">
                                <label>Email</label><br/>
                                <input type="text" class="form-control" name="Email" placeholder="Email">
                            </div>

                            <div class="form-group">
                                <label>PassWord</label><br/>
                                <input type="password" class="form-control" name="PassWord" placeholder="PassWord">
                            </div>
                            <div class="form-group">
                                <label>PassWordAgain</label><br/>
                                <input type="password" class="form-control" name="PassWordAgain" placeholder="PassWordAgain">
                            </div>
                            <div id="error"></div>
                            <a href="login.php"> <input type="button" class="btn btn-lg btn-danger" value="cancel"></a>
                            <input type="button" class="btn btn-lg btn-success" value="register" id="register">
                        </form>
                    </div>
                    
                </div>
            </div>
        </div>
        <?php

        echo "<div  style='width: 400px'><label style='color: #c8343f;'>$error</label></div>"
        ?>

    </div>





</div> <!-- /container -->


</body>
</html>
