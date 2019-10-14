<%-- 
    Document   : testred
    Created on : Oct 4, 2019, 9:49:53 PM
    Author     : Suman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function test()
            {
                var aa= document.getElementById("em").value;
                var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
                var flag=0;
                if(aa.match(mailformat))
                {
                    flag=1;
                    console.log("hi");
                }
                else
                {
                   console.log("done");
                }
                if(flag==0)
                {
                    return false;
                }
                else
                {
                    return true;
                }
            }
        </script>
    </head>
    <body>
        <form method="post">
            <label>Email</label>
            <input type="email" id="em">
            <input type="submit" value="test mail" onclick="return test()">
        </form>
    </body>
</html>
