/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function forgetval()
{
    var email=document.getElementById('email');
    var f=0;
    if(email.value=="")
    {
        email.style.borderColor="red";
        alert('Please Enter The Email');
        f=1;
    }
    else
    {
        email.style.borderColor="green";
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
