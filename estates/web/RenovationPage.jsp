<%-- 
    Document   : RenovationPage
    Created on : Feb 5, 2019, 12:48:53 PM
    Author     : CLARICE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@page import= "java.sql.* " %>--%>
<%@page import="java.sql.* " %>
<!DOCTYPE html>
<html>
    <head>
        
    <!--<a href=”bootstrap/bootstrap/css/bootstrap.css” rel=”stylesheet” type=”text/css”></a>-->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
        <title>Manager</title>
    </head>
    <body class="container-fluid">
      <nav class="navbar navbar-expand-lg navbar navbar-light bg-light">
  
  <div class="collapse navbar-collapse" id="navbarSuppUuortedContent">
    <ul class="navbar-nav ml-auto">
     <li class="nav-item" >
        <a style="margin-right: 50px" class="nav-link" href="HomePage.jsp">Home</a>
      </li>
      <li class="nav-item">
        <a style="margin-right: 50px" class="nav-link" href="RequestPage.jsp">Requests</a>
      </li>
      <li class="nav-item">
        <a style="margin-right: 50px" class="nav-link" href="AssignPage.jsp">Assign Work</a>
      </li>
      <li class="nav-item">
        <a style="margin-right: 50px; color: black" class="nav-link" href="RenovationPage.jsp">Renovation</a>
      </li>
      
      <li class="nav-item">
        <a style="margin-right: 50px" class="nav-link" href="ResetPasswordPage.jsp">Reset Password</a>
      </li>
     <li class="nav-item">
        <a style="margin-right: 50px" class="nav-link" href="Logout">LogOut</a>
      </li>   
    </ul>
      </div>
</nav>
        
<!--        <p style="margin-top: 70px; margin-left: 200px; font-family: sans-serif; font-size: 60px "><b>Welcome Manager <br></b>
        <b style=" margin-top: 80px; margin-left: 130px; font-family: sans-serif; font-size: 30px ">Thank you for visiting The Estates Website</b></p>-->
     <h3 style="font-family: sans-serif; margin-left: 10%;">Estate Department Work Records</h3>

    <table class="table table-stripped table-borderd table-condensed table-sm table-hover">
        <tr class="thead-dark">
            <th>No.</th>
            <th>Job Description</th>
            <th> Date Assigned work</th>
            <th>Done By</th>
            <th> Employee ID</th>
            <th> Work status</th>

        </tr>
        
         <%
            
          Connection conn = null;
          Statement st  = null;
          ResultSet rs = null;
            
             try{
                    Class.forName("com.mysql.jdbc.Driver");
                   String path="jdbc:mysql://localhost:3306/estates";
                   String user="root";
                   String pass="";
                 conn=DriverManager.getConnection(path,user,pass);
                 
                 st = conn.createStatement();
                 
                 String qry = "select * from workstatus";
                 rs = st.executeQuery(qry);
                 while (rs.next())
                 {
                     
                     %>
                    <tr>
                        <td><%= rs.getString(1) %> </td>
                        <td><%= rs.getString(2) %> </td>
                        <td><%= rs.getString(6) %> </td>
                        <td><%= rs.getString(4) %> </td>
                        <td><%= rs.getString(5) %> </td>
                        <td> <%=rs.getString(3) %></td>
                    </tr>
                     
                    <%   
                     
     }
   }catch(Exception e){
    
     } 
%>
        </table> 
                     
         </table> 
           
            
        <br>  
        
    
    </body>
    <script src="js/bootstrap.min.js"></script>
</html>

