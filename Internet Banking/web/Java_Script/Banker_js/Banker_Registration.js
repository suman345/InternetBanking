/* global ifse_code */
/* hi i am suman.change javascript file*/
function bankers_validation()
{              
           
            var empid=document.getElementById('EmpId');
            var branchname=document.getElementById('BranchNm');
            var branchcode=document.getElementById('BranchCd');
            var ifsc =document.getElementById('ifsc');
            var Employename=document.getElementById('EmpNm');
            var em=document.getElementById('email');
            var number=document.getElementById('MobNo');
            var aadhar=document.getElementById('Aadhar');
            var pan=document.getElementById('Pan');
            var password=document.getElementById('Password');
            var cpassword=document.getElementById('Cpassword');
          
             var f=0;
                if(empid.value === "")
                {  
                   empid.style.borderColor="red";
                    document.getElementById('emp1').innerHTML="Please Enter The Employe ID";
                
                    f=1;
                }
                else {
                    empid.style.borderColor="green";
                    document.getElementById('emp1').innerHTML="";
                   
                }   
                if(branchname.value==="")
                {
                    branchname.style.borderColor="red";
                    document.getElementById('emp2').innerHTML="Please Enter The Branchname";
                    f=1;
                }
                else
                {
                    branchname.style.borderColor="green";
                    document.getElementById('emp2').innerHTML="";
                    
                }
                if(branchcode.value=="")
                {
                    branchcode.style.borderColor="red";
                    document.getElementById('emp3').innerHTML="Please Enter The Branch Code";
                    f=1;
                }
                else
                {
                    branchcode.style.borderColor="green";
                    document.getElementById('emp3').innerHTML="";
                }
                 if(ifsc.value==="")
                {
                    ifsc.style.borderColor="red";
                    document.getElementById('emp4').innerHTML="Please Enter The IFSC";
                    f=1; 
                }
                else
                {
                    ifsc.style.borderColor="green";
                    document.getElementById('emp4').innerHTML="";
                }
                if(Employename.value==="")
                {
                   Employename.style.borderColor="red";
                    document.getElementById('emp5').innerHTML="Please Enter The Eploye Name";
                    f=1;
                }
                else
                {
                     Employename.style.borderColor="green";
                    document.getElementById('emp5').innerHTML="";
                }
                if(em.value==="")
                {
                   em.style.borderColor="red";
                    document.getElementById('emp6').innerHTML="Please Enter The Email Id";
                    f=1;
                }
                else
                {
                     em.style.borderColor="green";
                    document.getElementById('emp6').innerHTML="";
                }
                 if(number.value==="")
                {
                   number.style.borderColor="red";
                    document.getElementById('emp7').innerHTML="Please Enter The Phone Number";
                    f=1;
                }
                else
                {
                     number.style.borderColor="green";
                    document.getElementById('emp7').innerHTML="";
                }
                 if(aadhar.value==="")
                {
                   aadhar.style.borderColor="red";
                    document.getElementById('emp8').innerHTML="Please Enter The Aadhar";
                    f=1;
                }
                else
                {
                     aadhar.style.borderColor="green";
                    document.getElementById('emp8').innerHTML="";
                }
                  if(pan.value==="")
                {
                   pan.style.borderColor="red";
                    document.getElementById('emp9').innerHTML="Please Enter ThePan Card";
                    f=1;
                }
                else
                {
                     pan.style.borderColor="green";
                    document.getElementById('emp9').innerHTML="";
                }
//                 if(password.value==="")
//                {
//                   password.style.borderColor="red";
//                    document.getElementById('emp10').innerHTML="Please Enter The Pssword";
//                    f=1;
//                }
//                else
//                {
//                   password.style.borderColor="green";
//                    document.getElementById('emp10').innerHTML="";
//                }
//                 if(cpassword.value==="")
//                {
//                   cpassword.style.borderColor="red";
//                    document.getElementById('emp11').innerHTML="Please Enter The Comfrim Pssword";
//                    f=1;
//                }
//                else
//                {
//                    if(password.value != cpassword.value)
//                    {
//                        cpassword.style.borderColor="red";
//                        document.getElementById('emp11').innerHTML="The Given Password is Incorrect !";
//                        f=1;
//                    }
//                    else
//                    {
//                        cpassword.style.borderColor="green";
//                        document.getElementById('emp11').innerHTML="";
//                    }
//                }
                
                 if(f==0)
                    {
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                //                        if(empid=="")
//            {
//                alert("Please Enter The Employee ID");
//                return false;
//            }
//            if(branchname=="")
//            {
//                alert("Please Enter The BranchName");
//                return false;
//            }
//           
     
}