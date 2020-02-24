/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internet_banking;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Base64;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Sumanpc
 */
public class User_registration extends HttpServlet {

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
            String actype,fname,lname,ftname,dob,gender,occupation,annual_income,brname,brcode,country,state,
                    district,locality,zip_code,email,Phone_no;
                actype=request.getParameter("actype");
                fname= request.getParameter("fname");
                lname= request.getParameter("lname");
                ftname= request.getParameter("ftname");
                dob= request.getParameter("dob");
                gender= request.getParameter("gender");
                occupation= request.getParameter("occupation");
                annual_income= request.getParameter("annual_income");
                brname= request.getParameter("brname");
                brcode= request.getParameter("brcode");
                country= request.getParameter("country");
                state= request.getParameter("state");
                district= request.getParameter("district");
                locality= request.getParameter("locality");
                zip_code= request.getParameter("zip_code");
                email= request.getParameter("email");
                Phone_no= request.getParameter("Phone_no");
                Date date= new Date();
                long time = date.getTime();
               //String cif_no = String.valueOf(Math.random()).replaceAll("^\\d*\\.","");
                //Password = Password.substring(Password.indexOf("."));
                
                UserRegistrationGetSet ugs = new UserRegistrationGetSet();
                  ugs.setActype(actype);
                  ugs.setFname(fname);
                  ugs.setLname(lname);
                  ugs.setFtname(ftname);
                  ugs.setDob(dob);
                  ugs.setGender(gender);
                  ugs.setOccupation(occupation);
                  ugs.setAnnual_income(annual_income);
                  ugs.setBrname(brname);
                  ugs.setBrcode(brcode);
                  ugs.setCountry(country);
                  ugs.setState(state);
                  ugs.setDistrict(district);
                  ugs.setLocality(locality);
                  ugs.setZip_code(zip_code);
                  ugs.setEmail(email);
                  ugs.setPhone_no(Phone_no);
                  ugs.setTime(time);
                  ugs.setType("user");
                  HttpSession session =request.getSession();
                  session.setAttribute("mobile",Phone_no);
                  //time=Long.parseLong("1580024318694");
                  Databass d1 = new Databass();
                  int x=d1.insertuser_Details(ugs);
                  if(x==1)
                  {
                      String timeVal=String.valueOf(time);
                      String msg=Base64.getEncoder().encodeToString(timeVal.getBytes());
                        //String msg= org.apache.tomcat.util.codec.binary.Base64.encodeBase64String(timeVal.getBytes());
                       response.sendRedirect("Bankers/NewUserDocUpload.jsp?msg="+msg);
                  }
                  else
                  {
//                      String timeVal=String.valueOf(time);
//                      String msg=Base64.getEncoder().encodeToString(timeVal.getBytes());
                      response.sendRedirect("Bankers/AcForNew_user.jsp?Error=");
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
