<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/style-lable.css" />
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
				    	function goback() {
				        	history.back(-1);
				    	}
</script>
</head>
<body>
<div id="fb-root"></div>
<script>(function(d, s, id) {
  var js, fjs = d.getElementsByTagName(s)[0];
  if (d.getElementById(id)) return;
  js = d.createElement(s); js.id = id;
  js.src = "//connect.facebook.net/en_GB/sdk.js#xfbml=1&version=v2.5&appId=1675074109399975";
  fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));</script>
<%@include file="/header.jsp"%>
<%@include file="/benTrai.jsp"%>
<div class="col-md-8 control-border margin-box"><h3 class="text-center ">Xem chi tiết</h3></div>
<div class = "col-md-8 control-border margin-box margin-top">
<div class = "border">
<div class="col-sm-12"
		style="padding-bottom: 30px;">
		<div class="col-sm-9" style="margin-top: 10px;">
		
			<!-- Tiêu đề bài viết -->
			<bean:define id="baiDang" name="danhSachBaiDangBanForm"
				property="dangBanChiTiet"></bean:define>
			<div class="col-sm-12" style="font-size: 20pt; color: #9C2A2A;">
				<label> <bean:write name="baiDang" property="tenBaiDang" />
				</label>
			</div>

			<!-- Thời gian đăng -->
			<div class="col-sm-12">
			<div class="col-sm-6" style="font-size: 8pt; color: green;">
				<label>Đăng lúc: <bean:write name="baiDang"
						property="thoiGianDang" />
				</label>
			</div>

			<!-- Hình ảnh -->
			<div class="col-sm-12">
			<div class="col-sm-6">
				<bean:define id="hinhAnh" name="baiDang" property="hinhAnh"></bean:define>
				<html:img src="${hinhAnh }"
					style="width: 100%; height: 100%;"></html:img>
			</div>
			</div>

			<!-- Nội dung bài viết -->
			<div class="col-sm-10"
				style="font-size: 12pt; margin-top: 10px; width: 100%; color: black;">
				<bean:define id="noiDung" name="baiDang" property="noiDung"></bean:define>
				<%= noiDung%>
			</div>

			<!-- Số lượt xem -->
			<div class="col-sm-10" style="margin-top: 10px;">
				<label style="font-size: 14px; color: blue;"> Lượt xem: <bean:write
						name="baiDang" property="luotView" />
				</label>
			</div>
			
			<!-- Đường kẻ ngang -->
			<div class="col-sm-10">
				<hr
					style="margin-top: 5px; margin-bottom: 20px; border-top: 2px solid white; box-sizing: content-box;">
			</div>
			<bean:define id="idBaiDang" name="danhSachBaiDangBanForm"
				property="idBaiDang"></bean:define>
			<div class="fb-comments" data-href="http://localhost:8080/RaoVat/xemChiTiet.do?idBaiDang=${idBaiDang}" data-numposts="5"></div>
		</div>
		</div>
	</div>
</div>
</div>
</body>
</html>