<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edition de l'élève</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>

	<div class="container">
		<h2>Edition de l'élève</h2>
		<form action="<c:url value="/eleve"/>" method="post">
			<input type="hidden" name="action" value="save">
			<div class="form-group">
				<label for="id">Identifiant:</label> <input type="number"
					class="form-control" id="id" placeholder="Entrer un identifiant"
					name="id" value="${eleve.id}">
			</div>
			<div class="form-group">
				<label for="nom">Nom:</label> <input type="text"
					class="form-control" id="nom" placeholder="Entrer un nom"
					name="nom" value="${eleve.nom}">
			</div>
			<div class="form-group">
				<label for="prenom">Prénom:</label> <input type="text"
					class="form-control" id="prenom" placeholder="Entrer un prénom"
					name="prenom" value="${eleve.prenom}">
			</div>
			<div class="form-group">
				<label for="dtNaissance">Date de naissance:</label> <input
					type="date" class="form-control" id="dtNaissance"
					placeholder="Entrer une date de naissance" name="dtNaissance"
					value="<fmt:formatDate value="${eleve.dtNaissance}" pattern="yyyy-MM-dd"/>">
			</div>
			<div class="form-group">
				<label for="note">Note:</label> <input type="number"
					class="form-control" id="note" placeholder="Entrer une note"
					name="note" value="${eleve.note}">
			</div>
			<div class="form-group">
				<label for="diplome">Diplôme:</label> <select id="diplome"
					name="diplome" class="form-control">
					<c:forEach items="${diplomes}" var="diplome">
						<option value="${diplome}" ${eleve.diplome eq diplome ? "selected":""}>${diplome.label}</option>
					</c:forEach>
				</select>
			</div>
			<div class="form-group">
				<label for="rue">Rue:</label> <input type="text"
					class="form-control" id="rue" placeholder="Entrer une rue"
					name="rue" value="${eleve.adresse.rue}">
			</div>
			<div class="form-group">
				<label for="codePostal">Code postal:</label> <input type="text"
					class="form-control" id="codePostal"
					placeholder="Entrer un code postal" name="codePostal"
					value="${eleve.adresse.codePostal}">
			</div>
			<div class="form-group">
				<label for="ville">Ville:</label> <input type="text"
					class="form-control" id="ville" placeholder="Entrer une ville"
					name="ville" value="${eleve.adresse.ville}">
			</div>
			<div class="form-group">
				<label for="salle">Salle:</label> <select id="salle"
					name="salle" class="form-control">
						<option>----------</option>
					<c:forEach items="${salles}" var="sal">
						<option value="${sal.id}" ${eleve.salle.id eq sal.id ? "selected":""}>${sal.nom}</option>
					</c:forEach>
				</select>
			</div>
			<button type="submit" class="btn btn-success btn-lg">
				<span class="glyphicon glyphicon-ok"></span>
			</button>
		</form>


	</div>

</body>
</html>