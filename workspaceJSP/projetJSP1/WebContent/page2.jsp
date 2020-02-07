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
        Je suis une page JSP 2
    </p>

    <%
    String nom = request.getParameter("nom");
    String prenom = request.getParameter("prenom");
    int age = Integer.parseInt(request.getParameter("age"));
    int ageMin = Integer.parseInt(request.getParameter("age"));
    int ageMax = Integer.parseInt(request.getParameter("age"));
    int ageMajeur = Integer.parseInt(request.getParameter("age"));
    String status;
    if(age < ageMin || age > ageMax){
    	status="erreur";
    } else if (age <ageMajeur){
    	status ="mineur";
    } else {
    	status = "majeur";
    }
    String reponse = "RECAP <br> Nom: "+nom +"<br>Prenom: "+prenom +"<br>Age: "+age+"<br>Status: "+ status;
    out.print(reponse);
    %>

 
</body>

</html>