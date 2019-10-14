<html>

<head>
  <title>Internet Banking</title>
  <link rel="stylesheet" type="text/css" href="Css/index.css">
</head>

<body>
    <%@include file="File_Source/Navmain.jsp" %>
   <br>
  <div class="container-fluid">
    <div class="row">
      <div id="carousel-example-2" class="carousel slide carousel-fade" data-ride="carousel">
        <ol class="carousel-indicators">
          <li data-target="#carousel-example-2" data-slide-to="0" class="active"></li>
          <li data-target="#carousel-example-2" data-slide-to="1"></li>
          <li data-target="#carousel-example-2" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner" role="listbox">
          <div class="carousel-item active">
            <div class="view">
              <img class="d-block w-100" src="Image/Slider1.jpg" alt="First slide">
              <div class="mask rgba-black-light"></div>
            </div>
            <div class="carousel-caption">
              <h3 class="h3-responsive">Light mask</h3>
              <p>First text</p>
            </div>
          </div>
          <div class="carousel-item">
            <div class="view">
              <img class="d-block w-100" src="Image/Slider2.jpg" alt="Second slide">
              <div class="mask rgba-black-strong"></div>
            </div>
            <div class="carousel-caption">
              <h3 class="h3-responsive">Strong mask</h3>
              <p>Secondary text</p>
            </div>
          </div>
          <div class="carousel-item">
            <div class="view">
              <img class="d-block w-100" src="Image/Slider3.jpg" alt="Third slide">
              <div class="mask rgba-black-slight"></div>
            </div>
            <div class="carousel-caption">
              <h3 class="h3-responsive">Slight mask</h3>
              <p>Third text</p>
            </div>
          </div>
        </div>
</body>

</html>