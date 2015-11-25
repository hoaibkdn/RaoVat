<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<link type="text/css" href="css/flexslider.css" rel="stylesheet"/>
<link type="text/css" href="css/plug_mmenu.all.css" rel="stylesheet"/>
<link rel="stylesheet" href="css/bootstrap.min.css"/>
<link rel="stylesheet" href="css/trangchu_v2.css"/>
<link type="text/css" href="css/styles-responsive.css" rel="stylesheet"/>
<script type="text/javascript" src="js/jquery/jquery.flexslider-min.js"></script>
<script type="text/javascript" src="js/jquery/jquery.bxslider.js"></script>
<script type="text/javascript" src="js/main.js"></script>
<link rel="stylesheet" href="css/style-lable.css" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Đăng bài thành công</title>
</head>
<body>
<%@include file="/header.jsp"%>
<div><%@include file="/benTrai.jsp"%></div>
<div class="col-md-8 col-md-offset-3 control-border margin-box">
	<h5 class="text-center ">Cám ơn bạn đã gửi yêu cầu, chúng tôi sẽ phản hồi qua email cho bạn 
		nếu bài đăng của bạn hợp lệ.
		Xin chân thành cám ơn!</h5>
</div>
</body>
</html>