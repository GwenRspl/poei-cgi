<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>Liste des personnes</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>
<table>
  <tr>
    <th>ID</th>
    <th>Nom</th>
    <th>Prenom</th>
  </tr>
  <c:forEach items="${liste}" var="item">
   <tr>
    <td>${item.id}</td>
    <td>${item.nom}</td>
    <td>${item.prenom}</td>
  </tr>
</c:forEach>
</table>

	
</body>
</html>