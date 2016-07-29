/**
 * Created by dubo on 16/5/21.
 */
function chose(element){
    var x = document.getElementsByClassName("end");
    if(x.length > 0)
    {
        x[0].className = "";
    }
    var x = document.getElementsByClassName("active");

    if(x.length > 0)
    {
        x[0].style.border="solid 2px white";
        x[0].className = "end";
    }
    element.className = "active";
    element.style.border="solid 2px #5cb85c";
}
var plane_src
function setimg(){
    var getimg=document.getElementsByClassName("active");
    plane_src= getimg[0].src;
   // console.log(plane_src);

}
var enemysrc="img/airenemy.png"

var air={

    x:0,
    y:0
}


var timer1;
var timer2;
var timer3;
var timer4;
var timer5;
var timer6;
var timer7;
var score=0;
var live=1;
var distance=100;
var airArray= new Array()
for(var i=0;i<10;i++){
    airArray[i]=new Array();
    airArray[i][0]=0;
    airArray[i][1]=0;
    airArray[i][2]=0;
}
var missileArray_l= new Array()
for(var i=0;i<10;i++){
    missileArray_l[i]=new Array();
    missileArray_l[i][0]=0;
    missileArray_l[i][1]=0;
    missileArray_l[i][2]=0;
}
var missileArray_r= new Array()
for(var i=0;i<10;i++){
    missileArray_r[i]=new Array();
    missileArray_r[i][0]=0;
    missileArray_r[i][1]=0;
    missileArray_r[i][2]=0;
}

var bullet= new Array()
for(var i=0;i<12;i++){
    bullet[i]=new Array();
    bullet[i][0]=0;
    bullet[i][1]=0;
    bullet[i][2]=0;
}
var bullet_id=0;
var bulletNum=0
var air_id=0;
var airNum=0;

var missile_id=0;
var missileNum_r=0;
var missileNum_l=0;
//console.log(airArray[1][1]);
function draw(){
    var c=document.getElementById("flight");
    var context = c.getContext("2d");
    var img=new Image();
    img.src=plane_src;
    img.onload=function(){
    context.clearRect(air.x-10,air.y-10,70,70);
    context.drawImage(img, air.x, air.y,50,50);
    }
}
function clear(){
    var c=document.getElementById("flight");
    var context = c.getContext("2d");
    context.clearRect(0,0,6000,6000);


}

function draw_airenemy(){
    var c=document.getElementById("flight");
    var context = c.getContext("2d");
    var img=new Image();
    img.src=enemysrc;


    img.onload = function () {
        for(var i=0;i<airNum;i++){
            context.clearRect(airArray[i][1]-10, airArray[i][2]-10, 100, 110);
            context.drawImage(img,airArray[i][1], airArray[i][2], 80, 80);
        }
    }
}
function draw_missile_f(){
    var c=document.getElementById("flight");
    var context = c.getContext("2d");
    var img=new Image();
    img.src="img/l_enemy.png";


    img.onload = function () {
        for(var i=0;i<missileNum_l;i++){
            context.clearRect(missileArray_l[i][1]-15, missileArray_l[i][2]-10, 85, 60);
            context.drawImage(img,missileArray_l[i][1], missileArray_l[i][2], 60, 40);
        }
    }
}
function draw_missile_r(){
    var c=document.getElementById("flight");
    var context = c.getContext("2d");
    var img=new Image();
    img.src="img/r_enemy.png";


    img.onload = function () {
        for(var i=0;i<missileNum_r;i++){
            context.clearRect(missileArray_r[i][1]+10, missileArray_r[i][2]-10, 85, 60);
            context.drawImage(img,missileArray_r[i][1], missileArray_r[i][2], 60, 40);
        }
    }
}
function draw_buttet(){
    var c=document.getElementById("flight");
    var context = c.getContext("2d");
    var img=new Image();
    img.src="img/bullet.png";


    img.onload = function () {
        for(var i=0;i<bulletNum;i++){
            context.clearRect(bullet[i][1], bullet[i][2]+10, 20, 20);
            context.drawImage(img,bullet[i][1], bullet[i][2], 10, 10);
        }
    }
}

