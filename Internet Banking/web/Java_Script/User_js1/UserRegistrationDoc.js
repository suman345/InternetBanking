/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function user_document()
{
    var fetchcif=document.getElementById('fetchcif');
    var idupld=document.getElementById('idupld');
    var adrno=document.getElementById('adrno');
    var addupload=document.getElementById('addupload');
    var addno=document.getElementById('addno');
    var photo=document.getElementById('photo');
    
    var f=0;
    if(fetchcif.value === "")
    {  
        fetchcif.style.borderColor="red";
        document.getElementById('doc1').innerHTML="Please Enter The Account Type";
      
        f=1;
    }
    else {
        fetchcif.style.borderColor="green";
        document.getElementById('doc1').innerHTML="";
        
    }
     if(idupld.value === "")
    {  
        idupld.style.borderColor="red";
        document.getElementById('doc2').innerHTML="Please Enter The Account Type";
      
        f=1;
    }
    else {
        idupld.style.borderColor="green";
        document.getElementById('doc2').innerHTML="";
        
    }
     if(adrno.value === "")
    {  
        adrno.style.borderColor="red";
        document.getElementById('doc3').innerHTML="Please Enter The Account Type";
      
        f=1;
    }
    else {
        adrno.style.borderColor="green";
        document.getElementById('doc3').innerHTML="";
        
    }
     if(addupload.value === "")
    {  
        addupload.style.borderColor="red";
        document.getElementById('doc4').innerHTML="Please Enter The Account Type";
      
        f=1;
    }
    else {
        addupload.style.borderColor="green";
        document.getElementById('doc4').innerHTML="";
        
    }
    if(addno.value === "")
    {  
        addno.style.borderColor="red";
        document.getElementById('doc5').innerHTML="Please Enter The Account Type";
      
        f=1;
    }
    else {
        addno.style.borderColor="green";
        document.getElementById('doc5').innerHTML="";
        
    }
    if(photo.value === "")
    {  
        photo.style.borderColor="red";
        document.getElementById('doc6').innerHTML="Please Enter The Account Type";
      
        f=1;
    }
    else {
        photo.style.borderColor="green";
        document.getElementById('doc6').innerHTML="";
        
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

