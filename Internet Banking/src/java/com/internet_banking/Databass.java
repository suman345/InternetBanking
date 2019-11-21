/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internet_banking;
import java.sql.*;  

/**
 *
 * @author Soumen-Pc
 */
public class Databass {

    Connection conn;
    ResultSet rs;
    PreparedStatement smt;
    String url,id,pass;
    public Databass() {
    }
    public boolean isConnected() {
        try {
            url="jdbc:mysql://localhost:3306/internet_banking?zeroDateTimeBehavior=convertToNull";
            id="root";
            pass="";
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(url,id,pass);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    boolean close()
    {
        try{
            conn.close();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    int InsertBankerdetails(BankersRegistrationGetSet bgs) {
       try
       {
           if(isConnected())
           {
               String qur="INSERT INTO `banker_register`(`employee_id`, `branch_name`,`branch_code`, `ifsc_code`, `employe_name`, `email`, `moblie_number`, `aadhar_no`, `pan_number`, `password`) VALUES (?,?,?,?,?,?,?,?,?,?)";
               smt=conn.prepareStatement(qur);
               smt.setString(1,bgs.getEmpId());
               smt.setString(2,bgs.getBranchNm());
               smt.setString(3,bgs.getBranchCd());
               smt.setString(4,bgs.getIfsc());
               smt.setString(5,bgs.getEmpNm());
               smt.setString(6,bgs.getEmail());
               smt.setString(7,bgs.getMobNo());
               smt.setString(8,bgs.getAadhar());
               smt.setString(9,bgs.getPan());
               smt.setString(10,bgs.getPassword());
               smt.execute();
               return 1;
           }
          else
           {
               return 0;
           }
       }
       catch(Exception aa)
       {
       return 0;
       }
    }
    int banker_login(BankersRegistrationGetSet bgs)
    {
        try
        {
            if(isConnected())
            {
                String qur="INSERT INTO`login_details`(`username`,`password`,`type`, `isActive`)values(?,?,?,?)";
                smt=conn.prepareStatement(qur);
                smt.setString(1,bgs.getEmail());
                smt.setString(2,bgs.getEmail());
                smt.setString(3,bgs.getType());
                smt.setString(4,"0");
                smt.execute();
                return 1;
            }
            else
            {
                return 0;
            }
            
        }
        catch(Exception ex)
        {
            return 0;
        }
    }
        int insertuser_Details(UserRegistrationGetSet ugs)
        {
            try{
                if( isConnected())
                {
                    String qur="INSERT INTO `new_user_registration`( `ac_type`, `first_name`, `last_name`, `father_name`, `dob`, `gender`, `accupation`, `annual_income`, `branch_name`, "
                            + "`branch_code`, `country`, `state`, `district`, `locality`, `zip_code`, `email`, "
                            + "`phone_on`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    smt=conn.prepareStatement(qur);
                    smt.setString(1,ugs.getActype());
                    smt.setString(2,ugs.getFname());
                    smt.setString(3,ugs.getLname());
                    smt.setString(4,ugs.getFtname());
                    smt.setString(5,ugs.getDob());
                    smt.setString(6,ugs.getGender());
                    smt.setString(7,ugs.getOccupation());
                    smt.setString(8,ugs.getAnnual_income());
                    smt.setString(9,ugs.getBrname());
                    smt.setString(10,ugs.getBrcode());
                    smt.setString(11,ugs.getCountry());
                    smt.setString(12,ugs.getState());
                    smt.setString(13,ugs.getDistrict());
                    smt.setString(14,ugs.getLocality());
                    smt.setString(15,ugs.getZip_code());
                    smt.setString(16,ugs.getEmail());
                    smt.setString(17,ugs.getPhone_no());
                    smt.execute();
                    return 1;
                }
                else
                {
                    return 0;
                }
                
            }
            catch(Exception ex)
            {
                return 0;
            }
        }

    ResultSet CheckLogin(String userid, String password) {
        try
        {
            if(isConnected())
            {
                String qur="SELECT * FROM `login_details` WHERE `username`=? and `password` =? and `isActive`='1'";
                smt=conn.prepareStatement(qur);
                smt.setString(1, userid);
                smt.setString(2,password);
                rs=smt.executeQuery();
                return rs;
            }
            else
            {
                return null;
            }
        }
        catch(Exception ex)
        {
            return null;
        }
       
    }
    public ResultSet BankerDetail()
    {
        try{
            if(isConnected())
            {
                String q="SELECT * FROM login_details where `type`='Banker' ORDER BY `id` ASC";
                smt=conn.prepareStatement(q);
                rs=smt.executeQuery();
                        return rs;
            }
            else
            {
                return null;
            }
        }catch(Exception a)
        {
          return null;
        
        }
    }
    public ResultSet Banker_Details(String email)
    {
        try{
            if(isConnected())
            {
                String qur="SELECT * FROM `banker_register` WHERE email=?";
                smt=conn.prepareStatement(qur);
                smt.setString(1,email);
                rs=smt.executeQuery();
                return rs;
            }
            else
            {
                return null;
            }
        }
        catch(Exception ex)
        {
            return null;
        }
    }    
    public ResultSet BankerApprove()
    {
        try{
            if(isConnected())
            {
                String qur="SELECT b.id,b.employe_name FROM banker_register b,login_details l WHERE l.username= b.email AND l.isActive=1";
                smt=conn.prepareStatement(qur);
                rs=smt.executeQuery();
                return rs;
            }
            else
            {
                return null;
            }
            
        }
        catch(Exception ex)
        {
            return null;
        }
    }
    public ResultSet BankerReject()
    {
        try{
            if(isConnected())
            {
                String qur="SELECT b.id,b.employe_name FROM banker_register b,login_details l WHERE l.username= b.email AND l.isActive=0";
                smt=conn.prepareStatement(qur);
                rs=smt.executeQuery();
                return rs;
            }
            else
            {
                return null;
            }
        }
        catch(Exception ex)
        {
            return null;
        }
    }
    public void activateBanker(String email)
    {
        try{
            if(isConnected())
            {
                String qur="UPDATE `login_details` SET `isActive`='1' WHERE `username`=?";
                smt=conn.prepareStatement(qur);
                smt.setString(1,email);
                smt.execute();
//                return 1;
            }
            else
            {
//                return 0;
            }
        }
        catch(Exception ex)
        {
//            return 0;
        }
    }
    public void rejectBanker(String email)
    {
        try{
            if(isConnected())
            {
                String qur="UPDATE `login_details` SET `isActive`='0' WHERE `username`=? and `type`='Banker'";
                smt=conn.prepareStatement(qur);
                smt.setString(1, email);
                smt.execute();
//                return 1;
            }
            else
            {
//                return 0;
            }
        }
        catch(Exception ex)
        {
//            return 0;
        }
    }

}
