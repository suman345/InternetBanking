<%-- 
    Document   : test
    Created on : Jan 21, 2020, 8:25:16 PM
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
       
	<h3>Register Account</h3>
	<form method="post" action="../Testserv" enctype="multipart/form-data">
		<table border="0" cellpadding="2" cellspacing="2">
			<tr>
				<td>CIF No</td>
                                <td><input type="text" name="cifno" id="cifno" /></td>
			</tr>
			<tr>
				<td valign="top">Document</td>
				<td><input type="file" name="doc" /></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</form>

    </body>
</html>
