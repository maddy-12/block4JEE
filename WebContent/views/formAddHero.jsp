<%@ include file="head.jsp" %>
<%@ include file="nav.jsp" %>

<body>
	<div class="container form-zone my-5">
		<div class="text-center">
			<h1>S'inscrire</h1>
		</div>


		<form action="hero" method="post">

			<!-- Checkbox zone -->
			<div class="row d-flex justify-content-between">
				<label for="exampleInputEmail1" class="form-label">Type
					d'incident</label>
				<div class="col-6">

					<div class="mb-3 form-check">
						<input type="checkbox" class="form-check-input" id="incendie">
						<label class="form-check-label" for="incendie">Incendie</label>
					</div>
					<div class="col-6">
						<div class="mb-3 form-check">
							<input type="checkbox" class="form-check-input"
								id="accidentRoutier"> <label class="form-check-label"
								for="accidentRoutier">Accident routier</label>
						</div>
					</div>

					<div class="col-6">
						<div class="mb-3 form-check">
							<input type="checkbox" class="form-check-input"
								id="accidentFluvial"> <label class="form-check-label"
								for="accidentFluvial">Accident fluvial</label>
						</div>
					</div>

					<div class="col-6">
						<div class="mb-3 form-check">
							<input type="checkbox" class="form-check-input"
								id="accidentAerien"> <label class="form-check-label"
								for="accidentAerien">Accident aérien</label>
						</div>
					</div>

					<div class="col-6">
						<div class="mb-3 form-check">
							<input type="checkbox" class="form-check-input"
								id="eboulement"> <label class="form-check-label"
								for="eboulement"> Eboulement</label>
						</div>
					</div>
				</div>
				<!-- col 2 -->
				<div class="col-6">
					<div class="mb-3 form-check">
						<input type="checkbox" class="form-check-input" id="serpent">
						<label class="form-check-label" for="serpent">Invasion de serpent</label>
					</div>
					<div class="col-6">
						<div class="mb-3 form-check">
							<input type="checkbox" class="form-check-input"
								id="gaz"> <label class="form-check-label"
								for="gaz">Fuite de gaz</label>
						</div>
					</div>

					<div class="col-6">
						<div class="mb-3 form-check">
							<input type="checkbox" class="form-check-input"
								id="manifestation"> <label class="form-check-label"
								for="manifestation">Manifestation</label>
						</div>
					</div>

					<div class="col-6">
						<div class="mb-3 form-check">
							<input type="checkbox" class="form-check-input"
								id="braquage"> <label class="form-check-label"
								for="braquage">Braquage</label>
						</div>
					</div>

					<div class="col-6">
						<div class="mb-3 form-check">
							<input type="checkbox" class="form-check-input"
								id="prisonnier"> <label class="form-check-label"
								for="prisonnier">Evasion d’un prisonnier</label>
						</div>
					</div>

				</div>

				<!-- Name -->
				<div class="mb-3">
					<label for="heroName" class="form-label">Nom</label> <input
						name="heroName" type="text" class="form-control" id="heroName"
						aria-describedby="textHelp">
				</div>
				<!-- phone -->
				<div class="mb-3">
					<label for="heroPhone" class="form-label">Téléphone</label> <input
						type="text" class="form-control" id="heroPhone" name="heroPhone">
				</div>

				<!-- Address -->
				<div class="mb-3">
					<label for="heroPhone" class="form-label">Adresse</label> <input
						type="text" class="form-control" name="heroAddr" id="heroAddr">
				</div>

				<!-- Latitude -->
				<div class="mb-3">
					<label for="heroLatitude" class="form-label">Latitude</label> <input
						type="text" class="form-control" id="heroLatitude">
				</div>

				<!-- Longitude -->
				<div class="mb-3">
					<label for="heroLongitude" " class="form-label">Longitude</label> <input
						type="text" class="form-control" id="heroLongitude">
				</div>
				<div class="d-flex justify-content-center">
					<button type="submit" style="width: 200px;" class="btn btn-primary"
						name="addHero_form">Valider</button>
				</div>
		</form>
		<h4>Tableau des Heros</h4>
		<table border="1">
			<th>NOM</th>
			<th>Téléphone</th>
			<th>Adresse</th>
			<th>Latitude</th>
			<th>Longitude</th>
			<c:forEach var="hero" items="${heroes}">
				<tr>
					<td><c:out value="${hero.name}" /></td>
					<td><c:out value="${hero.phone}" /></td>
					<td><c:out value="${hero.address}" /></td>
					<td><c:out value="${hero.latitude}" /></td>
					<td><c:out value="${hero.longitude}" /></td>
				</tr>
			</c:forEach>
		</table>
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
