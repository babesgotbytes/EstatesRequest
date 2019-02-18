

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
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <a class="navbar-brand" href="#" style="font-size: 26px;"></a>

  <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
      <li class="nav-item active">
        <a class="nav-link" href="#" style="font-size: 22px;">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="index.html" style="font-size: 20px;">MakeReport</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="feedBackPage.jsp" style="font-size: 20px;">FeedBack</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="McomplainPage.jsp" style="font-size: 20px;">Make Complain</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="USerResetPwdPage.jsp" style="font-size: 20px;">Resetpassword</a>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="UserLogout.jsp" style="font-size: 19px">Logout</a>
      </li>
    </ul>
    
  </div>
</nav>
</body>
</html>

    
        <form method="post" action="Mcomplain" style="margin-left: 150px;margin-top: 60px">
            <h5>Send a Complain:</h5><br><br>
        <textarea  class="form-control" name="complain" style="width: 300px;height: 160px"></textarea>
       
        <button type="submit"class="btn btn-primary" id="butty" style="margin-left: 120px;margin-top: 45px;font-size: 18px;font-family: serif;"><i>Send</i></button>
        </form>
        </body>
</html>

