<%-- 
    Document   : index
    Created on : Jan 14, 2019, 12:15:23 PM
    Author     : Calvince
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hey USer!</h1>
        
        <%
String feedback=request.getParameter("feedback");


try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/department", "root", "");
Statement st=conn.createStatement();

int i=st.executeUpdate("insert into feedback(feedback)values('"+feedback+"')");
out.println("Data is successfully inserted!");
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>

    </body>
</html>
