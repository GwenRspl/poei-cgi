<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login result</title>
</head>
<body>
<h1>
    <c:if test="${empty client}">
        Identifiant ou mot de passe incorrect.
    </c:if>

    <c:if test="${not empty client}">
        Bienvenue <c:out value="${client.prenom}"/> <c:out value="${client.nom}"/> <br>
        Tu es désormais authentifié !
    </c:if>
</h1>
</body>
</html>
