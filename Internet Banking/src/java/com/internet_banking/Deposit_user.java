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
public class Deposit_user extends HttpServlet {

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
        try {
            /* TODO output your page here. You may use following sample code. */
            String acno;
            int amount;
            acno= request.getParameter("acno");
            amount = Integer.parseInt(request.getParameter("deposite"));
            Date date= new Date();
                //long time = date.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
            String today=sdf.format(date);
            sdf = new SimpleDateFormat("hh:mm:ss a");
            String time=sdf.format(date);
            String deposit=("Credit");
                ResultSet rs = new Databass().userdetalisFetch(acno);
                if(rs.next())
                {
                    int amount2=rs.getInt("amount");
                                    //out.println(amount2);
                    int amount3 = amount2+amount;
                    //out.println(amount3);
                    int rs1 = new Databass().user_Deposit(acno,amount3);                   
                    if(rs1 == 1)
                    {
                        Databass d1 = new Databass();
                        int x=d1.insertdepositdetalis(acno,amount,today,time, deposit);
                        if(x==1)
                        {
                            String to=rs.getString("email");
                            String subject="Deposit Ammount";
                            String mag="Dear Customer.. your credit Amount:" + amount+"Your Total Amount is"+amount3;
                            Mailer.send(to, subject, mag);
                            response.sendRedirect("Bankers/Banker_Home.jsp?msg=done");
                        }
                        else
                        {
                            response.sendRedirect("Bankers/Bdeposite.jsp?msg=error");
                        }
                    }
                    else
                    {
                        response.sendRedirect("Bankers/Bdeposite.jsp?msg=error3");
                    }
                }
                else
                {
                      response.sendRedirect("Bankers/Bdeposite.jsp?msg=error2");
                }
               
        }    
        catch (Exception ex) {
            //out.println(ex.toString());
             response.sendRedirect("Bankers/Bdeposite.jsp?msg=error2");
                
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
            Logger.getLogger(Deposit_user.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Deposit_user.class.getName()).log(Level.SEVERE, null, ex);
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