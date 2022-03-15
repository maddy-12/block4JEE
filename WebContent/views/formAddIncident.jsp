<%@ include file="head.jsp" %>
<%@ include file="nav.jsp" %>

<body>
	<div class="container form-zone my-5">
		<div class="text-center">
			<h1>Déclarer un incident</h1>
		</div>


		<form>
			<label for="exampleInputEmail1" class="form-label">Type
				d'incident</label> <select class="form-select"
				aria-label="Default select example" name="type_incident">
				<option selected>Selectionnez un type</option>
				<c:forEach var="incident" items="${incidents}"> 
				   <option value="${incident.id}" name="incident${incident.id}" id="${incident.name_incident}"><c:out value="${incident.name_incident}"/></option>
				</c:forEach>
			</select>

			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Lieu de
					l'incident</label> <input name="address" type="text" class="form-control"
					id="exampleInputEmail1" aria-describedby="textHelp">
			</div>
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Latitude</label>
				<input name="latitude" type="text" class="form-control" id="exampleInputEmail1"
					aria-describedby="textHelp">
			</div>
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Longitude</label>
				<input name="longitude" type="text" class="form-control" id="exampleInputEmail1"
					aria-describedby="textHelp">
			</div>
			<div class="d-flex justify-content-center">
				<button type="submit" style="width: 200px;" class="btn btn-primary" name="addIncident_submit">Valider</button>
			</div>

		</form>

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
</html>