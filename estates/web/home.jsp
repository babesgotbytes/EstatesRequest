<%-- 
    Document   : home
    Created on : Feb 4, 2019, 10:19:35 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ESTATES</title>
         <script src="jquery-3.3.1.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(document).ready(function(){
             $('#body').css('background-color','grey');
             $('#myform').css('background-color','chocolate');
             $('#myform').css('border','5px solid #ccc');
              $('#myform').css('width','15%');
              $('#myform').css('height','50%');
              $('#btn').css('background-color','red');
             $('#btn1').css('background-color','green');
             $('#head1').css('color','green');
            });
            </script>
    </head>
    <body id="body">
        <h1 id="head">WELCOME TO ESTATES</h1>
        <h2 id="head1">SELECT SYSTEM ROLE FROM THE MENU BELOW</h2>
        <form id="myform">
           ROLE:<select name="role" placeholder="role" onchange="javascript:handleSelect(this)">
             <option value="role"></option>
            <option value="login">DEPARTMENT</option>
            <option value="login2">ESTATES</option>
            </select>
            <<script type="text/javascript">
                function handleSelect(elm)
                {
                    window.location=elm.value+".jsp";
                }
            </script>
            </form>
        </body>
    </body>
</html>
