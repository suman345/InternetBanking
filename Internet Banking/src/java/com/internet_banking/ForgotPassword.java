/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internet_banking;

//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

import java.io.IOException;  
import java.io.PrintWriter;  
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse; 
/**
 *
 * @author Sumanpc
 */
public class ForgotPassword extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
         PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
          String email;//password;
           email= request.getParameter("email");
            ResultSet rs = new Databass().forgot_password(email);
            if(rs.next())
            {
                String type = rs.getString("type");
                if(type.equals("User") )
                {
                    ResultSet rs1 = new Databass().getuserDetails(email);
                    if(rs1.next())
                    {
                    String to=email;
                    String subject="Forgot Password";
                   // String msg="Dear "+rs1.getString("first_name")+" "+rs1.getString("last_name")+" "+" your password is :"+rs1.getString("password");
                   String msg ="<html>\n"+
                                    "<body>\n"+
                                    "<center>\n"+
                                     "  <table bgcolor=\"#66b3ff\">\n"+
                                     "      <tr>\n"+
                                     "         <td colspan=\\\"2\\\" width=\\\"400px\\\"><p class=\\\"navbar-brand\\\" style=\\\"font-family: Snap ITC; font-size: 28px;\\\"> <h2>NLDB Bank</h2> </p></td>\n"+
                                     "     </tr>\n"+
                                     //"         \n "+
                                     "       <tr>\n"+
                                     "          \n "+
                                    "         <td width=\\\"100px\\\" colspan=\\\"2\\\" align=\\\"Center\\\"><h3><u>Password:</u>  &nbsp;&nbsp; <font color=\\\"Blue\\\">"+rs1.getString("password")+"</font></h3></td>\n"+
                                     "         \n"+
                                     "        </tr>\n"+
                                     "        <tr>\n"+
                                     "          \n"+
                                     "          <td width=\\\"100px\\\" colspan=\\\"2\\\"><h4>Dear\""+rs1.getString("first_name")+" "+" "+rs1.getString("last_name")+" <br> Use the Password to Login <br> Your User ID: "+email+" </h4></td>"+
                                     "          \n"+
                                     "        </tr>\n"+
                                     "    <tr>\n"+
                                     "\n"+
                                     "        <td width=\\\"100px\\\" colspan=\\\"2\\\" align=\\\"right\\\"><h5>See You Soon <br>Team NLDB Bkank </h5></td>"+
                                     " \n"+
                                     "      </tr>\n"+
                                     "   </table>\n"+
                                     "</center>\n"+
                                     "</body>\n"+
                                "</html>";
                                      
                     Mailer.send(to, subject, msg);  
                     response.sendRedirect("Login/Login.jsp?mas=done");  
                    }
                    else
                    {
                        response.sendRedirect("Login/Login.jsp?mas=Error2"); 
                    }
                }
                if(type.equals("Banker"))
                {
                     ResultSet rs2 = new Databass().getBankerDetails(email);
                     if(rs2.next())
                     {
                         String to=email;
                         String subject="Forgot Password";
                         String msg="Dear "+rs2.getString("employe_name")+"  "+" your password is :"+rs2.getString("password");
                         response.sendRedirect("Login/Login.jsp?mas=done"); 
                         Mailer.send(to, subject, msg); 
                     }
                }
            }
            else
            {
                response.sendRedirect("Forgot_password/Forgot.jsp?mas=Error5");
            }
           
        }
        catch(Exception ex)
        {
           //out.println(ex.toString());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
