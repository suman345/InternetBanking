<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
    <link rel="stylesheet" href="../Css/Banker_css/Banker_Registration.css">
    <script src="../Java_Script/Banker_js/Banker_Registration.js"></script>
    

    <title>Banker's Registration</title>
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
    
      <form action="../Banker_Registration" method="POST" style="max-width:500px;margin:auto; margin-top: 30px; background-color: rgba(0,0,0,0.4); border-style: double; border-color: aliceblue; padding: 5px;">
      <h1 id="heading">Register Here</h1>
      <div class="input-container">
        <input class="input-field" type="text" title="Employee Id" placeholder="Employee Id" id="EmpId" name="EmpId">
       
        </div>
         <div> <span style="color:aqua;" id="emp1"></span></div>
         <div class="input-container">
        <input class="input-field" type="text" tilte=" Branch Name"placeholder="Branch Name" id="BranchNm" name="BranchNm">
        </div>
           <div> <span style="color:aqua;;" id="emp2"></span></div>
         <div class="input-container">
        <input class="input-field" type="text"  title="Branch Code "placeholder="Branch Code" id="BranchCd" name="BranchCd">
        </div>
             <div> <span style="color:aqua;" id="emp3"></span></div>
         <div class="input-container">
        <input class="input-field" type="text" title="IFSC Code"placeholder="IFSC Code" id="ifsc" name="ifsc">
        </div>
               <div> <span style="color:aqua;" id="emp4"></span></div>
         <div class="input-container">
             <input class="input-field" type="text" title="Employee Name" placeholder="Employee Name" id="EmpNm" name="EmpNm">
        </div>
                 <div> <span style="color:aqua;" id="emp5"></span></div>
        <div class="input-container">
          <input class="input-field" type="text" title="Email" placeholder="Email" name="email" id="email">
        </div>
                   <div> <span style="color:aqua;" id="emp6"></span></div>
         <div class="input-container">
        <input class="input-field" type="text" title="Mobile Number" placeholder="Mobile Number" id="MobNo" name="MobNo">
        </div>
                     <div> <span style="color:aqua;" id="emp7"></span></div>
         <div class="input-container">
             <input class="input-field" type="text" title="Aadhar Number" placeholder="Aadhar No" id="Aadhar" name="Aadhar">
        </div>
                       <div> <span style="color:aqua;;" id="emp8"></span></div>
         <div class="input-container">
        <input class="input-field" type="text" tilte="Pan Number" placeholder="Pan Number" id="Pan" name="Pan">
        </div>
                         <div> <span style="color:aqua;;" id="emp9"></span></div>
<!--        <div class="input-container">
        <input class="input-field" type="Password" placeholder="Password" id="Password" name="Password">
        </div>
                           <div> <span style="color:red;" id="emp10"></span></div>
        <div class="input-container">
        <input class="input-field" type="password" placeholder="Comfrim Password" id="Cpassword" name="Cpassword">
        </div>
                             <div> <span style="color:red;" id="emp11"></span></div>
      <div>-->
<!--        <input type="submit" class="btn" id="RegBtn" value="Register" oncilck="return bankers_validation()">
         <input type="submit" onclick="return user_validation()">-->
         <input type="submit" class="btn" id="RegBtn" value="Register" onclick="return bankers_validation();">
      </div>
      </form>
      
      
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    
  </body>
</html>