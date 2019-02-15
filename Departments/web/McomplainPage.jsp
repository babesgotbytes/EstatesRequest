<<%-- 
    Document   : feedBack
    Created on : Jan 14, 2019, 1:54:11 PM
    Author     : Calvince
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Complain</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </head>
    <body class="container-fluid">
    
        <form method="post" action="Mcomplain">
            <h5>Send a Complain:</h5><br><br>
        <textarea  class="form-control" name="complain" style="width: 300px;height: 200px"></textarea>
       
        <button type="submit"class="btn btn-info" id="butty" style="margin-left: 150px;margin-top: 5px;font-size: 18px;font-family: serif;"><i>Send</i></button>
        </form>
        </body>
</html>

