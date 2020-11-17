<%@page import="bo.sachBO"%>
<%@page import="bean.sachBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
if(request.getParameter("masach") != null && request.getParameter("tensach") != null && request.getParameter("soluong") != null && request.getParameter("img") != null && request.getParameter("gia") != null){
	if(session.getAttribute("giohang") != null){
		ArrayList<sachBean> ds = new ArrayList<>();
		String masach = request.getParameter("masach");
		String tensach = request.getParameter("tensach");
		String soluong = request.getParameter("soluong");
		String gia = request.getParameter("gia");
		String img = request.getParameter("img");
		ds = (ArrayList<sachBean>)session.getAttribute("giohang");
		sachBean x = new sachBean();
		x.setMaSach(masach);
		x.setTenSach(tensach);
		x.setGia(gia);
		x.setSoLuong(soluong);
		x.setAnh(img);
		ds.add(x);
		out.print(masach);
		session.setAttribute("giohang", ds);
	} else {
		ArrayList<sachBean> ds = new ArrayList<>();
		String masach = request.getParameter("masach");
		String tensach = request.getParameter("tensach");
		String soluong = request.getParameter("soluong");
		String gia = request.getParameter("gia");
		String img = request.getParameter("img");
		sachBean x = new sachBean();
		x.setMaSach(masach);
		x.setTenSach(tensach);
		x.setGia(gia);
		x.setSoLuong(soluong);
		x.setAnh(img);
		ds.add(x);
		out.print(masach);
		session.setAttribute("giohang", ds);
	}
}
response.sendRedirect("giohang.jsp");
%>
</body>
</html>