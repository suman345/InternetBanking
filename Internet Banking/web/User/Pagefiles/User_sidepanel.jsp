<%-- 
    Document   : User_sidepanel.jsp
    Created on : Feb 15, 2020, 8:56:02 PM
    Author     : Sumanpc
--%>
<!-- Side nav Start -->
        <nav id="sidebar">
            <div class="sidebar-header">
                <h3 style="text-align: center;">NLDB Bank</h3>
                <strong>NB</strong>
                <div class="line"></div>
            </div>

            <ul class="list-unstyled components">
                <li>
                    <a href="UserMyprofile.jsp" style="text-align: center;">
                        <i class="fas fa-user-circle"></i>
                        My Profile
                    </a>
                </li>
                <li>
                    <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle" style="text-align: center;">
                        <i class="fas fa-info-circle"></i>
                        Account info
                    </a>
                    <ul class="collapse list-unstyled" id="homeSubmenu">
                        <li>
                            <a href="Ac_balance.jsp" style="text-align: center;"> <i class="fas fa-wallet"></i>Account Balance</a>
                        </li>
                        <li>
                            <a href="#" style="text-align: center;"> <i class="fas fa-receipt"></i>Transactions</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#" style="text-align: center;">
                        <i class="fas fa-file-alt"></i>
                        View Statement
                    </a>
                    <a href="#fnd" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle" style="text-align: center;">
                        <i class="fas fa-random"></i>
                        Fund Transfer
                    </a>
                    <ul class="collapse list-unstyled" id="fnd">
                        <li>
                            <a href="#" style="text-align: center;"><i class="fas fa-arrow-alt-circle-right"></i>Within Bank</a>
                        </li>
                        <li>
                            <a href="#" style="text-align: center;"><i class="fas fa-arrow-circle-left"></i>With Other Bank</a>
                        </li>               
                    </ul>
                    <a href="#pageSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle" style="text-align: center;">
                        <i class="fas fa-dolly-flatbed"></i>
                        Services
                    </a>
                    <ul class="collapse list-unstyled" id="pageSubmenu">
                        <li>
                            <a href="#" style="text-align: center;"><i class="fas fa-money-check"></i>Checkbook</a>
                        </li>
                        <li>
                            <a href="#" style="text-align: center;"><i class="fas fa-credit-card"></i>Debit Card</a>
                        </li>
                        <li>
                            <a href="#" style="text-align: center;"><i class="fas fa-credit-card"></i>Credit Card</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#" style="text-align: center;">
                        <i class="fas fa-question"></i>
                        FAQ
                    </a>
                </li>
            </ul>

            <ul class="list-unstyled CTAs">
                <li>
                    <a href="#">Download Statement</a>
                </li>
            </ul>
        </nav>
        <!-- Side nav end -->