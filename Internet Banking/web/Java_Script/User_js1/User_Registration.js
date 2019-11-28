/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* global doucment */
function user_validation1()
{
    var actype = document.getElementById("actype");
    var fname=document.getElementById('fname');
    var lname=document.getElementById('lname');
    var ftname=document.getElementById('ftname');
    var dob= document.getElementById('dob');
    var gender=document.getElementById('gender');
    var occupation=document.getElementById('occupation');
    var annual_income=document.getElementById('annual_income');
    var brname=document.getElementById('brname');
    var brcode=document.getElementById('brcode');
    var country=document.getElementById('country');
    var state=document.getElementById('state');
    var district=document.getElementById('district');
    var locality=document.getElementById('locality');
    var zip_code=document.getElementById('zip_code');
    var email=document.getElementById('email');
    var Phone_no=document.getElementById('Phone_no');
   
    var f=0;
    if(actype.value === "")
    {  
        actype.style.borderColor="red";
        document.getElementById('cus1').innerHTML="Please Enter The Account Type";
      
        f=1;
    }
    else {
        actype.style.borderColor="green";
        document.getElementById('cus1').innerHTML="";
        
    }
    if(fname.value === "")
    {  
            fname.style.borderColor="red";
            document.getElementById('cus2').innerHTML="Please Enter The First Name";
            f=1;
        
    }
    else 
    {
         if(fname.value.length < 3)
        {
            fname.style.borderColor="red";
            document.getElementById('cus2').innerHTML="Please Enter The Three Charter";
            f=1; 
        }
        else
        {
            fname.style.borderColor="green";
            document.getElementById('cus2').innerHTML="";
        }
        
    }
    if(lname.value === "")
    {  
        lname.style.borderColor="red";
        document.getElementById('cus3').innerHTML="Please Enter The Last Name";
        f=1;
    }
    else
    {
        if(lname.value.length<3)
        {
            lname.style.borderColor="red";
            document.getElementById('cus3').innerHTML="Please Enter The The Three Charter";
            f=1;
        }
        else
        {
            lname.style.borderColor="green";
            document.getElementById('cus3').innerHTML="";
        }
        
    }
    if(ftname.value === "")
    {  
        ftname.style.borderColor="red";
        document.getElementById('cus4').innerHTML="Please Enter The Father's Name";
        f=1;
    }
    else 
    {
        if(ftname.value.length<3)
        {
            ftname.style.borderColor="red";
            document.getElementById('cus4').innerHTML="Please Enter The Three Charter";
            f=1;
        }
        else
        {
            ftname.style.borderColor="green";
            document.getElementById('cus4').innerHTML="";
        }
        
    }
    if(dob.value === "")
    {  
        dob.style.borderColor="red";
        document.getElementById('cus5').innerHTML="Please Enter The Date of Birth";
      
        f=1;
    }
    else {
        dob.style.borderColor="green";
        document.getElementById('cus5').innerHTML="";
        
    }
    if(occupation.value === "")
    {  
        occupation.style.borderColor="red";
        document.getElementById('cus7').innerHTML="Please Enter The Applicant's Occupation";
      
        f=1;
    }
    else {
        occupation.style.borderColor="green";
        document.getElementById('cus7').innerHTML="";
        
    }
    if(annual_income.value === "")
    {  
        annual_income.style.borderColor="red";
        document.getElementById('cus8').innerHTML="Please Enter The Annual Income";
      
        f=1;
    }
    else {
        annual_income.style.borderColor="green";
        document.getElementById('cus8').innerHTML="";
        
    }
     if(brname.value === "")
    {  
        brname.style.borderColor="red";
        document.getElementById('cus9').innerHTML="Please Enter The Branch Name";
      
        f=1;
    }
    else {
        brname.style.borderColor="green";
        document.getElementById('cus9').innerHTML="";
        
    }
      if(brcode.value === "")
    {  
        brcode.style.borderColor="red";
        document.getElementById('cus10').innerHTML="Please Enter The Branch Code";
      
        f=1;
    }
    else {
        brcode.style.borderColor="green";
        document.getElementById('cus10').innerHTML="";
        
    }
     if(country.value === "")
    {  
        country.style.borderColor="red";
        document.getElementById('cus11').innerHTML="Please Enter The Country";
      
        f=1;
    }
    else {
        country.style.borderColor="green";
        document.getElementById('cus11').innerHTML="";
        
    }
     if(state.value === "")
    {  
        state.style.borderColor="red";
        document.getElementById('cus12').innerHTML="Please Enter The State";
      
        f=1;
    }
    else {
        state.style.borderColor="green";
        document.getElementById('cus12').innerHTML="";
        
    }
     if(district.value === "")
    {  
        district.style.borderColor="red";
        document.getElementById('cus13').innerHTML="Please Enter The District";
      
        f=1;
    }
    else {
        district.style.borderColor="green";
        document.getElementById('cus13').innerHTML="";
        
    }
     if(locality.value === "")
    {  
        locality.style.borderColor="red";
        document.getElementById('cus14').innerHTML="Please Enter The Locality";
      
        f=1;
    }
    else {
        locality.style.borderColor="green";
        document.getElementById('cus14').innerHTML="";
        
    }
     if(zip_code.value === "")
    {  
        zip_code.style.borderColor="red";
        document.getElementById('cus15').innerHTML="Please Enter The Zip Code";
      
        f=1;
    }
    else {
        zip_code.style.borderColor="green";
        document.getElementById('cus15').innerHTML="";
        
    }
     if(email.value === "")
    {  
        email.style.borderColor="red";
        document.getElementById('cus16').innerHTML="Please Enter The Email";
      
        f=1;
    }
    else {
        email.style.borderColor="green";
        document.getElementById('cus16').innerHTML="";
        
    }
     if(Phone_no.value === "")
    {  
        Phone_no.style.borderColor="red";
        document.getElementById('cus17').innerHTML="Please Enter The Phone Number";
      
        f=1;
    }
    else {
            if(Phone_no.value.length!=10)
            {
                Phone_no.style.borderColor="red";
                document.getElementById('cus17').innerHTML="The Mobile Number Must Be of 10 Digit";
                f=1;
            }
            else
            {
                Phone_no.style.borderColor="green";
                document.getElementById('cus17').innerHTML="";
            }
        
    }
    
    if(f===1)
    {
        return false;
    }
    else
    {
        return true;
    }
}

