<%-- 
    Document   : ModifyUser
    Created on : Feb 5, 2020, 7:47:18 PM
    Author     : Sumanpc
--%>

<%@page import="com.internet_banking.Databass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            try{
                String email=request.getParameter("activate");
                Databass db = new Databass();
                db.activateUser(email);
                response.sendRedirect("UserDashboardAll.jsp");
            }
            catch(Exception ex){}
            try{
                String email=request.getParameter("Reject");
                Databass db = new Databass();
                db.rejectUser(email);
                response.sendRedirect("UserDashboardAll.jsp.jsp");
            }
            catch(Exception ex){}
        %>
    </body>
</html>
