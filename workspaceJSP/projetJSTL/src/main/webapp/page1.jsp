<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>

<body>

    <h1>Page 1</h1>
    <%= application.getAttribute("liste") %>

    <table>
        <tr>
            <th>NOM</th>
            <th>PRENOM</th>
        </tr>
        <c:forEach var="p" items="${applicationScope['liste']}">
            <tr>
                <td>
                    <c:out value="${p.nom}"/>
                </td>
                <td>
                    <c:out value="${p.prenom}"/>
                </td>
            </tr>
        </c:forEach>

    </table>
</body>

</html>