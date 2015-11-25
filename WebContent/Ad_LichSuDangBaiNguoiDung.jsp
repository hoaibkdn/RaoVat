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
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>Admin_Quản lý tất cà bài đăng</title>
</head>
<body>
<%@include file="/header.jsp"%>
<%@include file="/Ad_BenTrai.jsp"%>
<div class="col-md-8 control-border margin-box"><h3 class="text-center ">Tất cả bài đăng</h3>
</div>
<div class="col-md-8 control-border margin-box margin-top">
<div style="margin-top: 20px">
<table class="table table-bordered">
    <thead>
        <tr>
            <th class ="table-content">Tên bài đăng</th>
            <th class ="table-content">Giá</th>
            <th class ="table-content">Năm sản xuất</th>
            <th class ="table-content">Thời gian đăng</th>
            <th class ="table-content">Người đăng</th>
            <th class ="table-content">Trạng thái</th>
       </tr>
   </thead>        
   <tbody id="showtable">
		<logic:iterate name="ad_LichSuNguoiDungDangBaiForm" property="listBaiDang" id="baiDang">
			<tr>
						<td style="text-align: center;"><bean:write name="baiDang" property="tenBaiDang" /></td>
						<td style="text-align: center;"><bean:write name="baiDang" property="gia" /></td>
						<td style="text-align: center;"><bean:write name="baiDang" property="namSanXuat" /></td>	
						<td style="text-align: center;"><bean:write name="baiDang" property="thoiGianDang" /></td>
						<td style="text-align: center;"><bean:write name="baiDang" property="tenDangNhap"/></td>
						<td style="text-align: center;"><bean:write name="baiDang" property="trangThai" /></td>
			</tr>
		</logic:iterate>
	</tbody>
 </table>
</div>
</div>
</body>
</html>