<?php
/**
 * Created by PhpStorm.
 * User: dubo
 * Date: 16/6/4
 * Time: 下午5:42
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
$id=$_POST['article_id'];
$title=$_POST['newtitle'];
$content=$_POST['content'];
$last_update=$date;

$update = "update Article set title='".$_POST['newtitle']."', content='".$_POST['content']."',last_update='".$date."' where id='".$_POST['article_id']."'";

if(false==mysql_query($update)){
    echo 'shibai！';
}
mysql_query("set names utf8");
mysql_query($update);





echo $x;