WWW Technologies and Applications 2016
HOMEWORK#5
NAME : Mrdubo
CCU ID: 404410905
http://dmplus.cs.ccu.edu.tw:49256/www_hw5/login.php
click on the hyperlink "Link to Homework#5"

Project files : home.php index.php login.php register.php addarticle.php login.php addresponse.php articletable.php modity.php responsetable.php updatearticle.php
css:bootstrap.css,theme.css
js:myjs.js myjs2.js jQuery.min.js bootstrap.js



(Explain project files:)
[login.php] This file just login page,and use a modal show register page,thie modal can use Ajax .It don't need refresh this page.

[index.php]This file is the main page.It list the user's article and the all article.User can add new article.The button use modal.thie modal can use Ajax .It don't need refresh this page.The modal include modity the font and color and add a youtube video.It don't need refresh this page.
If you click a article,you will go to the article page.This page show the title message the last update,ande the responses.
If this article is your article.you can delete it and modify it.
The modify button use modal and Ajax .So it don't need to refresh to modify the content.
[myjs.js]This js file.Just include post register page to register an account。
[myjs2.js]This is the main js file.This include all button onclick function.For example .Button about addresponse.
Use function serializeArray() get Json object,Use function eval,to modify array Json to Json object.Then we can use Json format .
Use jQuery $.post(url,parameters,callback),post to the url execute the data process.This will not need to reload the pages,jQuery $.post function send a request to the url.And jQuery ajax post function callback() is when the request finish execute the finish function.


(Important note to run your code)
When i write this code,i don't know about ajax and jQuery,i hava to learn about it .w3school is a good web.
and i don't know how to modify the font and the color ,I hava to google it.

	
	