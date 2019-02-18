<%-- 
    Document   : login2
    Created on : Jan 13, 2019, 7:54:47 PM
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
             $('#body').css('background-color','whitesmoke');
             $('#myform').css('background-color','grey');
             $('#myform').css('border','5px solid #ccc');
              $('#myform').css('width','30%');
              $('#myform').css('height','500px');
              $('#btn').css('background-color','red');
             $('#btn1').css('background-color','green');
            });
            </script>
    </head>
    <body id="body">
        <h1 style="font-style: italic;color: red">PROVIDE LOGIN DETAILS BELOW</h1>
    <center>
        <form action="registrationController" style="font-family: italic;font-size: 100%;color: blue" method="POST" id="myform">
          <table style="font-family: cursive;font-size: 100%;border: thistle;border-color: aqua" cellspacing="5px" method="POST">
           <tr>
             <td>Manager Id:</td>
           </tr>
           <tr>
            <td><input type="text" name="managerid" placeholder="managerid" style="background-color: aqua;border-color:red "></td>
           </tr>
           <tr>
            <td>Password:</td>
           </tr>
           <tr>
            <td><input type="password" name="pass" placeholder="Password" style="background-color: aqua;border-color:red "></td>
            </tr> 
             <tr>
                <td><input type="button" name="ok" value="OK" style="background-color: blue" onClick="validate(this.form)" id="btn1"></td>
             </tr>
             <tr>
                <td><input type="reset" name="cancel" value="CANCEL" style="background-color: blue" id="btn"></td>
                 <td><a href="register.jsp">Register!!!</a></td>
            </tr> 
            </table>
        </form>
    </center>
        <p style="color: red;font-family: cursive"><b>${message}</b></p>
        <script language="JavaScript">
            function validate(form){
                 if(form.managerid.value==""&&form.pass.value==""){
                    alert("No fields Entered!");
                }
            else if(form.managerid.value==""){
                  
                 alert("Manager ID Required");
                 form.managerid.focus();
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


