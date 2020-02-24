<!doctype html>
<%
    int err=0;
    try{
        String msg=request.getParameter("mag");
        if(msg.equals("Error3"))
        {
            err=1;
        }
    }
    catch(Exception ex)
    {
        
    }
    %>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
    <link rel="stylesheet" href="../Css/Banker_css/Banker_Registration.css">
    <script src="../Java_Script/User_js1/User_Register.js"></script>
    <script>
        function value()
        {
            document.getElementById('err1').innerHTML="Invalied Account";
        }
        </script>

    <title>User's Registration</title>
  </head>
  <body onload="<% if(err==1){out.print("value()");}%>">
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
      <p id="Query">Already have an account ? </p>
      <div class="dropdown">
          <a href="../Login/Login.jsp">
           <button class="btn btn-md" type="button" id="logButton">
        Login
      </button>
          </a>
    </div>
</div>
</nav>
    
      <form  action="../UserRegister" method="POST" style="max-width:500px;margin:auto; margin-top: 30px; background-color: rgba(0,0,0,0.4); border-style: double; border-color: aliceblue; padding: 5px;">
      <h1 id="heading">Apply</h1>
      <div class="input-container">
        <input class="input-field" type="text" title="CIF Number" placeholder="CIF Number" id="cifn" name="cifno">    
        </div>
      <div> <span style="color:aqua;" id="us1"></span></div>
      <div class="input-container">
        <input class="input-field" type="text" title="Account Number" placeholder="Account Number" id="acn" name="accno">    
        </div>
      <div> <span style="color:aqua;" id="us2"></span></div>
      <div class="input-container">
        <input class="input-field" type="text" title="Mobile Number" placeholder="Registered mobile Number" id="mbn" name="mbno">    
        </div>
      <div> <span style="color:aqua;" id="us3"></span></div>
      <div class="input-container">
        <input class="input-field" type="text" title="Email" placeholder="Email" id="eml" name="email">    
        </div>
      <div id="err1" style="position:relative;color:red;left:210px" ></div>
        <div> <span style="color:aqua;" id="us4"></span></div>
        <div>
            <input type="submit" class="btn" id="RegBtn" value="Register" onclick="return user_register();">
      </div>
      </form>
      
      
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    
  </body>
</html>