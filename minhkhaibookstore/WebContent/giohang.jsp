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
	<title>Giỏ hàng</title>
	<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
	<script type="text/javascript" src="assets/jquery.min.js"></script>
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
	      <li class="nav-item active">
	        <a class="nav-link" href="trangchu.jsp">Home <span class="sr-only">(current)</span></a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="giohang.jsp">Giỏ hàng<span class="sr-only">(current)</span></a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="">Thanh toán<span class="sr-only">(current)</span></a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="">Đăng kí<span class="sr-only">(current)</span></a>
	      </li>
	    </ul>
	    </div>
	    <span class="navbar-text dropdown p-0">
		    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	         	Xin chào: <%out.print(session.getAttribute("user")); %>
	        </a>
	        <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
	          <a class="dropdown-item" href="logout.jsp">Logout</a>
	        </div>
	    </span>
	    </nav>
<div class="container mt-3">
	<a class="btn btn-success" href="trangchu.jsp">Tiếp tục mua hàng</a>
	<div class="card mt-2 mb-2" id="giohang">
		<div class="card-header">
			<h1>Giỏ hàng của bạn</h1>
		</div>
		
	</div>
</div>
</body>
<script type="text/javascript">
	$(document).ready(function(){
		$("#giohang").load("listgio.jsp", function(res){
		});
	});
</script>
</html>