<%@ include file="header.jsp" %>
<html>

<head>
    <%@ include file="bootstrap.jsp" %>
    <title>Insert title here</title>
</head>

<body>
    <%@ include file="nav.jsp" %>
    <div class="jumbotron">
        <h1 class="display-4">RECAPITULATIF COMMANDE</h1>
    </div>
    <div class="container">


        <h1>Recap commande </h1>

        <p>La commande de
            <c:out value="${client.prenom}" />
            <c:out value="${client.nom}" /> d'un montant total de
            <c:out value="${montantTotal}" />
        </p>

        <div class="row">
            <div class="col-12">
                <table class="table table-striped">
                    <thead class="thead-dark">
                    <tr>
                        <th>Article</th>
                        <th>Quantite</th>
                        <th>Prix total</th>
                    </tr>
                    </thead>
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
            </div>
        </div>
        <div class="row">
            <div class="col">
                <form action="ServletPanierCommande" method="GET">
                    <button type="submit" class="btn btn-dark">Retour au panier</button>
                </form>
            </div>
            <div class="col">
                <form action="ServletValidationCommande" method="GET">
                    <button type="submit" class="btn btn-dark float-right">Valider la commande</button>
                </form>
            </div>
        </div>

    </div>

</body>

</html>
