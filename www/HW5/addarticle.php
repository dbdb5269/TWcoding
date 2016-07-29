<?php
/**
 * Created by PhpStorm.
 * User: dubo
 * Date: 16/6/4
 * Time: 下午2:23
 */
$x=1;
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
$author_id=$_POST['author_id'];
$title=$_POST['newtitle'];
$content=$_POST['content'];
$sql="insert into Article (author_id,title,content,created_time,last_update) values('$author_id','$title','$content','$date','$date')";

mysql_query("set names utf8");
mysql_query($sql);
$select = "select LAST_INSERT_ID() as article_id";
$result = mysql_query($select);
$rows = mysql_fetch_row($result);
mysql_close($conn);

echo $x;