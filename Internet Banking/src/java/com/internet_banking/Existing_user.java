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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sumanpc
 */
public class Existing_user extends HttpServlet {

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
        try
        {
            String actype=request.getParameter("actype");
            String cif=request.getParameter("cif");
            ResultSet rs = new Databass().exiting_user(cif);
            Date date= new Date();
            long time = date.getTime();
            
                if(rs.next())
                {
                String fname,lname,ftname,dob,gender,occupation,annual_income,brname,brcode,country,state,
                    district,locality,zip_code,email,Phone_no,ip,in,ap,dn,p,s;
                fname=rs.getString("first_name");
               
                lname=rs.getString("last_name");
                ftname=rs.getString("father_name");
                dob=rs.getString("dob");
                gender=rs.getString("gender");
                occupation=rs.getString("accupation");
                annual_income=rs.getString("annual_income");
                brname=rs.getString("branch_name");
                brcode=rs.getString("branch_code");
                country=rs.getString("country");
                state=rs.getString("state");
                district=rs.getString("district");
                locality=rs.getString("locality");
                zip_code=rs.getString("zip_code");
                email=rs.getString("email");
                Phone_no=rs.getString("phone_on");
                //next table
               //String  ci=ip=rs.getString("cif_no");
                ip=rs.getString("identification_proof");
                in=rs.getString("id_number");
                ap=rs.getString("address_proof");
                dn=rs.getString("document_no");
                p=rs.getString("photo");
                s=rs.getString("signature");
                //s=rs.getString("phone_on");
                
                
                   Databass d1 =new Databass();
                   
                    int x= d1.inserExistingAc(actype,fname,lname,ftname,dob,gender,occupation,annual_income,brname,brcode,country,state,
                    district,locality,zip_code,email,Phone_no,cif);
                   
                    if(x==1)
                    {
                         int x1=d1.insertExistAcdou(cif,ip,in,ap,dn,p,s,time);
                         if(x1==1)
                         {
                             out.print("done1");
                         }
                         else
                         {
                             out.print("not1");
                         }
                    }
                    else
                    {
                       out.print("not "); 
                    }
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
