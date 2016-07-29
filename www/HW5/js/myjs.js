/**
 * Created by dubo on 16/6/3.
 */
$(document).ready(function(){
    $("#register").click(function(){

        var d = $("#registerform").serializeArray();
        
        $.post("./register.php",d,function(data){
            alert(data);
            if(data == 1)
            {
                alert("注册成功");
                window.location.href="./index.php";
            }
            else if(data != 1)
            {   alert("error")
                $("#error").html(data);

            }


        });
    });

});



