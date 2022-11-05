<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- TODO: ------------------- Required meta tags ------------------>
    <meta charset="utf-8" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1, shrink-to-fit=no"
    />
    <!--TODO:----- Google Fonts(Optional) Roboto -->
    <!-- <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"> -->
    <!--TODO:----- Bootstrap core CSS -->
    <link
      href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/css/bootstrap.min.css"
      rel="stylesheet"
    />
    <!--TODO:----- Material Design Bootstrap -->
    <link
      href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.1/css/mdb.min.css"
      rel="stylesheet"
    />

    <!--TODO:------------- Custom Personalize css  -------------->
    <link rel="stylesheet" href="css/style.css" />
    <link rel="stylesheet" href="css/addbook.css" />

    <!--TODO:-------------- Animation.css links(Please Include anim folder)  -------------->
    <link rel="stylesheet" href="anim/css/libs/animate.css" />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.0.0/animate.min.css"
    />

    <title>Add product | MUB</title>
    <!--TODO:------ Adding icon of Max size of (100 X 100) in Tab bar -->
    <link rel="shortcut icon" href="images/MUB.png" />
  </head>

  <body>
    <% if(session.getAttribute("name") == null){
      String message="Please login first!";
            request.getSession().setAttribute("errMessage", message);
            response.sendRedirect("login.jsp");
    }%>
    <h3 class="welcome">
      <a href="dashboard.jsp" class="logo"><img src="./images/MUB.png" alt="" /></a> Welcome
      <span id="username">
        <%=
        session.getAttribute("name")
        %>
      </span>
      </span> ,
      <form action="Controller" method="POST" class="form_logout">
        <button class="logout" type="submit" name="action" value="logout" style=" position: relative;
        top: -3rem; float: right;">logout</button>
      </form>
    </h3>
    <hr class="line" />
    <!-- Sign up form -->
    <section class="addbook">
      <div class="container">
        <div class="signup-content">
          <div class="signup-form">
            <h2 class="form-title">Add Book</h2>
            <form method="POST" name="addbook" class="register-form" action="Controller">
              <div class="form-group">
                <input type="text" name="title" placeholder="Title" required />
              </div>
              <div class="form-group">
                <input name="author" placeholder="Author" required/>
              </div>
              <div class="form-group">
                <input name="publisher" placeholder="Publiusher" required />
              </div>
              <div class="form-group">
                <input name="genre" placeholder="Genre" required />
              </div>
              <div class="form-group">
                <input name="link" placeholder="URL (link)" />
              </div>

              <div class="form-group form-button">
                <input
                  type="submit"
                  name="action"
                  class="form-submit"
                  value="addbook"
                />
              </div>
            </form>
          </div>
          <div class="signup-image">
            <figure>
              <img src="images/books_blue_add.png" alt="sing up image" />
            </figure>
          </div>
        </div>
      </div>
    </section>

    <!--TODO:----- JQuery -->
    <script
      type="text/javascript"
      src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"
    ></script>
    <!--TODO:----- Bootstrap tooltips -->
    <script
      type="text/javascript"
      src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js"
    ></script>
    <!--TODO:----- Bootstrap core JavaScript -->
    <script
      type="text/javascript"
      src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/js/bootstrap.min.js"
    ></script>
    <!--TODO:----- MDB core JavaScript -->
    <script
      type="text/javascript"
      src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.1/js/mdb.min.js"
    ></script>
    <!--TODO:----- Customize(User) JavaScript -->
    <script src="js/"></script>
    <!--TODO:------------ Font awesome icons link  -------------->
    <script src="https://use.fontawesome.com/releases/v5.14.0/js/all.js"></script>

    <!--TODO:---------- Wow.js link and then script for scrolling animation  -------------->
    <script src="anim/dist/wow.min.js"></script>
    <script>
      new WOW().init();
    </script>
  </body>
</html>
