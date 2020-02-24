<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Liste des personnes</title>
</head>

<body>
	<form:form action="" method="post" modelAttribute="u">
		nom
		<input name="nom" /><br>
		prenom
		<input name="prenom" /><br>
		<button type="submit">Valider</button>
	</form:form>



</body>

</html>