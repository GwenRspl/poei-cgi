<%@ include file="header.jsp" %>
<html>

<head>
    <%@ include file="bootstrap.jsp" %>
    <title>Insert title here</title>
</head>

<body>
    <%@ include file="nav.jsp" %>
    <div class="container">
        <h1>F�licitations
            <c:out value="${client.prenom}" />
            <c:out value="${client.nom}" />
        </h1>

        <p>Votre commande est valid�e.</p>
        <p>Le montant total est de
            <c:out value="${montantTotal}" />
        </p>
    </div>


</body>

</html>