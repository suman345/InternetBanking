<%-- 
    Document   : User_Home
    Created on : Feb 15, 2020, 8:32:14 PM
    Author     : Sumanpc
--%>

<%@page import="com.internet_banking.Databass"%>
<%@page import="java.sql.ResultSet"%>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>FUND TRANSFER</title>
    
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="../Css/User_css/User_Home.css">    
    <script src="../Java_Script/User_js1/Fundwithin_bank.js"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js"></script>  
    <style>
                .login-wrap{
	width:100%;
	margin:auto;
	max-width:525px;
	min-height:835px;
	position:relative;
    background-color: #000aa3;
	box-shadow:0 12px 15px 0 rgba(255,255,255,0.9),0 17px 50px 0 rgba(255,255,255,0.9);
}
.login-html{
	width:100%;
	height:100%;
	position:absolute;
	padding:90px 70px 50px 70px;
	background: #000aa3;
}
.login-html .sign-in,
.login-html .sign-up,
.login-form .group .check{
	display:none;
}
.login-html .tab,
.login-form .group .label,
.login-form .group .button{
	text-transform:uppercase;
}

.login-form{
	min-height: 345px;
	position:relative;
	-webkit-transform-style:preserve-3d;
	        transform-style:preserve-3d;
}
.login-form .group{
	margin-bottom:15px;
}
.login-form .group .label,
.login-form .group .input,
.login-form .group .button{
	width:100%;
	display:block;
}
.login-form .group .input{
    height: 35px;
    color: blueviolet;
}
.login-form .group .input,
.login-form .group .button{
	border:none;
	padding:15px 20px;
	border-radius:25px;	background:rgba(255,255,255,0.89);
}
.login-form .group input[data-type="password"]{
	text-security:circle;
	-webkit-text-security:circle;
}
.login-form .group .label{
	color:#aaa;
	font-size:12px;
}
.login-form .group .button{
	background:#1161ee;
    color: white;
}
hr.hr-text {
  position: relative;
    border: none;
    height: 1px;
    background: #999;
}

hr.hr-text::before {
    content: attr(data-content);
    text-align: center;
    display: inline-block;
    background: #fff;
    font-weight: bold;
    font-size: 0.60rem;
    color: #000aa3;
    border-radius: 30rem;
    padding: 0.2rem 2rem;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
}
hr.solid{
    background: #999;
}
hr.dashed {
    border-top: 2px dashed #999;
}

.hd {
    color: #fff;
    text-align: center;    
}


    </style>
</head>
<body>
    <div class="wrapper">
        <%@include file="Pagefiles/User_sidepanel.jsp" %>
        <div id="content">
            <%@include file="Pagefiles/User_navbar.jsp" %>
            <!-- Form Start -->
            <div class="login-wrap">
                <div class="login-html">
                    <form method="POST" action="../Within_bank_transfer">
                    <div class="login-form">
                        <div class="hd">
                            <h3>Fund Transfer</h3>
                            <hr class="dashed">
                        </div>
                            <div class="group">
                                <label for="user" class="label">Enter Your Account Number</label>
                                <input name="oacc" id="oacc" type="text" class="input">
                                <hr data-content="Beneficiary_Details" class="hr-text">
                            </div>
                            <div class="group">
                                <label for="pass" class="label">Account Number</label>
                                <input name="baccl" id="baccl" type="text" class="input">
                            </div>
                            <div class="group">
                                <label for="pass" class="label">Confirm Account Number</label>
                                <input name="bacc" id="bacc" type="text" class="input">
                            </div>
                            <div class="group">
                                <label for="pass" class="label">IFSC Code</label>
                                <input name="ifsc1" id="ifsc1" type="password" class="input">
                            </div>
                            <div class="group">
                                <label for="pass" class="label">Amount</label>
                                <input name="amnt" id="amnt" type="text" class="input">
                            </div>
                            <hr class="solid">
                            <div class="group">
                                <label for="pass" class="label">Internet Banking Password</label>
                                <input name="passw" id="passw" type="password" class="input" data-type="password">
                            </div>
                            <div class="group">
                                <input type="submit" class="button" value="Send Money" onclick="return funwithB();">   
                            </div>
                        </div>
                      </form>
                    </div>
                </div>
            </div>      
            <!-- Form End -->          
        </div>          
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $('#sidebarCollapse').on('click', function () {
                $('#sidebar').toggleClass('active');
            });
        });
    </script>
</body>

</html>
