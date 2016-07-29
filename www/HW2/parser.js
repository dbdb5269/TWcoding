/**
 * Created by dubo on 16/3/22.
 */


function parsexml(filename){


    var url = filename.value;
    console.log(url);
    if(url==""){
        alert("Error,Please input XML url.")
        return0;
    }


    if(window.XMLHttpRequest){

        xmlerror= new XMLHttpRequest();
        xmlerror.open("GET",url,false);
        xmlerror.send();
        xml=xmlerror.responseXML;
        if(!xml){
            alert("error xml");
            return 0;
        }


    }



    if(window.XMLHttpRequest){

        xmlhttp = new XMLHttpRequest();
        xmlhttp.onreadystatechange=onResponse
        xmlhttp.open("GET",url,false);
        xmlhttp.send(null);



    }

    function onResponse() {
        food = xmlhttp.responseXML.documentElement.getElementsByTagName("food");

        console.log(food.length);
        windows =window.open('','','width=800,height=600')
        windows.document.write("<html><head></head><body>");
        windows.document.write("<div style='text-align:center;font-size:20px;'>Menu<br />");
        if(food.length==0){
            windows.document.write("<p>no date</p>");;}

        for (i=0;i<food.length;i++)
        {
            var foodname = xmlhttp.responseXML.documentElement.getElementsByTagName("foodname");
            var price = xmlhttp.responseXML.documentElement.getElementsByTagName("price");
            var description = xmlhttp.responseXML.documentElement.getElementsByTagName("description");
            var calories = xmlhttp.responseXML.documentElement.getElementsByTagName("calories");

            windows.document.write("<span>"+foodname[i].childNodes[0].nodeValue+ "<br>"+ price[i].childNodes[0].nodeValue
                +" ("+calories[i].childNodes[0].nodeValue+")</span>");
            windows.document.write("<br />");
            windows.document.write("<span>"+description[i].childNodes[0].nodeValue+"</span>");


            windows.document.write("<br /><br />");
        }
        windows.document.write("</div> <br /><br />");







        basketball = xmlhttp.responseXML.documentElement.getElementsByTagName("basketball");

        console.log(basketball.length);

        windows.document.write("<html> <head> </head> <body> <div align='center'>");

        windows.document.write("<p>basketball</p>");
        if(basketball.length==0){
            windows.document.write("<p>no date</p>");;}

        for (i=0;i<basketball.length;i++){
            var Image=xmlhttp.responseXML.documentElement.getElementsByTagName("Image");
            windows.document.write("<a href='#"+i+"'><img src="+Image[i].childNodes[0].nodeValue+" width=120 height=120 /></a>");


        }

        for (i=0;i<basketball.length;i++)
        {
            var Team = xmlhttp.responseXML.documentElement.getElementsByTagName("Team");
            var City = xmlhttp.responseXML.documentElement.getElementsByTagName("City");
            var Color = xmlhttp.responseXML.documentElement.getElementsByTagName("Color");
            var BColor = xmlhttp.responseXML.documentElement.getElementsByTagName("BColor");
            var Image2=xmlhttp.responseXML.documentElement.getElementsByTagName("Image");
            var name = xmlhttp.responseXML.documentElement.getElementsByTagName("name");
            var age = xmlhttp.responseXML.documentElement.getElementsByTagName("age");
            var position = xmlhttp.responseXML.documentElement.getElementsByTagName("position");
            var Coach = xmlhttp.responseXML.documentElement.getElementsByTagName("Coach");
            var Stadium = xmlhttp.responseXML.documentElement.getElementsByTagName("Stadium");
            var Video = xmlhttp.responseXML.documentElement.getElementsByTagName("Video");
            windows.document.write("<a name='"+i+"'><table border='1px' style='text-align: center;background-color:"+BColor[i].childNodes[0].nodeValue+";color: "+Color[i].childNodes[0].nodeValue+";'>");
            windows.document.write("<tr > <td colspan='6' width='800px' height='100px'>"+Team[i].childNodes[0].nodeValue+"</td> </tr>");
            windows.document.write("<tr height='100px'> <td rowspan='2'> <img src="+Image2[i].childNodes[0].nodeValue+" width='50px'></td> <td colspan='3'> all-star </td> <td> coach </td> <td> stadium </td> </tr>");
            windows.document.write("<tr height='70px'> ");
            windows.document.write("<td>"+name[i].childNodes[0].nodeValue+"</td>");
            windows.document.write("<td>age:"+age[i].childNodes[0].nodeValue+"</td>");
            windows.document.write("<td>"+position[i].childNodes[0].nodeValue+"</td>");
            windows.document.write("<td>"+Coach[i].childNodes[0].nodeValue+"</td>");
            windows.document.write("<td>"+Stadium[i].childNodes[0].nodeValue+"</td>");
            windows.document.write("</tr>");



            windows.document.write("<tr> <td colspan='6'> <iframe width='100%'height='200px' src="+Video[i].childNodes[0].nodeValue+"></iframe></td></tr></a>  </table> </br><br>");


        }

        windows.document.write("  </div> </body> </html>")

    }




}