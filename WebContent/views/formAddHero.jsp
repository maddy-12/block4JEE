<%@ include file="head.jsp"%>
<%@ include file="nav.jsp"%>

<body>

	<header>
	<img src = "/assets/hero/jsp">
	</header>
	<div class="container form-zone my-5">
		<div class="text-center">
			<h1>S'inscrire</h1>
		</div>
		<form action='' method="post">

		<label for="exampleInputEmail1" class="form-label">Incidents</label>
			<!-- Checkbox zone -->
			<div class="row ">
				
				<div class="">
					<c:forEach var="incident" items="${incidents}">
						<div class="form-check">
							<input class="form-check-input"
								name="incident${incident.id}" type="checkbox"
								value="${incident.id}" id="${incident.name_incident}"> <label
								class="form-check-label" for="${incident.name_incident}">
									${incident.name_incident}
							</label>
						</div>
					</c:forEach>
				</div>
			</div>

			<!-- Name -->
			<div class="mb-3">
				<label for="heroName" class="form-label">Nom</label> <input
					name="name" type="text" class="form-control" id="heroName"
					aria-describedby="textHelp" name="name">
			</div>
			<!-- phone -->
			<div class="mb-3">
				<label for="heroPhone" class="form-label">Telephone</label> <input
					type="text" class="form-control" id="phone" name="phone">
			</div>

			<!-- Address -->
			<div class="mb-3">
				<label for="heroPhone" class="form-label">Adresse</label> <input
					type="text" class="form-control" name="address" id="heroAddr">
			</div>

			<!-- Latitude -->
			<div class="mb-3">
				<label for="heroLatitude" class="form-label">Latitude</label> <input
					type="float" class="form-control" id="heroLatitude"
					name="longitude">
			</div>

			<!-- Longitude -->
			<div class="mb-3">
				<label for="heroLongitude" " class="form-label">Longitude</label> <input
					type="float" class="form-control" id="heroLongitude"
					name="latitude">
			</div>
			<div class="d-flex justify-content-center">
				<button type="submit" style="width: 200px;" class="btn btn-primary"
					name="addHero_form">Valider</button>
			</div>
		</form>
	
	<!-- Limiter le nombre de checkboxes coché -->
		<script>
		$("input:checkbox").click(function() {
			var bol = $("input:checkbox:checked").length >= 3;     
			$("input:checkbox").not(":checked").attr("disabled",bol);
			});
		</script>
		
		<!-- CSS -->
		<style>
			.form-zone {
							width: 60%;
							padding: 20px;
							border: #F4F3F6 1px solid;
							box-shadow: -6px 15px 15px -12px rgba(0, 0, 0, 0.32);
						}
		</style>
	</div>
</body>
