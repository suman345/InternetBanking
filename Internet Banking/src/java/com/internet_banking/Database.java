/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internet_banking;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;

public class Database {
    Connection conn;
    ResultSet rs;
    PreparedStatement smt;
    String url,id,pass;
    public Database() {
        
    }
    private boolean isConnected()
    {
        try {
            url="jdbc:mysql://localhost:3306/internet_banking?zeroDateTimeBehavior=convertToNull";
            id="root";
            pass="";
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(url,id,pass);
            return true;
        } 
        catch (Exception e) {
            return false;
        }
    }
    
    public int Banker_Registration(Banker_Details banker)
    {
        try
        {
            if(isConnected())
            {
                String Qry="INSERT INTO `bankers_registration`(`id`, `first_name`, `last_name`, "
                        + "`dob`, `father_name`, `state`,"
                        + " `district`, `area`, `zip`,"
                        + " `mobile_number`, `email`, `branch_name`,"
                        + " `aadhar_no`, `pan_no`, `password`,`status`) VALUES (Null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,'0')";
                smt=conn.prepareStatement(Qry);
                smt.setString(1, banker.getFirst_name());
                smt.setString(2, banker.getLast_name());
                smt.setString(3, banker.getDob());
                smt.setString(4, banker.getFather_name());
                smt.setString(5, banker.getState());
                smt.setString(6, banker.getDistrict());
                smt.setString(7, banker.getArea());
                smt.setString(8, banker.getZip());
                smt.setString(9, banker.getMobile_no());
                smt.setString(10, banker.getEmail());
                smt.setString(11, banker.getBranch_name());
                smt.setString(12, banker.getAadher_no());
                smt.setString(13, banker.getPan_no());
                smt.setString(14, banker.getPassword());
                
                smt.execute();
                return 1;
            }
            else
            {
                //not done
                return 0;
            }
        }
        catch(Exception ex)
        {
            //error
            return -1;
        }
    }
    
    public int User_Registration(User_Details user){
        try{
            if(isConnected())
            {
                String Qur="insert into user_registration(ac_type,ac_number,ac_holder_name,branch_code,ifsc_code,email_id,mobile,password) values(?,?,?,?,?,?,?,?)";
                smt=conn.prepareStatement(Qur);
                smt.setString(1,user.getAc_type());
                smt.setString(2,user.getAc_number());
                smt.setString(3,user.getAc_holder());
                smt.setString(4,user.getBranch_name());
                smt.setString(5, user.getIfsc_code());
                smt.setString(6,user.getEmail());
                smt.setString(7,user.getMobile_no());
                smt.setString(8,user.getPassword());
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
            return -1;
        }
    }
}
