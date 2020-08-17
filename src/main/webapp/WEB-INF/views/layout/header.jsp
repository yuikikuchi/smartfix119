<header>
  <nav class="navbar navbar-expand-lg navbar-dark mx-background-top-linear">
    <div class="container">
      <a class="navbar-brand header_logo" href="<%= request.getContextPath() %>/" style="text-transform: uppercase;"></a>
      <button class="navbar-toggler" type="button"
              data-toggle="collapse"
              data-target="#navbarResponsive"
              aria-controls="navbarResponsive"
              aria-expanded="false"
              aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item mr-auto">
            <a class="nav-link" href="<%= request.getContextPath() %>/#home_section">Home</a>
          </li>
          <li class="nav-item mr-auto">
            <a class="nav-link" href="<%= request.getContextPath() %>/#about_section">About</a>
          </li>
          <li class="nav-item mr-auto">
            <a class="nav-link" href="<%= request.getContextPath() %>/#search_section">Search</a>
          </li>
          <li class="nav-item mr-auto">
            <a class="nav-link" href="<%= request.getContextPath() %>/#service_section">Service</a>
          </li>
          <li class="nav-item mr-auto">
            <a class="nav-link" href="<%= request.getContextPath() %>/#news_section">News</a>
          </li>
          <li class="nav-item mr-auto">
            <a class="nav-link" href="<%= request.getContextPath() %>/#maker_section">Maker</a>
          </li>
          <li class="nav-item mr-auto">
            <a class="nav-link" href="<%= request.getContextPath() %>/#contact_section">Contact</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
</header>