<%-- 
    Document   : Bwithdrawl_ajax
    Created on : Feb 27, 2020, 8:51:00 PM
    Author     : Sumanpc
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.internet_banking.Databass"%>
<%
    try{
        String acno=request.getParameter("acno");
      
        ResultSet rs = new Databass().modelajax(acno);
       if(rs.next())
       {
         //out.print("hi");
           //rs.getSring("cif_no");
         out.println(rs.getString(8));
       }
       else
       {
           out.print("not");
       }
    }
    catch(Exception ex)
    {
        
    }
    
    
%>