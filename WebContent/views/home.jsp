<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="head.jsp" %>
<%@ include file="nav.jsp" %>

<body>

	    <div class="container">
        <div class="row" style=" margin: 0 auto; width: 100%; text-align: center; width: 60%;
	           padding: 40px 60px;
	           border: #F4F3F6 1px solid;
	           box-shadow: -6px 15px 15px -12px rgba(0, 0, 0, 0.32); ">
            <div class="col-6"
                style=" background-image: url('assets/hero.png'); box-sizing: border-box;  border-right: black 1px solid; height: 250px;">
                <p>Superhéro ? Inscrivez-vous !</p>
                <!-- <img src="hero.png" alt=""> -->
                <a class="btn btn-primary" href="/superhero/registerHero">Incription</a>
            </div>

            <div class="col-6" style=" background-image: url('assets/incident.PNG');">
                <p>Besoin d'aide ? Nous sommes là pour vous !</p>
                <a class="btn btn-primary" href="/superhero/reportIncident">Déclarer un incident</a>
            </div>
        </div>
    </div>
</body>
