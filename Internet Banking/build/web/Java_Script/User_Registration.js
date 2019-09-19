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
    /*var branch_name=document.getElementById('branch_name');
    var ifse_code =doucment.getElementById('ifse_code');
    var email=document.getElementById('email');
    var mobile_no=document.getElementById('mobile_no');
    var password=document.getElementById('password');*/
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
    }
    
    
    if(ac_number.value === "")
    {
        ac_number.style.borderColor="red";
        document.getElementById('a2').innerHTML="Please Enter The Account Type ";
        ac_number.focus();
        f=1;
    }
    else {
        ac_number.style.borderColor="green";
        document.getElementById('a2').innerHTML="";
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

