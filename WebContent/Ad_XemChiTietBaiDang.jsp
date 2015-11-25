<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="css/style-lable.css" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Chi tiet</title>
</head>
<body>
<%@include file="/header.jsp"%>
<%@include file="/Ad_BenTrai.jsp"%>
<div class="col-md-8 margin-box" >
	<h3 style="font-weight: bold; color: orange; font-size: 35px;">XEM CHI TIẾT</h3>
</div>
<div class = "col-md-8 control-border margin-box margin-top">
<div class = "border">
<div class="col-sm-12"
		style="padding-bottom: 30px;">
		<div class="col-sm-9" style="margin-top: 10px;">
		
			<!-- Tiêu đề bài viết -->
			<bean:define id="baiDang" name="ad_BaiDangChuaDuyetForm"
				property="xemChiTiet"></bean:define>
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

			<!-- Đường kẻ ngang -->
			<div class="col-sm-10">
				<hr
					style="margin-top: 5px; margin-bottom: 20px; border-top: 2px solid white; box-sizing: content-box;">
			</div>
			<bean:define id="idBaiDang" name="ad_BaiDangChuaDuyetForm"
				property="idBaiDang"></bean:define>
		</div>
		</div>
	</div>
</div>
</div>
</body>
</html>