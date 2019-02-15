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
                        <a style="margin-right: 50px ; color: black" class="nav-link" href="HomePage.jsp">Home</a>
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
                        <a style="margin-right: 50px" class="nav-link" href="ResetPasswordPage.jsp">Reset Password</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-right: 50px" class="nav-link" href="Logout">LogOut</a>
                    </li>   
                </ul>
            </div>
        </nav>

        <p style="margin-top: 70px; margin-left: 200px; font-family: sans-serif; font-size: 60px "><b>Welcome Manager <br></b>
            <b style=" margin-top: 80px; margin-left: 130px; font-family: sans-serif; font-size: 30px ">Thank you for visiting The Estates Website</b></p>
    </body>
    <script src="js/bootstrap.min.js"></script>
</html>
