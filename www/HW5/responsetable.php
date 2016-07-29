<?php
/**
 * Created by PhpStorm.
 * User: dubo
 * Date: 16/6/4
 * Time: 下午2:39
 */
$article_id=$_POST['article_id'];

define('MYSQL_HOST','localhost:3306');
define('MYSQL_USER','s404410905');
define('MYSQL_PW','s404410905');
$conn =  mysql_connect(MYSQL_HOST,MYSQL_USER,MYSQL_PW);
if(!$conn){
    echo ('can not connect db');
}

mysql_select_db('s404410905');
$mes="select Response.*,user.Name from Response left join user 
	on Response.user_id = user.id where article_id='$article_id' order by Response.timestamp desc";
mysql_query("set names utf8");
$result=mysql_query($mes);
$ans = "";
$data;
while($row = mysql_fetch_array($result)) {
    
    $data[] = $row;
}
echo json_encode($data);