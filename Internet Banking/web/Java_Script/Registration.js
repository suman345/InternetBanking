/* global ifse_code */
/* hi i am suman.change javascript file*/
//frist push form shakha
function validation()
{              
            var fname=document.getElementById('fname');
            var lname=document.getElementById('lname');
            var dob=document.getElementById('dob');
            var ftname=document.getElementById('ftname');
            var state=document.getElementById('state');
            var district=document.getElementById('district');
            var area=document.getElementById('area');
            var zip=document.getElementById('zip');
            var number=document.getElementById('number');
            var email=document.getElementById('email');
            var bname=document.getElementById('bname');
            var aadhar=document.getElementById('aadhar');
            var pan=document.getElementById('pan');
            var password=document.getElementById('password');
            var cpassword=document.getElementById('cpassword');
            var gender = document.getElementById('gender');
            
            var f=0;
            //alert("df");
            if(fname.value == "")
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
                fname.style.borderColor="green";
                document.getElementById('fname1').innerHTML="";
                f=0;
            }
             if(lname.value<1)
            {
                lname.style.borderColor="red";
                document.getElementById('lname1').innerHTML="Please Enter The Last Name";
                lname.focus();
                f=1;
                //f=1;
            }
            else
            {
                lname.style.borderColor="green";
                document.getElementById('lname1').innerHTML="";
                f=0;
            }
            if(dob.value<1)
            {
                dob.style.borderColor="red";
                document.getElementById('dob1').innerHTML="Please Enter Date of birth";
                dob.focus();
                f=1;
                //f=1;
            }
            else
            {
                dob.style.borderColor="green";
                document.getElementById('dob1').innerHTML="";
                f=0;
            }
            if(gender.value != "male" || gender.value != "female") {
                gender.style.borderColor="green";
                gender.innerHTML="";
                f = 0;
                alert("Form if");
                alert(gender.value);
            }
            else {
                gender.style.borderColor="red";
               gender.innerHTML="Please Select your Gender";
               gender.focus();
               f=1;
               alert("Form else");
               alert(gender.value);
            }
            if(ftname.value<1)
            {
                ftname.style.borderColor="red";
                document.getElementById('ftname1').innerHTML="Please Enter Father's Name";
                ftname.focus();
                f=1;
                //f=1;
            }
            else
            {
                ftname.style.borderColor="green";
                document.getElementById('ftname1').innerHTML="";
                f=0;
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