<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title
    </head>
    <body>
        <form>
            <table align="center">
                <tr>
                    <td>Account Type</td>
                    <td><input type="text" name ="ac_type" id= "ac_type"></td>
                    <td><font color="red" id="a1"></font></td> 
                </tr>
                <tr>
                    <td>Account Number</td>
                    <td><input type="text" name="ac_number" id="ac_number"></td>
                    <td><font color="red" id="a2"></font></td> 
                </tr>
                <tr>
                    <td>Account Holder</td>
                    <td><input type="text" name="ac_holder" id="ac_holder"></td>
                    <td><font color="red" id="a2"></font></td> 
                </tr>
<!--                <tr>
                    <td>Branch Name</td>
                    <td><input type="text" name="branch_name" id="branch_name"></td>
                    <td><font color="red" id="a3"></font></td> 
                </tr>
                <tr>
                    <td>IFSE Code</td>
                   <td> <input type="text" name="ifse_code" id="ifse_code"></td>
                    <td><font color="red" id="a4"></font></td> 
                </tr>
                <tr>
                    <td>Email Id</td>
                    <td><input type="email" name="email" id="email"></td>
                    <td><font color="red" id="a5"></font></td> 
                </tr>
                <tr>
                    <td>Mobile No</td>
                    <td><input type="text" name="mobile_no" id="mobile_no"></td>
                    <td><font color="red" id="a6"></font></td> 
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password" id="password"></td>
                    <td><font color="red" id="a7"></font></td> 
                </tr>
                <tr>-->
                   <td colspan="2" align="center">
                       <input type="submit" onclick="return user_validation()"></td>
                </tr>     
            </table>   
        </form>
        <script src="../Java_Script/User_Registration.js"></script>
    </body>
</html>
