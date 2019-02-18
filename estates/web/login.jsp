<%-- 
    Document   : login
    Created on : Feb 5, 2019, 2:35:13 PM
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
        <h1 style="font-style: italic;color: red">PROVIDE LOGIN DETAILS BELOW</h1>
    
        <form action="HomePage.jsp" style="font-family: italic;font-size: 100%;color: blue" method="POST" >
        <table style="font-family: cursive;font-size: 100%;border: thistle;border-color: aqua" cellspacing="20px" method="POST">
           <tr>
             
            <td>Staff Id:</td>
            <td><input type="text" name="staffid" placeholder="staffid" style="background-color: aqua;border-color:red "></td>
           </tr>
           <tr>
            <td>Password:</td>
            <td><input type="password" name="pass" placeholder="Password" style="background-color: aqua;border-color:red "></td>
            </tr> 
            
            <tr>
                <td></td>
                <td><input type="button" name="ok" value="OK" style="background-color: blue" onClick="validate(this.form)"></td>
            </tr>
            <tr>
                <td></td>
                 <td><input type="reset" name="cancel" value="CANCEL" style="background-color: blue"></td>
                 </tr>
            
        </table>
        </form>
        <script language="JavaScript">
            function validate(form){
            if(form.staffid.value==""){
                  // return false;
                 alert("Staff Id Required");
                 form.staffid.focus();
             }  
            else if(form.pass.value==""){
                 //return false;	```
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

