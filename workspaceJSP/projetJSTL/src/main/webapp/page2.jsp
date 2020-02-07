<%@ page import="java.util.ArrayList"%>
<%@ page import="model.Personne"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Page 2</h1>
    <table>
        <tr>
            <th>Nom</th>
            <th>Prenom</th>
        </tr>

        <%
    String res ="";
    ArrayList<Personne> liste = (ArrayList<Personne>)application.getAttribute("liste");
    for(Personne p : liste){
    	res+="<tr>";
    	res+="<td>"+p.getNom()+"</td>";
    	res+="<td>"+p.getPrenom()+"</td>";
    	res+="</tr>";
    }
    
    out.print(res);
    %>
    </table>

</body>
</html>