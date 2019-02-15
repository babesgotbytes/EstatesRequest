<%-- 
    Document   : page1
    Created on : Feb 14, 2019, 9:10:02 PM
    Author     : CLARICE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
            <table>
        <tr>
            
            <th>Category</th>
            <th> Category name</th>
            <th>Property name</th>
            <th> Damage</th>
            

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
    </body>
</html>
