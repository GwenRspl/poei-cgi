<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des élèves</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Identifiant</th>
					<th>Nom</th>
					<th>Prénom</th>
					<th>Date de naissance</th>
					<th>Rue</th>
					<th>Code postal</th>
					<th>Ville</th>
					<th>Note</th>
					<th>Diplôme</th>
					<th>Salle</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
			
				<c:forEach items="${eleves}" var="eleve">
					<c:url value="/eleve" var="editUrl">
						<c:param name="action" value="edit"/>
						<c:param name="id" value="${eleve.id}"/>
					</c:url>
					<c:url value="/eleve" var="deleteUrl">
						<c:param name="action" value="delete"/>
						<c:param name="id" value="${eleve.id}"/>
					</c:url>
					<tr>
						<td>${eleve.id}</td>
						<td>${eleve.nom}</td>
						<td>${eleve.prenom}</td>
						<td><fmt:formatDate value="${eleve.dtNaissance}" pattern="dd/MM/yyyy"/></td>
						<td>${eleve.adresse.rue}</td>
						<td>${eleve.adresse.codePostal}</td>
						<td>${eleve.adresse.ville}</td>
						<td>${eleve.note}</td>
						<td>${eleve.diplome.label}</td>
						<td>${eleve.salle.nom}</td>
						<td><a href="${editUrl}" class="btn btn-info btn-xs"><span class="glyphicon glyphicon-pencil"></span></a><a href="${deleteUrl}" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-trash"></span></a></td>
					</tr>
				</c:forEach>
				
			</tbody>
		</table>
		<c:url value="/eleve" var="addUrl">
			<c:param name="action" value="add"/>
		</c:url>
		<a href="${addUrl}" class="btn btn-success btn-lg"><span class="glyphicon glyphicon-plus"></span></a>
	</div>
</body>
</html>