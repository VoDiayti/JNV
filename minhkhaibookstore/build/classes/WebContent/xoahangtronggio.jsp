<%@page import="bo.sachBO"%>
<%@page import="bean.sachBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete</title>
</head>
<body>
<%
	int index = Integer.parseInt(request.getParameter("index"));
	ArrayList<sachBean> ds = new ArrayList<>();
	ds = (ArrayList<sachBean>)session.getAttribute("giohang");
	ds.remove(index);
	session.setAttribute("giohang", ds);
%>
</body>
</html>