<%-- 
    Document   : welcome
    Created on : Jan 9, 2019, 9:12:50 AM
    Author     : user

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.bean.Credentials"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WELCOME PAGE</title>
    </head>
    <body>
       
        <h1 style="color:red">REPORT SITE</h1>
        <p></p> 
        <p style="color: red;font-family:cursive;font-size: 120%">
        <jsp:useBean id="cred" scope="session" class="com.bean.Credentials" />
        Welcome <jsp:getProperty name="cred" property="fname" />&nbsp;&nbsp;<jsp:getProperty name="cred" property="sname" />
        
        </p>
    </body>
</html>
