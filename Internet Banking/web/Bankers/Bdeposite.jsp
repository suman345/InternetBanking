<!DOCTYPE html>
    <%
        int err=0;
        try{
            String msg=request.getParameter("msg");
            if(msg.equalsIgnoreCase("error2"))
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
    <title>Deposite</title>
    <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
    <!-- Our Custom CSS -->
     <link rel="stylesheet" href="../Css/Banker_css/BankerHome.css">
     <link rel ="stylesheet" href="../Css/Banker_css/Bdeposite.css">
    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">
    <script src="../Java_Script/Banker_js/BakerDeposit.js"></script>
    <!-- Font Awesome JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/js/solid.js"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>
        <script>
            function msge()
            {
                    document.getElementById('err').innerHTML="Account No Dose no Exits";
                   //alert("Account No Dose no Exits");
            }
        </script>
</head>

<body onload="<%if(err==1){out.print("msge()");}%>">

    <div class="wrapper">
        <!-- Sidebar  -->
        <%@include file="pagefiles/Banker_sidepanel.jsp" %>
        <!-- Page Content  -->
        <div id="content">

            <%@include file="pagefiles/Banker_navbar.jsp" %>
            <form action="../Deposit_user" style="max-width:500px;margin:auto; margin-top: 30px;" id="dform" method="POST">
              <h2 id="heading">Customar Deposite</h2>
                <div style="color:red;" id="err"> </div>
              <div class="input-container">
                  
                <input class="input-field inp" type="text" placeholder="Account Number" id="acno" name="acno">
                </div>
               <div style="color:red;" id="err1"> </div>
                 <div class="input-container">
                <input class="input-field inp" type="text" placeholder="Amount to Deposite" id="deposite" name="deposite">
                </div>
               <div style="color:red;" id="err2"> </div>
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
               <div style="color:red;" id="err3"> </div>
               <button type="submit" class="btn btn-MD" id="DepBtn" onclick=" return deposit();">Deposite</button>
              </form>
        </div>
    </div>

    <!-- jQuery CDN - Slim version (=without AJAX) -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <!-- Popper.JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
    <!-- Bootstrap JS -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
    <!-- jQuery Custom Scroller CDN -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js"></script>

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
</body>

</html>