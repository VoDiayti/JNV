<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Minh Khai Book Store</title>
	<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
	<script src="assets/jquery.min.js"></script>
	<script type="text/javascript" src="assets/popper.js"></script>
	<script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="assets/main.css">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css">
</head>
<body>
	<div class="top-header">
		<div class=logo>
		  	<p><a href="#"><img src="assets/img/minhkhai-logo.png" width="200" height="50"></a></p>
		  	<div class="select-lang">
		  		<select>
		  			<option>Chọn Ngôn Ngữ</option>
		  			<option>Tiếng Anh</option>
		  			<option>Tieng Viet</option>
		  			<option>Tieng Phap</option>
		  		</select>
		  	</div>
		</div>

		<div class="toolnav">
		    <ul class="topnav"> 
		     	<li>
		     		<img src="assets/img/icon1.png" border="0" style="width:18px;height:18px">
		     		<span class="linkitem"><a style="font-size:16px"> Giao hàng <br> 24 giờ </a></span>
		     		<a style="font-size:16px" href="index.aspx?q=helpshipment"> </a>
		     	</li>
		     	<li>
		     		<img src="assets/img/icon2.png" border="0" style="width:18px;height:18px">
		     		<span class="linkitem"><a style="font-size:16px" > Đặt hàng <br>Amazon</a></span>
		     	</li>
		    	<li>
		    		<img src="assets/img/icon3.png" border="0" style="width:18px;height:18px">
		    		<span class="linkitem">
		    			<a style="font-size:16px" > Đăng nhập <br><span style="font-size:14px;font-weight:normal;"> Tài khoản &amp; Đơn hàng</span></a> 
		          	</span>
		        </li> 
		     	<li>
		     		<img src="assets/img/icon4.png" border="0" style="width:18px;height:18px">
		     		<span class="linkitem">
		     			<a style="font-size:16px" >Giỏ hàng </a><br> 
		     			<span style="font-size:14px;font-weight:normal;">Đang có (<span id="cartCount">0</span>) sản phẩm <br>
		     				<span style="font-size:11px">ĐT: (028) 3925 0590 - Hotline: 0903 10 14 79</span> 
		     			</span>
		     		</span>
		     	</li>
		   </ul> <br> 
		</div>
	</div>
	<div class="nav-header">
		<ul class="nav" id="menu">
			<li class="actived"><a href="">Trang chủ</a></li>
			<li><a href="">Giới thiệu</a></li>
			<li><a href="">Gian hàng</a></li>
			<li><a href="">Sách độc quyền</a></li>
			<li><a href="">Hướng dẫn mua hàng</a></li>
			<li><a href="">Download</a></li>
			<li><a href="">Liên hệ</a></li>
			<li><a href="" style="color: #FFD261;">Giảm giá đặc biệt</a></li>
			<li><a href="">Bản tin Minh Khai</a></li>
		</ul>
	</div>
	<hr style="width: 1024px; margin-top: 10px;  margin-bottom: 0px">
	<div class="main">
		<div class="col-left">
			<div class="dropdown-shop">
				<p><i class="fas fa-caret-down"></i> SÁCH</p>
				<div class="popup-shop">
			     	<a href="#">Sách</a>
			     	<a href="#">Văn phòng phẩm</a>
			     	<a href="#">Đồ chơi - Thú bông các loại</a>
			     	<a href="#">Hàng lưu niệm</a>
			     	<a href="#">Hàng xách tay Thái Lan</a>
			     	<a href="#">Hàng điện tử</a>
				</div>
			</div>
			<div class="cat-menu">
				<a class="item-menu" href="#" data-id="1"><i class="fas fa-chevron-right"></i> Đời sống - gia đình</a>
				<div class="sub-menu" data-parent="1">
					<a href="#">Bí quyết dành cho phụ nữ</a>
					<a href="#">Cẩm nang nuôi dạy trẻ</a>
					<a href="#">Hạnh phục gia đình</a>
					<a href="#">Làm đẹp</a>
					<a href="#">Làm vườn - Vật nuôi</a>
					<a href="#">Mang thai</a>
					<a href="#">Nữ công gia chánh</a>
					<a href="#">Tâm lý - Giới tính</a>
					<a href="#">Thể dục thể thao</a>
				</div>
				<a class="item-menu" href="#" data-id="2"><i class="fas fa-chevron-right"></i> Giáo khoa - Giáo trình - Sách tham khảo</a>
				<div class="sub-menu" data-parent="2">
					<a href="#">Bí quyết dành cho phụ nữ</a>
					<a href="#">Cẩm nang nuôi dạy trẻ</a>
					<a href="#">Hạnh phục gia đình</a>
					<a href="#">Làm đẹp</a>
					<a href="#">Làm vườn - Vật nuôi</a>
					<a href="#">Mang thai</a>
					<a href="#">Nữ công gia chánh</a>
					<a href="#">Tâm lý - Giới tính</a>
					<a href="#">Thể dục thể thao</a>
				</div>
				<a class="item-menu" href="#"><i class="fas fa-chevron-right"></i> Ngoại ngữ - Từ điển</a>
				<a class="item-menu" href="#"><i class="fas fa-chevron-right"></i> Ngoại Văn</a>
				<a class="item-menu" href="#"><i class="fas fa-chevron-right"></i> Sách Chuyên ngành</a>
				<a class="item-menu" href="#"><i class="fas fa-chevron-right"></i> Sách dành cho Thiếu nhi</a>
				<a class="item-menu" href="#"><i class="fas fa-chevron-right"></i> Sách dành cho Thiếu niên - Tuổi mới lớn</a>
				<a class="item-menu" href="#"><i class="fas fa-chevron-right"></i> Sách kinh tế</a>
				<a class="item-menu" href="#"><i class="fas fa-chevron-right"></i> Sách rèn luyện bản thân</a>
				<a class="item-menu" href="#"><i class="fas fa-chevron-right"></i> Sách song ngữ</a>
				<a class="item-menu" href="#"><i class="fas fa-chevron-right"></i> Sách tô màu người lớn</a>
				<a class="item-menu" href="#"><i class="fas fa-chevron-right"></i> Văn hóa - Nghệ thuật - Du lịch</a>
				<a class="item-menu" href="#"><i class="fas fa-chevron-right"></i> Văn học	</a>
			</div>
			<div class="widget mt-3">
				<h4 class="wg-title">Thư viện ảnh</h4>
				<div class="wg-body mt-2">
					<div id="carouselExampleControls1" class="carousel slide" data-ride="carousel">
					  	<div class="carousel-inner">
					    	<div class="carousel-item active">
					      		<img class="d-block w-100" src="assets/img/mk1.jpg">
					    	</div>
					    	<div class="carousel-item">
					      		<img class="d-block w-100" src="assets/img/mk10.jpg">
					    	</div>
					    	<div class="carousel-item">
					      		<img class="d-block w-100" src="assets/img/mk11.jpg">
					    	</div>
					    	<div class="carousel-item">
					      		<img class="d-block w-100" src="assets/img/mk13.jpg">
					    	</div>
					  	</div>
					  	<a class="carousel-control-prev" href="#carouselExampleControls1" role="button" data-slide="prev">
					    	<span class="carousel-control-prev-icon" aria-hidden="true"></span>
					    	<span class="sr-only">Previous</span>
					  	</a>
					  	<a class="carousel-control-next" href="#carouselExampleControls1" role="button" data-slide="next">
					    	<span class="carousel-control-next-icon" aria-hidden="true"></span>
					    	<span class="sr-only">Next</span>
					  	</a>
					</div>
				</div>
			</div>
			<div class="widget mt-3">
				<h4 class="wg-title">Ảnh minh khai</h4>
				<div class="wg-body mt-2">
					<div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
					  	<div class="carousel-inner">
					    	<div class="carousel-item active">
					      		<img class="d-block w-100" src="assets/img/IMG_0549.jpg">
					    	</div>
					    	<div class="carousel-item">
					      		<img class="d-block w-100" src="assets/img/IMG_0563.jpg">
					    	</div>
					    	<div class="carousel-item">
					      		<img class="d-block w-100" src="assets/img/IMG_0564.jpg">
					    	</div>
					    	<div class="carousel-item">
					      		<img class="d-block w-100" src="assets/img/IMG_0566.jpg">
					    	</div>
					  	</div>
					  	<a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
					    	<span class="carousel-control-prev-icon" aria-hidden="true"></span>
					    	<span class="sr-only">Previous</span>
					  	</a>
					  	<a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
					    	<span class="carousel-control-next-icon" aria-hidden="true"></span>
					    	<span class="sr-only">Next</span>
					  	</a>
					</div>
				</div>
			</div>
			<div class="widget mt-3">
				<h4 class="wg-title">Bản tin minh khai</h4>
				<div class="wg-body mt-2">
					<a href=""><img src="assets/img/1-150x150.png" width="100%" height="150"></a>
					<strong><a href="">THỂ LỆ CHƯƠNG TRÌNH TÍCH LŨY ĐIỂM </a></strong><br>
					Đối tượng tham gia: khách đến mua hàng trực tiếp tại nhà sách Minh Khai. Cách tham gia: · Khi mua hàng, khách tích điểm qua số điện thoại hoặc thẻ thành viên nếu có. · Thẻ thành viên được cấp cho khách ở lần đầu tiên khách nhận tiền chiết khấu. Quy tắc tích
				</div>
			</div>
			<div class="widget mt-3">
				<h4 class="wg-title">website liên kết</h4>
				<div class="wg-body mt-2">
					<a href=""><img src="assets/img/facebook-logo.jpg"></a>
					<a href=""><img src="assets/img/logo-gui-nhanh.jpg"></a>
					<a href=""><img src="assets/img/logo-gui-thuong.jpg"></a>
				</div>
			</div>
		</div>
		<div class="col-right">
			<div class="search-bar">
				<span>TÌM KIẾM</span>
				<div class="search-form">
					<input id="main-ip-search" type="txt" name="txtsearch" placeholder="Từ khóa ...">
					<button id="main-btn-search" type="submit" name="txtsubmit"><i class="fas fa-search"></i></button>
				</div>
				<div class="search-cat">
					<select>
						<option>Tên/ Tựa</option>
						<option > Nhà Xuất Bản </option>
             			<option > ISBN </option>
                 		<option > Tác giả </option>
                 		<option selected=""> Sách </option>
                 		<option > Văn phòng phẩm </option>
                 		<option > Hàng lưu niệm </option>
                 		<option > Hàng điện tử </option>
                 		<option > Đồ chơi - Thú bông các loại </option>
                 		<option > Hàng xách tay Thái Lan </option>
					</select>
				</div>
			</div>
			<div id="carouselExampleIndicators" class="carousel slide mt-3 pl-3" data-ride="carousel">
			  	<ol class="carousel-indicators">
			    	<li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
			    	<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
			    	<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
			  	</ol>
			  	<div class="carousel-inner">
			    	<div class="carousel-item active">
			      		<img class="d-block w-100" src="assets/img/8935074109552.jpg" alt="First slide">
			    	</div>
			    	<div class="carousel-item">
			      		<img class="d-block w-100" src="assets/img/8935075942387.jpg" alt="Second slide">
			    	</div>
			    	<div class="carousel-item">
			      		<img class="d-block w-100" src="assets/img/8936067596892.jpg" alt="Third slide">
			    	</div>
			  	</div>
			  	<a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
			    	<span class="carousel-control-prev-icon" aria-hidden="true"></span>
			    	<span class="sr-only">Previous</span>
			  	</a>
			  	<a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
			    	<span class="carousel-control-next-icon" aria-hidden="true"></span>
			    	<span class="sr-only">Next</span>
			  	</a>
			</div>
			<div class="list-cat mt-3">
				<div class="listcat-header">
					<h4>Sách độc quyền minh khai</h4> | <a href="#">Xem tiếp »</a>
				</div>
				<div class="listcat-body">
					<div class="row mt-3">
						<div class="item-list-cat col-md-4 text-center">
							<img alt="" src="assets/img/anh1.jpg" width="160" height="200">
							<a class="buynow-btn" href="datsach.jsp?masach=sach1"><img src="assets/img/buynow.jpg" style="cursor:pointer"><img src="assets/img/p30.png"></a>
							<h3 class="book-title"><a href="">Chữa bệnh không dùng thuốc</a></h3>
							Tác giả: <a href="">Nguyễn Văn A</a><br>
							<b class="m-0">Giá bìa: <strike> 99.000VND</strike> (-30%)</b><br>
							<b>Giá bán: <span style="font-size: 18px; color: #6D2524">69.300VND</span></b>
						</div>
						<div class="item-list-cat col-md-4 text-center">
							<img alt="" src="assets/img/anh2.jpg" width="160" height="200">
							<a class="buynow-btn" href="datsach.jsp?masach=sach2"><img src="assets/img/buynow.jpg" style="cursor:pointer"><img src="assets/img/p15.png"></a>
							<h3 class="book-title"><a href="">Ngôn ngữ lập trình thiết bị di động</a></h3>
							Tác giả: <a href="" style="text-transform: uppercase;">Nguyễn Văn A</a><br>
							<b class="m-0">Giá bìa: <strike> 120.000VND</strike> (-15%)</b><br>
							<b>Giá bán: <span style="font-size: 18px; color: #6D2524">102.000VND</span></b>
						</div>
						<div class="item-list-cat col-md-4 text-center">
							<img alt="" src="assets/img/anh3.JPG" width="160" height="200">
							<a class="buynow-btn" href="datsach.jsp?masach=sach3"><img src="assets/img/buynow.jpg" style="cursor:pointer"><img src="assets/img/p25.png"></a>
							<h3 class="book-title"><a href="">Số phận và tâm linh</a></h3>
							Tác giả: <a href="">Nguyễn Văn A</a><br>
							<b class="m-0">Giá bìa: <strike> 199.000VND</strike> (-20%)</b><br>
							<b>Giá bán: <span style="font-size: 18px; color: #6D2524">194.250VND</span></b>
						</div>
					</div>
				</div>
			</div>
			<div class="list-cat mt-3">
				<div class="listcat-header">
					<h4>Sách mới</h4> | <a href="#">Xem tiếp »</a>
				</div>
				<div class="listcat-body">
					<div class="row mt-3">
						<div class="item-list-cat col-md-4 text-center">
							<img alt="" src="assets/img/anh1.jpg" width="160" height="200">
							<a class="buynow-btn" href="datsach.jsp?masach=sach1"><img src="assets/img/buynow.jpg" style="cursor:pointer"></a>
							<h3 class="book-title"><a href="">Chữa bệnh không dùng thuốc</a></h3>
							Tác giả: <a href="">Nguyễn Văn A</a><br>
							<b>Giá bán: <span style="font-size: 18px; color: #6D2524">69.300VND</span></b>
						</div>
						<div class="item-list-cat col-md-4 text-center">
							<img alt="" src="assets/img/anh2.jpg" width="160" height="200">
							<a class="buynow-btn" href="datsach.jsp?masach=sach2"><img src="assets/img/buynow.jpg" style="cursor:pointer"></a>
							<h3 class="book-title"><a href="">Ngôn ngữ lập trình thiết bị di động</a></h3>
							Tác giả: <a href="" style="text-transform: uppercase;">Nguyễn Văn A</a><br>
							<b>Giá bán: <span style="font-size: 18px; color: #6D2524">102.000VND</span></b>
						</div>
						<div class="item-list-cat col-md-4 text-center">
							<img alt="" src="assets/img/anh3.JPG" width="160" height="200">
							<a class="buynow-btn" href="datsach.jsp?masach=sach3"><img src="assets/img/buynow.jpg" style="cursor:pointer"></a>
							<h3 class="book-title"><a href="">Số phận và tâm linh</a></h3>
							Tác giả: <a href="">Nguyễn Văn A</a><br>
							<b>Giá bán: <span style="font-size: 18px; color: #6D2524">194.250VND</span></b>
						</div>
					</div>
					<div class="row mt-3">
						<div class="item-list-cat col-md-4 text-center">
							<img alt="" src="assets/img/anh1.jpg" width="160" height="200">
							<a class="buynow-btn" href="datsach.jsp?masach=sach1"><img src="assets/img/buynow.jpg" style="cursor:pointer"></a>
							<h3 class="book-title"><a href="">Chữa bệnh không dùng thuốc</a></h3>
							Tác giả: <a href="">Nguyễn Văn A</a><br>
							<b>Giá bán: <span style="font-size: 18px; color: #6D2524">69.300VND</span></b>
						</div>
						<div class="item-list-cat col-md-4 text-center">
							<img alt="" src="assets/img/anh2.jpg" width="160" height="200">
							<a class="buynow-btn" href="datsach.jsp?masach=sach2"><img src="assets/img/buynow.jpg" style="cursor:pointer"></a>
							<h3 class="book-title"><a href="">Ngôn ngữ lập trình thiết bị di động</a></h3>
							Tác giả: <a href="" style="text-transform: uppercase;">Nguyễn Văn A</a><br>
							<b>Giá bán: <span style="font-size: 18px; color: #6D2524">102.000VND</span></b>
						</div>
						<div class="item-list-cat col-md-4 text-center">
							<img alt="" src="assets/img/anh3.JPG" width="160" height="200">
							<a class="buynow-btn" href="datsach.jsp?masach=sach3"><img src="assets/img/buynow.jpg" style="cursor:pointer"></a>
							<h3 class="book-title"><a href="">Số phận và tâm linh</a></h3>
							Tác giả: <a href="">Nguyễn Văn A</a><br>
							<b>Giá bán: <span style="font-size: 18px; color: #6D2524">194.250VND</span></b>
						</div>
					</div>
				</div>
			</div>
			<div class="list-cat mt-3">
				<div class="listcat-header">
					<h4>Bán chạy</h4> | <a href="#">Xem tiếp »</a>
				</div>
				<div class="listcat-body">
					<div class="row mt-3">
						<div class="item-list-cat col-md-4 text-center">
							<img alt="" src="assets/img/anh1.jpg" width="160" height="200">
							<a class="buynow-btn" href="datsach.jsp?masach=sach1"><img src="assets/img/buynow.jpg" style="cursor:pointer"></a>
							<h3 class="book-title"><a href="">Chữa bệnh không dùng thuốc</a></h3>
							Tác giả: <a href="">Nguyễn Văn A</a><br>
							<b>Giá bán: <span style="font-size: 18px; color: #6D2524">69.300VND</span></b>
						</div>
						<div class="item-list-cat col-md-4 text-center">
							<img alt="" src="assets/img/anh2.jpg" width="160" height="200">
							<a class="buynow-btn" href="datsach.jsp?masach=sach2"><img src="assets/img/buynow.jpg" style="cursor:pointer"></a>
							<h3 class="book-title"><a href="">Ngôn ngữ lập trình thiết bị di động</a></h3>
							Tác giả: <a href="" style="text-transform: uppercase;">Nguyễn Văn A</a><br>
							<b>Giá bán: <span style="font-size: 18px; color: #6D2524">102.000VND</span></b>
						</div>
						<div class="item-list-cat col-md-4 text-center">
							<img alt="" src="assets/img/anh3.JPG" width="160" height="200">
							<a class="buynow-btn" href="datsach.jsp?masach=sach3"><img src="assets/img/buynow.jpg" style="cursor:pointer"></a>
							<h3 class="book-title"><a href="">Số phận và tâm linh</a></h3>
							Tác giả: <a href="">Nguyễn Văn A</a><br>
							<b>Giá bán: <span style="font-size: 18px; color: #6D2524">194.250VND</span></b>
						</div>
					</div>
				</div>
			</div>
			<div class="list-cat mt-3">
				<div class="listcat-header">
					<h4>Sách sắp xuất bản</h4> | <a href="#">Xem tiếp »</a>
				</div>
				<div class="listcat-body">
					<div class="row mt-3">
						<div class="item-list-cat col-md-4 text-center">
							<img alt="" src="assets/img/anh1.jpg" width="160" height="200">
							<a class="buynow-btn" href="datsach.jsp?masach=sach1"><img src="assets/img/buybook.jpg" style="cursor:pointer"></a>
							<h3 class="book-title"><a href="">Chữa bệnh không dùng thuốc</a></h3>
							Tác giả: <a href="">Nguyễn Văn A</a><br>
							<b>Giá bán: <span style="font-size: 18px; color: #6D2524">69.300VND</span></b>
						</div>
						<div class="item-list-cat col-md-4 text-center">
							<img alt="" src="assets/img/anh2.jpg" width="160" height="200">
							<a class="buynow-btn" href="datsach.jsp?masach=sach2"><img src="assets/img/buybook.jpg" style="cursor:pointer"></a>
							<h3 class="book-title"><a href="">Ngôn ngữ lập trình thiết bị di động</a></h3>
							Tác giả: <a href="" style="text-transform: uppercase;">Nguyễn Văn A</a><br>
							<b>Giá bán: <span style="font-size: 18px; color: #6D2524">102.000VND</span></b>
						</div>
						<div class="item-list-cat col-md-4 text-center">
							<img alt="" src="assets/img/anh3.JPG" width="160" height="200">
							<a class="buynow-btn" href="datsach.jsp?masach=sach3"><img src="assets/img/buybook.jpg" style="cursor:pointer"></a>
							<h3 class="book-title"><a href="">Số phận và tâm linh</a></h3>
							Tác giả: <a href="">Nguyễn Văn A</a><br>
							<b>Giá bán: <span style="font-size: 18px; color: #6D2524">194.250VND</span></b>
						</div>
					</div>
					<div class="row mt-3">
						<div class="item-list-cat col-md-4 text-center">
							<img alt="" src="assets/img/anh1.jpg" width="160" height="200">
							<a class="buynow-btn" href="datsach.jsp?masach=sach1"><img src="assets/img/buybook.jpg" style="cursor:pointer"></a>
							<h3 class="book-title"><a href="">Chữa bệnh không dùng thuốc</a></h3>
							Tác giả: <a href="">Nguyễn Văn A</a><br>
							<b>Giá bán: <span style="font-size: 18px; color: #6D2524">69.300VND</span></b>
						</div>
						<div class="item-list-cat col-md-4 text-center">
							<img alt="" src="assets/img/anh2.jpg" width="160" height="200">
							<a class="buynow-btn" href="datsach.jsp?masach=sach2"><img src="assets/img/buybook.jpg" style="cursor:pointer"></a>
							<h3 class="book-title"><a href="">Ngôn ngữ lập trình thiết bị di động</a></h3>
							Tác giả: <a href="" style="text-transform: uppercase;">Nguyễn Văn A</a><br>
							<b>Giá bán: <span style="font-size: 18px; color: #6D2524">102.000VND</span></b>
						</div>
						<div class="item-list-cat col-md-4 text-center">
							<img alt="" src="assets/img/anh3.JPG" width="160" height="200">
							<a class="buynow-btn" href="datsach.jsp?masach=sach3"><img src="assets/img/buybook.jpg" style="cursor:pointer"></a>
							<h3 class="book-title"><a href="">Số phận và tâm linh</a></h3>
							Tác giả: <a href="">Nguyễn Văn A</a><br>
							<b>Giá bán: <span style="font-size: 18px; color: #6D2524">194.250VND</span></b>
						</div>
					</div>
				</div>
			</div>
			<div class="list-cat mt-3">
				<div class="listcat-header">
					<h4>Báo chí giới thiệu</h4>
				</div>
				<span id="sm-menu" >
					<a href="#" >Báo tuổi trẻ</a> | <a href="">Báo thanh niên</a>
					<a href="#" style="float: right;">Xem tiếp »</a></span>
				<div class="listcat-body">
					<br>
					<table>
						<tbody>
							<tr>
								<td><img src="assets/img/9786047221585.jpg" width="120" height="180"></td>
								<td valign="top" style="padding-left:3px">
									<span class="linkitem">
										<a href=""><b>GIA TỘC TỔNG THỐNG V.V. PUTIN</b> </a> - Nguồn: ttp://dantri.com.vn/the-gioi/gia-toc-tong-thong-putin-bo-bien-nien-su-quy-gia-ve-nuoc-nga-20161209092754696.htm<br>
									</span>
									<span style="color:#000;"> Tác giả: <a href="">Alekxandr Putin</a>. Người dịch: <a href="">Mai Quang Huy</a> - <a href="">Nguyễn Huy Hoàng</a> - <a href="">Trần Đình Hậu</a></span> (<b>ISBN</b>: 9786047221585)<br>
									Cuốn sách do Aleksandr Putin – một nhà nghiên cứu trong gia tộc vị tổng thống Nga chấp bút, các dịch giả Mai Quang Huy, Nguyễn Huy Hoàng, Trần Đình Hậu biên dịch, NXB Công an nhân dân ấn hành. “Gia tộc Tổng thống V.V.Putin” không chỉ là sự tìm hiểu về gốc tích của dòng họ nhà Putin, mà còn là một bộ biên niên sử nước Nga suốt ... 
								</td>
							</tr>
						</tbody>
					</table>
					<br>
					<table>
						<tbody>
							<tr>
								<td><img src="assets/img/9786047221585.jpg" width="120" height="180"></td>
								<td valign="top" style="padding-left:3px">
									<span class="linkitem">
										<a href=""><b>GIA TỘC TỔNG THỐNG V.V. PUTIN</b> </a> - Nguồn: ttp://dantri.com.vn/the-gioi/gia-toc-tong-thong-putin-bo-bien-nien-su-quy-gia-ve-nuoc-nga-20161209092754696.htm<br>
									</span>
									<span style="color:#000;"> Tác giả: <a href="">Alekxandr Putin</a>. Người dịch: <a href="">Mai Quang Huy</a> - <a href="">Nguyễn Huy Hoàng</a> - <a href="">Trần Đình Hậu</a></span> (<b>ISBN</b>: 9786047221585)<br>
									Cuốn sách do Aleksandr Putin – một nhà nghiên cứu trong gia tộc vị tổng thống Nga chấp bút, các dịch giả Mai Quang Huy, Nguyễn Huy Hoàng, Trần Đình Hậu biên dịch, NXB Công an nhân dân ấn hành. “Gia tộc Tổng thống V.V.Putin” không chỉ là sự tìm hiểu về gốc tích của dòng họ nhà Putin, mà còn là một bộ biên niên sử nước Nga suốt ... 
								</td>
							</tr>
						</tbody>
					</table>
					<br>
					<table>
						<tbody>
							<tr>
								<td><img src="assets/img/9786047221585.jpg" width="120" height="180"></td>
								<td valign="top" style="padding-left:3px">
									<span class="linkitem">
										<a href=""><b>GIA TỘC TỔNG THỐNG V.V. PUTIN</b> </a> - Nguồn: ttp://dantri.com.vn/the-gioi/gia-toc-tong-thong-putin-bo-bien-nien-su-quy-gia-ve-nuoc-nga-20161209092754696.htm<br>
									</span>
									<span style="color:#000;"> Tác giả: <a href="">Alekxandr Putin</a>. Người dịch: <a href="">Mai Quang Huy</a> - <a href="">Nguyễn Huy Hoàng</a> - <a href="">Trần Đình Hậu</a></span> (<b>ISBN</b>: 9786047221585)<br>
									Cuốn sách do Aleksandr Putin – một nhà nghiên cứu trong gia tộc vị tổng thống Nga chấp bút, các dịch giả Mai Quang Huy, Nguyễn Huy Hoàng, Trần Đình Hậu biên dịch, NXB Công an nhân dân ấn hành. “Gia tộc Tổng thống V.V.Putin” không chỉ là sự tìm hiểu về gốc tích của dòng họ nhà Putin, mà còn là một bộ biên niên sử nước Nga suốt ... 
								</td>
							</tr>
						</tbody>
					</table>
					<br>
				</div>
			</div>
		</div>
	</div>
	<div class="footer">
		<center>
			<img src="assets/img/paymentall.png">
			<br><br>
			<b>Copyright @1999-2009 MINHKHAI.VN All rights Reserved. </b><br>
			Công Ty TNHH Minh Khai S.G (Nhà sách Minh Khai) <br>
			249 Nguyễn Thị Minh Khai, F. Nguyễn Cư Trinh, Q.1, Tp. Hồ Chí Minh<br>
			Giấy chứng nhận đăng ký kinh doanh số: 4102019159<br>
			Mã số doanh nghiệp 0303209716 - Đăng ký thay đổi lần 6 ngày 30/07/2010<br>
			Ðiện Thoại (028)39250590 - (028)39250591 -Fax: (028)39257837<br>
			Website: <a href="">www.minhkhai.vn</a> và <a href="">www.minhkhai.com.vn</a><br>
			E-mail:<b>mk.book@minhkhai.vn</b> hoặc <b>mk.book@minhkhai.com.vn </b>
		</center>
	</div>
	<script type="text/javascript">
		$(document).ready(function () {
			$(".cat-menu .item-menu").click(function(){
				var i = $(this).attr("data-id");
				$(".cat-menu .sub-menu").css("display", "none");
				$(".cat-menu .sub-menu[data-parent="+i+"]").css("display", "block");
			});
		});
	</script>
</body>
</html>