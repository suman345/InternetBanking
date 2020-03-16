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
           String oacc,bacc;
                   int amnt;
           oacc=request.getParameter("oacc");
           bacc=request.getParameter("bacc");
           //amnt=request.getParameter("amnt");
           amnt = Integer.parseInt(request.getParameter("amnt"));
           Date date = new Date();
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
           String today=sdf.format(date);
           sdf = new SimpleDateFormat("hh:mm:ss a");
           String time=sdf.format(date);
            String deposit=("Dabit");
            String deposit2=("Credit");
            
           ResultSet rs= new Databass().accno_detalis(oacc);
           {
               if(rs.next())
               {
                   String email=rs.getString("email");
                   String type= rs.getString("ac_type");
                 // out.print(email);
                   //out.print(type);
                   int a1=rs.getInt("amount");
                   int ta=a1-amnt;
                    //out.print(ta);
                    int x=new Databass().with_in_Btransfer(ta,oacc);
                    {
                       if(x==1)
                       {
                          // out.print("done");
                           int x1 =new Databass().insertdabit(oacc,today,time,amnt,deposit,email,type);
                           if(x1==1)
                           {
                               //out.print("success");
                               response.sendRedirect("User/FundWb.jsp?msg=done");
                           }
                       }
                    }
                    ResultSet rs1= new Databass().accno_detalis(bacc);
                    {
                        if(rs1.next())
                        {
                            String email2=rs1.getString("email");
                            String type2= rs1.getString("ac_type");
                           // out.print(email2);
                           // out.print(type2);
                            int a=rs1.getInt("amount");
                            int ta1=a+amnt;
                            //out.print(ta1);
                            int y=new Databass().with_in_Btransfer(ta1,bacc);
                            if(y==1)
                            {
                                //out.print("done1");
                                int y1= new Databass().insertcredit(bacc,today,time,amnt,deposit2,email2,type2);
                                if(y1==1)
                                {
                                    //out.print("kjhgfd");
                                    response.sendRedirect("User/FundWb.jsp?msg=done1");
                                }
                            }
                        }
                        else
                        {
                            response.sendRedirect("User/FundWb.jsp?msg=error");
                        }
                    }
                    
               }
               else
               {
                    response.sendRedirect("User/FundWb.jsp?msg=error");
               }
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
