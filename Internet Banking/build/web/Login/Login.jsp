<%-- 
    Document   : Login
    Created on : 02-Nov-2019, 10:22:44
    Author     : Soumen-Pc
--%>
<%
    int err=0;
    try{
            String msg=request.getParameter("msg");
            if(msg.equals("error1"))
            {
                err = 1;
            }
            else
            {
                if(msg.equals("error2"))
                {
                    err = 2;
                }
                else
                {
                    if(msg.equals("error3"))
                    {
                        err=3;
                    }
                }
            }
        }
    catch(Exception ex)
    {
        
    }

 %>
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
    <script>
        function value()
        {
            document.getElementById('msg').innerHTML="The user id or password that you've entered is incorrect.";
        }
        function value2()
        {
            document.getElementById('msg').innerHTML="Username/Password can not Empty";
        }
        function value3()
        {
            document.getElementById('msg').innerHTML="You can't Login because Admin not Approve wait while of Time";
        }
         function gfg_Run() { 
                document.addEventListener('contextmenu',  
                        event => event.preventDefault()); 
                alert("Right click disabled"); 
            }
            $('#email').bind("cut copy paste",function(e) {
     e.preventDefault();
 });
    </script>
        <title>login</title>
    </head>
    <body onload="<% if(err==1){out.print("value()");}
                      else
                      {
                         if(err==2){out.print("value2()");}
                         else
                         {
                             if(err==3){out.print("value3()");}
                         }
                      }
          %>" oncontextmenu="gfg_Run()">
       <nav class="navbar navbar-expand-lg">
  <a class="navbar-brand" href="#">NDBL Bank</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"><i class="fas fa-hamburger fa-lg"></i></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
          <a class="nav-link" href="../index.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
    </ul>
      <p id="signUpQuery">Don's have an account ? </p>
      <div class="dropdown">
      <button class="btn btn-md dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
        Sign Up
      </button>
      <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
          <a class="dropdown-item" href="../User/UserRegister.jsp"><span><i class="fas fa-user"></i></span> Customer</a>
        <a class="dropdown-item" href="../Bankers/Banker_Registration.jsp"><span><i class="fas fa-user-tie"></i></span> Banker</a>
      </div>
    </div>
</div>
</nav>
    
        <form action="../Mainlogin" method="POST" style="max-width:500px;margin:auto; margin-top: 100px;">
      <h1 id="heading"><i class="fas fa-sign-in-alt fa-2x"></i>Login Here</h1>
      
      <div class="input-container">
        <i class="fa fa-envelope icon"></i>
        <input class="input-field" type="text" placeholder="Username" name="email" id="email" onCut="return false"   oncopy="return false" >
        <div> <span style="color:aqua;" id="emp2"></span></div>
      </div>
      <div class="input-container">
        <i class="fa fa-key icon"></i>
        <input class="input-field" type="password" placeholder="Password" name="psw" id="password" onCut="return false" oncopy="return false">
        <div> <span style="color:aqua;" id="emp3"></span></div>
      </div>
      <div id="msg" style="color: aliceblue; background-color: #000aa3; width: 90%; text-align: center; font-family: sans-serif; border-radius: 20%; margin-bottom: 20px;"></div>
      <div class="container">
          <div class="row">
              <div class="col-md-7">
                  <p id="forgetpw">Have you forgot your password ? >> <a href="../Forgot_password/Forgot.jsp" style="color: black; font-size: 14px; font-style: italic; font-synthesis: weight;">Click here</a></p> 
<!--                  <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal"> Open modal </button>-->
              </div>
              <div class="col-md-5 text-right">
      <button type="submit" class="btn btn-lg " id="Loginbtn" onclick="">Login</button>
      </div>
          </div>
      </div>
      </form>   
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="../Java_Script/Login_js/Login.js"></script>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    
  </body>
</html>