function draw_sroce(){
    var c=document.getElementById("flight");
    var context = c.getContext("2d");
    context.fillText("live"+live, 0, 400);
    context.fillText("score"+score, 0, 410);
    context.fillText("distance"+distance, 0, 420);

}
function sroce_clean(){
    var c=document.getElementById("flight");
    var context = c.getContext("2d");
    context.clearRect(0,390,80,30);
}
document.onkeydown=function(e){
    if(air.x>0){
        if(e.keyCode==37){
                air.x=air.x-10;
            }
    }
    if(air.y>0){
        if (e.keyCode == 38) {
            air.y = air.y - 10;
        }
    }
    if(air.y<450) {
        if (e.keyCode == 40) {
            air.y = air.y + 10;
        }
    }
    if(air.x<350) {
        if (e.keyCode == 39) {
            air.x = air.x + 10;
        }
    }
    if(e.keyCode==32){
        console.log("kongge")
        (timer1);
        clearInterval(timer2);
        clearInterval(timer3);
        clearInterval(timer4);
        clearInterval(timer5);
        clearInterval(timer6);
        clearInterval(timer7);
    }

}
//document.onkeyup=function(e){
//    if(e.keyCode==32){
//        timer4=setInterval("run()",1000/20);
//    }
//}


function start(){
    clear();
    air.x=100;
    air.y=440;
    live=1;
    score=0;
    distance=100;
    setimg();
    create_airenemy();
    document.getElementById("bgaudio").play();
     timer1=setInterval("draw()",10);
    timer2=setInterval("create_airenemy();createmissile_r();createmissile_l()",3000);


     timer3=setInterval("createbullet()",600);


     timer4=setInterval("run()",1000/20);

     timer5=setInterval("runbullet()",40);
     timer6=setInterval("check1();check2();check3();check4()",30);
     timer7=setInterval("dis()",1000);





}
function run(){
    for(var i=0;i<airNum;i++) {
        airArray[i][2] = airArray[i][2] + 10;
    }
    for(var i=0;i<missileNum_l;i++){
        missileArray_l[i][1]= missileArray_l[i][1]+10;
        missileArray_r[i][1]= missileArray_r[i][1]-10;
    }


    draw_airenemy();
    draw_missile_f();
    draw_missile_r();

    sroce_clean();

    draw_sroce();

}
function dis(){
    distance=distance-1;
}
function runbullet(){

    for(var i=0;i<bulletNum;i++){
        bullet[i][2]= bullet[i][2]-10;
    }
    draw_buttet()


}
function create_airenemy(){

    if(airNum==4){
        var c=document.getElementById("flight");
        var context = c.getContext("2d");
        for(var i=0;i<4;i++){
            context.clearRect(airArray[i][1], airArray[i][2], 100, 110);

        }
    }
    airNum=airNum%4;

    console.log(airNum)
        airArray[3][2]=10;
        airArray[airNum][0]=air_id;
        airArray[airNum][1]=Math.random()*340;
        //airArray[airNum][1]=200;
    console.log(airArray[airNum][1])
        airArray[airNum][2]=10;

 //   console.log(airArray[airNum][1]);
    air_id=air_id+1;
    airNum++;
}

function createmissile_l(){
    missileNum_l=missileNum_l%4;
    missileArray_l[missileNum_l][0]=missile_id;
    missileArray_l[missileNum_l][1]=0;
    missileArray_l[missileNum_l][2]=Math.random()*200;
    missile_id=missile_id+1;
    missileNum_l++;

}
function createmissile_r(){
    missileNum_r=missileNum_r%4;
    missileArray_r[missileNum_r][0]=missile_id;
    missileArray_r[missileNum_r][1]=340;
    missileArray_r[missileNum_r][2]=Math.random()*200+150;
    //missileArray_r[missileNum_r][2]=300;
    missile_id=missile_id+1;
    //console.log(missileNum_r)
    missileNum_r++;


}
function createbullet(){
    if(bulletNum==10){
        var c=document.getElementById("flight");
        var context = c.getContext("2d");
        for(var i=4;i<10;i++){
            context.clearRect(bullet[i][1], bullet[i][2], 10, 10);

        }
    }
    bulletNum=bulletNum%10;

    bullet[bulletNum][0]=bullet_id;
    bullet[bulletNum][1]=air.x+20;
    bullet[bulletNum][2]=air.y-10;
    //bullet[bulletNum][1]=180+20;
    //bullet[bulletNum][2]=440-10;
    bullet_id=bullet_id+1;
    bulletNum++;

}

