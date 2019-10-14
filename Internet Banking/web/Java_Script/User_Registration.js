/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* global doucment */
function user_validation()
{
    var ac_type = document.getElementById("ac_type");
    var ac_number=document.getElementById('ac_number');
    var ac_holder=document.getElementById('ac_holder');
    var branch_name=document.getElementById('branch_name');
    var ifsc_code= document.getElementById('ifsc_code');
    var email=document.getElementById('email');
    var mobile_no=document.getElementById('mobile_no');
    var password=document.getElementById('password');
    var f=0;
    if(ac_type.value === "")
    {  
        ac_type.style.borderColor="red";
        document.getElementById('a1').innerHTML="Please Enter The Account Type";
        ac_type.focus();
        f=1;
    }
    else {
        ac_type.style.borderColor="green";
        document.getElementById('a1').innerHTML="";
        ac_number.focus();
    }
    
    //Account Number Start......
    if(ac_number.value === "")
    {
        ac_number.style.borderColor="red";
        document.getElementById('a2').innerHTML="Please Enter The Account Type ";
        ac_number.focus();
        f=1;
    }
    else {
            if(isNaN(ac_number.value))
                {
                    ac_number.style.borderolor="red";
                    document.getElementById('a2').innerHTML="Character not allowed";
                }
           
            else
            {
                 if(ac_number.value.length!==11)
            {
                ac_number.style.borderColor="red";
                document.getElementById('a2').innerHTML="Accunt Number Should 11 digits..";
                f=1;
            }
                else
                {
                    ac_number.style.borderColor="green";
                    document.getElementById('a2').innerHTML="";
                    ac_holder.focus();
                }
        
           }
        }
     //Account Number End   
    if(ac_holder.value==="")
    {
        ac_holder.style.borderColor="red";
        document.getElementById('a3').innerHTML="Please Enter The Account Holder";
        ac_holder.focus();
        f=1;
    }
    else
    {
        ac_holder.style.borderColor="green";
        document.getElementById('a3').innerHTML="";
        branch_name.focus();
        
    }
    if(branch_name.value==="")
    {
        branch_name.style.borderColor="red";
        document.getElementById('a4').innerHTML="Please Enter The Branch Name";
       // branch_name.focus();
        ac_type.focus();
        f=1;
    }
    else
    {
        branch_name.style.borderColor="green";
        document.getElementById('a4').innerHTML="";
        
    }
    if(ifsc_code.value=="")
    {
        ifsc_code.style.borderColor="red";
        document.getElementById('a5').innerHTML="Please Enter The IFSC Code";
        ifsc_code.focus();
        
    }
    else
    {
        ifsc_code.style.borderColor="green";
        document.getElementById('a5').innerHTML="";
    }
    if(email.value==="")
    {
        email.style.borderColor="red";
        document.getElementById('a6').innerHTML="Please Enter The Email";
        email.focus();
    }
    else
    {
        email.style.borderColor="green";
        document.getElementById('a6').innerHTML="";
    }
    if(mobile_no.value=="")
    {
        mobile_no.style.borderColor="red";
        document.getElementById('a7').innerHTML="Please Enter The Phone Number";
        mobile_no.focus();
    }
    else
    {   
         if(isNaN(mobile_no.value))
            {
                mobile_no.style.bordercolor="red";
                document.getElementById('a7').innerHTML="character not allowed";
            }
       
        else
        {   
            if(mobile_no.value.length!==10)
        {
            mobile_no.style.bordercolor="red";
            document.getElementById('a7').innerHTML="Please Fill 10 Digite Number";
        }
            else
            {    
                mobile_no.style.borderColor="green";
                document.getElementById('a7').innerHTML="";
            }
        }   
    }
    
    if(password.value=="")
    {
        password.style.borderColor="red";
        document.getElementById('a8').innerHTML="Please Enter The mobile no";
        password.focus();
    }
    else
    {
        password.style.borderColor="green";
        document.getElementById('a8').innerHTML="";
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

