/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internet_banking;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Suman
 */
@WebServlet(name = "banker_registration", urlPatterns = {"/banker_registration"})
public class banker_registration extends HttpServlet {
    
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
            out.println("<title>Servlet banker_registration</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet banker_registration at " + request.getContextPath() + "</h1>");
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
        processRequest1(request, response);
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

    private void processRequest1(HttpServletRequest request, HttpServletResponse response) {
    try{
            PrintWriter out =response.getWriter();
            String first_name,last_name,dob,gender,father_name,state,district,area,zip,mobile_no,email,branch_name,aadhar_no,pan_no,password;
            first_name=request.getParameter("fname");
            last_name=request.getParameter("lname");
            dob=request.getParameter("dob");
            gender=request.getParameter("gender");
            father_name=request.getParameter("fathername");
            state=request.getParameter("state");
            district=request.getParameter("district");
            area=request.getParameter("area");
            zip=request.getParameter("zip");
            mobile_no=request.getParameter("number");
            email=request.getParameter("email");
            branch_name=request.getParameter("bname");
            aadhar_no=request.getParameter("aadhar");
            pan_no=request.getParameter("pan");
            password=request.getParameter("password");
            
            
            Banker_Details banker = new Banker_Details();
            
            banker.setFirst_name(first_name);
            banker.setLast_name(last_name);
            banker.setDob(dob);
            banker.setGender(gender);
            banker.setFather_name(father_name);
            banker.setState(state);
            banker.setDistrict(district);
            banker.setArea(area);
            banker.setZip(zip);
            banker.setMobile_no(mobile_no);
            banker.setEmail(email);
            banker.setBranch_name(branch_name);
            banker.setAadher_no(aadhar_no);
            banker.setPan_no(pan_no);
            banker.setPassword(password);
            
            Database db = new Database();
            int x= db.Banker_Registration(banker);
            if(x==1)
            {
                response.sendRedirect("/Internet_Banking/Web pages/Bankers/Registration.jsp?msg=done");
            }
            else
            {
                response.sendRedirect("/Internet_Banking/Bankers/Registration.jsp?msg=error");
            }
            
            
            
        }
        catch(IOException ex){
                
    }
    }

}
