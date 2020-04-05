<%@page import="com.internet_banking.Databass"%>
<%@page import="java.sql.ResultSet"%>
<%
    try{
            String email=request.getParameter("email");
            ResultSet rs = new Databass().Banker_Details(email);
            {
                if(rs.next())
                {
                    out.print("<tr><td>Employee ID :</td>"
                            +"<td>"+ rs.getString("employee_id")+"</td></tr>"+
                            "<tr><td>Employee Name:</td>"
                            +"<td>"+ rs.getString("employe_name")+"</td></tr>"+
                            "<tr><td>Phone No:</td>"
                            +"<td>"+ rs.getString("moblie_number")+"</td></tr>"+
                            "<tr><td>Branch Code:</td>"
                            +"<td>"+ rs.getString("branch_code")+"</td></tr>"
                    );
                }
               
            }
        
       }
    catch(Exception ex){
        out.print(ex);
    }
%>