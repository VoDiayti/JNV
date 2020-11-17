<%@page import="bo.sachBO"%>
<%@page import="bean.sachBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Book Store</title>
	<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
	<script type="text/javascript" src="assets/jquery.js"></script>
	<script type="text/javascript" src="assets/popper.js"></script>
	<script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-light sticky">
	  <a class="navbar-brand" href="#">Book Store</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	
	  <div class="collapse navbar-collapse" id="navbarSupportedContent">
	    <ul class="navbar-nav mr-auto">
	      <li class="nav-item">
	        <a class="nav-link" href="trangchu.jsp">Home <span class="sr-only">(current)</span></a>
	      </li>
	      <li class="nav-item active">
	        <a class="nav-link" href="giohang.jsp">Giỏ hàng<span class="sr-only">(current)</span></a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="">Thanh toán<span class="sr-only">(current)</span></a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="">Đăng kí<span class="sr-only">(current)</span></a>
	      </li>
	    </ul>
	    <%if(session.getAttribute("user") == null || session.getAttribute("pass") == null) { %>
	    <form class="form-inline my-2 my-lg-0" method="post" action="ktdangnhap.jsp">
	      	<input class="form-control mr-sm-2" name="txtuser" type="text" placeholder="username">
			<input class="form-control mr-sm-2" name="txtpass" type="pass" placeholder="password">
			<input class="btn btn-outline-success my-2 my-sm-0" type="submit" name="login" value="Login">
	    </form>
	    <%} else { %>
	    <span class="navbar-text dropdown p-0">
		    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	         	Xin chào! <%out.print(session.getAttribute("user")); %>
	        </a>
	        <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
	          <a class="dropdown-item" href="logout.jsp">Logout</a>
	        </div>
	    </span>
	    <%} %>
	  </div>
	</nav>
	
	<div class="container">
	<%
		if(session.getAttribute("noti") != null && session.getAttribute("noti").equals("Đăng nhập thành công!")){	
	%>
		<div class="alert alert-success mt-2 alert-dismissible fade show" role="alert">
		  <% out.print(session.getAttribute("noti")); session.removeAttribute("noti");%>
		  <button type="button" class="close" data-dismiss="alert" aria-label="Close">
		    	<span aria-hidden="true">&times;</span>
		  </button>
		</div>
	<%} else if(session.getAttribute("noti") != null && session.getAttribute("noti").equals("Tên đăng nhập hoặc mật khẩu sai!")) { %>
		<div class="alert alert-danger mt-2 alert-dismissible fade show" role="alert">
		  <% out.print(session.getAttribute("noti")); session.removeAttribute("noti"); %>
		  <button type="button" class="close" data-dismiss="alert" aria-label="Close">
		    	<span aria-hidden="true">&times;</span>
		  </button>
		</div>
	<%} %>
	
	<% 
		ArrayList<sachBean> ds = new ArrayList<>();
		sachBO nn = new sachBO();
		ds = nn.getSach();
		int i = 1;
		for(sachBean x : ds){
			if(i == 1) {
	%>
				<div class="row mt-3">
			<%} %>
			
					<div class="col-md-4 text-center">
						<img alt="" src="assets/img/<%=x.getAnh() %>" width="160" height="200">
						<h4 style="text-transform: uppercase;"><%=x.getTenSach() %></h4>
						<a href="themhangvaogio.jsp?masach=<%=x.getMaSach() %>&tensach=<%=x.getTenSach() %>&soluong=1&img=<%=x.getAnh() %>&gia=<%=x.getGia()%>"><img src="assets/img/buynow.jpg" style="cursor:pointer"></a>
						<p class="m-0">Giá: <%=x.getGia() %>VND</p>
						<p>Số lượng: <%=x.getSoLuong() %></p>
					</div>
			<%i++; %>
			<%if(i > 3) { i = 1;%>
				</div>
			<%} %>
	<%} %>
	</div>
	
	<script type="text/javascript">
		setTimeout(function() {
	        $(".alert").alert('close');
	    }, 2000);
	</script>
</body>
</html>