<%-- 
    Document   : Registration
    Created on : Sep 10, 2019, 9:05:07 PM
    Author     : Suman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="../Css/User_Registration.css">
        <script src="../Java_Script/Banker_Registration.js"></script>
    </head>
    <body>
        <%@include file="../File_Source/Navmain.jsp" %>
        <form name="reg" action="../banker_registration" method="post">
            <table align="center" >
                <th colspan="3">
                    <td>
                        <center><h1>Registration Form</h1></center>
                    </td>
                </th>
                <tr>
                    <td> First Name:</td>
                    <td><input type="text" name="fname" id="fname"></td>
                    <td><font color="red" id="fname1"></font></td>
                </tr>
                <tr>
                    <td> Last Name:</td>
                    <td><input type="text"name="lname" id="lname"></td>
                    <td> <font color="red" id="lname1"></td>
                </tr>
                <tr>
                    <td> Date of Birth:</td>
                    <td><input type="text"name="dob" id="dob"></td>
                    <td> <font color="red" id="dob1"></td>
                </tr>
                <tr>
                    <td>Gender:</td>
                    <td>male<input type="radio" name="gender" value="male" id="gender">
                    female<input type="radio" name="gender" value="female" id="gender"></td>
                    <td><font color="red" id="gender1"></td>
                </tr>
                
               <!-- <tr>
                    <td> Father's Name:</td>
                    <td><input type="text"name="ftname" id="fathername"></td>
                    <td> <font color="red" id=fathername1"></td>
                </tr>-->
               <tr>
                   <td>Father Name:</td>
                   <td> <input type="text" name="fathername" id="fathername"></td>
                   <td><font color="red" id="fathername1"></td>
               </tr>
                <tr>
                    <td> State:</td>
                    <td><input type="text"name="state" id="state"></td>
                    <td> <font color="red" id="state1"></td>
                </tr>
                <tr>
                    <td> district:</td>
                    <td><input type="text"name="district" id="district"></td>
                    <td> <font color="red" id="district1"></td>
                </tr>
                <tr>
                    <td> Area:</td>
                    <td><input type="text"name="area" id="area"></td>
                    <td> <font color="red" id="area1"></td>
                </tr>
                <tr>
                    <td> Zip Code:</td>
                    <td><input type="text"name="zip" id="zip"></td>
                    <td> <font color="red" id="zip1"></td>
                </tr>
                <tr>
                    <td> Mobile Number:</td>
                    <td><input type="text" name="number" id="number"></td>
                    <td><font color="red" id="number1"></td>
                </tr>
                <tr>
                   <td>Email:</td>
                   <td><input type="email" name="email" id="email">
                   <td><font color="red" id="email1"></td>
                </tr>
                 <tr>
                    <td> Branch Name:</td>
                    <td><input type="text" name="bname" id="bname"></td>
                    <td><font color="red" id="bname1"></font></td>
                </tr>
                <tr>
                    <td> AAdhar No:</td>
                    <td><input type="text" name="aadhar" id="aadhar"></td>
                    <td><font color="red" id="aadhar1"></font></td>
                </tr>
                  <tr>
                    <td>Pan No:</td>
                    <td><input type="text" name="pan" id="pan"></td>
                    <td><font color="red" id="pan1"></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password" id="password"></td>
                    <td><font color="red" id="password1"></td>
                </tr>
                 <tr>
                    <td>Confirm Password:</td>
                    <td><input type="password" name="cpassword" id="cpassword"></td>
                    <td><font color="red" id="cpassword1"></td>
                </tr>
                
                <tr>
                   <td colspan="2" align="center">
                       <input type="submit" value="submit" onclick="return validation();"></td>
                </tr>
            </table>
       </form>
        <%@include file="../File_Source/Footermain.jsp"%>
    </body>
</html>
