/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internet_banking;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sumanpc
 */
public class Banker_Registration extends HttpServlet {

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
           String EmpId,BranchNm,BranchCd,ifsc,EmpNm,email,MobNo,Aadhar,Pan,Password;
           EmpId= request.getParameter("EmpId");
           BranchNm= request.getParameter("BranchNm");
           BranchCd= request.getParameter("BranchCd");
           ifsc= request.getParameter("ifsc");
           EmpNm= request.getParameter("EmpNm");
           email= request.getParameter("email");
           MobNo= request.getParameter("MobNo");
           Aadhar= request.getParameter("Aadhar");
           Pan= request.getParameter("Pan");
           //Password= request.getParameter("Password");
           Password = String.valueOf(Math.random()).replaceAll("^\\d*\\.","");
           //Password = Password.substring(Password.indexOf("."));
           BankersRegistrationGetSet bgs=new BankersRegistrationGetSet();
           bgs.setEmpId(EmpId);
           bgs.setBranchNm(BranchNm);
           bgs.setBranchCd(BranchCd);
           bgs.setIfsc(ifsc);
           bgs.setEmpNm(EmpNm);
           bgs.setEmail(email);
           bgs.setMobNo(MobNo);
           bgs.setAadhar(Aadhar);
           bgs.setPan(Pan);
           bgs.setPassword(Password);
           bgs.setType("Banker");
           Databass d1=new Databass();
           int x=d1.InsertBankerdetails(bgs);
           if(x==1)
           {
               int y=d1.banker_login(bgs);
               if(y==1)
               {
                    response.sendRedirect("Login/Login.jsp?mas=done");
               }
               else
               {
                   response.sendRedirect("Bankers/Banker_Registration.jsp?Error=1");
               }
           }
           else
           {
               response.sendRedirect("Bankers/Banker_Registration.jsp?Error=2");
           }
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
