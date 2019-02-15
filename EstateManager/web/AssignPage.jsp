

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
            <th>empID</th>
            <th>Name</th>
            <th>PhoneNumber</th>
            <th>Email</th>
            <th>Status</th>
            <!--<th>Assign</th>-->

                </tr>
                <c:forEach items="${list}" var="list">
                    <tr>
                        <td><c:out value="${list.id}"/></td>
                        <td><c:out value="${list.name}"/></td>
                        <td><c:out value="${list.number}"/></td>
                        <td><c:out value="${list.email}"/></td>
                        <td><c:out value="${list.status}"/></td>
                        
                       
                     
                </c:forEach>  
        </table> 
            
            
        <br>  
<!--        <p style="margin-top: 70px; margin-left: 200px; font-family: sans-serif; font-size: 60px "><b>Welcome Manager <br></b>
        <b style=" margin-top: 80px; margin-left: 130px; font-family: sans-serif; font-size: 30px ">Thank you for visiting The Estates Website</b></p>-->
   <!--               

		</tr>
        </table>
        
        <!--Connection conn = DatabaseConnection.getConnection();-->
        <a href="AddEmployeePage.jsp" style="font-family: 'sans-serif';font-size: 25px; color: black;float: right;">Add Employee</a>

        <form style="align: center" action="Renovation" method="POST">
        <p style="color: black;font-family:sans-serif;font-size: 20px;"><u><b>Assign Work To a free Employee</b></u></p>
        <label>Please select the employee to be assigned</label>
        <select  class="form-control" name="emp_id" id="" style="width: 400px" >
          <option value="" disabled selected>--Please choose--</option>";
            <%
            
          Connection conn = null;
          Statement st  = null;
          ResultSet rs = null;
            ResultSet resultSet = null;
             try{
                    Class.forName("com.mysql.jdbc.Driver");
                   String path="jdbc:mysql://localhost:3306/estates";
                   String user="root";
                   String pass="";
                 conn=DriverManager.getConnection(path,user,pass);
               
          
                 st = conn.createStatement();
                 
                 String qry = "select * from employee where emp_status='NOT ASSIGNED'";
                 rs = st.executeQuery(qry);
                 while (rs.next())
                 {
                                   
                             %>
                             <option value="<%=rs.getInt(1)%>"><%=rs.getString(2)%></option>  
                             <%
                                 
                     
     }   
                 
                 
          %>
                    <%   
                     
     
   }catch(Exception e){
    
     } 
%>
    
        </select>

        <br><br>
        <label>Choose work for the employee</label><br>
        <select class="form-control" name="jobdescription" id="" style="width: 400px">
            

           
            <option value=\"\" disabled selected>--Please choose--</option>";
             <%
            
             try{
             
                 st = conn.createStatement();
                 
                 String qry = "select id from report";
                 rs = st.executeQuery(qry);
                 while (rs.next())
                 {
                                   
                             %>
                             <option><%=rs.getString(1)%></option>  
                             <%
                                 
                     
     }
   }catch(Exception e){
    
     } 
%>
  
        </select>

        <br>
        <input  class="btn alert-dark" type="submit" name="submit" value="Submit" style=" color: black;width:150px;margin-left: 90px;">

        <br>
        <br>
    </form>
    </body>
    <script src="js/bootstrap.min.js"></script>
    
    <script>          
        function changeStatus(empid){
            
            window.location='ToggleAssigned?empId='+empid;
            
        }

       
    </script>
        
        <% 
            
            String passedValue=request.getParameter("passed_value");
        if(passedValue!=null){
            
            %>
             
            <script>
                
                alert("The user has been successfully saved");
            </script>
    
            <%
            
        }else{

            
}
        %>
       
</html>
