 <%@page import="java.sql.ResultSet"%>
<%@page import="com.internet_banking.Databass"%>
<%-- 
    Document   : UserDashboardApp
    Created on : Feb 5, 2020, 1:49:57 PM
    Author     : Sumanpc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    <title>Internet Banking</title>

    <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
    <!-- Our Custom CSS -->
    <!--datatable link-->
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.css">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css">
    <!datatable link end-->
   <link rel="stylesheet" href="../Css/Admin_css/Adminhome.css">

    <!-- Font Awesome JS -->
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>

        
        
        
    </head>
    <body>
        
        <div class="wrapper">
        <!-- Adminsidepanel start -->
        <%@include file="pagefiles/Admin_sidepanel.jsp" %>
        <!-- Adminsidepanel End -->
        <!-- Admin_navbar start -->
        <div id="content">
        <%@include file="pagefiles/Admin_navbar.jsp" %>
        <!-- Admin_navbar End -->\
           <div class="card">
        
            
             <table class="table table-hover" id="suman">
            <thead>
              <tr>
                <th scope="col">ID</th>
                <th scope="col">Name</th>
                <th scope="col">Edit List </th>
                <th scope="col">Details</th>
              </tr>
            </thead>
            <tbody>
                 <%
                     try{
                         ResultSet rs= new Databass().userApprove();
                         while(rs.next())
                         {
                     
                 %>
                    
              <tr>
                  <th scope="row"><%=rs.getString("id")%></th>
                  <td><%=rs.getString("first_name")%>&nbsp;<%=rs.getString("last_name")%></td>
                <td>
                    <a class="btn btn-sm btn-danger" href="#"><i class="fas fa-trash-alt"></i> Reject</a>    
                </td>
                <td><a class="btn btn-sm btn-info" href="#"><i class="fas fa-info-circle"></i> Details</a> </td>
              </tr>  
             <%
                 }
                }
                catch(Exception ex){

                }
             %>
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
            $('#sidebarCollapse').on('click', function () {
                $('#sidebar').toggleClass('active');
                $(this).toggleClass('active');
            });
        });
    </script>
    
    <!-- java script link start-->
     <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
	<script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>
	<script src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js"></script>
	<script>
		$(document).ready(function() {
			$('#suman').DataTable();
		} );
	</script>
    </body>
</html>
