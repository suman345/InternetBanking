function cnf_number()
{
    var cif_no= document.getElementById("cif");
    if(cif_no.value=="")
    {
        alert("Please Enter The CIF Number");
        return false;
    }
}
function ac_number()
{
    var acno=document.getElementById("acno");
    if(acno.value=="")
    {
        alert("Please Enter The Accound Number");
        return false;
    }
}