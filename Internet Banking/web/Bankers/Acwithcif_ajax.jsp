<%-- 
    Document   : Acwithcif_ajax
    Created on : Feb 29, 2020, 1:43:13 PM
    Author     : Sumanpc
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.internet_banking.Databass"%>
<%
    try{
        String acno=request.getParameter("cif");
        ResultSet rs = new Databass().acwith_cifajax(acno);
        if(rs.next())
        {
            out.print(rs.getString(2));
        }
        else
        {
            out.print("not found");
        }
    }
    catch(Exception ex)
    {
        
    }
%>
