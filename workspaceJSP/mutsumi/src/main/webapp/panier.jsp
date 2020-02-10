<%@ include file="header.jsp" %>
<html>

<head>
    <%@ include file="bootstrap.jsp" %>
    <title>Commande</title>
</head>

<body>
    <%@ include file="nav.jsp" %>
    <div class="container">

        <h1>Passer une commande</h1>
        <div class="row">
            <div class="col-7">

                <p>Fais ton choix parmi les plats suivants:</p>

                <form action="ServletPanierCommande" method="POST">
                    <div class="form-row">
                        <div class="col">
                            <div class="form-group">
                                <label for="select">Plat</label>
                                <select name="articleSelect" id="select" class="form-control">
                                    <c:forEach items="${articles}" var="article">
                                        <option value="${article.id}">
                                            <c:out value="${article.nom}" />
                                        </option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="col-2">
                            <div class="form-group">
                                <label for="quantity">Quantité</label>
                                <input type="number" name="quantity" min="1" value="1" class="form-control"
                                    id="quantity">
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="col">
                            <button type="submit" class="btn btn-dark">Ajouter au panier</button>
                        </div>

                    </div>
                </form>

            </div>
            <div class="col-5">
                <h4>
                    Montant de la commande :
                    <c:out value="${montantTotal}" />
                    euros
                </h4>
                <table class="table table-striped">
                    <thead class="thead-dark">
                        <tr>
                            <th>Article</th>
                            <th>Quantité</th>
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

                <form action="ServletCommande" method="GET">
                    <button type="submit" class="btn btn-dark">Valider le panier</button>
                </form>
            </div>
        </div>


    </div>

</body>

</html>