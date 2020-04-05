<%-- 
    Document   : ModifyUser
    Created on : Feb 5, 2020, 7:47:18 PM
    Author     : Sumanpc
--%>

<%@page import="com.internet_banking.Mailer"%>
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
                String to=email;               
                String subject="Admin Disided";
                String msg="Yor are Approub now login";
                Mailer.send(to, subject, msg);
                response.sendRedirect("UserDashboardAll.jsp");
            }
            catch(Exception ex){
                out.print(ex);
            }
            try{
                String email=request.getParameter("Reject");
                Databass db = new Databass();
                db.rejectUser(email);
                 String to=email; 
                 String subject="Admin Disided";
                 String msg="Yor are Rejeced you contact NLDB BANK";
                 Mailer.send(to, subject, msg); 
                response.sendRedirect("UserDashboardAll.jsp.jsp");
            }
            catch(Exception ex){
            out.print(ex);
            }
        %>
    </body>
</html>
