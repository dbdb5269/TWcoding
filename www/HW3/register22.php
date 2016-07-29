<?php
    session_start();
    extract($_POST);
$bool1=$username&& $Email && $PassWord && $PassWordAgain;
$bool2=!isset($username) && !isset($Email) && !isset($PassWord) && !isset($PassWordAgain);
if($bool1){
    $sql = "select * from user where Name='$username'";
    define('MYSQL_HOST','localhost:3306');
    define('MYSQL_USER','s404410905');
    define('MYSQL_PW','s404410905');
    $conn =  mysql_connect(MYSQL_HOST,MYSQL_USER,MYSQL_PW);
    if(!$conn){
        echo ('can not connect db');

    }

    mysql_select_db('s404410905');
    $result = mysql_query($sql);

    if(mysql_num_rows($result))
        $error = "Warning! 此帐号已被注册";
    else{
        if($PassWord !=$PassWordAgain)
        {
            $error = "Warning! 密码与确认密码不同";
        }
        else{
            mysql_query("set names utf8");
            mysql_query("INSERT INTO user(Name,Email,Password) VALUES ('$username','$Email','$PassWord')");
                mysql_query("set names utf8");
                $result = mysql_query("select * from user where Email='$Email'");
                $row = mysql_fetch_array($result);
                $_SESSION['id'] = $row['id'];

                mysql_close($conn);
                echo "<script>alert('register succeed');location.href=\"index.php\";</script>";

        }
    }
}
else if($bool2)
{
    $error = "";
}
else
{
    $error = "Warning! 请确保填写所有栏位";
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">

    <title>Theme Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <link href="css/theme.css" rel="stylesheet">
<!--    <link href="my.css" rel="stylesheet">-->
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

    <div class="page-header">
        <h1>注册新的账号</h1>
    </div>
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <form method="post" action="./register.php" >
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
                <?php
                if(isset($error) && $error != ""){
                    echo "<div  ><label style='color: #c8343f;'>$error</label></div><br/>";
                }
                ?>
                <a href="login.php"> <input type="button" class="btn btn-lg btn-danger" value="cancel"></a>
                <input type="submit" class="btn btn-lg btn-success" value="register">
            </form>
        </div>
    </div>
</div>
<!-- /container -->


</body>
</html>
