<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<html>
<head>
<%@ include file="bootstrap.jsp" %>
    <title>Login result</title>
</head>
<body>
<%@ include file="nav.jsp" %>
<div class="jumbotron text-center">
    <h1 class="display-4">SUCCES</h1>
</div>
<div class="container">
<h1>
    <c:if test="${empty client}">
        Identifiant ou mot de passe incorrect.
    </c:if>

    <c:if test="${not empty client}">
        Bienvenue <c:out value="${client.prenom}"/> <c:out value="${client.nom}"/> <br>
        Tu es désormais authentifié !
    </c:if>
</h1>
</div>
</body>
</html>
