/* global ifse_code */
/* hi i am suman.change javascript file*/
function validation()
{              
            var fname=document.getElementById('fname');
            var lname=document.getElementById('lname');
            var dob=document.getElementById('dob');
            var fathername=document.getElementById('fathername');
            var state=document.getElementById('state');
            var district=document.getElementById('district');
            var zip=document.getElementById('zip');
            var area=document.getElementById('area');
            var number=document.getElementById('number');
            var em=document.getElementById('email');
            var bname=document.getElementById('bname');
            var aadhar=document.getElementById('aadhar');
            var pan=document.getElementById('pan');
            var password=document.getElementById('password');
            var cpassword=document.getElementById('cpassword');
          
            var f=0;
            
            
            //First name validation
            if(fname.value === "")
            {
                fname.style.borderColor="red";
                document.getElementById('fname1').innerHTML="Please Enter the First Name";
                fname.focus();
                f=1;
                //alert("df");
                //f=1;
            }
            else
            {
                //lname.focus();
                fname.style.borderColor="green";
                document.getElementById('fname1').innerHTML="";
            }
            //Lastname validation
            if(lname.value === "")
            {
                lname.style.borderColor="red";
                document.getElementById('lname1').innerHTML="Please Enter the Last Name";
                lname.focus();
                f=1;
                //alert("df");
                //f=1;
            }
            else
            {
                lname.style.borderColor="green";
                document.getElementById('lname1').innerHTML="";
              
            }
            //Date of Birth validation
            if(dob.value === "")
            {
                dob.style.borderColor="red";
                document.getElementById('dob1').innerHTML="Please Enter the Date of Birth";
                dob.focus();
                f=1;
                //alert("df");
                //f=1;
            }
            else
            {
                dob.style.borderColor="green";
                document.getElementById('dob1').innerHTML="";
              
            }
            //fathername validation
            if(fathername.value === "")
            {
                fathername.style.borderColor="red";
                document.getElementById('fathername1').innerHTML="Please Enter The Father's Name";
                fathername.focus();
                f=1;
                //alert("df");
                //f=1;
            }
            else
            {
                fathername.style.borderColor="green";
                document.getElementById('fathername1').innerHTML="";
              
            }
            //state validation
            if(state.value === "")
            {
                state.style.borderColor="red";
                document.getElementById('state1').innerHTML="Please Enter The Father's Name";
                state.focus();
                f=1;
                //alert("df");
                //f=1;
            }
            else
            {
                state.style.borderColor="green";
                document.getElementById('state').innerHTML="";
              
            }
            //District validation
            if(district.value === "")
            {
                district.style.borderColor="red";
                document.getElementById('district1').innerHTML="Please Enter the District";
                district.focus();
                f=1;
                //alert("df");
                //f=1;
            }
            else
            {
                district.style.borderColor="green";
                document.getElementById('district1').innerHTML="";
              
            }
            //area validation
            if(area.value === "")
            {
                area.style.borderColor="red";
                document.getElementById('area1').innerHTML="Please Enter the Area";
                area.focus();
                f=1;
                //alert("df");
                //f=1;
            }
            else
            {
                area.style.borderColor="green";
                document.getElementById('area1').innerHTML="";
              
            }
            //zip code validation
             if(zip.value === "")
            {
                zip.style.borderColor="red";
                document.getElementById('zip1').innerHTML="Please Enter the Zip Code";
                zip.focus();
                f=1;
                //alert("df");
                //f=1;
            }
            else
            {
                zip.style.borderColor="green";
                document.getElementById('zip1').innerHTML="";
              
            }
                 //Number mobile validation
              if(number.value === "")
            {
                number.style.borderColor="red";
                document.getElementById('number1').innerHTML="Please Enter The Mobile no";
                number.focus();
                f=1;
                //alert("df");
                //f=1;
            }
            else
            {
                number.style.borderColor="green";
                document.getElementById('number1').innerHTML="";
              
            }
            //email id validation
            
         
              if(em.value === "")
              {
               
               em.style.borderColor="red";
               document.getElementById('email1').innerHTML="Please Enter The Email no";
                em.focus();
                f=1;
                //alert("df");
                //f=1;
            }
            else
            {
                
                em.style.borderColor="green";
                document.getElementById('email1').innerHTML="";
            }
            //Branch Name validation
            if(bname.value === "")
            {
                bname.style.borderColor="red";
                document.getElementById('bname1').innerHTML="Please Enter The Branch Name";
                bname.focus();
                f=1;
                //alert("df");
                //f=1;
            }
            else
            {
                bname.style.borderColor="green";
                document.getElementById('bname1').innerHTML="";
            }
           // aadhar number validation
             if(aadhar.value === "")
            {
                aadhar.style.borderColor="red";
                document.getElementById('aadhar1').innerHTML="Please Enter the Aadhar No";
                aadhar.focus();
                f=1;
                //alert("df");
                //f=1;
            }
            else
            {
                aadhar.style.borderColor="green";
                document.getElementById('aadhar1').innerHTML="";
              
            }
            //pan validation
            if(pan.value === "")
            {
                pan.style.borderColor="red";
                document.getElementById('pan1').innerHTML="Please Enter the PAN No";
                pan.focus();
                f=1;
                //alert("df");
                //f=1;
            }
            else
            {
                pan.style.borderColor="green";
                document.getElementById('pan1').innerHTML="";
                
              
            }
            //password validation
            if(password.value === "")
            {
                password.style.borderColor="red";
                document.getElementById('password1').innerHTML="Please Enter The Password";
                password.focus();
                f=1;
                //alert("df");
                //f=1;
            }
            else
            {
                password.style.borderColor="green";
                document.getElementById('password1').innerHTML="";
              
            }
            //comfirm password validation
            if(cpassword.value === "")
            {
                cpassword.style.borderColor="red";
                document.getElementById('cpassword1').innerHTML="Please Enter The Comfirm Password";
                password.focus();
                f=1;
                //alert("df");
                //f=1;
            }
           
            else
            {
                 if(password.value !==cpassword.value)
                {
                    cpassword.style.borderColor="red"; 
                    document.getElementById('cpassword1').innerHTML="password dose not match"; 
                    cpassword.focus();
                    f=1;
                 }
                else
                {
                    cpassword.style.borderColor="green";
                    document.getElementById('cpassword1').innerHTML="";
                }
              
            }
            
           
            if(f===0)
            {
                return true;
            }
            else
            {
                return false;
            }
}