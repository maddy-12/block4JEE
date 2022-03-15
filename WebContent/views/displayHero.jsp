<%@ include file="head.jsp" %>
<%@ include file="nav.jsp" %>

<body>
	
	<div class="container text-center">
			<h4 class="my-5">Liste des Héros</h4>
		<table class="table" border="1">
		<thead class="table-dark">
			<th scope="col">NOM</th>
			<th scope="col">Téléphone</th>
			<th scope="col">Adresse</th>
			<th scope="col">Latitude</th>
			<th scope="col">Longitude</th>
			</thead>
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
	</div>

</body>
