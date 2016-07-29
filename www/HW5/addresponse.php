<?php
/**
 * Created by PhpStorm.
 * User: dubo
 * Date: 16/6/4
 * Time: 下午1:42
 */
Date_default_timezone_set("PRC");
$date=date("Y-m-d H:i:s");
define('MYSQL_HOST','localhost:3306');
define('MYSQL_USER','s404410905');
define('MYSQL_PW','s404410905');
$conn =  mysql_connect(MYSQL_HOST,MYSQL_USER,MYSQL_PW);
if(!$conn){
    echo ('can not connect db');
}

mysql_select_db('s404410905');
$article_id=$_POST['article_id'];
$author_id=$_POST['author_id'];
$message=$_POST['response'];
$sql="insert into Response (article_id,user_id,message,timestamp)VALUES ('$article_id','$author_id','$message','$date')";
$sql2="update Article set last_update='$date' where id='$article_id'";


mysql_query("set names utf8");
mysql_query($sql);
mysql_query($sql2);
mysql_close($conn);
echo $article_id;

?>