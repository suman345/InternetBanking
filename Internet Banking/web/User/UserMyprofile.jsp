<%-- 
    Document   : User_Home
    Created on : Feb 15, 2020, 8:32:14 PM
    Author     : Sumanpc
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.internet_banking.Databass"%>

<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>Internet_Banking</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link rel="stylesheet" href="../Css/User_css/User_Home.css">
    <link rel="stylesheet" href="../Css/User_css/UserMyprofile.css">
    <script src="../Java_Script/User_js1/user_password_change.js"></script>
    <script src="../Java_Script/User_js1/User_profile_pictuer.js"></script>
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js"></script>
    
    <script>
        $(document).ready(function()
        {
            $('.pass_show').append('<span class="ptxt">Show</span>');  
        });
        $(document).on('click','.pass_show .ptxt', function(){
            $(this).text($(this).text() == "Show" ? "Hide" : "Show");
            $(this).prev().attr('type', function(index, attr){return attr == 'password' ? 'text' : 'password'; }); 
        });  
    </script>
    <script>
        function value()
        {
            document.getElementById('op').innerHTML="your password incorrect";
        }
        function Show()
        {
            document.getElementById('btnChangePicture').style.display="block";
        }
        function Show1()
        {
            document.getElementById('btnSubmitPicture').style.display="block";
        }
        function Hide()
        {
             document.getElementById('btnChangePicture').style.display="none";
             document.getElementById('btnSubmitPicture').style.display="none";
        }
    </script>
</head>

