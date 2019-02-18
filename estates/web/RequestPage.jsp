<%-- 
    Document   : RequestPage
    Created on : Feb 5, 2019, 12:50:05 PM
    Author     : CLARICE
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
        <a style="margin-right: 50px; color: black" class="nav-link" href="RequestPage.jsp">Requests</a>
      </li>
      <li class="nav-item">
        <a style="margin-right: 50px" class="nav-link" href="AssignPage.jsp">Assign Work</a>
      </li>
      <li class="nav-item">
        <a style="margin-right: 50px; " class="nav-link" href="RenovationPage.jsp">Renovation</a>
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
     <h3 style="font-family: sans-serif; margin-left: 10%;">Requests List</h3>

    <table class="table table-stripped table-borderd table-condensed table-sm table-hover">
        <tr class="thead-dark">
            <th>No.</th>
            <th>Category</th>
            <th> Category name</th>
            <th>Property name</th>
            <th> Damage</th>
            <th> Status</th>

        </tr>
        <c:forEach items="${list}" var="list">
        <tr>
            <td><c:out value="${list.category}"/></td>  
             <td><c:out value="${list.categoryname}"/></td>  
              <td><c:out value="${list.propertynamename}"/></td>  
               <td><c:out value="${list.damage}"/></td>  
        </tr>
        
           </c:forEach>         
                     
         </table> 
           
            
        <br>  
        
    
    </body>
    <script src="js/bootstrap.min.js"></script>
</html>

