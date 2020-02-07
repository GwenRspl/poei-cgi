<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>PAGE 1 SESSION 
<%

if(session.getAttribute("count") == null){
	session.setAttribute("count", 1);
} else {
	session.setAttribute("count", (int) session.getAttribute("count") + 1);
}
out.print(session.getAttribute("count"));



%>
</h1>
</body>
</html>