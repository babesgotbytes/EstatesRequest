<%-- 
    Document   : welcome2
    Created on : Jan 14, 2019, 9:16:15 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            <jsp:useBean id="users" scope="session" class="com.access.UserBean" />
          Welcome <jsp:getProperty name="users" property="fname" /> <jsp:getProperty name="users" property="sname" />
        </p>
    </body>
</html>
