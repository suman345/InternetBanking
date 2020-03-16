/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internet_banking;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sumanpc
 */
@MultipartConfig(
	fileSizeThreshold = 1024 * 1024 * 100, // 100 MB
	maxFileSize = 1024 * 1024 * 500, // 500 MB
	maxRequestSize = 1024 * 1024 * 500 // 500 MB
)
public class Userdocument1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 
    private static final String UPLOAD_DIR = "uploads";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String setid=null;
            String setardno=null;
            String setphoto=null;
            String setsing=null;
            String cif=request.getParameter("h_cifno");
		//String Password(request.getParameter("doc"));
           //out.println(cif+"<br>");
		List<String> photos = User_helper.uploadFile(UPLOAD_DIR, request);
                String adrno=request.getParameter("adrno");
                List<String> photos2 = User_helper2.uploadFile(UPLOAD_DIR, request);
                 String addno=request.getParameter("addno");
                 List<String> photos3 = User_helper3.uploadFile(UPLOAD_DIR, request);
                 List<String> photos4 = User_helper4.uploadFile(UPLOAD_DIR, request);
                   Date date= new Date();
                long time = date.getTime();
                
                for(String s:photos)
                {
                    //out.println(s);
                    setid=s;
                }
                for(String s:photos2)
                {
                    setardno=s;
                }
                for(String s:photos3)
                {
                   setphoto=s; 
                }
                for(String s:photos4)
                {
                    setsing=s;
                }
               
                    
                User_doc1getser doc1 =new User_doc1getser();
                doc1.setCif(cif);
                doc1.setSetid(setid);
                doc1.setAdrno(adrno);
                doc1.setSetardno(setardno);
                doc1.setAddno(addno);
                doc1.setSetphoto(setphoto);
                doc1.setSetsing(setsing);
                doc1.setTime(time);
                Databass d1=new Databass();
                int x= d1.user_document(doc1);
                if(x==1)
                {
                    String mob;
                    HttpSession session=request.getSession();
                    mob=session.getAttribute("mobile").toString();
                   // out.println("done");
                     SendMessage s= new SendMessage();
                  
                     //s.sendCampaign("B6J3GWWF1MM0W75F4PFNIB861AGN7QHK", "1YZDJV6SWZBM2V9Q", "stage",mob, " Your Account has been Created : Your CIF Number is"+cif+" .And Account no is "+time, "sumandhara345@gmail.com");
                    response.sendRedirect("Bankers/Banker_Home.jsp?msg=done");
                }
                else
                {
                   // out.printf("not done");
                    response.sendRedirect("Bankers/NewUserDocUpload.jsp?msg=Error");
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
