<%@ include file="header.jsp" %>
<html>

<head>
    <%@ include file="bootstrap.jsp" %>
    <title>Insert title here</title>
</head>

<body>
    <%@ include file="nav.jsp" %>
    <div class="container">


        <h1>Recap commande </h1>

        <p>La commande de
            <c:out value="${client.prenom}" />
            <c:out value="${client.nom}" /> d'un montant total de
            <c:out value="${montantTotal}" />
        </p>

        <table>
            <tr>
                <th>Article</th>
                <th>Quantité</th>
                <th>Prix total</th>
            </tr>
            <c:forEach items="${panier}" var="item">
                <tr>
                    <td>
                        <c:out value="${item.key.nom}" />
                    </td>
                    <td>
                        <c:out value="${item.value}" />
                    </td>
                    <td>
                        <c:out value="${item.value * item.key.prix}" />
                    </td>
                </tr>
            </c:forEach>
        </table>
        <form action="ServletPanier" method="GET">
            <button type="submit">Retour au panier</button>
        </form>
        <form action="ServletValidationCommande" method="GET">
            <button type="submit">Valider la commande</button>
        </form>
    </div>

</body>

</html>