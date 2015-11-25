<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link type="text/css" href="css/plug_mmenu.all.css" rel="stylesheet"/>
<link rel="stylesheet" href="css/bootstrap.min.css"/>
<link rel="stylesheet" href="css/myStyleSheet.css"/>
<link type="text/css" href="css/styles-responsive.css" rel="stylesheet"/>
<link rel="stylesheet" href= "css/style-lable.css"/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="content">
<div class="control-border col-md-2 col-md-offset-1">
	<p><html:link styleClass="btn btn-warning center-block btn-type"
			action="/danhSachBan">Trang chủ</html:link></p>
	<p><html:link styleClass="btn btn-warning center-block btn-type"
			action="/dangBai">Đăng bán</html:link></p>
	<p><html:link styleClass="btn btn-warning center-block btn-type"
			action="/dangBaiMua">Đăng mua</html:link></p>
	<p><html:link styleClass="btn btn-warning center-block btn-type"
			action="/lichSuDang">Lịch Sử đăng bài</html:link></p>
</div>
</div>
</body>
</html>