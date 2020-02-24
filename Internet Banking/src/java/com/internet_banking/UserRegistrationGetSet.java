/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internet_banking;

/**
 *
 * @author Sumanpc
 */
public class UserRegistrationGetSet {
    String actype,fname,lname,ftname,dob,gender,occupation,annual_income,brname,brcode,country,state,
                    district,locality,zip_code,email,Phone_no,type;
    long time;

   
    public UserRegistrationGetSet() {
    }

    public UserRegistrationGetSet(String actype, String fname, String lname, String ftname, String dob, String gender, String occupation, String annual_income, String brname, String brcode, String country, String state, String district, String locality, String zip_code, String email, String Phone_no, String type,String cif) {
        this.actype = actype;
        this.fname = fname;
        this.lname = lname;
        this.ftname = ftname;
        this.dob = dob;
        this.gender = gender;
        this.occupation = occupation;
        this.annual_income = annual_income;
        this.brname = brname;
        this.brcode = brcode;
        this.country = country;
        this.state = state;
        this.district = district;
        this.locality = locality;
        this.zip_code = zip_code;
        this.email = email;
        this.Phone_no = Phone_no;
        this.type = type;
        //this.cif = cif;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

  

    public String getActype() {
        return actype;
    }

    public void setActype(String actype) {
        this.actype = actype;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFtname() {
        return ftname;
    }

    public void setFtname(String ftname) {
        this.ftname = ftname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAnnual_income() {
        return annual_income;
    }

    public void setAnnual_income(String annual_income) {
        this.annual_income = annual_income;
    }

    public String getBrname() {
        return brname;
    }

    public void setBrname(String brname) {
        this.brname = brname;
    }

    public String getBrcode() {
        return brcode;
    }

    public void setBrcode(String brcode) {
        this.brcode = brcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_no() {
        return Phone_no;
    }

    public void setPhone_no(String Phone_no) {
        this.Phone_no = Phone_no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
}