<body>
    <div class="wrapper">
        <%@include file="Pagefiles/User_sidepanel.jsp" %>
        <div id="content">
            <%@include file="Pagefiles/User_navbar.jsp" %>
            <!-- User Profile start -->
            <div class="container main-secction">
                <div class="row user-left-part">
                    <div class="image-container">
                        <form action="#" method="POST" enctype="multipart/form-data">
                            
                            <img src="https://www.jamf.com/jamf-nation/img/default-avatars/generic-user-purple.png"
                                id="imgProfile" class="img-thumbnail" width="180px;" height="22px;" />
                            <div class="middle">
                                <input type="button" class="btn btn-secondary" id="btnChangePicture" value="Change"
                                    onclick="Show1();" />
                                <input type="file"  id="profilePicture" name="Userproduct_file" style="display: none" />
                                <input class="btn btn-success" id="btnSubmitPicture" type="submit" value="Submit" style="display: none">
                            </div>
                        </form>
                    </div>
                   
                    <div class="col-md-12 col-sm-12 col-xs-12 pull-right profile-right-section">
                        <div class="row profile-right-section-row">
                            <div class="col-md-12">
                                <div class="row">
                                    <div class="col-md-12">
                                        <ul class="nav nav-tabs" role="tablist" id="myTab">
                                            <li class="nav-item">
                                                <a class="nav-link active" href="#acdet" role="tab" data-toggle="tab"><i
                                                        class="fas fa-user-circle" onclick="Show();"></i>Account Details</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="#profl" role="tab" data-toggle="tab"><i
                                                        class="fas fa-info-circle" onclick="Hide();"></i>Personal Details</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="#cntct" role="tab" data-toggle="tab"><i
                                                        class="fas fa-user-circle"></i>Contacts</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="#pass" role="tab" data-toggle="tab"><i
                                                        class="fas fa-user-circle"></i>Change Password</a>
                                            </li>
                                        </ul>
 <%
                          try{
                             String email;
                            email=session.getAttribute("bankerid").toString();
                            ResultSet rs = new Databass().myprofileuser_Details(email);
                            if(rs.next())
                           {
%>
                                        <!-- Tab panes -->
                                        <div class="tab-content">
                                            <div role="tabpanel" class="tab-pane fade show active" id="acdet">
                                                <div class="row">
                                                    <div class="col-md-3">
                                                        <label>CIF Number:</label>
                                                        <label><%= rs.getString("cif_no")%></label>
                                                        
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p id="cif1"></p>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-3">
                                                        <label>Account Number</label>
                                                        <label><%= rs.getString("account_no")%></label>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p id="acno1"></p>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-3">
                                                        <label>Branch Name</label>
                                                        <label><%= rs.getString("branch_name")%></label>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p id="brnm"></p>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-3">
                                                        <label>IFSC Code</label>
                                                        <label><%= rs.getString("cif_no")%></label>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p id="IFSC1"></p>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-3">
                                                        <label>MICR Code</label>
                                                        <label><%= rs.getString("cif_no")%></label>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p id="MICR"></p>
                                                    </div>
                                                </div>
                                            </div>
                                            <div role="tabpanel" class="tab-pane fade" id="profl">
                                                <div class="row">
                                                    <div class="col-md-6">
                                                        <label>Name</label>
                                                        <label><%= rs.getString("first_name")%></label>
                                                        <label><%= rs.getString("last_name")%></label>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p id="name1"></p>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-6">
                                                        <label>Father's Name</label>
                                                        <label><%= rs.getString("father_name")%></label>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p id="ftnm1"></p>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-6">
                                                        <label>Date of Birth</label>
                                                        <label><%= rs.getString("dob")%></label>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p id="dob1"></p>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-6">
                                                        <label>Gender</label>
                                                        <label><%= rs.getString("gender")%></label>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p id="gen1"></p>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-6">
                                                        <label>Occupation</label>
                                                        <label><%= rs.getString("accupation")%></label>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p id="occu1"></p>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-6">
                                                        <label>Annual Income</label>
                                                        <label><%= rs.getString("annual_income")%></label>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p id="anin"></p>
                                                    </div>
                                                </div>
                                            </div>
                                            <div role="tabpanel" class="tab-pane fade" id="cntct">
                                                <div class="row">
                                                    <div class="col-md-3">
                                                        <label>Mobile Number</label>
                                                        <label><%= rs.getString("phone_on")%></label>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p id="mob1"></p>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-3">
                                                        <label>Email</label>
                                                        <label><%= rs.getString("email")%></label>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p id="em1"></p>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-3">
                                                        <label>Locality</label>
                                                        <label><%= rs.getString("locality")%></label>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p id="lcl"></p>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-3">
                                                        <label>District</label>
                                                        <label><%= rs.getString("district")%></label>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p id="dis"></p>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-3">
                                                        <label>State</label>
                                                        <label><%= rs.getString("state")%></label>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p id="st1"></p>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-3 ">
                                                        <label>Country</label>
                                                        <label><%= rs.getString("country")%></label>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p id="cntry"></p>
                                                    </div>
                                                </div>
                                            </div>
<%
    }
}
    catch(Exception ex){
    out.print(ex);
}
%>
                                            <div role="tabpanel" class="tab-pane fade" id="pass">
                                                <div class="form-group">
                                                <div class="row">
                                                    <div class="col-sm-4">
                                                        
                                                        <form action="../Change_password_user" method="post" >
                                                            <label>Old Password</label>
                                                            <div class="form-group pass_show">
                                                                <input type="password" name="old_password" id="old_password" class="form-control" placeholder="Current Password">             
                                                            </div>
                                                               <div><label id="op" class="p_w" style="color:red"></label></div>
                                                            <label>New Password</label>
                                                            <div class="form-group pass_show">
                                                                <input type="password" name="new_password" id="new_password" class="form-control" placeholder="New Password">
                                                            </div>
                                                            <div><label id="np" class="p_w" style="color:red"></label></div> 
                                                            <label>Confirm Password</label>
                                                            <div class="form-group pass_show">
                                                                <input type="password" name="con_password" id="con_password" class="form-control" placeholder="Confirm Password">
                                                            </div>
                                                            <div><span id="cp"class="p_w" style="color:red"></span></div> 
                                                            <button type="submit" class="btn btn-success" onclick=" return change_password(); ">Change</button>
                                                            <button type="reset" class="btn btn-danger">Reset</button>
                                                        </form>
                                                    </div>
                                                </div>
                                                </div>
                                            </div>

                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- User Profile End -->
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