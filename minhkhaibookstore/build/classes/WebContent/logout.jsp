<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<%
		session.removeAttribute("user");
		session.removeAttribute("pass");
		response.sendRedirect("trangchu.jsp");
	%>
</body>
</html>