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
    <link rel="stylesheet" href="../Css/User_css/User_Home.css">    
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js"></script>   
    
</head>
<body>
    <div class="wrapper">
        <%@include file="Pagefiles/User_sidepanel.jsp" %>
        <div id="content">
            <%@include file="Pagefiles/User_navbar.jsp" %>
            <div class="container">
                <div class="row">
                    <div class="alert alert-warning alert-dismissible" role="alert">
                        <button type="button" onclick="this.parentNode.parentNode.removeChild(this.parentNode);" class="close" data-dismiss="alert"><span aria-hidden="true">×</span></button>
                        <marquee><p style="font-family: Lucida Handwriting; font-size: 18pt; color: blueviolet;">NLDB Bank never asks for confidential information sush as PIN and OTP from customers. Any such call can be made only by a fraudster. Please do not share personal information.</p></marquee>
                    </div>
                    <%
                        try{
                            
                            String email;
                            email=session.getAttribute("bankerid").toString();
                            ResultSet rs = new Databass().user_welcome(email);
                            if(rs.next())
                            {
                        %>
                        <div><h2 id="wc" style="color: red">hi&nbsp;<%=rs.getString("first_name") %>&nbsp;&nbsp;<%= rs.getString("last_name")%></h2></div>
                </div>
                        <%
                            }
                        }catch(Exception ex){

}
                            %>
            </div>
            
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
