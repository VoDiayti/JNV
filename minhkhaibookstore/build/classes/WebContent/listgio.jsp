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
<script type="text/javascript" src="assets/jquery.min.js"></script>
</head>
<body>
<div class="card-body" id="giohang">
<%	
	long sum = 0;
	if(session.getAttribute("giohang") != null){
		ArrayList<sachBean> ds = new ArrayList<sachBean>();
		ds = (ArrayList<sachBean>)session.getAttribute("giohang");
		int i = 0;
		for(sachBean x : ds){ 
		sum = sum + Long.parseLong(x.getGia());
		%>
			<table width="100%">
				<tbody>
					<tr>
						<td width="150">
							<img alt="" src="assets/img/<%=x.getAnh() %>" width="150" height="200">
						</td>
						<td valign="top" style="padding-left: 10px;">
							<h2 style="color: #000; font-size: 16px; text-transform: uppercase; font-weight: bold;"><%=x.getTenSach() %></h2>
							Mã Sách: <%=x.getMaSach() %><br>
							Giá bán: <%=x.getGia() %>
						</td>
						<td align="right">
							<button class="btn btn-danger delitem" data-index="<%=i++ %>">Xóa</button>
						</td>
					</tr>
				</tbody>
			</table>
			<br>
		<%}
	}
%>
</div>
<div class="card-footer text-muted">
   	<h3>Thành tiền: <span id="tien"><%=sum %></span></h3>
</div>
<script type="text/javascript">
	$(".delitem").click(function(e){
		e.preventDefault();
		var index = $(this).attr("data-index");
		$.get("xoahangtronggio.jsp",
		{
			index: index
		}, function(){
			alert("Xóa thành công");
			$("#giohang").load("listgio.jsp", function(res){
			});
		});
	});
</script>
</body>
</html>