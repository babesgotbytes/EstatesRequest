<%-- 
    Document   : RequestPage
    Created on : Feb 5, 2019, 12:50:05 PM
    Author     : CLARICE
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
        <a style="margin-right: 50px; " class="nav-link" href="AddEmployeePage.jsp">Manage Employee</a>
      </li>
      <li class="nav-item">
        <a style="margin-right: 50px" class="nav-link" href="RenovationPage.jsp">Renovation</a>
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
        <br>
        <h3 style="font-family: sans-serif;"><b><u>Estate Department Employees</u></b></h3>

        <br>
	<table  class="table table-stripped table-bordered table-condensed table-sm table-hover" id="tab">

		<tr class="thead-dark">
            <!--<th>No.</th>-->
            <th>No</th>
            <th>Category</th>
            <th>Category name</th>
            <th>Property name</th>
            <th>Damage</th>
            <!--<th>Assign</th>-->

                </tr>
                <c:forEach items="${list}" var="list">
                    <tr>
                        <td><c:out value="${list.category}"/></td>
                        <td><c:out value="${list.cname}"/></td>
                        <td><c:out value="${list.pname}"/></td>
                        <td><c:out value="${list.damage}"/></td>
                        
                    </tr>  
                     
                </c:forEach>  
        </table> 
            
            
        <br>  
        </body>
</html>
