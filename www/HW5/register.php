<?php
session_start();
$error =1;
$username=$_POST['username'];

$Email=$_POST['Email'];
$PassWord=$_POST['PassWord'];
$PassWordAgain=$_POST['PassWordAgain'];
$bool1=$username&& $Email && $PassWord && $PassWordAgain;
$bool2=!isset($username) && !isset($Email) && !isset($PassWord) && !isset($PassWordAgain);
if($bool1){
    $sql = "select * from user where Email='$Email'";
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
        $error = "Warning! 此邮箱帐号已被注册";
    else{
        if($PassWord !=$PassWordAgain)
        {
            $error = "Warning! 密码与确认密码不同";
        }
        else{
            $sql="INSERT INTO user(Name,Email,Password) VALUES ('$username','$Email','$PassWord')";
            mysql_query("set names utf8");
            $result=mysql_query($sql);

            mysql_query("set names utf8");
            $result = mysql_query("select * from user where Email='$Email'");

            $row = mysql_fetch_array($result);
            $_SESSION['id'] = $row['id'];

            mysql_close($conn);
        }
    }
}

else
{
    $error = "Warning! 请确保填写所有栏位";
}

echo $error;

?>

