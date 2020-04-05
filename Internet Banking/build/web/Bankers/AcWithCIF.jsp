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
     <link rel="stylesheet" href="../Css/Banker_css/AwithCIF.css">
    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">

    <!-- Font Awesome JS -->
    <script src="../Java_Script/Banker_js/AcWithCIF.js"></script>
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/js/solid.js"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js"></script>
    <script>
        function acwith_nextpage()
        {
           var cif= document.getElementById('cif').value;
            window.location="Acwithcif_nextpage.jsp?cif="+cif;
        }
    </script>    
</head>
<body>
    <div class="wrapper">
        <!-- Sidebar  -->
        <%@include file="pagefiles/Banker_sidepanel.jsp" %>
        <!-- Page Content  -->
        <div id="content">

            <%@include file="pagefiles/Banker_navbar.jsp" %>
            
             <form action="#" style="max-width:500px;margin:auto; margin-top: 30px;" id="dform">
              <h2 id="heading">CIF Number</h2>
              <div class="input-container">
                <input class="input-field inp" type="text" placeholder="Enter CIF Number" id="cif" name="cif">
                </div>
              <button type="button" class="btn btn-md" onclick="acwith_nextpage();">Find</button>
               
               
                 <div class="forget_part"><p id="fgttxt">forgot CIF number?? 
                    <button type="button" class="btn btn-sm" data-toggle="modal" data-target="#fgt" id="viewBtn">ClickMe
                  </button>
                         
                  <div class="modal fade" id="fgt">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h4 class="modal-title">Search CIF with Account Number</h4>
                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                            </div>
                            <div class="modal-body">
                                <div>
                                   <div class="input-container" id="inputcon">
                                    <input class="input-field inp" type="text" placeholder="Enter A/C Number" id="accno" name="accno">
                                    <button type="button" class="btn btn-sm" data-toggle="modal" data-target="#srchcif" id="Ac_su">Search</button>        
                                   </div>
                             
                                </div>
                            </div>
                        </div>
                      </div>
                  </div>
                </div>
                 <div class="modal fade" id="srchcif">
                    <div class="modal-dialog">
                      <div class="modal-content" style="background-color: aliceblue;">
                        <div class="modal-header">
                         <h4 class="mdl_title">Your CIF Number is</h4>
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                        </div>
                        <div class="modal-body">
                            <p id="acnodisplay"></p>
                            <button type="button" class="btn" onclick="copyToClipboard('#acnodisplay')">Copy CIF</button>
                        </div>
                    </div>
                </div>
                </div>
             </form>
        </div>
    </div>
    <!-- jQuery CDN - Slim version (=without AJAX) -->
<!--    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>-->
    <!-- Popper.JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
    <!-- Bootstrap JS -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
    <!-- jQuery Custom Scroller CDN -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js"></script>
    <script>
       $(document).ready(function(){
  
        $("#Ac_su").click(function() {
          var cif=$("#accno").val();
         
          $.ajax({
             type:'post', 
             url:'http://localhost:8084/Internet_Banking/Bankers/Acwithcif_ajax.jsp',
             data:{cif:cif},
             success:function(f){
             // $('#fgt').remove();   
              $('#acnodisplay').html(f);  
             console.log(f);
             }
          });
        });
      });
    </script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#sidebar").mCustomScrollbar({
                theme: "minimal"
            });

            $('#sidebarCollapse').on('click', function () {
                $('#sidebar, #content').toggleClass('active');
                $('.collapse.in').toggleClass('in');
                $('a[aria-expanded=true]').attr('aria-expanded', 'false');
            });
        });
    </script>
    <script type="text/javascript">
      function copyToClipboard(element) {
      var $temp = $("<input>");
      $("body").append($temp);
      $temp.val($(element).text()).select();
      document.execCommand("copy");
      $temp.remove();
}  
    </script>
</body>
</html>