<%@ page language="java" contentType="text/html; charset=ISO-utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Login</title>
</head>
<body>
<%
	String user = request.getParameter("txtuser");
	String pass = request.getParameter("txtpass");
	if(user.equals("admin") && pass.equals("123")){
		response.sendRedirect("trangchu.jsp");
		session.setAttribute("noti", "Đăng nhập thành công!");
		session.setAttribute("user", user);
		session.setAttribute("pass", pass);
	} else{
		response.sendRedirect("trangchu.jsp");
		session.setAttribute("noti", "Tên đăng nhập hoặc mật khẩu sai!");
	}
		
%>
</body>
</html>