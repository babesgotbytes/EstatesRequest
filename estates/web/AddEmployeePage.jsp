<%-- 
    Document   : AddEmployeePage
    Created on : Feb 5, 2019, 12:41:45 PM
    Author     : CLARICE
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <a style="margin-right: 50px ; color: black" class="nav-link" href="AssignPage.jsp">Assign Work</a>
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
        <p style="font-family: 'sans-serif';font-size: 25px;">Addition of a new Employee:</p><br>
        
<!--        <form action="AddEmployee" method="POST">
            Enter username :<input type="text" name="Name"> <br>
            Enter username :<input type="text" name="PhoneNumber"> <br>
		Enter password :<input type="text" name="Email"><br>
		<input type="submit" value="Login">
            -->
        <!--</form>-->
       <form action="AddEmployee" method="POST">

    <div class="row" style="margin-top: 70px;margin-left: 30px;">
        
        <input type="hidden" name="saved_user" value="1"/>         
        <br>
        
        <div class="col-md-4">

            <label style="font-family: 'sans-serif';font-size: 18px">Employee Name:</label>
            <input type="text" name="Name" class="form-control" autocomplete="off" required>
            <label style="font-family: 'sans-serif';font-size: 18px">Phone Number:</label>
            <input type="text" name="PhoneNumber" class="form-control" autocomplete="off" required>
            <label style="font-family: 'sans-serif';font-size: 18px">Employee Email:</label>
            <input type="email" name="Email" class="form-control" autocomplete="off" required>
            <br><br>
            <button type="submit" class="btn alert-dark" name="submit" value="Submit"
                    style="margin-top: 25px;width: 200px;margin-left: 60px"> Submit
            </button>

        </div>
    </div>
</form>
<!--        <p style="margin-top: 70px; margin-left: 200px; font-family: sans-serif; font-size: 60px "><b>Welcome Manager <br></b>
        <b style=" margin-top: 80px; margin-left: 130px; font-family: sans-serif; font-size: 30px ">Thank you for visiting The Estates Website</b></p>-->
    </body>
    <script src="js/bootstrap.min.js"></script>
   
</html>

