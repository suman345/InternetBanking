<%@page import="java.sql.ResultSet"%>
<%@page import="com.internet_banking.Databass"%>
<!DOCTYPE html>
<%
                String cif=request.getParameter("cif");
                    try
                    {
                        
                        ResultSet rs1 = new Databass().acc_detalisfetch(cif);
                        if(rs1.next())
                        {
                            
                        }
                        else
                        {
                             response.sendRedirect("AcWithCIF.jsp");
                        }
                    }
                    catch(Exception ex){
                    
                    }
                    
%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>internet Banking</title>
    <!--hiigit-->

    <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" >
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
    <!-- Our Custom CSS -->
    <link rel="stylesheet" href="../Css/Banker_css/BankerHome.css">
    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">

    <!-- Font Awesome JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/js/solid.js"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js"></script>
</head>

<body>
    <div class="wrapper">
        <!-- Sidebar  -->
        <%@include file="pagefiles/Banker_sidepanel.jsp" %>
        <!-- Page Content  -->
          <div id="content">
            <%@include file="pagefiles/Banker_navbar.jsp" %>           
                               <form action="../Existing_user" method="POST" id="cifac">
                                   <%
                    try{
                        ResultSet rs=new Databass().acc_detalisfetch(cif);
                        if(rs.next())
                        {
                        
                        
             %>
                                <div class="row register-form">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                         <select class="form-control" name="actype" id="actype" size="1">
                                             <option value="" disabled="" selected="">Select Account Type</option>
                                            <option value="savings">Savings</option>
                                            <option value="current">Current</option>
                                         </select>
                                            <div> <span style="color:red;" id="cus1"></span></div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="First Name *" id="fname" name="fname" value="<%=rs.getString("first_name")%>">
                                            <div> <span style="color:red;" id="cus2"></span></div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="Last Name *" id="lname" name="lname" value="<%=rs.getString("last_name")%>">
                                             <div> <span style="color:red;" id="cus3"></span></div>
                                        </div>
                                       
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="Father's Name *" id="ftname" name="ftname" value="<%=rs.getString("father_name")%>">
                                             <div> <span style="color:red;" id="cus4"></span></div>
                                        </div>
                                       
                                        <div class="form-group">
                                            <input type="date" class="form-control"  placeholder="Date of Birth *" value="<%=rs.getString("dob")%>"name="dob" id="dob">
                                        </div><div> <span style="color:red;" id="cus5"></span></div>
                                        <div class="form-group">
                                            <input type="text" class="form-control"  placeholder="Gender *" value="<%=rs.getString("first_name")%>"name="gen" id="gen">
                                        </div><div> <span style="color:red;" id="cus6"></span></div>
                                        
                                         <div class="form-group">
                                            <input type="text" class="form-control"  placeholder="Applicant's Occupation *" value="<%=rs.getString("accupation")%>" name="occupation" id="occupation">
                                            <div> <span style="color:red;" id="cus7"></span></div>
                                        </div>
                                        
                                         <div class="form-group">
                                            <input type="text" class="form-control"  placeholder="Annual Income *" value="<%=rs.getString("annual_income")%>" name="annual_income" id="annual_income">
                                            <div> <span style="color:red;" id="cus8"></span></div>
                                            
                                        </div>
                                            <div class="form-group">
                                            <input type="text" class="form-control"  placeholder="CIF NO *" value="<%=rs.getString("cif_no")%>" name="cif" id="annual_income">
                                            <div> <span style="color:red;" id="cus8"></span></div>
                                            
                                        </div>   
                                    </div>
                                    <div class="col-md-6">
                                          <div class="form-group">
                                         <input type="text" class="form-control" placeholder="Branch Name *" id="brname" name="brname" value="<%=rs.getString("branch_name")%>">  
                                         <div> <span style="color:red;" id="cus9"></span></div>
                                          </div>
                                        
                                        <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Branch Code *" id="brcode" name="brcode" value="<%=rs.getString("branch_code")%>">  
                                        <div> <span style="color:red;" id="cus10"></span></div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="Country *" id="country" name="country" value="<%=rs.getString("country")%>"> 
                                             <div> <span style="color:red;" id="cus11"></span></div>
                                            </div>
                                        
                                            <div class="form-group">
                                        <input type="text" class="form-control" placeholder="State *" id="state" name="state" value="<%=rs.getString("state")%>">  
                                         <div> <span style="color:red;" id="cus12"></span></div>
                                             </div>
                                        
                                            <div class="form-group">
                                        <input type="text" class="form-control" placeholder="District *" id="district" name="district" value="<%=rs.getString("district")%>">  
                                         <div> <span style="color:red;" id="cus13"></span></div>
                                        </div>
                                        
                                         <div class="form-group">
                                            <input type="text" class="form-control" placeholder="Locality *" name="locality" id="locality" value="<%=rs.getString("locality")%>">
                                            <div> <span style="color:red;" id="cus14"></span></div>
                                        </div>
                                        
                                         <div class="form-group">
                                            <input type="text" class="form-control" placeholder="Zip Code *" name="zip_code" id="zip_code" value="<%=rs.getString("zip_code")%>">
                                              <div> <span style="color:red;" id="cus15"></span></div>
                                        </div>
                                      
                                        <div class="form-group">
                                            <input type="email" class="form-control" placeholder="Email *"name="email" id="email" value="<%=rs.getString("email")%>">
                                            <div> <span style="color:red;" id="cus16"></span></div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <input type="tel" class="form-control" placeholder="Phone *" name="Phone_no" id="Phone_no"value="<%=rs.getString("phone_on")%>">
                                             <div> <span style="color:red;" id="cus17"></span></div>
                                        </div>
                                        
                                        <input type="submit" class="btn btn-lg btnRegister"  value="Submit" onclick="" >
                                    </div>
                                </div>
                                       <%
                            }
                           }
                           
                    catch(Exception ex){

}
                        %>
                            </form>
                 
    </div>
    </div>

    <!-- jQuery CDN - Slim version (=without AJAX) -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <!-- Popper.JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
    <!-- Bootstrap JS -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
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