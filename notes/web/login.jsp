<%-- 
    Document   : login
    Created on : Jan 7, 2019, 4:21:50 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN PAGE</title>
         <script src="jquery-3.3.1.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(document).ready(function(){
             $('#body').css('background-color','grey');
             $('#myform').css('background-color','chocolate');
             $('#myform').css('border','5px solid #ccc');
              $('#myform').css('width','50%');
              $('#btn').css('background-color','red');
             $('#btn1').css('background-color','green');
            });
            </script>
    </head>
    <body id="body">
        <h1 style="font-style: italic;color: red">PROVIDE LOGIN DETAILS BELOW</h1>
    
        <form action="LoginServlet" style="font-family: italic;font-size: 100%;color: blue" method="POST" id="myform"/>
        <table style="font-family: cursive;font-size: 100%;border: thistle;border-color: aqua" cellspacing="5px" method="POST">
           <tr>
             <td>Staff Id:</td>
           </tr>
           <tr>
            <td><input type="text" name="staffid" placeholder="staffid" style="background-color: aqua;border-color:red "></td>
           </tr>
           <tr>
            <td>Password:</td>
           </tr>
           <tr>
            <td><input type="password" name="pass" placeholder="Password" style="background-color: aqua;border-color:red "></td>
            </tr> 
             <tr>
                <td><input type="button" name="ok" value="OK" style="background-color: blue" onClick="validate(this.form)" id="btn1"></td>
                <td><input type="reset" name="cancel" value="CANCEL" style="background-color: blue" id="btn"></td>
                 <td><a href="register.jsp">Register!!!</a></td>
            </tr> 
            
        </table>
        </form>
        <p style="color: red;font-family: cursive"><b>${message}</b></p>
        <script language="JavaScript">
            function validate(form){
                if(form.staffid.value==""&&form.pass.value==""){
                    alert("No fields Entered!");
                }
           else if(form.staffid.value==""){
                  
                 alert("Staff Id Required");
                 form.staffid.focus();
             }  
            else if(form.pass.value==""){
                 
                 alert("Password Required");
                 form.pass.focus();
             } 
             else{
                
                 form.submit();
                 
             }
         }
        </script>
    </body>
</html>

