/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internet_banking;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Sumanpc
 */
public class Within_bank_transfer extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try{
            /* TODO output your page here. You may use following sample code. */
           String oacc,bacc,passw;
           int amnt;
           oacc=request.getParameter("oacc");
           bacc=request.getParameter("bacc");
           //amnt=request.getParameter("amnt");
           amnt = Integer.parseInt(request.getParameter("amnt"));
           passw=request.getParameter("passw");
           Date date = new Date();
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
           String today=sdf.format(date);
           sdf = new SimpleDateFormat("hh:mm:ss a");
           String time=sdf.format(date);
            String deposit=("Dabit");
            String deposit2=("Credit");
           int a1=0,ta=0;
           ResultSet rs= new Databass().accno_detaliswith_pass(oacc,passw);
               if(rs.next())
               {
                   String email=rs.getString("email");
                   String type= rs.getString("ac_type");
                 // out.print(email);
                   //out.print(type);
                    a1=rs.getInt("amount");
                    int a2 = a1;
                    if(a2>=amnt)
                    {
                         ta=a1-amnt;
                         out.println(ta);
                          ResultSet rs1= new Databass().accno_detalis(bacc);
                            if(rs1.next())
                                 {
                                     String email2=rs1.getString("email");
                                     String type2= rs1.getString("ac_type");
                                     int a=rs1.getInt("amount");
                                    int ta1=a+amnt;
                                     int y=new Databass().with_in_Btransfer(ta1,bacc);
                                     if(y==1)
                                     {
                                         int y1= new Databass().insertcredit(bacc,today,time,amnt,deposit2,email2,type2);
                                         if(y1==1)
                                        {
                                             int x=new Databass().with_in_Btransfer(ta,oacc);
                                             if(x==1)
                                             {
                                                 int x1=new Databass().insertdabit(oacc,today,time,amnt,deposit,email,type);
                                                 if(x1==1)
                                                 {
                                                     response.sendRedirect("User/FundWb.jsp?msg=done");
                                                 }
                                            }
                                         }     
                                     }
                                 }
                            else                        
                            {
                                response.sendRedirect("User/FundWb.jsp?err=2");
                            }
                    }
                    else
                    {
                         response.sendRedirect("User/FundWb.jsp?err=31");
                    }                  
                }
                else
               {
                   response.sendRedirect("User/FundWb.jsp?err=3");
               }
        }
        catch(Exception ex)
        {
            out.print(ex);
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
