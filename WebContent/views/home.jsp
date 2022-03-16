<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="head.jsp"%>
<%@ include file="nav.jsp"%>

<body>

	<div class="container">
		<div class="row mt-5"
			style="margin: 0 auto; width: 100%; text-align: center; width: 60%; padding: 40px 60px; border: #F4F3F6 1px solid; box-shadow: -6px 15px 15px -12px rgba(0, 0, 0, 0.32);">
			<div class="col-6"
				style=" box-sizing: border-box; border-right: black 1px solid; height: 250px;">
				<p>Superhéro ? Inscrivez-vous !</p>
				<a class="btn btn-primary"
					style="margin-top: 80px; padding: 8px 85px;"
					href="/superhero/registerHero"
					target="blank">Incription</a>
			</div>

			<div class="col-6"
				style="">
				<p>Besoin d'aide? Nous sommes là pour vous !</p>
				<a class="btn btn-primary"
					style="margin-top:  55px; padding: 8px 50px;"
					href="/superhero/reportIncident"
					target="blank">Déclarer un incident</a>
			</div>
		</div>
	</div>
</body>
