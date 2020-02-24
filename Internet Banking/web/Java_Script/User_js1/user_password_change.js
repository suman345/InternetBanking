/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function change_password()
{
    var new_password,old_password, con_password;
    old_password=document.getElementById("old_password");
    new_password=document.getElementById("new_password");
    con_password=document.getElementById("con_password");
    var f=0;
    if(old_password.value=="")
    {
       // alert('Please Enter The Old Password');
       old_password.style.borderColor="red";
       document.getElementById('op').innerHTML="Please Enter The Old Password";
       f=1;
    }
    else
    {
        old_password.style.borderColor="green";
        document.getElementById('op').innerHTML="";
    }
    if(new_password.value=="")
    {
       // alert('Please Enter The Old Password');
       new_password.style.borderColor="red";
       document.getElementById('np').innerHTML="Please Enter The New Password";
       f=1;
    }
    else
    {
        new_password.style.borderColor="green";
        document.getElementById('np').innerHTML="";
    }
    
     if(con_password.value=="")
    {
       // alert('Please Enter The Old Password');
       con_password.style.borderColor="red";
       document.getElementById('cp').innerHTML="Please Enter The New Password";
       f=1;
    }
    else
    {
        if(new_password.value!=con_password.value)
        {
            con_password.style.borderColor="red";
            document.getElementById('cp').innerHTML="The Given Password is Incorrect !";
            f=1;
        }
        else
        {   
            con_password.style.borderColor="green";
            document.getElementById('cp').innerHTML="";
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
