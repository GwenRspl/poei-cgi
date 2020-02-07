<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>

<body>
    <p>
        Je suis une page JSP 1
    </p>

    <form action="servlet2" method="POST">
        Nom <br>
        <input type="text" name="nom"><br>
        Prenom <br>
        <input type="text" name="prenom"><br>
        Age <br>
        <input type="number" name="age"><br><br>

        <button type="submit">Valider</button>
    </form>

</body>

</html>