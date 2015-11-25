<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<link type="text/css" href="css/flexslider.css" rel="stylesheet"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="/header.jsp"%>
<%@include file="/benTrai.jsp"%>
<html:form action="/trangChu">
<div class="col-sm-offset-9 col-sm-3" style="padding-top: 560px;">
	<html:link action="/dangNhap">Đăng nhập </html:link>
					/
	<html:link action="#"> Đăng ký</html:link>
</div>
<logic:notEmpty name="nguoiDungForm" property="tenDangNhap">
	<html:link action="/dangXuat">Đăng Xuất</html:link>
</logic:notEmpty>
</html:form>
</body>
</html>