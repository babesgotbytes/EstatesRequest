<%-- 
    Document   : HomePage
    Created on : Jan 10, 2019, 12:24:19 PM
    Author     : hp
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
        <a style="margin-right: 50px" class="nav-link" href="AddEmployeePage.jsp">Manage Employee</a>
      </li>
      <li class="nav-item">
        <a style="margin-right: 50px" class="nav-link" href="RenovationPage.jsp">Renovation</a>
      </li>
      
      <li class="nav-item">
        <a style="margin-right: 50px; color: black" class="nav-link" href="ResetPasswordPage.jsp">Reset Password</a>
      </li>
     <li class="nav-item">
        <a style="margin-right: 50px" class="nav-link" href="Logout">LogOut</a>
      </li>   
    </ul>
      </div>
</nav>
        
        <div id="main" style="margin-left:400px; margin-right: 400px; margin-top: 50px; margin-bottom: 100px;height: 500px; width: 450px;">

    <p style="font-family: Serif;font-size: 30px;margin-left: 38px;">Manager Reset Password</p><br>
    <div style="box-shadow: 5px 5px 5px 5px  #ccccff;margin-right: 10px;background-color: #f3f3f3">
        <br><br>
        <form method="POST" action="#">
            <div class="form-group">
                <label style="margin-left: 80px;font-family: Serif;font-size: 16px">Username:</label><br>
                <div class="col-sm-10">
                    <input class="form-control" style="margin-left: 40px" id="exampleInputUsername" type="textfield" placeholder="username" name="username">

                </div>
            </div><br>
            <div class="form-group">
                <label style="margin-left: 80px;font-family: Serif;font-size: 16px">Email:</label><br>
                <div class="col-sm-10">
                    <input class="form-control" style="margin-left: 40px" id="exampleInputUsername" type="textfield" placeholder="email" name="email">

                </div>
            </div><br>
            <div class="form-group">
                <label style="margin-left: 80px;font-family: Serif;font-size: 16px"> Enter Initial password:</label><br>
                <div class="col-sm-10">
                    <input class="form-control" style="margin-left: 40px" id="exampleInputPassword" type="password" name="initial_pass" placeholder="initial password" required>
                </div>
            </div><br>
            <div class="form-group">
                <label style="margin-left: 80px;font-family: Serif;font-size: 16px">Enter new password</label><br>
                <div class="col-sm-10">
                    <input class="form-control" style="margin-left: 40px;" id="exampleInputPassword" type="password" name="password" placeholder="new password" required>
                </div>
            </div>
            <div class="form-group">
                <label style="margin-left: 80px;font-family: Serif;font-size: 16px">Re-enter new password:</label><br>
                <div class="col-sm-10">
                    <input class="form-control" style="margin-left: 50px" id="exampleInputPassword" type="password" name="con_pass" placeholder="confirm password" required>
                </div>
            </div><br><br>
            <input class="btn alert-dark" style="margin-left: 60px;color: black; font-family: Serif;font-size: 18px;width: 280px;" type="Submit" name="update" value ="Reset"></br>

        </form>
        <br><br>
    </div>
</div>
<!--        <p style="margin-top: 70px; margin-left: 200px; font-family: sans-serif; font-size: 60px "><b>Welcome Manager <br></b>
        <b style=" margin-top: 80px; margin-left: 130px; font-family: sans-serif; font-size: 30px ">Thank you for visiting The Estates Website</b></p>-->
    </body>
    <script src="js/bootstrap.min.js"></script>
</html>
