<%-- 
    Document   : Logout
    Created on : Nov 19, 2019, 5:01:59 PM
    Author     : Sumanpc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            session.invalidate();
            response.sendRedirect("index.jsp");
         %>
    </body>
</html>
