/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internet_banking;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class Withdrawa_userl extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
            /* TODO output your page here. You may use following sample code. */
           String acno=request.getParameter("acno");
           int amount=Integer.parseInt(request.getParameter("deposite"));
            String  actype = request.getParameter("actype");
           Date date= new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
            String today=sdf.format(date);
            sdf = new SimpleDateFormat("hh:mm:ss a");
            String time=sdf.format(date);
            String deposit=(" Debit");
                       ResultSet rs = new Databass().userdetalisFetch(acno,actype);
                       if(rs.next())
                       {
                           String email=rs.getString("email");
                           int amount2=rs.getInt("amount");
                           int amount3=amount2-amount;
                           int rs1 = new Databass().user_Deposit(acno,amount3);
                           if(rs1==1)
                           {
                               
                                Databass d1 = new Databass();
                                int x=d1.insertdepositdetalis(acno,amount,today,time, deposit,email,actype);
                                if(x==1)
                                {
                                   /* String to=rs.getString("email");
                                    String subject="Withdrawl Ammount";
                                    String mag="Dear Customer.. your Withdrawl Amount:" + amount+"Your Total Amount is"+amount3;
                                    Mailer.send(to, subject, mag);*/
                                   response.sendRedirect("Bankers/Banker_Home.jsp?msg=done");
                                }
                                else
                                {
                                   response.sendRedirect("Bankers/Bwithdrawl.jsp?msg=error1");
                                }
                           }
                           else
                             {
                               response.sendRedirect("Bankers/Bwithdrawl.jsp?msg=error3");
                            }
                  }
                  else
                  {
                      response.sendRedirect("Bankers/Bwithdrawl.jsp?msg=error2");
                  }
        }
        catch(Exception ex)
        {
            response.sendRedirect("Bankers/Bwithdrawl.jsp?msg=error5");
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
            Logger.getLogger(Withdrawa_userl.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Withdrawa_userl.class.getName()).log(Level.SEVERE, null, ex);
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
