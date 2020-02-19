<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des salles</title>
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
					<th>Rue</th>
					<th>Code postal</th>
					<th>Ville</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${mesSalles}" var="salle">
					<c:url value="/salle" var="editUrl">
						<c:param name="action" value="edit"/>
						<c:param name="id" value="${salle.id}"/>
					</c:url>
					<c:url value="/salle" var="deleteUrl">
						<c:param name="action" value="delete"/>
						<c:param name="id" value="${salle.id}"/>
					</c:url>
					<tr>
						<td>${salle.id}</td>
						<td>${salle.nom}</td>
						<td>${salle.adresse.rue}</td>
						<td>${salle.adresse.codePostal}</td>
						<td>${salle.adresse.ville}</td>
						<td><a href="${editUrl}" class="btn btn-info btn-xs"><span class="glyphicon glyphicon-pencil"></span></a><a href="${deleteUrl}" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-trash"></span></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<c:url value="/salle" var="addUrl">
			<c:param name="action" value="add"/>
		</c:url>
		<a href="${addUrl}" class="btn btn-success btn-lg"><span class="glyphicon glyphicon-plus"></span></a>
	</div>
</body>
</html>