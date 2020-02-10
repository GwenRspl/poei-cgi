<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
</head>
<body>
<h1>Login</h1>

<form action="ServletLogin" method="POST">
    Identifiant <br>
    <input type="number" name="id"> <br>
    Mot de passe <br>
    <input type="password" name="password"> <br>
    <button type="submit">Login</button>
</form>

</body>
</html>
