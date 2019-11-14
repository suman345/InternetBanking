<%-- 
    Document   : Login
    Created on : 02-Nov-2019, 10:22:44
    Author     : Soumen-Pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
    <link rel="stylesheet" href="../Css/Login_css/Login_css.css">
        <title>login</title>
    </head>
    <body>
       <nav class="navbar navbar-expand-lg">
  <a class="navbar-brand" href="#">My Bank</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"><i class="fas fa-hamburger fa-lg"></i></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="home.html">Home <span class="sr-only">(current)</span></a>
      </li>
    </ul>
      <p id="signUpQuery">Don's have an account ? </p>
      <div class="dropdown">
      <button class="btn btn-md dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
        Sign Up
      </button>
      <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
        <a class="dropdown-item" href="#"><span><i class="fas fa-user"></i></span> Customer</a>
        <a class="dropdown-item" href="../Bankers/Banker_Registration.jsp"><span><i class="fas fa-user-tie"></i></span> Banker</a>
      </div>
    </div>
</div>
</nav>
    
        <form action="../Mainlogin" method="POST" style="max-width:500px;margin:auto; margin-top: 100px;">
      <h1 id="heading"><i class="fas fa-sign-in-alt fa-2x"></i>Login Here</h1>
      <div class="input-container">
        <i class="fa fa-envelope icon"></i>
        <input class="input-field" type="text" placeholder="Username" name="email" id="email">
      </div>
      <div> <span style="color:aqua;" id="emp2"></span></div>
      <div class="input-container">
        <i class="fa fa-key icon"></i>
        <input class="input-field" type="password" placeholder="Password" name="psw" id="password">
      </div>
      <div> <span style="color:aqua;" id="emp3"></span></div>
      <p id="forgetpw">Have you forgot your password ? >> <a href="#" style="color: black; font-size: 14px; font-style: italic; font-synthesis: weight;">Click here</a></p>
      <button type="submit" class="btn" id="Loginbtn" onclick="return login_validation();">Login</button>
      </form>
      
      
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="../Java_Script/Login_js/Login.js"></script>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    
  </body>
    </body>
</html>
