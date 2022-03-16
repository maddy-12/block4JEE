<%@ include file="head.jsp" %>
<body>
<nav class="navbar navbar-expand-lg mb-3 navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="/superhero/home">My Superhero</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="/superhero/home">Accueil</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" aria-current="page" href="/superhero/registerHero">Inscription</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" aria-current="page" href="#">D�clarer un incident</a>
        </li>
          <li class="nav-item">
          <a class="nav-link" aria-current="page" href="/superhero/HeroList">Superh�ros</a>
        </li>

      </ul>
    </div>
  </div>
</nav>
</body>
</html>