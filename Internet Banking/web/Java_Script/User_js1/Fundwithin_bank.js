/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function funwithB()
{
    var oacc,bacc1,bacc,ifsc1,amnt,passw;
    oacc=document.getElementById('oacc');
    bacc1=document.getElementById('bac1');
    bacc=document.getElementById('bacc');
    ifsc1=document.getElementById('ifsc1');
    amnt=document.getElementById('amnt');
    passw=document.getElementById('passw');
    var f=0;
    if(oacc.value=="")
    {
        oacc.style.borderColor="red";
        alert("Please Enter The your Account number");
       f=1;
    }
    else
    {
        oacc.style.borderColor="green";
    }
    if(bacc1.value=="")
    {
        bacc1.style.borderColor="red";
        alert("Please Enter The sender Account Number");
        f=1;
    }
    else
    {
         bacc1.style.borderColor="green";
    }
    if(bacc.value=="")
    {
        bacc1.style.borderColor="red";
        alert("Please Enter The sender Comfrim Account Number");
        f=1;
    }
    else
    {
         //bacc.style.borderColor="green";
         if(bacc.value!=bacc1.value)
         {
            bacc.style.borderColor="red";
            alert("The Given Account Number is Incorrect");
            f=1;
         }
         else
         {
             bacc.style.borderColor="green";
         }
    }
    if(ifsc1.value=="")
    {
        ifsc1.style.borderColor="red";
        alert("Please Enter The IFSC Code");
        f=1;
    }
    else
    {
        ifsc1.style.borderColor="green";
    }
    if(amnt.value=="")
    {
        amnt.style.borderColor="red";
        alert("Please Enter The Amount");
        f=1;
    }
    else
    {
        amnt.style.borderColor="green";
    }
     if(passw.value=="")
    {
        passw.style.borderColor="red";
        alert("Please Enter The Internet Banking Password");
        f=1;
    }
    else
    {
        passw.style.borderColor="green";
    }
    if(f==1)
    {
        return false;
    }
    else
    {
        return true;
    }
}
