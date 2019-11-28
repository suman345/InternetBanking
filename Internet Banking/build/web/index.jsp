<!DOCTYPE html>
<html lang="en">
        <%
        try{
            String type=session.getAttribute("type").toString();
            if(type.equals("Banker"))
            {
                response.sendRedirect("Bankers/Banker_Home.jsp");
            }
            else
            {
                if(type.equals("admin"))
                {
                    response.sendRedirect("Admin/Adminhome.jsp");
                }
                else
                {
                    
                }
            }
        }
        catch(Exception ex){
            
        }
        %>
<head>
  <meta charset="utf-8">
  <title>HOME - VISION BANK</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta content="" name="keywords">
  <meta content="" name="description">

  <!-- Favicons -->
  <link href="index/img/favicon.png" rel="icon">
  <link href="index/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Montserrat:300,400,500,700" rel="stylesheet">

  <!-- Bootstrap CSS File -->
  <link href="index/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="index/lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="index/lib/animate/animate.min.css" rel="stylesheet">
  <link href="index/lib/ionicons/css/ionicons.min.css" rel="stylesheet">
  <link href="index/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
  <link href="index/lib/lightbox/css/lightbox.min.css" rel="stylesheet">

  <!-- Main Stylesheet File -->
  <link href="index/css/style.css" rel="stylesheet">
</head>

