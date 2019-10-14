<head>
    <link rel="stylesheet" type="text/css" href="Css/NavMain_style.css">
   
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head> 
<!-- Navbar start -->
   
    <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="#"> My Bank </a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarColor01">
      <ul class="navbar-nav mc-auto">
           <li class="nav-item active">           
               <a class="nav-link" href="User/user_registration.jsp"> Home</a>
           </li>
        <li class="nav-item active">
            <a class="nav-link" href="#">Customer<span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item active">           
          <a class="nav-link" href="#"> Banker</a>
        </li>
        <li class="nav-item active">
          <a class="nav-link" href="#">Admin</a>
        </li>
         <li class="nav-item active">
          <ul class="nav navbar-nav navbar-right">
        <li class="dropdown" id="log">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown"  style="text-decoration: none;">Login<span class="caret"></span></a>
            <ul id="login-dp" class="dropdown-menu">
                <li>
                    <div class="row">
			<div class="col-md-12">  
                            <form class="form" role="form" method="post" action="login" accept-charset="UTF-8" id="login-nav">
				<div class="form-group">
                                    
                                    <input type="email" class="form-control" id="email" placeholder="Email address" required>
                                </div>
				<div class="form-group">
                                    
				    <input type="password" class="form-control" id="Password" placeholder="Password" required>
                                    <div class="help-block text-right"><a href="">Forget the password ?</a></div>
				</div>
				<div class="form-group">
                                    <button type="submit" class="btn btn-primary btn-block">Sign in</button>
                                </div>
				<div class="checkbox">
                                    <label>
                                        <input type="checkbox"> keep me logged-in
				    </label>
				</div>
                            </form>
			</div>
			<div class="bottom text-center">
                            New here ? <a href="#"><b>Join Us</b></a>
			</div>
                     </div>
		</li>
            </ul>
        </li>
      </ul>
        </li>
       </div> 
       <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="text" placeholder="Search">
      <button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
     </form>
    </nav>
    
    <!-- Navbar end -->
   <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>