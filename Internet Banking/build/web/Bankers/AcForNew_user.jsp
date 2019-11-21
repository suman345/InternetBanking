

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New user</title>
    </head>
    <body>
       <!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>Collapsible sidebar using Bootstrap 4</title>

    <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
    <!-- Our Custom CSS -->
    <link rel="stylesheet" href="../Css/Banker_css/BankerHome.css">
    <link rel="stylesheet" href="../Css/Banker_css/AcForNewUser.css"
    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">

    <!-- Font Awesome JS -->
    <script src="../Java_Script/User_js1/User_Registration.js">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/js/solid.js"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>
</head>

<body>

    <div class="wrapper">
        <!-- Sidebar  -->
        <%@include file="pagefiles/Banker_sidepanel.jsp" %>
        <!-- Page Content  -->
        <div id="content">

            <%@include file="pagefiles/Banker_navbar.jsp" %>
                <div class="container">
                  <ul class="nav nav-tabs">
                    <li class="nav-item">
                      <a class="nav-link" href="#pdetails"></a>
                    </li>
                  </ul>
                </div>
                <div class="tab-content">
                <div class="tab-pane active" id="pdetails">
                    <form action="../User_registration" method="POST" id="newacreg">
                        <h3 class="register-heading">Application for New Account</h3>
                                <div class="row register-form">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                         <select class="form-control" name="actype" id="actype" size="1">
                                             <option value="" disabled="" selected="">Select Account Type</option>
                                            <option value="savings">Savings</option>
                                            <option value="current">Current</option>
                                         </select>
                                        </div>
                                        <div> <span style="color:red;" id="cus1"></span></div>
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="First Name *" id="fname" name="fname" value="">
                                        </div>
                                        <div> <span style="color:red;" id="cus2"></span></div>
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="Last Name *" id="lname" name="lname" value="">
                                        </div>
                                        <div> <span style="color:red;" id="cus3"></span></div>
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="Father's Name *" id="ftname" name="ftname" value="">
                                        </div>
                                        <div> <span style="color:red;" id="cus4"></span></div>
                                        <div class="form-group">
                                            <input type="date" class="form-control"  placeholder="Date of Birth *" value=""name="dob" id="dob">
                                        </div>
                                        <div> <span style="color:red;" id="cus5"></span></div>
                                        <div class="form-group">
                                            <div class="maxl">
                                                <label class="radio inline"> 
                                                    <input type="radio" name="gender" id="gender"value="male" checked>
                                                    <span> Male </span> 
                                                </label>
                                                <label class="radio inline"> 
                                                    <input type="radio" name="gender" id="gender" value="female">
                                                    <span> Female </span> 
                                                </label>
                                                <label class="radio inline"> 
                                                    <input type="radio" name="gender" id="gender" value="other">
                                                    <span> Other </span> 
                                                </label>
                                            </div>
                                        </div>
                                         <div class="form-group">
                                            <input type="text" class="form-control"  placeholder="Applicant's Occupation *" value="" name="occupation" id="occupation">
                                        </div>
                                        <div> <span style="color:red;" id="cus7"></span></div>
                                         <div class="form-group">
                                            <input type="text" class="form-control"  placeholder="Annual Income *" value="" name="annual_income" id="annual_income">
                                        </div>
                                        <div> <span style="color:red;" id="cus8"></span></div>
                                    </div>
                                    <div class="col-md-6">
                                          <div class="form-group">
                                         <input type="text" class="form-control" placeholder="Branch Name *" id="brname" name="brname" value="">  
                                          </div>
                                        <div> <span style="color:red;" id="cus9"></span></div>
                                        <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Branch Code *" id="brcode" name="brcode" value="">  
                                        </div>
                                        <div> <span style="color:red;" id="cus10"></span></div>
                                        <div class="form-group">
                                           <select class="form-control" name="country" id="country" size="1">
                                               <option value="" disabled="" selected="">Select your Country</option>
                                            <option value="INDIA" >INDIA</option>
                                            </select>
                                            </div>
                                        <div> <span style="color:red;" id="cus11"></span></div>
                                            <div class="form-group">
                                            <select class="form-control" name="state" id="state" size="1">
                                                <option value="" disabled="" selected="">Select your State</option>
                                                <option value="WEST BENGAL">WEST BENGAL</option>
                                            </select>
                                             </div>
                                        <div> <span style="color:red;" id="cus12"></span></div>
                                            <div class="form-group">
                                            <select class="form-control" name="district" id="district" size="1">
                                                <option value="" disabled="" selected="">Select your District </option>
                                            <option value="HOWRAH">HOWRAH</option>
                                            </select>
                                        </div>
                                        <div> <span style="color:red;" id="cus13"></span></div>
                                         <div class="form-group">
                                            <input type="text" class="form-control" placeholder="Locality *" name="locality" id="locality" value="">
                                        </div>
                                        <div> <span style="color:red;" id="cus14"></span></div>
                                         <div class="form-group">
                                            <input type="text" class="form-control" placeholder="Zip Code *" name="zip_code" id="zip_code" value="">
                                        </div>
                                        <div> <span style="color:red;" id="cus15"></span></div>
                                        <div class="form-group">
                                            <input type="email" class="form-control" placeholder="Email *"name="email" id="email" value="">
                                        </div>
                                        <div> <span style="color:red;" id="cus16"></span></div>
                                        <div class="form-group">
                                            <input type="text" minlength="10" maxlength="10" class="form-control" placeholder="Phone *" name="Phone_no" id="Phone_no"value="">
                                        </div>
                                        <div> <span style="color:red;" id="cus17"></span></div>
                                        <input type="submit" class="btn btn-lg btnRegister"  value="Submit" onclick="return user_validation1();">
                                    </div>
                                </div>
                    </form>
                    </div>
            </div>
        </div>
    </div>

    <!-- jQuery CDN - Slim version (=without AJAX) -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <!-- Popper.JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
    <!-- Bootstrap JS -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
    <!-- jQuery Custom Scroller CDN -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js"></script>

    <script type="text/javascript">
        $(document).ready(function () {
            $("#sidebar").mCustomScrollbar({
                theme: "minimal"
            });

            $('#sidebarCollapse').on('click', function () {
                $('#sidebar, #content').toggleClass('active');
                $('.collapse.in').toggleClass('in');
                $('a[aria-expanded=true]').attr('aria-expanded', 'false');
            });
        });
    </script>
</body>

</html>
    </body>
</html>
