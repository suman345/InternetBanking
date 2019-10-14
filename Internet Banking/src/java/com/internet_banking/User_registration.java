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
import static sun.font.GlyphLayout.done;

/**
 *
 * @author Suman
 */
@WebServlet(name = "User_registration", urlPatterns = {"/User_registration"})
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
            
            String ac_type,ac_number,ac_holder,branch_name,ifsc_code,email,mobile_no,password;
            
          ac_type=request.getParameter("ac_type");
          ac_number=request.getParameter("ac_number");
          ac_holder=request.getParameter("ac_holder");
          branch_name=request.getParameter("branch_name");
          ifsc_code=request.getParameter("ifsc_code");
          email=request.getParameter("email");
          mobile_no=request.getParameter("mobile_no");
          password=request.getParameter("password");
          
          User_Details user=new User_Details();
          user.setAc_type(ac_type);
          user.setAc_number(ac_number);
          user.setAc_holder(ac_holder);
          user.setBranch_name(branch_name);
          user.setIfsc_code(ifsc_code);
          user.setEmail(email);
          user.setMobile_no(mobile_no);
          user.setPassword(password);
          
          
          Database db=new Database();
          int x=db.User_Registration(user);
          if(x==1)
          {
               response.sendRedirect("User/user_registration.jsp?msg=done");
          }
          else
          {
               response.sendRedirect("User/user_registration.jsp?msg=error");
          }
        }
        catch(IOException e)
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
