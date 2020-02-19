<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edition de la salle</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>

	<div class="container">
		<h2>Edition de la salle</h2>
		<form action="<c:url value="/salle"/>" method="post">
			<input type="hidden" name="action" value="save">
			<div class="form-group">
				<label for="id">Identifiant:</label> <input type="number"
					class="form-control" id="id" placeholder="Entrer un identifiant"
					name="id" value="${maSalle.id}">
			</div>
			<div class="form-group">
				<label for="nom">Nom:</label> <input type="text"
					class="form-control" id="nom" placeholder="Entrer un nom"
					name="nom" value="${maSalle.nom}">
			</div>
			<div class="form-group">
				<label for="rue">Rue:</label> <input type="text"
					class="form-control" id="rue" placeholder="Entrer une rue"
					name="rue" value="${maSalle.adresse.rue}">
			</div>
			<div class="form-group">
				<label for="codePostal">Code postal:</label> <input type="text"
					class="form-control" id="codePostal" placeholder="Entrer un code postal"
					name="codePostal" value="${maSalle.adresse.codePostal}">
			</div>
			<div class="form-group">
				<label for="ville">Ville:</label> <input type="text"
					class="form-control" id="ville" placeholder="Entrer une ville"
					name="ville" value="${maSalle.adresse.ville}">
			</div>
			<button type="submit" class="btn btn-success btn-lg"><span class="glyphicon glyphicon-ok"></span></button>
		</form>


	</div>

</body>
</html>