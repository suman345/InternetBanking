
<%@page import="java.sql.ResultSet"%>
<%@page import="com.internet_banking.Databass"%>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>Internet Banking</title>

    <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
    <!-- Our Custom CSS -->
    <link rel="stylesheet" href="../Css/Admin_css/Adminhome.css">

    <!-- Font Awesome JS -->
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js"></script>

</head>

<body>

    <div class="wrapper">
        <!-- Adminsidepanel start -->
        <%@include file="pagefiles/Admin_sidepanel.jsp" %>
        <!-- Adminsidepanel End -->
        <!-- Admin_navbar start -->
        <div id="content">
        <%@include file="pagefiles/Admin_navbar.jsp" %>
        <!-- Admin_navbar End -->
                 <div class="card">
           <table class="table table-hover">
              <thead>
              <center><h1>Bankers Detalis</h1></center>
                
                     <%
                         try{
                             String email=request.getParameter("Details").toString();
                             ResultSet rs=new Databass().Banker_Details(email);
                             while(rs.next())
                             {
                                     
                         
                         %>
                 <tr>     
                   <td scope="col">Employe Id</td>
                   <td><%= rs.getString("employee_id")%></td>
                 </tr>
                 <tr>
                   <td scope="col">Branch Name</td>
                   <td><%= rs.getString("branch_name")%></td>
                 </tr>
                 <tr>
                   <td scope="col">Branch Code </td>
                   <td><%= rs.getString("branch_code")%></td>
                 </tr>
                 <tr>
                   <td scope="col">IFSE CODE</td>
                   <td><%= rs.getString("ifsc_code")%></td>
                 </tr>
                 <tr>
                   <td scope="col">Employe Name</td>
                   <td><%= rs.getString("employe_name")%></td>
                 </tr>
                 <tr>
                   <td scope="col">Email</td>
                   <td><%= rs.getString("email")%></td>
                 </tr>
                 <tr>
                   <td scope="col">Phone NO</td>
                   <td><%= rs.getString("moblie_number")%></td>
                 </tr>
                 <tr>
                   <td scope="col">Aadher NO</td>
                   <td><%= rs.getString("aadhar_no")%></td>
                 </tr>
                 <tr>
                   <td scope="col">Pan NO</td>
                   <td><%= rs.getString("pan_number")%></td>
                   <!--<th scope="col">Update</th>-->
                 </tr>  
                 <%
                     }
}
catch(Exception ex){}
%>
               </thead>
               <tbody>
              <tr>
<!--                <th scope="row">1</th>
                <td>name 1</td>
                <td>Employee</td>
                <td>
                    <a class="btn btn-sm btn-primary" href="#"><i class="far fa-edit"></i> Approve</a>
                    <a class="btn btn-sm btn-danger" href="#"><i class="fas fa-trash-alt"></i> Reject</a>    
                </td>
                <td><a class="btn btn-sm btn-info" href="#"><i class="fas fa-info-circle"></i> Details</a> </td>-->
              </tr>
         
             
             
            </tbody>
          </table>
    </div>
        </div>
    </div>
    <!-- jQuery CDN - Slim version (=without AJAX) -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <!-- Popper.JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
    <!-- Bootstrap JS -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>

    <script type="text/javascript">
        $(document).ready(function () {
            $('#sidebar                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      Collapse').on('click', function () {
                $('#sidebar').toggleClass('active');
                $(this).toggleClass('active');
            });
        });
    </script>
</body>

</html>