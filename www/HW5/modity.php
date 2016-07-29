<?php
/**
 * Created by PhpStorm.
 * User: dubo
 * Date: 16/6/4
 * Time: 下午4:10
 */

define('MYSQL_HOST','localhost:3306');
define('MYSQL_USER','s404410905');
define('MYSQL_PW','s404410905');
$conn =  mysql_connect(MYSQL_HOST,MYSQL_USER,MYSQL_PW);
if(!$conn){
    echo ('can not connect db');
}

mysql_select_db('s404410905');
$sql="SELECT * FROM Article where id=".$_POST['article_id'].";";
mysql_query("set names utf8");
$result=mysql_query($sql);
$row=mysql_fetch_array($result);
$title=$row['title'];