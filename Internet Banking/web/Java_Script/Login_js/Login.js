function login_validation()
{
    var email=document.getElementById('email');
    var password=document.getElementById('password');
    var f=0;
    if(email.value=="")
    {
         
        email.style.borderColor="red";
        document.getElementById('emp2').innerHTML="Please Enter The User ID";
        f=1;
    }
    else
    {
       email.style.borderColor="green";
        document.getElementById('emp2').innerHTML="";        
    }   
    if(password.value=="")
    {
        password.style.borderColor="red";
        document.getElementById('emp3').innerHTML="Please Enter The Password";
        f=1;
    }
    else
    {
        password.style.borderColor="green";
        document.getElementById('emp3').innerHTML="";
    }
    if(f==0)
    {
        return true;
    }
    else
    {
        return false;
    }
}