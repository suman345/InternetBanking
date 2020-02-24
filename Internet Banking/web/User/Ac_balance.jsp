<%-- 
    Document   : Ac_balance
    Created on : Feb 23, 2020, 8:25:53 PM
    Author     : Sumanpc
--%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>Internet_Banking</title>
    
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="../Css/User_css/User_Home.css">
    <link rel="stylesheet" href="../Css/User_css/User_balance_check.css">
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js"></script>
    
</head>
<body>
    <div class="wrapper">
        <%@include file="Pagefiles/User_sidepanel.jsp" %>
        <div id="content">
            <%@include file="Pagefiles/User_navbar.jsp" %>
                        <!-- User Balance Start -->
            
             <div class="container register">
                <div class="row">
                    <div class="col-md-12">
                        <ul class="nav nav-tabs nav-justified" id="myTab" role="tablist">
                            <li class="nav-item">
                                <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">Current Balance</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile" aria-selected="false">Last Transactions</a>
                            </li>
                        </ul>
                        <div class="tab-content" id="myTabContent">
                            <div class="tab-pane fade show active text-align form-new" id="home" role="tabpanel" aria-labelledby="home-tab">
                                <h6 class="register-heading">Your Current Account Balance Is:</h6>
                                <div class="card">
                                <p style="text-align: center; color: blanchedalmond; font-size: 30px; font-family: serif;">INR.</p>
                                <p id="blnc" name="blnc" style="color: black; text-align: center; font-family:fantasy;">32532</p>
                                </div>
                            </div>
                            <div class="tab-pane fade show text-align form-new" id="profile" role="tabpanel" aria-labelledby="profile-tab">
                                <h6  class="register-heading">Your last 5 transactions are</h6>
                                <div>
                                <!--Table-->
                                    <table class="table table-striped">
                                      <thead>
                                        <tr>
                                          <th scope="col">Date</th>
                                          <th scope="col">Transaction Detail</th>
                                          <th scope="col">Amount</th>
                                          <th scope="col">Transaction type</th>
                                        </tr>
                                      </thead>
                                      <tbody>
                                        <tr>
                                          <th scope="row">1</th>
                                          <td>Mark</td>
                                          <td>Otto</td>
                                          <td>jyu</td>
                                        </tr>
                                        <tr>
                                          <th scope="row">2</th>
                                          <td>Jacob</td>
                                          <td>Thornton</td>
                                          <td>hthf</td>
                                        </tr>
                                        <tr>
                                          <th scope="row">3</th>
                                          <td>Larry</td>
                                          <td>the Bird</td>
                                          <td>ghhfhj</td>
                                        </tr>
                                        <tr>
                                          <th scope="row">4</th>
                                          <td>Larry</td>
                                          <td>the Bird</td>
                                          <td>ghhfhj</td>
                                        </tr>
                                          <tr>
                                          <th scope="row">5</th>
                                          <td>Larry</td>
                                          <td>the Bird</td>
                                          <td>ghhfhj</td>
                                        </tr>
                                      </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!--ac_balance end-->
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $('#sidebarCollapse').on('click', function () {
                $('#sidebar').toggleClass('active');
            });
        });
    </script>
</body>

</html>
