<%@page import="com.internet_banking.Databass"%>
<%@page import="java.sql.ResultSet"%>
<%
    try{
        String email=request.getParameter("email");
        ResultSet rs=new Databass().userDetailsAdmin(email);
        if(rs.next())
        {  
           // String path="../uploads/"+rs.getString("photo");
            //table = "<td>"+rs.getString("first_name") +"</td>";
            //table = "<td>"+rs.getString("") +"</td><td>"+rs.getString("")+"00</td><td>"+rs.getString("")+"</td><td>"+rs.getString("")+"</td>";
             out.println(
                     "<div class='modal-dialog' role='document'>"
                          +"<div class='modal-content'>"
                     +"<div class='modal-header'>"
                        +"<h5 class='modal-title'>"+rs.getString("first_name")+" "+rs.getString("last_name")+"</h5>"
                     +"</div>"
                     +"<div class='modal-body'>" +
                        "<center>"
                        +"<table>"
                        +"<tr><td>Name: </td>"
                        + "<td>"+rs.getString("first_name")+" "+rs.getString("last_name")+"</td></tr>"+
                        "<tr><td>Occupation: </td>"
                        + "<td>"+rs.getString("accupation")+"</td></tr>"+
                        "<tr><td>District:</td>"
                        +"<td>"+rs.getString("district")+"</td></tr>"+
                        "<tr><td>Locality:</td>"
                        +"<td>"+rs.getString("locality")+"</td></tr>"+
                        "<tr><td>Account Type:</td>"
                        +"<td>"+rs.getString("ac_type")+"</td></tr>"+
                         "<tr><td>Account No:</td>"
                        +"<td>"+rs.getString("account_no")+"</td></tr>"+
                         "<tr><td>CIF NO</td>"
                        +"<td>"+rs.getString("cif_no")+"</td></tr>"+
                         "<tr><td>Phone No:</td>"
                        +"<td>"+rs.getString("phone_on")+"</td></tr>"+
                        "<tr>"+
                        "<td> <img src='../uploads/"+rs.getString("photo")+"' id='p_img'> </td>"+       
                        "</tr>"
                        +"</table>"+"</center>"
                     +"</div>"
                     +"<div class='modal-footer'>"                            
                              +"<button type='button' class='btn btn-secondary' data-dismiss='modal'>Close</button>"
                            +"</div>"
                          +"</div>"
                        +"</div>"
             );
        }
       
    }catch(Exception a){}
%>
<style type="text/css" rel="stylesheet">
    #p_img{
        position: absolute;
        right: 368px;
        bottom: 90px;
        width: 131px;
        height: 130px;
    }
    
</style>