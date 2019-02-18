<%-- 
    Document   : register
    Created on : Jan 7, 2019, 4:22:07 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTRATION PAGE</title>
        <script src="jquery-3.3.1.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(document).ready(function(){
             $('#body').css('background-color','grey');
             $('#myform').css('background-color','white');
             $('#myform').css('border','5px solid #ccc');
              $('#myform').css('width','30%');
              $('#myform').css('height','100%');
              $('#btn').css('background-color','red');
             $('#btn1').css('background-color','green');
            });
            </script>
    </head>
    <body id="body">
        <h1 style="font-style: italic;color: red">PROVIDE REGISTRATION DETAILS BELOW</h1>
    <center>
        <form action="RegisterServlet" style="font-family: italic;font-size: 100%;color: red" method="POST" id="myform">
        <table style="font-family: cursive;font-size: 100%;color:green" border-spacing="10em" cellspacing="20px">
           <tr>
             <td>First_Name:</td>
                <td><input type="text" name="fname" placeholder="First_Name" style="background-color: aqua;border-color:red "></td>
           </tr>
           <tr>
              <td>Second_Name:</td>
            <td><input type="text" name="sname" placeholder="Second_Name" style="background-color: aqua;border-color:red "></td>
            </tr>
            
             <tr>
            <td>StaffId:</td>
            <td><input type="text" name="staffid" placeholder="staffid" style="background-color: aqua;border-color:red "></td>
             </tr>
            <tr>
            <td>Password:</td>
            <td><input type="password" name="pass" placeholder="Password" style="background-color: aqua;border-color:red "></td>
            </tr> 
            <tr>
                <td>
             ROLE:<select name="role" placeholder="role">
            <option value="estate">ESTATES</option>
            <option value="department">DEPARTMENT</option>
            </select>  
                </td> 
            </tr>
            <tr>
                <td><input type="button" name="ok" value="OK" style="background-color: blue" onClick="validate(this.form)" id="btn1"></td>
                 <td><input type="reset" name="cancel" value="CANCEL" style="background-color: blue" id="btn"></td>
                 
           </tr>
        </table>
        </form>
        <p style="color: red;font-family: cursive"><b>${message}</b></p>
        </center>
        <script language="JavaScript">
            function validate(form){
                 if(form.fname.value==""&&form.sname.value==""&&form.staffid.value==""
                        &&form.role.value==""&&form.pass.value==""){
                    alert("No fields filled!");
                    }
             else if(form.fname.value==""){
                 
                 alert("First Name Required!");
                 form.fname.focus();
             } 
             else if(form.sname.value==""){
                 
                 alert("Second Name Required!");
                 form.sname.focus();
             } 
               else if(form.staffid.value==""){
                  
                 alert("Staff Id Required!");
                 form.staffid.focus();
             }  
             else if(form.role.value==""){
                
                 alert("Role Required!");
                 form.role.focus();
             }
             else if(form.pass.value==""){
                 
                 alert("Password Required!");
                 form.pass.focus();
             } 
             else{
                form.submit();
                 
             }
            }
            </script>
        
        
    </body>
</html>
