<%@ include file="header.jsp" %>
<html>

<head>
    <%@ include file="bootstrap.jsp" %>
    <title>Insert title here</title>
</head>

<body>
    <%@ include file="nav.jsp" %>
    <div class="jumbotron">
        <h1 class="display-4">CONFIRMATION DE COMMANDE</h1>
    </div>
    <div class="container">

        <div class="row">
            <div class="col"></div>
            <div class="col">
                <h1>Merci de votre confiance
                    <c:out value="${client.prenom}" />
                    <c:out value="${client.nom}" />
                </h1>

                <p>Votre commande d'un montant total est de
                    <c:out value="${montantTotal}" />
                    euros est validée. Elle vous sera livrée à l'adresse suivante dans les plus bref délais : <br>
                    <c:out value="${client.adresse}" />
                </p>
                <form action="ServletCarte" method="GET">
                <button class="btn btn-dark">Retour à la carte</button>
                </form>


            </div>
            <div class="col"></div>
        </div>

    </div>


</body>

</html>