<body>

  <!--==========================
  Header
  ============================-->
  <header id="header" class="fixed-top">
    <div class="container">

      <div class="logo float-left">
        <!-- Uncomment below if you prefer to use an image logo -->
        <!-- <h1 class="text-light"><a href="#header"><span>NewBiz</span></a></h1> -->
        <a href="#intro" class="scrollto"><img src="index/img/bnklogo.png" alt="" class="img-fluid" style="width: 200px;"></a>
      </div>

      <nav class="main-nav float-right d-none d-lg-block">
        <ul>
          <li class="active"><a href="#intro">Home</a></li>
          <li><a href="#about">About Us</a></li>
          <li><a href="#services">Services</a></li>
          <li><a href="#team">Team</a></li>
          <li><a href="#contact">Contact Us</a></li>
        </ul>
      </nav><!-- .main-nav -->
      
    </div>
  </header><!-- #header -->

  <!--==========================
    Intro Section
  ============================-->
  <section id="intro" class="clearfix">
    <div class="container">

      <div class="intro-img">
        <img src="index/img/intro-img.svg" alt="" class="img-fluid">
      </div>

      <div class="intro-info">
          <h2>Here you can get<br>next level of<br><span>DIGITAL BANKING!</span></h2>
        <div>
            <a href="Login/Login.jsp" class="btn-get-started scrollto">login Here</a>
        </div>
      </div>

    </div>
  </section><!-- #intro -->

  <main id="main">

    <!--==========================
      About Us Section
    ============================-->
    <section id="about">
      <div class="container">

        <header class="section-header">
          <h3>About Us</h3>
          <p>Vision Bank is one of the largest private sector bank in India.</p>
        </header>

        <div class="row about-container">

          <div class="col-lg-6 content order-lg-1 order-2">
            <p>
              The Bank has a large footprint of 4,050 domestic branches (including extension counters) with 11,801 ATMs and 4,917 cash recyclers spread across the country as on 31st March, 2019. The overseas operations of the Bank are spread over nine international offices with branches at Singapore, Hong Kong, Dubai (at the DIFC), Colombo and Shanghai; representative offices at Dhaka, Dubai, Abu Dhabi and an overseas subsidiary at London, UK. The international offices focus on corporate lending, trade finance, syndication, investment banking and liability businesses.
            </p>

            <div class="icon-box wow fadeInUp">
              <div class="icon"><i class="fa fa-eye"></i></div>
              <h4 class="title"><a href="">Vision of the Bank</a></h4>
              <p class="description">To be the preferred financial solutions provider excelling in customer delivery through insight, empowered employees and smart use of technology<br>
                <b>>> <u>Core Values</u><br>
                >> <u>Customer Centricity</u><br>
                >> <u>Ethics</u><br>
                >> <u>Transparency</u><br>
                >> <u>Teamwork</u><br>
                >> <u>Ownership</u></b>
                </p>
            </div>

            <div class="icon-box wow fadeInUp" data-wow-delay="0.2s">
              <div class="icon"><i class="fa fa-photo"></i></div>
              <h4 class="title"><a href="">Awards</a></h4><br>
              <ul class="description">
                <li>Vision Bank wins Financial Inclusion Initiative of the Year at the Asian Banking &amp; Finance Awards, 2019. Vision Bank wins for the Best Use of Data &amp; Analytics for Business Outcome amongst Large Banks at the 14th Indian Banking Association Technology Awards</li><li>Vision Bank wins Best Digital Bank at the 2016-17 edition of The Financial Express 'India's Best Banks' awards ceremony, held on January 10th, 2019. Vision Bank wins The Best Rewards Program for the fifth consecutive year at the Customer Loyalty Awards, 2019. </li>
                </ul>
            </div>

          </div>

          <div class="col-lg-6 background order-lg-2 order-1 wow fadeInUp">
            <img src="index/img/about-img.svg" class="img-fluid" alt="">
          </div>
        </div>

        <div class="row about-extra">
          <div class="col-lg-6 wow fadeInUp">
            <img src="index/img/about-extra-1.svg" class="img-fluid" alt="">
          </div>
          <div class="col-lg-6 wow fadeInUp pt-5 pt-lg-0">
            <h4>Investor Relation</h4>
            <p>
              Vision Bank disseminates information on its operations and initiatives on a regular basis. The Vision Bank website serves as a key investor awareness facility, allowing stakeholders to access information on Vision Bank at their convenience. Vision Bank's dedicated investor relations personnel play a proactive role in disseminating information to both analysts and investors and respond to specific queries.
            </p>
          </div>
        </div>

        <div class="row about-extra">
          <div class="col-lg-6 wow fadeInUp order-1 order-lg-2">
            <img src="index/img/about-extra-2.svg" class="img-fluid" alt="">
          </div>

          <div class="col-lg-6 wow fadeInUp pt-4 pt-lg-0 order-2 order-lg-1">
            <h4>Safe Banking</h4>
            <p>
             Of all the things you want to keep safe, your financial information is surely near the top of the list. Online banks know protecting your financial information is serious business. They use a combination of cutting edge technology and industry best practices to protect your personal and financial information.

            While individual banks approach security in different ways, there are several measures every online bank should take to provide a safe banking 
            </p>
          </div>
          
        </div>

      </div>
    </section><!-- #about -->

    <!--==========================
      Services Section
    ============================-->
    <section id="services" class="section-bg">
      <div class="container">

        <header class="section-header">
          <h3>Services</h3>
          <p>Laudem latine persequeris id sed, ex fabulas delectus quo. No vel partiendo abhorreant vituperatoribus.</p>
        </header>

        <div class="row">

          <div class="col-md-6 col-lg-5 offset-lg-1 wow bounceInUp" data-wow-duration="1.4s">
            <div class="box">
              <div class="icon"><i class="ion-ios-analytics-outline" style="color: #ff689b;"></i></div>
              <h4 class="title"><a href="">Accounts</a></h4>
              <p class="description">Manage money and bank better with different types of bank accounts to cater to different categories of industries, individuals and banking transactions.</p>
            </div>
          </div>
          <div class="col-md-6 col-lg-5 wow bounceInUp" data-wow-duration="1.4s">
            <div class="box">
              <div class="icon"><i class="ion-ios-bookmarks-outline" style="color: #e9bf06;"></i></div>
              <h4 class="title"><a href="">Loans</a></h4>
              <p class="description">Explore our wide range of loans that fits into your requirements and lets you achieve your goals.</p>
            </div>
          </div>

          <div class="col-md-6 col-lg-5 offset-lg-1 wow bounceInUp" data-wow-delay="0.1s" data-wow-duration="1.4s">
            <div class="box">
              <div class="icon"><i class="ion-ios-paper-outline" style="color: #3fcdc7;"></i></div>
              <h4 class="title"><a href="">Deposites</a></h4>
              <p class="description">Whether it's a large or small amount of money, keep it secure and earn high interest, through our array of fixed and recurring deposits that you can invest in.</p>
            </div>
          </div>
          <div class="col-md-6 col-lg-5 wow bounceInUp" data-wow-delay="0.1s" data-wow-duration="1.4s">
            <div class="box">
              <div class="icon"><i class="ion-ios-speedometer-outline" style="color:#41cf2e;"></i></div>
              <h4 class="title"><a href="">Cards</a></h4>
              <p class="description">Choose from a series of credit cards, tailor made to meet your needs and desires. Enjoy the unmatched privileges, gift vouchers, eDGE reward points and much more.</p>
            </div>
          </div>

          <div class="col-md-6 col-lg-5 offset-lg-1 wow bounceInUp" data-wow-delay="0.2s" data-wow-duration="1.4s">
            <div class="box">
              <div class="icon"><i class="ion-ios-world-outline" style="color: #d6ff22;"></i></div>
              <h4 class="title"><a href="">Investments</a></h4>
              <p class="description">Get more from your money and fuel your financial aspirations with our range of investment products suited to cater varied investor profiles.</p>
            </div>
          </div>
          <div class="col-md-6 col-lg-5 wow bounceInUp" data-wow-delay="0.2s" data-wow-duration="1.4s">
            <div class="box">
              <div class="icon"><i class="ion-ios-clock-outline" style="color: #4680ff;"></i></div>
              <h4 class="title"><a href="">Isurance</a></h4>
              <p class="description">Get assured compensation of financial losses during medical and non-medical emergencies, with our comprehensive health, travel and life insurance products.</p>
            </div>
          </div>

        </div>

      </div>
    </section><!-- #services -->

    <!--==========================
      Clients Section
    ============================-->
    <section id="testimonials" class="section-bg">
      <div class="container">

        <header class="section-header">
          <h3>Testimonials</h3>
        </header>

        <div class="row justify-content-center">
          <div class="col-lg-8">

            <div class="owl-carousel testimonials-carousel wow fadeInUp">
    
              <div class="testimonial-item">
                <img src="index/img/testimonial-1.jpg" class="testimonial-img" alt="">
                <h3>Sukumar Jain</h3>
                <h4>Co-Owner</h4>
                <h3>Pini Ace Hardware</h3>
                <p>
                  At Vision Bank, they’re all about customer service, and we’re all about customer service. They’re all about the community and we’re all about the community. That’s why I feel it’s been a great, great fit.
                </p>
              </div>
    
              <div class="testimonial-item">
                <img src="index/img/testimonial-2.jpg" class="testimonial-img" alt="">
                <h3>Rajendra Singh</h3>
                <h4>President</h4>
                <h3>Halsey Bottling</h3>
                <p>
                  Having a banker with wine expertise is very important. It helps us to do our thing without having to explain to someone how and why we need something.
                </p>
              </div>
    
              <div class="testimonial-item">
                <img src="index/img/testimonial-3.jpg" class="testimonial-img" alt="">
                <h3>Ricky D'souza</h3>
                <h4>President</h4>
                <h3>Rustic Bakery</h3>
                <p>
                  I’ve worked closely over the years with the bank to develop a relationship that has become integral to the growth and success of our company.
                </p>
              </div>

            </div>

          </div>
        </div>


      </div>
    </section><!-- #testimonials -->

    <!--==========================
      Team Section
    ============================-->
    <section id="team">
      <div class="container">
        <div class="section-header">
          <h3>Team</h3>
          <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque</p>
        </div>

        <div class="row">

          <div class="col-lg-3 col-md-6 wow fadeInUp">
            <div class="member">
              <img src="index/img/Suman.JPG" class="img-fluid" alt="">
              <div class="member-info">
                <div class="member-info-content">
                  <h4>Suman Dhara</h4>
                  <span>Chief Executive Officer</span>
                  <div class="social">
                    <a href=""><i class="fa fa-twitter"></i></a>
                    <a href=""><i class="fa fa-facebook"></i></a>
                    <a href=""><i class="fa fa-google-plus"></i></a>
                    <a href=""><i class="fa fa-linkedin"></i></a>
                  </div>
                </div>
              </div>
            </div>
          </div>

          <div class="col-lg-3 col-md-6 wow fadeInUp" data-wow-delay="0.1s">
            <div class="member">
              <img src="index/img/Soumen.JPG" class="img-fluid" alt="">
              <div class="member-info">
                <div class="member-info-content">
                  <h4>Soumen Mondal</h4>
                  <span>Product Manager</span>
                  <div class="social">
                    <a href=""><i class="fa fa-twitter"></i></a>
                    <a href=""><i class="fa fa-facebook"></i></a>
                    <a href=""><i class="fa fa-google-plus"></i></a>
                    <a href=""><i class="fa fa-linkedin"></i></a>
                  </div>
                </div>
              </div>
            </div>
          </div>

          <div class="col-lg-3 col-md-6 wow fadeInUp" data-wow-delay="0.2s">
            <div class="member">
              <img src="index/img/Kushal.JPG" class="img-fluid" alt="">
              <div class="member-info">
                <div class="member-info-content">
                  <h4>Kushal Mukherjee</h4>
                  <span>CTO</span>
                  <div class="social">
                    <a href=""><i class="fa fa-twitter"></i></a>
                    <a href=""><i class="fa fa-facebook"></i></a>
                    <a href=""><i class="fa fa-google-plus"></i></a>
                    <a href=""><i class="fa fa-linkedin"></i></a>
                  </div>
                </div>
              </div>
            </div>
          </div>

          <div class="col-lg-3 col-md-6 wow fadeInUp" data-wow-delay="0.3s">
            <div class="member">
              <img src="index/img/akash.jpg" class="img-fluid" alt="">
              <div class="member-info">
                <div class="member-info-content">
                  <h4>Akash Sau</h4>
                  <span>Accountant</span>
                  <div class="social">
                    <a href=""><i class="fa fa-twitter"></i></a>
                    <a href=""><i class="fa fa-facebook"></i></a>
                    <a href=""><i class="fa fa-google-plus"></i></a>
                    <a href=""><i class="fa fa-linkedin"></i></a>
                  </div>
                </div>
              </div>
            </div>
          </div>

        </div>

      </div>
    </section><!-- #team -->

    <!--==========================
      E-commerce partner Section
    ============================-->
    <section id="clients" class="section-bg">

      <div class="container">

        <div class="section-header">
          <h3>Our E-commerce Partners</h3>
        </div>

        <div class="row no-gutters clients-wrap clearfix wow fadeInUp">

          <div class="col-lg-3 col-md-4 col-xs-6">
            <div class="client-logo">
              <img src="index/img/clients/client-1.png" class="img-fluid" alt="">
            </div>
          </div>
          
          <div class="col-lg-3 col-md-4 col-xs-6">
            <div class="client-logo">
              <img src="index/img/clients/client-2.png" class="img-fluid" alt="">
            </div>
          </div>
        
          <div class="col-lg-3 col-md-4 col-xs-6">
            <div class="client-logo">
              <img src="index/img/clients/client-3.png" class="img-fluid" alt="">
            </div>
          </div>
          
          <div class="col-lg-3 col-md-4 col-xs-6">
            <div class="client-logo">
              <img src="index/img/clients/client-4.png" class="img-fluid" alt="">
            </div>
          </div>
          
          <div class="col-lg-3 col-md-4 col-xs-6">
            <div class="client-logo">
              <img src="index/img/clients/client-5.png" class="img-fluid" alt="">
            </div>
          </div>
        
          <div class="col-lg-3 col-md-4 col-xs-6">
            <div class="client-logo">
              <img src="index/img/clients/client-6.png" class="img-fluid" alt="">
            </div>
          </div>
          
          <div class="col-lg-3 col-md-4 col-xs-6">
            <div class="client-logo">
              <img src="index/img/clients/client-7.png" class="img-fluid" alt="">
            </div>
          </div>
          
          <div class="col-lg-3 col-md-4 col-xs-6">
            <div class="client-logo">
              <img src="index/img/clients/client-8.png" class="img-fluid" alt="">
            </div>
          </div>

        </div>

      </div>

    </section>

    <!--==========================
      Contact Section
    ============================-->
    <section id="contact">
      <div class="container-fluid">

        <div class="section-header">
          <h3>Contact Us</h3>
        </div>

        <div class="row wow fadeInUp">

          <div class="col-lg-6">
            <div class="map mb-4 mb-lg-0">
              <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d12097.433213460943!2d-74.0062269!3d40.7101282!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0xb89d1fe6bc499443!2sDowntown+Conference+Center!5e0!3m2!1smk!2sbg!4v1539943755621" frameborder="0" style="border:0; width: 100%; height: 312px;" allowfullscreen></iframe>
            </div>
          </div>

          <div class="col-lg-6">
            <div class="row">
              <div class="col-md-5 info">
                <i class="ion-ios-location-outline"></i>
                <p>A108 Adam Street, NY 535022</p>
              </div>
              <div class="col-md-4 info">
                <i class="ion-ios-email-outline"></i>
                <p>info@example.com</p>
              </div>
              <div class="col-md-3 info">
                <i class="ion-ios-telephone-outline"></i>
                <p>+1 5589 55488 55</p>
              </div>
            </div>

            <div class="form">
              <div id="sendmessage">Your message has been sent. Thank you!</div>
              <div id="errormessage"></div>
              <form action="" method="post" role="form" class="contactForm">
                <div class="form-row">
                  <div class="form-group col-lg-6">
                    <input type="text" name="name" class="form-control" id="name" placeholder="Your Name" data-rule="minlen:4" data-msg="Please enter at least 4 chars" />
                    <div class="validation"></div>
                  </div>
                  <div class="form-group col-lg-6">
                    <input type="email" class="form-control" name="email" id="email" placeholder="Your Email" data-rule="email" data-msg="Please enter a valid email" />
                    <div class="validation"></div>
                  </div>
                </div>
                <div class="form-group">
                  <input type="text" class="form-control" name="subject" id="subject" placeholder="Subject" data-rule="minlen:4" data-msg="Please enter at least 8 chars of subject" />
                  <div class="validation"></div>
                </div>
                <div class="form-group">
                  <textarea class="form-control" name="message" rows="5" data-rule="required" data-msg="Please write something for us" placeholder="Message"></textarea>
                  <div class="validation"></div>
                </div>
                <div class="text-center"><button type="submit" title="Send Message">Send Message</button></div>
              </form>
            </div>
          </div>

        </div>

      </div>
    </section><!-- #contact -->

  </main>

  <!--==========================
    Footer
  ============================-->
  <footer id="footer">
    <div class="footer-top">
      <div class="container">
        <div class="row">

          <div class="col-lg-4 col-md-6 footer-info">
            <h3>NewBiz</h3>
            <p>Cras fermentum odio eu feugiat lide par naso tierra. Justo eget nada terra videa magna derita valies darta donna mare fermentum iaculis eu non diam phasellus. Scelerisque felis imperdiet proin fermentum leo. Amet volutpat consequat mauris nunc congue.</p>
          </div>

          <div class="col-lg-2 col-md-6 footer-links">
            <h4>Useful Links</h4>
            <ul>
              <li><a href="#">Home</a></li>
              <li><a href="#">About us</a></li>
              <li><a href="#">Services</a></li>
              <li><a href="#">Terms of service</a></li>
              <li><a href="#">Privacy policy</a></li>
            </ul>
          </div>

          <div class="col-lg-3 col-md-6 footer-contact">
            <h4>Contact Us</h4>
            <p>
              A108 Adam Street <br>
              New York, NY 535022<br>
              United States <br>
              <strong>Phone:</strong> +1 5589 55488 55<br>
              <strong>Email:</strong> info@example.com<br>
            </p>

            <div class="social-links">
              <a href="#" class="twitter"><i class="fa fa-twitter"></i></a>
              <a href="#" class="facebook"><i class="fa fa-facebook"></i></a>
              <a href="#" class="instagram"><i class="fa fa-instagram"></i></a>
              <a href="#" class="google-plus"><i class="fa fa-google-plus"></i></a>
              <a href="#" class="linkedin"><i class="fa fa-linkedin"></i></a>
            </div>

          </div>

          <div class="col-lg-3 col-md-6 footer-newsletter">
            <h4>Our Newsletter</h4>
            <p>Tamen quem nulla quae legam multos aute sint culpa legam noster magna veniam enim veniam illum dolore legam minim quorum culpa amet magna export quem marada parida nodela caramase seza.</p>
            <form action="" method="post">
              <input type="email" name="email"><input type="submit"  value="Subscribe">
            </form>
          </div>

        </div>
      </div>
    </div>

    <div class="container">
      <div class="copyright">
        &copy; Copyright <strong>VisionBank</strong>. All Rights Reserved
      </div>
      <div class="credits">
        <!--
          All the links in the footer should remain intact.
          You can delete the links only if you purchased the pro version.
          Licensing information: https://bootstrapmade.com/license/
          Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/buy/?theme=NewBiz
        -->
        Designed by Suman and Shankha
      </div>
    </div>
  </footer><!-- #footer -->

  <a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>
  <!-- Uncomment below i you want to use a preloader -->
  <!-- <div id="preloader"></div> -->

  <!-- JavaScript Libraries -->
  <script src="index/lib/jquery/jquery.min.js"></script>
  <script src="index/lib/jquery/jquery-migrate.min.js"></script>
  <script src="index/lib/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="index/lib/easing/easing.min.js"></script>
  <script src="index/lib/mobile-nav/mobile-nav.js"></script>
  <script src="index/lib/wow/wow.min.js"></script>
  <script src="index/lib/waypoints/waypoints.min.js"></script>
  <script src="index/lib/counterup/counterup.min.js"></script>
  <script src="index/lib/owlcarousel/owl.carousel.min.js"></script>
  <script src="index/lib/isotope/isotope.pkgd.min.js"></script>
  <script src="index/lib/lightbox/js/lightbox.min.js"></script>
  <!-- Contact Form JavaScript File -->
  <script src="index/contactform/contactform.js"></script>

  <!-- Template Main Javascript File -->
  <script src="index/js/main.js"></script>

</body>
</html>
