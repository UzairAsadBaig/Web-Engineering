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
    <link rel="stylesheet" href="css/searchbook.css" />

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

    <%@ page import="myPack.*" %>
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
    <div class="main-search-input-wrap">
      <form action="Controller" method="POST" class="main-search-input fl-wrap">
          <div  class="main-search-input-item"> <input type="text" name="searchTitle" placeholder="Search Book"> </div> <button type="submit" name="action" value="searchbook" class="main-search-button">Search</button>
      </form>
  </div>

  <table class="table table-striped table-dark search_table">
    <thead>
      <tr>
        <th scope="col">ID</th>
        <th scope="col">Title</th>
        <th scope="col">Author</th>
        <th scope="col">Publisher</th>
        <th scope="col">Genre</th>
        <th scope="col">Link</th>
      </tr>
    </thead>
    <tbody>
      <% Book temp=(Book)session.getAttribute("book"); 
      if(temp == null){ %>
      <tr>
        <th scope="row"></th>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      <% } else{%>
        <tr>
          <th scope="row"><%=temp.getId()%></th>
          <td><%=temp.getTitle()%></td>
          <td><%=temp.getAuthor()%></td>
          <td><%=temp.getPublisher()%></td>
          <td><%=temp.getGenre()%></td>
          <td><a href="https://<%=temp.getLink()%>" target="_blank" class="tapMe">Tap me</a></td>
        </tr>


        <%}
        session.removeAttribute("book");
        %>
    </tbody>
  </table>


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

  </body>
</html>