function check1() {
    var c = document.getElementById("flight");
    var context = c.getContext("2d");
    for (i = 0; i < 4; i++) {
        if (Math.abs(air.x - airArray[i][1]) < 60 && (Math.abs(air.y - airArray[i][2])) < 60) {
            context.clearRect(airArray[i][1], airArray[i][2] - 10, 100, 110);
            airArray[i][1] = -200;
            live=live-1;
            score=score+1;
        }
    }
    for (i = 0; i < 10; i++) {
        for (var j = 0; j < 4; j++) {

            if ((bullet[i][1]>airArray[j][1])&&((airArray[j][2]-bullet[i][2])<50)&&((bullet[i][1]-airArray[j][1])>10)&&((bullet[i][1]-airArray[j][1])<60)) {
                context.clearRect(airArray[j][1], airArray[j][2] - 10, 100, 110);
                airArray[j][1] = 800;
                score=score+1;

            }
        }
    }
}
function check2(){
    var c=document.getElementById("flight");
    var context = c.getContext("2d");
    for(i=0;i<4;i++) {
        if(Math.abs(air.x-missileArray_r[i][1])<50&&(Math.abs(air.y-missileArray_r[i][2]))<50){
            context.clearRect(missileArray_r[i][1]-10, missileArray_r[i][2], 100, 110);
            missileArray_r[i][2]=-100;
            live=live-1;

        }
    }
    for (i = 0; i < 10; i++) {
        for (var j = 0; j < 4; j++) {

            if ((bullet[i][1]>missileArray_r[j][1])&&((missileArray_r[j][2]-bullet[i][2])<40)&&((bullet[i][1]-missileArray_r[j][1])>10)&&((bullet[i][1]-missileArray_r[j][1])<60)) {
                context.clearRect(missileArray_r[j][1]-10, missileArray_r[j][2] - 10, 100, 110);
                missileArray_r[j][2] = -100;
                score=score+1;

            }
        }
    }
}

function check3(){
    var c=document.getElementById("flight");
    var context = c.getContext("2d");
    for(i=0;i<4;i++) {
        if(Math.abs(air.x-missileArray_l[i][1])<50&&(Math.abs(air.y-missileArray_l[i][2]))<50){
            context.clearRect(missileArray_l[i][1]-10, missileArray_l[i][2], 100, 110);
            missileArray_l[i][2]=-100;
            live=live-1;
        }
    }
    for (i = 0; i < 10; i++) {
        for (var j = 0; j < 4; j++) {

            if ((bullet[i][1]>missileArray_l[j][1])&&((missileArray_l[j][2]-bullet[i][2])<40)&&((bullet[i][1]-missileArray_l[j][1])>10)&&((bullet[i][1]-missileArray_l[j][1])<60)) {
                context.clearRect(missileArray_l[j][1]-10, missileArray_l[j][2], 100, 110);
                missileArray_l[j][2] = -100;
                score=score+1;
            }
        }
    }
}


function check4(){
    if(live==0||distance==0){
        clearInterval(timer1);

        console.log(timer1);
        clearInterval(timer2);
        clearInterval(timer3);
        clearInterval(timer4);
        clearInterval(timer5);
        clearInterval(timer6);
        clearInterval(timer7);

        var username = prompt("游戏结束请在这里输入您的名字");
        clear();
        document.getElementById("bgaudio").pause();
        if(username!=null&&username!="")
        {
            var node=document.createElement("LI");
            var textnode=document.createTextNode(username+"成绩是"+score);
            node.appendChild(textnode);
            document.getElementById("123").appendChild(node);
            clear();

        //    document.getElementById("123").appendChild=(username+"成绩是"+score);
            alert(username+"您的成绩是"+score);

        }

    }

}

window.onload = function() {
    var oDropBox = document.getElementById('dropBox'),
        oImgInfo = document.getElementById('imgInfo');

    oDropBox.addEventListener('dragover', function(e) {
        e.stopPropagation();
        e.preventDefault();
    }, false);
    oDropBox.addEventListener('drop', handleDrop, false);

    function handleDrop(e) {
        e.stopPropagation();
        e.preventDefault();

        var fileList  = e.dataTransfer.files,　　//获取拖拽文件
            fileType = fileList[0].type,
            oImg = document.createElement('img'),
            reader = new FileReader();

        if (fileType.indexOf('image') == -1) {
            alert('请拖拽图片~');
            return;
        }

        reader.onload = function(e) {
            oImg.src = this.result;
            console.log(this.result);
            enemysrc=this.result;
            oDropBox.innerHTML = '';
            oDropBox.appendChild(oImg);
            oImgInfo.innerHTML = this.result;
        }
        reader.readAsDataURL(fileList[0])
    }
}
