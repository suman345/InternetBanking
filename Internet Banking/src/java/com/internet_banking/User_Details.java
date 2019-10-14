/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internet_banking;

/**
 *
 * @author Suman
 */
public class User_Details {
    String ac_type,ac_number,ac_holder,branch_name,ifsc_code,email,mobile_no,password;

    public User_Details(String ac_type, String ac_number, String ac_holder, String branch_name, String ifsc_code, String email, String mobile_no, String password) {
        this.ac_type = ac_type;
        this.ac_number = ac_number;
        this.ac_holder = ac_holder;
        this.branch_name = branch_name;
        this.ifsc_code = ifsc_code;
        this.email = email;
        this.mobile_no = mobile_no;
        this.password = password;
    }

    public User_Details() {
    }

    public String getAc_type() {
        return ac_type;
    }

    public void setAc_type(String ac_type) {
        this.ac_type = ac_type;
    }

    public String getAc_number() {
        return ac_number;
    }

    public void setAc_number(String ac_number) {
        this.ac_number = ac_number;
    }

    public String getAc_holder() {
        return ac_holder;
    }

    public void setAc_holder(String ac_holder) {
        this.ac_holder = ac_holder;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public String getIfsc_code() {
        return ifsc_code;
    }

    public void setIfsc_code(String ifsc_code) {
        this.ifsc_code = ifsc_code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}  


