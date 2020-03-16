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

    <title>Internet_Banking</title>
    
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
    
      <link rel="stylesheet" href="../Css/User_css/FundWb.css">
    <link rel="stylesheet" href="../Css/User_css/User_Home.css">    
    
   
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js"></script>   
   
</head>
<body>
    <div class="wrapper">
        <%@include file="Pagefiles/User_sidepanel.jsp" %>
        <div id="content">
            <%@include file="Pagefiles/User_navbar.jsp" %>
              <!--Transaction form-->
              
             <div class="container contact-form">
                <div class="contact-image">
                <img src="https://image.ibb.co/kUagtU/rocket_contact.png" alt="rocket_contact"/>
                </div>
                 <form method="post" action="../Within_bank_transfer">
                <input type="text" name="oacc" id="oacc" class="form-control" placeholder="Enter Your Account Number *" value="" />
                <h3><b><u>Benificiary Details</u></b></h3>
                <input type="text" name="bacc1" id="bacc" class="form-control" placeholder="Enter Account Number *" value="" />
                <input type="text" name="bacc" id="bacc1" class="form-control" placeholder="Confirm Account number *" value="" />
                <input type="text" name="ifsc1" id="ifsc1" class="form-control" placeholder="Enter IFSC Code *" value="" /> 
                <input type="text" name="amnt" id="amnt" class="form-control" placeholder="Enter Amount *" value="" />
                <div class="line"></div>
                <input type="text" name="passw" id="passw" class="form-control" placeholder="Enter Your Internet Banking Password *" value="" />
                <input type="submit" name="su" id="su" class="btn" value="Send Amount" />
                 </form>
            </div>
              
              <!--Transaction form-->
        </div>        
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
