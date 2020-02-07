<%@ page import="model.Personne" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Success</title>
</head>

<body>
    <p>Page 2</p>
    Bienvenue <br>
    <%
    Personne p = (Personne) request.getAttribute("p");
    out.print(p.getId()+"<br>");
    out.print(p.getNom()+"<br>");
    out.print(p.getPrenom());
    %>

</body>

</html>