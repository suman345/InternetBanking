/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internet_banking;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sumanpc
 */
public class UserRegister extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           String cifno,accno,mbno,email,password;
           cifno=request.getParameter("cifno");
           accno=request.getParameter("accno");
           mbno=request.getParameter("mbno");
           email=request.getParameter("email");
           password=Random.getAlphaNumericString();
           ResultSet rs =new Databass().checkUserRegister(cifno,accno,mbno,email);
            if(rs.next())
            {
                
                    UserRegistergetset ur =new  UserRegistergetset();

                    ur.setCifno(cifno);
                    ur.setAccno(accno);
                    ur.setMbno(mbno);
                    ur.setEmail(email);
                    ur.setPassword(password);
                    ur.setType("User");

                    Databass d1=new Databass();  

                    int x = d1.user_register(ur);
                    if(x==1)
                    {
                        int y=d1.user_login(ur);
                        if(y==1)
                        {
                            String to=ur.getEmail();
                            String subject="Confirmation internet banking NLDB";
                            String msg="Dear Customer..  confirmed your apply internet banking. your user id:"+ur.getEmail()+" And Password :"+ur.getPassword();
                            Mailer.send(to, subject, msg);  
                            response.sendRedirect("Login/Login.jsp?mas=done");
                        }
                        else
                        {
                            response.sendRedirect("User/UserRegister.jsp?mag=Error1");
                        }
                    }
                    else
                    {
                       response.sendRedirect("User/UserRegister.jsp?mag=Error2");
                    }

            }
            else
            {
                
                response.sendRedirect("User/UserRegister.jsp?mag=Error3");
            }
        }
        
        catch(Exception ex)
        {
            
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
        processRequest(request, response);
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
        processRequest(request, response);
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
