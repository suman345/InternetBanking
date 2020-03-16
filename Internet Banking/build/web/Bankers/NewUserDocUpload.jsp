<%@page import="java.util.Base64"%>
<!DOCTYPE html>
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
     <link rel ="stylesheet" href="../Css/Banker_css/NewUserDocUpload.css">
    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">
    <script src="../Java_Script/User_js1/UserRegistrationDoc.js"></script>
    <!-- Font Awesome JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/js/solid.js"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>
</head>

<body>
    <div class="wrapper">
        <!-- Sidebar  -->
        <%@include file="pagefiles/Banker_sidepanel.jsp" %>
        <!-- Page Content  -->
        <div id="content">

            <%@include file="pagefiles/Banker_navbar.jsp" %>
            
            <form action="../Userdocument1" style="max-width:500px;margin:auto; margin-top: 30px;" id="upld" method="POST" enctype="multipart/form-data">
              <h2 id="heading">Document Upload</h2>
              <div class="input-container">
                  <p id="cifcu">CIF No</p>
                  <%
                        try
                        {
                            String msg= request.getParameter("msg");
                            String time=new String( Base64.getDecoder().decode(msg));
                            try
                            {
                                long timeLong=Long.parseLong(time);

                    %>
                    <input type="text" class="form-control" id="fetchcif" name="cifno" value="<%=time%>" disabled="true">
                    <input type="hidden" class="form-control" id="h_fetchcif" name="h_cifno" value="<%=time%>">
                    <%
                            }
                            catch(Exception ex)
                            {
                                %>
                                <script>
                                    alert("Invalid Url");
                                </script>
                                <%
                            }
                         }
                        catch(Exception ex){}
                    %>
              </div>
              <div> <span style="color:aqua;" id="doc1"></span></div>
              <div class="custom-file">
                  <input type="file" class="custom-file-input" id="idupld" name="doc">
                <label class="custom-file-label" for="idupld">Upload Identification Proof*</label>
              </div>
              <div> <span style="color:aqua;" id="doc2"></span></div>
            
              
         <div class="input-container">
                <input class="form-control" type="text" placeholder="ID Number" id="adrno" name="adrno">
                </div>
              <div> <span style="color:aqua;" id="doc3"></span></div>
                <div class="custom-file">
                   <input type="file" class="custom-file-input" id="addupload" name="addupload">
                <label class="custom-file-label" for="addupload">Upload Address Proof*</label>
              </div>
              <div> <span style="color:aqua;" id="doc4"></span></div>
           
               
               <div class="input-container">
                <input class="form-control" type="text" placeholder="Document No" id="addno" name="addno">
                </div>
               <div> <span style="color:aqua;" id="doc5"></span></div>
                 <div class="custom-file">
                     <input type="file" class="custom-file-input" id="photo" name="photo">
                <label class="custom-file-label" for="photo">Upload Photo*</label>
                 </div>
                <div> <span style="color:aqua;" id="doc6"></span></div>
                <div class="custom-file">
                    <input type="file" class="custom-file-input" id="signature" name="signature">
                    <label class="custom-file-label" for="signature">Signature*</label>
                </div>
                <button type="submit" class="btn btn-lg" id="UpldBtn" onclick="return user_document();">Deposite</button>
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