<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>

<body>
    <h1>Page 2</h1>
    
    <%
    if(application.getAttribute("count") == null){
    	application.setAttribute("count", 1);
    } else {
    	application.setAttribute("count", (int) application.getAttribute("count") + 1);
    }
    out.print(application.getAttribute("count"));
    %>
</body>

</html>