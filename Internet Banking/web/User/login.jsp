<html>
    <head>
        <title>login</title>
            <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
            <!--External css -->
            <link rel="stylesheet" type="text/css" href="../Css/Login_css.css">
 
    </head>
<!------ Include the above in your HEAD tag ---------->
<body>
    <%@include file="../File_Source/Navmain.jsp" %>
    <div id="login">
<!--        <h3 class="text-center text-white pt-5">Login form</h3>-->
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                        <form id="login-form" class="form" action="" method="post">
                            <h3 class="text-center text-info">Login</h3>
                            <div class="form-group">
                                <label for="username" class="text-info">Username:</label><br>
                                <input type="text" name="username" id="username" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="password" class="text-info">Password:</label><br>
                                <input type="password" name="password" id="password" class="form-control">
                            </div>
                             <div id="new_account" class="text-right">
                                <a href="#">Create New Account</a>
                            </div>
                        
                            <div class="form-group">
                                <label for="remember-me" class="text-info"><span>Remember me</span>�<span><input id="remember-me" name="remember-me" type="checkbox"></span></label><br>
                                <input type="submit" name="submit" class="btn btn-info btn-md" value="submit">
                            </div>
                            <div id="register-link" class="text-right">
                                <a href="#" class="text-info">Forget Password</a>
                            </div>
                         </form>  
                    </div>
                </div>
            </div>
       </div>
    </div>
    <br>    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <%@include file="../File_Source/Footermain.jsp" %>
            <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
            <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</body>
</html>