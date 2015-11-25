<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="css/tab.css" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Danh sách bài đăng</title>
</head>
<body>
<div class = "col-md-9">
	<div class="listing_tabs">
		<div id = "tabarea_left">
			<ul id = "tabnav">
				<li class = "tab_all tab_active"><html:link onclick="xt_click(this,'C',xtn2,'filter_private','A');" action="/danhSachBan">Bài đăng bán</html:link></li>
				<li class = "tab_all tab_active"><html:link action="/danhSachMua">Bài đăng mua</html:link></li>
			</ul>
		</div>
	</div>
</div>
</body>
</html>