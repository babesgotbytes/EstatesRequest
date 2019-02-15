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
<!--        <script>
        function validate()
{ 
 var Name= document.form.fullname.value;
 var PhoneNumber = document.form.email.value;
 var Email = document.form.username.value; 
 
 
 if (Name==null || Name=="")
 { 
 alert("Name can't be blank"); 
 return false; 
 }
 else if (PhoneNumber==null || PhoneNumber=="")
 { 
 alert("PhoneNumber can't be blank"); 
 return false; 
 }
 else if (Email==null || Email=="")
 { 
 alert("Email can't be blank"); 
 return false; 
 }
 
 } 
</script> -->

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
        <a style="margin-right: 50px ; color: black" class="nav-link" href="AddEmployeePage.jsp">Manage Employee</a>
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
        <p style="font-family: 'sans-serif';font-size: 25px;">Addition of a new Employee:</p>
        

        <form action="${pageContext.request.contextPath}/AddEmployee" method="POST">

    <div class="row" style="margin-top: 70px;margin-left: 30px;">
        
        <input type="hidden" name="saved_user" value="1"/>         
        
        
        <div class="col-md-4">

            <label style="font-family: 'sans-serif';font-size: 18px">Employee Name:</label>
            <input type="text" name="Name" class="form-control" autocomplete="off" required>
            <label style="font-family: 'sans-serif';font-size: 18px">Phone Number:</label>
            <input type="text" name="PhoneNumber" class="form-control" autocomplete="off" required>
            <label style="font-family: 'sans-serif';font-size: 18px">Employee Email:</label>
            <input type="email" name="Email" class="form-control" autocomplete="off" required>
            <br>
           <%=(request.getAttribute("errMessage") == null) ? ""  : request.getAttribute("errMessage")%>
                
            <button type="submit" class="btn alert-dark" name="submit" value="Submit"
                    style="margin-top: 25px;width: 200px;margin-left: 60px"> Submit
            </button>

        </div>
    </div>
</form>
<!--        <p style="margin-top: 70px; margin-left: 200px; font-family: sans-serif; font-size: 60px "><b>Welcome Manager <br></b>
    
<b style=" margin-top: 80px; margin-left: 130px; font-family: sans-serif; font-size: 30px ">Thank you for visiting The Estates Website</b></p>-->
<br>
<br>
<form action="DisplayServlet" method="POST">

    <div class="row" style="font-family: Serif;font-size: 18px;margin-left: 20px; margin-top: 10px; margin-bottom: 100px;">
        <div class="form-group">
            <h4 style="font-family: sans-serif; font-size: 25px ">Check for available employees</h4>
        <input class="btn alert-dark" style="margin-left: 60px;width: 200px; color: black; font-family: Serif;font-size: 18px;" type="Submit" value ="Check">
    </div>
</form>

<!--<a href="<%=request.getContextPath()%>/DisplayServlet">Display</a>-->
    </body>
    
    <script src="js/bootstrap.min.js"></script>
   
</html>
