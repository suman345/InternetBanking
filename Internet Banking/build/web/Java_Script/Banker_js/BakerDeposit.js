/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


   function deposit()
   {
       var acno,deposite,actype;
       acno = document.getElementById('acno');
       deposite = document.getElementById('deposite');
       actype = document.getElementById('actype');
       var f=0;
       if(acno.value=="")
       {
           acno.style.borderColor="red";
           document.getElementById('err1').innerHTML="please Enter The Account no";
           f=1;
       } 
       else
       {
           acno.style.borderColor="green";
           document.getElementById('err1').innerHTML="";
       }
       if(deposite.value=="")
       {
           deposite.style.borderColor="red";
           document.getElementById('err2').innerHTML="please Enter The Amount";
           f=1;
       }
       else
       {
           deposite.style.borderColor="green";
           document.getElementById('err2').innerHTML="";
       }
       if(actype.value=="")
       {
           actype.style.borderColor="red";
           document.getElementById('err3').innerHTML="please Enter The Account Type";
           f=1;
       }
       else
       {
           actype.style.borderColor="green";
           document.getElementById('err3').innerHTML="";
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