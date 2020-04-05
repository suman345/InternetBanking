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
                smt.setString(2,bgs.getPassword());
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
                            + "`phone_on`,`cif_no`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
                    smt.setLong(18,ugs.getTime());
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
        //This function is user_document and servlet
         int user_document(User_doc1getser doc1)
        {
            try{
                if(isConnected())
                {
                    String qur="INSERT INTO `user_document`( `cif_no`, `identification_proof`, `id_number`, `address_proof`, `document_no`, `photo`,`signature`, `account_no`,`amount`) VALUES (?,?,?,?,?,?,?,?,?)";
                    smt=conn.prepareStatement(qur);
                    smt.setString(1, doc1.getCif());
                    smt.setString(2, doc1.getSetid());
                    smt.setString(3, doc1.getAdrno());
                    smt.setString(4, doc1.getSetardno());
                    smt.setString(5, doc1.getAddno());
                    smt.setString(6, doc1.getSetphoto());
                    
                    smt.setString(7, doc1.getSetsing());
                    smt.setLong(8, doc1.getTime());
                    smt.setInt(9, 0);
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
        //user_Register member insert and servlet UserRegister
        int user_register(UserRegistergetset ur)
        {
            try{
                if(isConnected())
                {
                    String qur="INSERT INTO `user_register`( `cif_no`, `account_no`, `phone_no`, `email`, `password`) VALUES (?,?,?,?,?)";
                    smt=conn.prepareStatement(qur);
                    smt.setString(1,ur.getCifno());
                    smt.setString(2,ur.getAccno());
                    smt.setString(3,ur.getMbno());
                    smt.setString(4,ur.getEmail());
                    smt.setString(5,ur.getPassword());
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
        //This Function userlogin servlet is UserRegister.java    
        int user_login(UserRegistergetset ur)
        {
            try{
                if(isConnected())
                {
                    String qur="INSERT INTO`login_details`(`username`,`password`,`type`, `isActive`)values(?,?,?,?)";
                    smt=conn.prepareStatement(qur);
                    smt.setString(1, ur.getEmail());
                    smt.setString(2,ur.getPassword());
                    smt.setString(3, ur.getType());
                    smt.setString(4, "0");
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
                String qur="SELECT * FROM `login_details` WHERE `username`=? and `password` =?";
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
    //This Function UserRegister from nldb servlet is UserRegister.java
    ResultSet checkUserRegister(String cifno,String accno,String mbno, String email){
        try{
            if(isConnected())
            {
                String qur="select n.cif_no,n.phone_on,n.email,u.account_no from new_user_registration n,user_document u where n.cif_no =u.cif_no and n.cif_no=? and n.phone_on=? and n.email=? and u.account_no=?";
                smt=conn.prepareStatement(qur);
                smt.setString(1, cifno);
                smt.setString(2,mbno);
                smt.setString(3, email);
                smt.setString(4, accno);
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
    //This Function used by BakDashboardAll.jsp
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
    //This function used by Details_Banker.jsp 
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
    public ResultSet userApprove()
    {
        try{
            if(isConnected())
            {
                String qur="SELECT b.id,b.first_name,b.last_name FROM new_user_registration b,login_details l WHERE l.username= b.email AND l.isActive=1";
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
    public ResultSet userReject()
    {
        try{
            if(isConnected())
            {
                String qur="SELECT b.id,b.first_name,b.last_name FROM new_user_registration b,login_details l WHERE l.username= b.email AND l.isActive=0";
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
    //This function calling by UserDashboardAll.jsp
    public ResultSet userDetail()
    {
        try{
            if(isConnected())
            {
               String qur="SELECT * from login_details where `type`='User' ORDER BY `id` ASC";
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
    public void activateUser(String email)
    {
        try{
            if(isConnected())
            {
                String qur="UPDATE `login_details` SET `isActive`='1' WHERE `username`=?";
                smt=conn.prepareStatement(qur);
                smt.setString(1,email);
                smt.execute();
            }
        }
        catch(Exception ex)
        {
            
        }
    }
    public void rejectUser(String email)
    {
        try{
            if(isConnected())
            {
                String qur="UPDATE `login_details` SET `isActive`='0' WHERE `username`=? and `type`='User'";
                smt=conn.prepareStatement(qur);
                smt.setString(1, email);
                smt.execute();
            }
        }
        catch(Exception ex)
        {
            
        }
    }
    //forgot_password function.... servlet This ForgotPassword.java.java
  public ResultSet forgot_password(String email)
    {
        try{
            if(isConnected())
            {
                String qur="select * from login_details where username=?";
                smt=conn.prepareStatement(qur);
                smt.setString(1, email);
                //smt.setString(2,password);
                rs=smt.executeQuery();
                return rs;
               // return ;
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
   public ResultSet getuserDetails(String email)
   {
       try{
           if(isConnected())
           {
               String qur = "select a.*, b.*  from new_user_registration a,login_details b where a.email = b.username and a.email=?";
               smt=conn.prepareStatement(qur);
               smt.setString(1, email);
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
   public ResultSet getBankerDetails (String email)
   {
       try{
           if(isConnected())
           {
               String qur="select a.*, b.*  from banker_register a,login_details b where a.email = b.username and a.email=?";
               smt=conn.prepareStatement(qur);
               smt.setString(1, email);
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
  //User Deposit function.... servlet This Deposit_user.java and Withdrawl update
  public int user_Deposit(String acno,Integer amount3)
  {
      try{
          if(isConnected())
          {
             String qur = "UPDATE `user_document` SET `amount`=? where `account_no`=?"; 
             smt=conn.prepareStatement(qur);
             smt.setInt(1, amount3);
             smt.setString(2, acno);
             smt.executeUpdate();
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
  //userdetalisFetch function ....servlet this Deposit_user
  public ResultSet userdetalisFetch( String acno,String actype)
  {
      try{
          if(isConnected()){
              //System.out.println("account number: "+acno);
                // qur="select * from new_user_rejistration nu,user_document ud where nu.cif_no=ud.cif_no and ud.account_no=?";
                String qur = "select a.*, b.* from new_user_registration a,user_document b where a.cif_no = b.cif_no and b.account_no=? and a.ac_type=?";
                smt=conn.prepareStatement(qur);
                smt.setString(1, acno);
                smt.setString(2,actype);
                rs=smt.executeQuery();
                return rs;
          }
          else
          {
              return null;
          }
      }
      catch(Exception ex){
           return null;
      }
  }
  //This Function made user transaction histyoy insert
  int insertdepositdetalis(String acno,Integer amount,String today,String time,String deposit,String email,String actype)
  {
      try{
          if(isConnected())
          {
              //String qur = "insert into user_depwithhistory(account_no,date,amount,deposit_or_withdrawl)values(?,?,?,?)";
              String qur="INSERT INTO `user_depwithhistory`( `account_no`, `date`, `amount2`,`time`, `deposit_or_withdrawl`,`email`,`ac_type`) VALUES (?,?,?,?,?,?,?)";
              smt=conn.prepareStatement(qur);
              smt.setString(1, acno);      
              smt.setString(2,today );
              smt.setInt(3, amount);
              smt.setString(4,time);
              //setDate(4, (java.sql.Date) temp.getOrigionalAirDate());
              smt.setString(5,deposit);
              smt.setString(6, email);
              smt.setString(7, actype);
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
    
  public ResultSet myprofileuser_Details(String email)
  {
      try{
          if(isConnected())
          {
              String qur="SELECT * FROM login_details a,new_user_registration b,user_document c where a.username=b.email and b.cif_no=c.cif_no and b.email=?";
              smt=conn.prepareStatement(qur);
              smt.setString(1, email);
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
  public int user_change_password(String new_password,String email)
  {
      try{
          if(isConnected())
          {
              String qur="UPDATE `login_details` SET password=? where username=?";
              smt=conn.prepareStatement(qur);
              smt.setString(1, new_password);
              smt.setString(2, email);
              smt.execute();
              return 1;
          }
          else
          {
              return 0;
          }
      }
      catch(Exception ex){
          return 0;
      }
  }
  public ResultSet userfetch_password(String old_password,String email)
  {
      try{
          if(isConnected())
          {
              String qur="select * from login_details where password=? and  username=? and type='User'";
              smt=conn.prepareStatement(qur);
              smt.setString(1,old_password);
              smt.setString(2,email);
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
 /* public ResultSet user_profile_picture(String email2)
   {
       try{
           if(isConnected())
           {
               String qur="select a.*,b.*,c.* from login_detalis a,new_user_registration b,user_document c where a.username=b.email and b.cif_no=c.cif_no and c.photo=?";
               smt=conn.prepareStatement(qur);
               smt.setString(1,email2);
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
   }*/
  public ResultSet user_welcome(String email){
      try{
          if(isConnected())
          {
              String qur="SELECT * FROM login_details a, new_user_registration b WHERE a.username=b.email AND b.email=?";
              smt=conn.prepareStatement(qur);
              smt.setString(1, email);
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
  public ResultSet balance_fatch(String email)
  {
      try{
          if(isConnected())
          {
              String qur="SELECT * from login_details a,new_user_registration b ,user_document c WHERE a.username=b.email AND b.cif_no=c.cif_no AND b.email=?";
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
  public ResultSet five_trasaction(String email1)
  {
      try{
          if(isConnected())
          {
              String qur="SELECT * FROM `user_depwithhistory` WHERE `email`=?  ORDER BY `id` DESC LIMIT 5 ";
              smt=conn.prepareStatement(qur);
              smt.setString(1, email1);
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
  //this function signature search use Bwithdrawl_ajax.jsp
  public ResultSet modelajax(String acno)
  {
      try{
          if(isConnected())
          {
              String qur="SELECT * FROM `user_document` WHERE account_no=?";
              smt=conn.prepareStatement(qur);
              smt.setString(1, acno);
              rs=smt.executeQuery();
              return rs;
          }
          else
          {
              return null;
          }
      }
      catch(Exception ex){
          return null;
      }
  }
  //this function cif search use Acwithcif_ajax.jsp
  public ResultSet acwith_cifajax(String acno)
  {
      try{
          if(isConnected())
          {
             String qur="SELECT * FROM `user_document` WHERE account_no=?";
             smt=conn.prepareStatement(qur);
             smt.setString(1, acno);
             rs=smt.executeQuery();
             return rs;
          }
          else
          {
              return null;
          }
      }
      catch(Exception ex){
          return null;
      }
  }
  public ResultSet acc_detalisfetch(String cif)
  {
      try{
          if(isConnected())
          {
              String qur="SELECT * FROM `new_user_registration` where cif_no=?";
              smt=conn.prepareStatement(qur);
              smt.setString(1,cif);
              rs=smt.executeQuery();
              return rs;
          }
          else
          {
              return null;
          }
      }
      catch(Exception ex){
          return null;
      }
  }
  public ResultSet exiting_user(String cif)
  {
      try{
          if(isConnected())
          {
              String qur="SELECT *  from new_user_registration a,user_document b WHERE a.cif_no=b .cif_no and a.cif_no=?";
              smt=conn.prepareStatement(qur);
              smt.setString(1, cif);
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
  int inserExistingAc(String actype, String fname,String lname,String ftname, String dob,String gender,String occupation,String annual_income,String brname,String brcode,String country,String state,
                    String district,String locality,String zip_code,String email,String Phone_no,String ci)
  {
      try{
          if(isConnected())
          {
              String qur="INSERT INTO `new_user_registration`(`ac_type`, `first_name`, `last_name`, `father_name`, `dob`, `gender`, `accupation`, `annual_income`, `branch_name`, `branch_code`, `country`, `state`, `district`, `locality`, `zip_code`, `email`, `phone_on`, `cif_no`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
              smt=conn.prepareStatement(qur);
              smt.setString(1, actype);
              smt.setString(2, fname);
              smt.setString(3, lname);
              smt.setString(4, ftname);
              smt.setString(5, dob);
              smt.setString(6, gender);
              smt.setString(7, occupation);
              smt.setString(8, annual_income);
              smt.setString(9, brname);
              smt.setString(10, brcode);
              smt.setString(11, country);
              smt.setString(12, state);
              smt.setString(13, district);
              smt.setString(14, locality);
              smt.setString(15, zip_code);
              smt.setString(16, email);
              smt.setString(17, Phone_no);
              smt.setString(18, ci); 
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
  int insertExistAcdou(String cif,String ip,String in,String ap,String dn,String p,String s,Long time)
  {
      try{
          if(isConnected())
          {
              String qur="INSERT INTO `user_document`(`cif_no`, `identification_proof`, `id_number`, `address_proof`, `document_no`, `photo`, `signature`, `account_no`, `amount`) VALUES (?,?,?,?,?,?,?,?,?)";
              smt=conn.prepareStatement(qur);
              smt.setString(1, cif);
              smt.setString(2, ip);
              smt.setString(3, in);
              smt.setString(4, ap);
              smt.setString(5, dn);
              smt.setString(6, p);
              smt.setString(7, s);
              smt.setLong(8, time);
              smt.setInt(9,0);
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
    public ResultSet accno_detalis(String acc)
  {
      try{
          if(isConnected())
          {
             //String qur="SELECT * FROM `user_document` WHERE account_no=?";
              String qur="select a.*, b.* from new_user_registration a,user_document b where a.cif_no = b.cif_no and b.account_no=?";
              smt=conn.prepareStatement(qur);
              smt.setString(1, acc);
              rs=smt.executeQuery();
              return rs;
          }
          else
          {
              return null;
          }
      }
      catch(Exception ex){
          return null;
      }
  }
  public ResultSet accno_detaliswith_pass(String acc,String passw)
  {
      try{
          if(isConnected())
          {
             //String qur="SELECT * FROM `user_document` WHERE account_no=?";
              String qur="SELECT * from new_user_registration a,user_document b,login_details c WHERE a.cif_no=b.cif_no AND a.email=c.username AND b.account_no=? AND c.password=?";
              smt=conn.prepareStatement(qur);
              smt.setString(1, acc);
              smt.setString(2, passw);
              //smt.setInt(3, amou);
              rs=smt.executeQuery();
              return rs;
          }
          else
          {
              return null;
          }
      }
      catch(Exception ex){
          return null;
      }
  }
  public int with_in_Btransfer(Integer tamount,String acc)
  {
      try{
          if(isConnected())
          {
              String qur="UPDATE `user_document` SET `amount`=? where `account_no`=?";
              smt=conn.prepareStatement(qur);
              smt.setInt(1, tamount);
              smt.setString(2, acc);
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
  public int insertdabit(String oacc,String today,String time, Integer amnt,String deposit,String email, String type)
  {
      try{
          if(isConnected())
          {
              String qur="INSERT into user_depwithhistory(account_no,date,time,amount2,deposit_or_withdrawl,email,ac_type)values(?,?,?,?,?,?,?)";
              smt=conn.prepareStatement(qur);
              smt.setString(1, oacc);
              smt.setString(2, today);
              smt.setString(3, time);
              smt.setInt(4, amnt);
              smt.setString(5, deposit);
              smt.setString(6, email);
              smt.setString(7, type);
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
  public int insertcredit( String bacc, String today,String time,Integer amnt,String deposit2,String email2,String type2)
  {
      try{
          if(isConnected())
          {
               String qur="INSERT into user_depwithhistory(account_no,date,time,amount2,deposit_or_withdrawl,email,ac_type)values(?,?,?,?,?,?,?)";
              smt=conn.prepareStatement(qur);
              smt.setString(1, bacc);
              smt.setString(2, today);
              smt.setString(3, time);
              smt.setInt(4, amnt);
              smt.setString(5, deposit2);
              smt.setString(6, email2);
              smt.setString(7, type2);
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
  public ResultSet userDetailsAdmin(String email)
  {
     try{
         if(isConnected())
         {
             String qur="SELECT * FROM new_user_registration a, user_document b WHERE a.cif_no=b.cif_no and a.email=?";
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
//    ResultSet checkUserRegister() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    private String Date() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String Time() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  

    ResultSet Exiting_user(String cif) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
