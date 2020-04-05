/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internet_banking;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sumanpc
 */
public class Mainlogin extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Mainlogin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Mainlogin at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        try {
            processRequest1(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Mainlogin.class.getName()).log(Level.SEVERE, null, ex);
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

    private void processRequest1(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
       PrintWriter out = response.getWriter();
        String userid,password,type;
           userid=request.getParameter("email");
           password=request.getParameter("psw");
           if(userid.isEmpty() || password.isEmpty())
           {
                response.sendRedirect("Login/Login.jsp?msg=error2");
           }
           else
           {
                ResultSet rs =new Databass().CheckLogin(userid,password);
                if(rs.next())
                {
                   String isActive=rs.getString("isActive");
                   if(isActive.equals("0"))
                   {
                      response.sendRedirect("Login/Login.jsp?msg=error3");
                   }
                   else
                   {
                        type=rs.getString("type");
                        HttpSession session=request.getSession();
                        session.setAttribute("bankerid",userid); 
                        session.setAttribute("type",type);
                        if(type.equalsIgnoreCase("Banker"))
                        {
                            response.sendRedirect("Bankers/Banker_Home.jsp");
                        }
                        else
                        {
                            if(type.equalsIgnoreCase("Admin"))
                            {
                                response.sendRedirect("Admin/Adminhome.jsp");
                            }    
                            else
                            {
                                 if(type.equalsIgnoreCase("User"))
                                 {
                                       response.sendRedirect("User/User_Home.jsp");
                                    //out.println("fffffffff");
                                 }
                            }
                        }
                   }
                }
                else
                {
                    response.sendRedirect("Login/Login.jsp?msg=error1");
                }
               }
        }

    }


