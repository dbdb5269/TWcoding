/**
 * Created by dubo on 16/6/4.
 */
$(document).ready(function(){
    $("#response").click(function(){
        var d = $("#responseform").serializeArray();


        $.post("./addresponse.php",d,function(data){


                alert("回复成功");
            console.log(d);
            $.post("./responsetable.php",d,function(data){

                var json = eval('(' + data + ')');

                var list = "";
                for(var i = 0; i < json.length; i++)
                {
                    list = list +"<tr class=\"col-md-11\" style=\"margin-left: 5%\"><td class=\"col-md-1\">"+json[i].Name+"</td><td class=\"col-md-8\">"+json[i].message+"</td><td class=\"col-md-2\">"+json[i].timestamp+"</td></tr>";
                }
                $("#responsetable").html(list);
            });
            $("#text33").val("");


        });
    });
    $("#new").click(function (){
        $("#title").val("");
        $("#video").css("display","none");
        $("#textarea").val("");
        $("#textarea2").val("");
        $("#html").val("");
        $("#html").val("");
    })
    $("#fabu").click(function(){

        if($("#article_id").val()==null) {
            var d = $("#newarticle").serializeArray();
            console.log(d);
            $.post("./addarticle.php", d, function (data) {
                if (data == 1) {

                    alert("发布成功");
                    $.post("./articletable.php", {id: $("#id").val()}, function (data) {
                        var json = eval('(' + data + ')');
                        console.log(json)
                        var text = "<thead> <tr> <th>发表日期</th> <th>Author</th> <th>Title</th> <th>回复</th> <th>最后更新/回复</th> </tr> </thead>";
                        for (var i = 0; i < json.length; i++) {
                            text = text + "<tr>\
									<td>" + json[i]['created_time'] + "</td>\
									<td>" + json[i]['Name'] + "</td>\
									<td><a href=\"./index.php?article_id=" + json[i]['id'] + "\">" + json[i]['title'] + "</a></td>\
									<td>" + json[i]['count'] + "</td>\
									<td>" + json[i]['last_update'] + "</td>\
								  </tr>"
                        }
                        $("#userarticle").html(text);
                        $('#myModal').modal('hide')

                    })
                    $.post("./articletable.php", d, function (data) {
                        var json = eval('(' + data + ')');
                        var text = "<thead> <tr> <th>发表日期</th> <th>Author</th> <th>Title</th> <th>回复</th> <th>最后更新/回复</th> </tr> </thead>";
                        for (var i = 0; i < json.length; i++) {
                            text = text + "<tr>\
                                <td>" + json[i]['created_time'] + "</td>\
                                <td>" + json[i]['Name'] + "</td>\
                                <td><a href=\"./index.php?article_id=" + json[i]['id'] + "\">" + json[i]['title'] + "</a></td>\
                                <td>" + json[i]['count'] + "</td>\
                                <td>" + json[i]['last_update'] + "</td>\
                              </tr>"
                        }
                        $("#otherarticle").html(text);

                    })


                }

            });

        }
        else {
            var d = $("#newarticle").serializeArray();

            $.post("./updataarticle.php",d,function(data){
                console.log("update");
                console.log(data);
                if(data ==1)
                {
                    alert("修改成功");
                    $.post("./articletable.php",{article_id: $("#article_id").val()},function(data){
                        console.log("new");
                        console.log(data);

                        var json = eval('(' + data + ')');
                        var a=json[0].title;
                        var b=json[0].content;
                        var last_update=json[0].last_update
                        console.log(b);
                        var text1=a;

                        var text2="<div style=\"font-size:15px\" id='updatacontent'>"+b+"</div>";
                        var text3="<p style=\"font-size:15px;color: #ababab;\">update is on "+last_update+"</p>"
                        $("#updatatitle").html(text1);
                        $("#time").html(text3);
                        $("#updatacontent").html($.html2(text2));

                    });

                    $('#myModal').modal('hide')
                }
            });

        }
    });
    $("#modi").click(function(){
        var article_id=$("#article_id").val();
        console.log(article_id);
        $.post("./articletable.php",{article_id: $("#article_id").val()},function(data){
            console.log(data);
            var json = eval('(' + data + ')');

            console.log(json.length);
            console.log(json[0].title);
            $("#title").val(json[0].title);
            $("#textarea").val(json[0].content);
        });

        



    });
    $("#code").click(function(){
        $("#textarea").css("display","block");
        $("#textarea2").css("display","none");

    });
    $("#html").click(function(){
        $("#video").css("display","none");
        $("#textarea").css("display","none");
        $("#textarea2").css("display","block");
        var text = $.html1($("#textarea").val());
        $("#textarea2").html(text);

    });
    $("#youtube").click(function(){
        
        var flag = $("#video").css("display");
        if(flag == "none")
            $("#video").css("display","block");
        else
            $("#video").css("display","none");
    });
    $("#insert").click(function(){

        var url_pate=$("#URL").val();
        var url="https://www.youtube.com/watch?v="+url_pate;
        var newtext = $("#textarea").val();
        newtext = newtext + "\n<YOUTUBE>" + url + "</YOUTUBE>";
        $("#textarea").val(newtext);
        $("#textarea2").html($.html1($("#textarea").val()));
        $("#URL").val("");

    });
    $("#B").click(function(){

        var textarea = document.getElementById("textarea");
        var start = textarea.selectionStart;
        var end = textarea.selectionEnd;
        var text = $("#textarea").val();
        console.log(text);
        var newtext = text.substr(0,start) + "<Strong>" + text.substr(start,end - start) + "</Strong>" + text.substr(end);
        $("#textarea").val(newtext);

    });
    $("#I").click(function(){
        var textarea = document.getElementById("textarea");
        var start = textarea.selectionStart;
        var end = textarea.selectionEnd;
        var text = $("#textarea").val();
        console.log(text);
        var newtext = text.substr(0,start) + "<em>" + text.substr(start,end - start) + "</em>" + text.substr(end);
        $("#textarea").val(newtext);

    });
    $("#red").click(function(){
        var textarea = document.getElementById("textarea");
        var start = textarea.selectionStart;
        var end = textarea.selectionEnd;
        var text = $("#textarea").val();
        console.log(text);
        var newtext = text.substr(0,start) + "<R>" + text.substr(start,end - start) + "</R>" + text.substr(end);
        $("#textarea").val(newtext);

    });
    $("#blue").click(function(){
        var textarea = document.getElementById("textarea");
        var start = textarea.selectionStart;
        var end = textarea.selectionEnd;
        var text = $("#textarea").val();
        console.log(text);
        var newtext = text.substr(0,start) + "<B>" + text.substr(start,end - start) + "</B>" + text.substr(end);
        $("#textarea").val(newtext);
    });
    $("#green").click(function(){
        var textarea = document.getElementById("textarea");
        var start = textarea.selectionStart;
        var end = textarea.selectionEnd;
        var text = $("#textarea").val();
        console.log(text);
        var newtext = text.substr(0,start) + "<G>" + text.substr(start,end - start) + "</G>" + text.substr(end);
        $("#textarea").val(newtext);
    });
});
$.extend({
    html1:function(text)
    {
        text = text.replace(/<R>/g,"<div style=\"color:red;\">");
        text = text.replace(/<\/R>/g,"</div>");
        text = text.replace(/<B>/g,"<div style=\"color:blue;\">");
        text = text.replace(/<\/B>/g,"</div>");
        text = text.replace(/<G>/g,"<div style=\"color:green;\">");
        text = text.replace(/<\/G>/g,"</div>");
        text = text.replace(/<YOUTUBE>/g,"影片不提供预览<br>(");
        text = text.replace(/<\/YOUTUBE>/g,")");
        text = text.replace(/\n/g,"<br>");
        return text;
    }

});
$.extend({
    html2:function(text)
    {
        text = text.replace(/<R>/g,"<div style=\"color:red;\">");
        text = text.replace(/<\/R>/g,"</div>");
        text = text.replace(/<B>/g,"<div style=\"color:blue;\">");
        text = text.replace(/<\/B>/g,"</div>");
        text = text.replace(/<G>/g,"<div style=\"color:green;\">");
        text = text.replace(/<\/G>/g,"</div>");
        text = text.replace(/<YOUTUBE>/g,"<iframe src=\"");
        text = text.replace(/watch\?v=/g,"v/");
        text = text.replace(/<\/YOUTUBE>/g,"\" width=\"300\" height=\"200\" frameborder=\"0\" allowfullscreen></iframe>");
        text = text.replace(/\n/g,"<br>");
        return text;
    }

});