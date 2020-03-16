<!DOCTYPE html>
<%
    int err=0;
        try{ 
        
        String msg=request.getParameter("msg");
        if(msg.equals("error2"))
        {
            err=1;
        }
        }
        catch(Exception ex){
            
        }
 %>   
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>Internet Banking</title>

    <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
    <!-- Our Custom CSS -->
     <link rel="stylesheet" href="../Css/Banker_css/BankerHome.css">
     <link rel="stylesheet" href="../Css/Banker_css/Bwithdrawl.css">
    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">

    <!-- Font Awesome JS -->
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<!--    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/js/solid.js"></script>-->
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js"></script>
    <script>
       // 
       function value()
       {
           document.getElementById('er').innerHTML="Account No Dose no Exits";
       }    
    </script>     
</head>

<body onload="<%if(err==1){out.print("value()");} %>">

    <div class="wrapper">
        <!-- Sidebar  -->
        <%@include file="pagefiles/Banker_sidepanel.jsp" %>
        <!-- Page Content  -->
        <div id="content">
            <%@include file="pagefiles/Banker_navbar.jsp" %>
            <form action="../Withdrawa_userl" style="max-width:500px;margin:auto; margin-top: 30px;" id="dform" method="POST">
              <h2 id="heading">Customar Withdrawl</h2>
               <div style="color:red;" id="er"> </div>
              <div class="input-container">
                  <input class="input-field inpc" type="text" placeholder="Account Number" id="acno" name="acno" >
                  <button type="button" class="btn btn-sm" data-toggle="modal" data-target="#val" id="viewBtn">Validate
                  </button>
                  <div class="modal" tabindex="-1" role="dialog" id="val">
                        <div class="modal-dialog" role="document">
                          <div class="modal-content">
                            <div class="modal-header">
                              <h5 class="modal-title">Modal title</h5>
                              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                              </button>
                            </div>
                            <div class="modal-body">
                                <div id="mod"></div>
                            </div>
                            <div class="modal-footer">
                            
                              <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            </div>
                          </div>
                        </div>
                      </div>
                </div>
                 <div class="input-container">
                <input class="input-field inp" type="text" placeholder="Amount to Deposite" id="deposite" name="deposite">
                </div>
                 <div class="input-container">
<!--                <input class="input-field" type="radio" id="actype" name="actype"><p style="color: aliceblue;">Savings</p>
                <input class="input-field" type="radio" id="actype" name="actype"><p style="color: aliceblue;">Current</p>-->
                 <label class="radio inline"> 
                                                    <input type="radio" name="actype" id="gender"value="savings" checked>
                                                    <span> savings </span> 
                                                </label>
                                                <label class="radio inline"> 
                                                    <input type="radio" name="actype" id="gender" value="current">
                                                    <span> current </span> 
                                                </label>
                </div>
              <button type="submit" class="btn btn-md" id="DepBtn">Withdraw</button>
              </form>
        </div>
    </div>
<!--    <script type="text/javascript">
        
        function signature2()
        {
            var acco=document.getElementById("acno").value;
            if(acco=='')
            {
               alert('Pleace enter Account No.');
            }
            else
            {
                //alert(acco);
                $.ajax({
                    url:'http://localhost:8084/Internet_Banking/Bankers/Bwithdrawl_ajax.jsp',
                    method: 'post',
                    data: {accNo: acco},
                   
                    success: function(result)
                    {
                        if(result =='success')
                        {
                            alert('your account noumber is match');
                        }
                        else
                        {
                            alert('your account noumber dose not match');
                        }
                      //console.log(result);
                    }
                 });
            }
            
        }
        
    </script>-->
<script>
    $(document).ready(function(){
      $(document).on('click','#viewBtn',function(){
          
          $('#mod').html('');
          //acno=$(this).val();
          var acno=document.getElementById("acno").value;
         //alert(acno); 
         var html='';
          $.ajax({
              type:'post',
              url:'http://localhost:8084/Internet_Banking/Bankers/Bwithdrawl_ajax.jsp',
              data:{acno:acno},
              success:function(f){
               //console.log(f);
             // f=f.trim();
                  ima='<img src="../uploads/'+f+'" height="" width="300">';
                console.log(ima);
//                 Path="../uploads/"+f;
//                 console.log(path);
//1582741027169
              $('#mod').html(ima);
          }
          });
      });  
    });
</script>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<!--     <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>-->
 <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js"></script>
</body>
</html>