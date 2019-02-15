<%-- 
    Document   : register
    Created on : Feb 5, 2019, 2:44:36 PM
    Author     : CLARICE
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTRATION PAGE</title>
    </head>
    <body background="Alienware.jpg">
        <h1 style="font-style: italic;color: red">PROVIDE REGISTRATION DETAILS BELOW</h1>
        
        <form action="registerServlet" style="font-family: italic;font-size: 100%;color: blue" method="POST" onsubmit="validate(this.form)">
        <table style="font-family: cursive;font-size: 100%;border: thistle;border-color: aqua" border-spacing="10em" cellspacing="20px">
           <tr>
             <td>First_Name:</td>
                <td><input type="text" name="fname" placeholder="First_Name" style="background-color: aqua;border-color:red "></td>
              <td>Second_Name:</td>
            <td><input type="text" name="sname" placeholder="Second_Name" style="background-color: aqua;border-color:red "></td>
            </tr>
            
             <tr>
            <td>StaffId:</td>
            <td><input type="text" name="staffid" placeholder="staffid" style="background-color: aqua;border-color:red "></td>
           
            <td>E-Mail:</td>
            <td><input type="text" name="email" placeholder="user@gmail.com" style="background-color: aqua;border-color:red "></td>
           
            </tr>
            <tr>
            <td>Password:</td>
            <td><input type="password" name="pass" placeholder="Password" style="background-color: aqua;border-color:red "></td>
            </tr> 
            <tr>
                <td><input type="button" name="ok" value="OK" style="background-color: blue" onClick="validate(this.form)"></td>
                 <td><input type="reset" name="cancel" value="CANCEL" style="background-color: blue"></td>
           </tr>
        </table>
        </form>

        
        <script language="JavaScript">
            function validate(form){
             if(form.fname.value==""){
                 //return false;
                 alert("First Name Required");
                 form.fname.focus();
             } 
             else if(form.sname.value==""){
                 //return false;
                 alert("Second Name Required");
                 form.sname.focus();
             } 
               else if(form.staffid.value==""){
                  // return false;
                 alert("Staff Id Required");
                 form.staffid.focus();
             }  
             else if(form.email.value==""){
                // return false;
                 alert("Email Required");
                 form.email.focus();
             }
             else if(form.pass.value==""){
                 //return false;
                 alert("Password Required");
                 form.pass.focus();
             } 
             else{
                // return true;
                 form.submit();
                 
             }
            }
            </script>
        
        
    </body>
</html>
