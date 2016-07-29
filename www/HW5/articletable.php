<?php
/**
 * Created by PhpStorm.
 * User: dubo
 * Date: 16/6/4
 * Time: 下午4:27
 */
$x=1;
$author_id=$_POST['id'];
$article_id=$_POST['article_id'];
define('MYSQL_HOST','localhost:3306');
define('MYSQL_USER','s404410905');
define('MYSQL_PW','s404410905');
$conn =  mysql_connect(MYSQL_HOST,MYSQL_USER,MYSQL_PW);
if(!$conn){
    echo ('can not connect db');
}

mysql_select_db('s404410905');

if(!isset($_POST['article_id']) &&isset($_POST['id'])){

    $sql="select * from(
                    SELECT `Article`.*, `user`.`Name`, COUNT(`Response`.`id`) AS `count`
                    FROM `Article`
                    INNER JOIN `user` ON `Article`.`author_id`=`user`.`id`
                    LEFT JOIN `Response` ON `Article`.`id`=`Response`.`article_id`
                    GROUP BY `Article`.`id` ORDER BY `Article`.`last_update` DESC) COUNT where author_id=$author_id limit 5;";
    mysql_query("set names utf8");
    $result = mysql_query($sql);
    $data;

    while($row = mysql_fetch_array($result)) {

        $data[] = $row;
    }

    mysql_close($conn);

    echo json_encode($data);
}
else if(!isset($_POST['article_id'])&&!isset($_POST['id'])){
    $sql="SELECT `Article`.*, `user`.`Name`, COUNT(`Response`.`id`) AS `count`
                      FROM `Article`
                      INNER JOIN `user` ON `Article`.`author_id`=`user`.`id`
                      LEFT JOIN `Response` ON `Article`.`id`=`Response`.`article_id`
                      GROUP BY `Article`.`id` ORDER BY `Article`.`last_update` DESC";
    mysql_query("set names utf8");
    $result= mysql_query($sql);
    $data;

    while($row = mysql_fetch_array($result)) {

        $data[] = $row;
    }

    mysql_close($conn);

    echo json_encode($data);
}
else if(isset($_POST['article_id'])){
    $query = "select * from Article where id = $article_id";
    mysql_query("set names utf8");
    $result= mysql_query($query);
    $data;

    while($row = mysql_fetch_array($result)) {

        $data[] = $row;
    }

    mysql_close($conn);

    echo json_encode($data);
}

