<%-- 
    Document   : first
    Created on : Jan 30, 2019, 1:07:18 PM
    Author     : user
--%>

<%-- 
    Document   : first
    Created on : Jan 29, 2019, 10:52:31 AM
    Author     : stella
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>PASSWORD</title>
    </head>
    <body style="color: aqua">
    <form action="change"
        method="post">
        <table cellspacing="50" border="0" >
           
                
        <tr><td>id</td><td><input type="text"
                                                name="id"></td></tr>
         <tr><td>current password</td><td><input type="password"
                                                name="current"></td></tr>
        <tr><td>New Password</td>
            <td><input type="password"
                       name="new"></td></tr>
        <tr><td>Confirm Password</td><td><input type="password"
                                                name="confirm"></td></tr>
        
        <tr><td><input type ="submit"
                       value="Change Password"></td></tr>
        
    </table>
    </form>
        <p style="color:red;font-family: cursive;font-style: italic">${message}</p>
    </body> 
        </html>


