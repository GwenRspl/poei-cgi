<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Commande</title>
</head>
<body>
<h1>Faire une commande</h1>

<p>Fais ton choix parmi les plats suivants:</p>

<form action="ServletPanier" method="POST">
<select name="articleSelect" id="select">
    <c:forEach items="${articles}" var="article">
        <option value="${article.id}"><c:out value="${article.nom}"/></option>
    </c:forEach>
</select>
<input type="number" name="quantity" min="1" value="1">
<button type="submit">Ajouter au panier</button>
</form>
<p>
    Montant de la commande : <c:out value="${montantTotal}"/>
</p>
<table>
    <tr>
        <th>Article</th>
        <th>Quantité</th>
        <th>Prix total</th>
    </tr>
    <c:forEach items="${panier}" var="item">
        <tr>
            <td><c:out value="${item.key.nom}"/></td>
            <td><c:out value="${item.value}"/></td>
            <td><c:out value="${item.value * item.key.prix}"/></td>
        </tr>
    </c:forEach>
</table>

<form action="ServletCommande" method="POST">
    <button type="submit">Valider le panier</button>
</form>

</body>
</html>
