/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function user_register()
{
    var cifn,acn,mbn,eml;
    cifn=document.getElementById("cifn");
    acn=document.getElementById("acn");
    mbn=document.getElementById("mbn");
    eml=document.getElementById("eml");
    f=0;
    if(cifn.value=="")
    {
          cifn.style.borderColor="red";
         document.getElementById('us1').innerHTML="Please Enter The CIF No";
      
        f=1;
    }
    else
    {
        cifn.style.borderColor="green";
        document.getElementById('us1').innerHTML="";
    }
    if(acn.value=="")
    {
        acn.style.borderColor="red";
        document.getElementById('us2').innerHTML="Please Enter The Account No";
        f=1;
    }
    else
    {
        acn.style.borderColor="green";
        document.getElementById('us2').innerHTML="";
    }
    if(mbn.value=="")
    {
        mbn.style.borderColor="red";
        document.getElementById('us3').innerHTML="Please Enter The Phone number";
        f=1;
    }
    else
    {
        mbn.style.borderColor="green";
        document.getElementById('us3').innerHTML="";
    }
    if(eml.value=="")
    {
        eml.style.borderColor="red";
        document.getElementById('us4').innerHTML="Please Enter The Email";
        f=1;
    }
    else
    {
        eml.style.borderColor="green";
        document.getElementById('us4').innerHTML="";
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
