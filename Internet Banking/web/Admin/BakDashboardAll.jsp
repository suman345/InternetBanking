<%@page import="com.internet_banking.Databass"%>
<%@page import="java.sql.ResultSet"%>
<html>
    <head>
         <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Internet Banking</title>
<!--     Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" >
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
<!--    Boostrap Datatable-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.css">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css">
<!--
    Boostrap Datatable end
     Our Custom CSS -->
        <link rel="stylesheet" href="../Css/Admin_css/Adminhome.css">
<!--     Font Awesome JS -->
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js"></script>
    <script>
      function Activate(val)
        {
            
           var loc="ModifyBanket.jsp?activate="+val;
            window.location=loc;
        }
        function Reject(val)
        {
//            alert("d");
            var loc="ModifyBanket.jsp?Reject="+val;
            window.location=loc;
        }
        
//        function Details(val)
//        {    var loc="Details_Banker.jsp?Details="+val;
//            window.location=loc; 
//        }
    </script>
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
        <table class="table table-hover" id="suman">
            <thead>
              <tr>
                <th scope="col">ID</th>
                <th scope="col">Email</th>
                <th scope="col">Applicant Status</th>
                <th scope="col">Edit List </th>
                <th scope="col">Details</th>
              </tr>
            </thead>
            <tbody>
            <%
                try{
                     ResultSet rs=new Databass().BankerDetail();
                while(rs.next())
                {
            %>
              <tr>
                  <th scope="row"><%=rs.getString("id")%></th>
                <td><%=rs.getString("username")%></td>
                <td><%=(rs.getString("isActive").equals("1"))? "Approved":"Pending"%></td>
				<td>
                                    <%if(!rs.getString("isActive").equals("1"))
                                    {%>
                                        <button class="btn btn-sm btn-primary" onclick="Activate('<%=rs.getString("username")%>')"><i class="far fa-edit"></i> Activate</button>
                                    <%}
                                    else
                                    {%>
                                        <button class="btn btn-sm btn-danger" onClick="Reject('<%=rs.getString("username")%>')"><i class="fas fa-trash-alt"></i> Reject</button>
                                    <%}%>
                                  </td>        
                                  <td><button class="btn btn-sm btn-info" data-toggle="modal" data-target="#val" onclick="Details('<%=rs.getString("username")%>')"><i class="fas fa-info-circle"></i> Details</button> </td>     
                  
              </tr>
              <%                
                  }
                }catch(Exception a)
                {}
               %>
            </tbody>
          </table>
           </div>
        </div>
      </div>
                    <div class="modal" tabindex="-1" role="dialog" id="val">
                        <div class="modal-dialog" role="document">
                          <div class="modal-content">
                            <div class="modal-header">
                              <h5 class="modal-title">Banker Detlis</h5>
                              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                              </button>
                            </div>
                            <div class="modal-body">
                                <center>
                              <table id="tdval">
                              </table>                    
                                </center>
                            </div>
                            <div class="modal-footer">
                            
                              <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            </div>
                          </div>
                        </div>
                      </div>
  <!--jQuery CDN - Slim version (=without AJAX)--> 
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
     <!--Popper.JS--> 
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
     <!--Bootstrap JS--> 
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

    <script type="text/javascript">
        $(document).ready(function () {
            $('#sidebarCollapse').on('click', function () {
                $('#sidebar').toggleClass('active');
                $(this).toggleClass('active');
            });
        });
    </script>
        <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
	<script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>
	<script src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js"></script>
	<script>
		$(document).ready(function() {
			$('#suman').DataTable();
		} );
	</script>
        <script>
           function Details(eid)
           { 
               
           //  alert(eid);
                $.ajax({
                    type:'post',
                    url:'Details_Banker.jsp',
                    data:{email:eid},          
                    success:function(f){  
                      
                    console.log(f);
                    $('#tdval').html(f);
                }
                });
            }
        </script>
    </body>
</html>   