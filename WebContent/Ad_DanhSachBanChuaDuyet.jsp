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
<link rel="stylesheet" href="css/style-lable.css" />
<title>Admin_Quản lý đăng bán</title>
</head>
<body>
<%@include file="/header.jsp"%>
<%@include file="/Ad_BenTrai.jsp"%>
<div class="col-md-8 control-border margin-box">
<div class="row"><h3 class="text-center">Danh sách bài đăng bán</h3>
                <html:form action="/dsBanChuaDuyet" styleClass="form-inline">
                  <div class="row" style="margin-top: 30px;" >
                    	<div class = "col-md-2 col-md-offset-1"><label>Tìm kiếm:</label></div>
						<div class = "col-md-6">
         					<html:text property="timKiem" name="ad_BaiDangChuaDuyetForm" styleClass="form-control"></html:text>
     					</div>
     			<div class ="col-md-2">
     				<html:submit styleClass="btn btn-warning" property="submit" value="Tìm kiếm" />
     			</div>
           </div>
     </html:form>
</div> 
</div>
<div class="col-md-8 control-border margin-box margin-top">
<div style="margin-top: 20px">
<table class="table table-bordered">
    <thead>
        <tr>
            <th class ="table-content">Tên bài đăng</th>
            <th class ="table-content">Giá</th>
            <th class ="table-content">Thời gian đăng</th>
            <th class ="table-content">Năm sản xuất</th>
            <th class ="table-content">Chức năng</th>
       </tr>
   </thead>        
   <tbody id="showtable">
		<logic:iterate name="ad_BaiDangChuaDuyetForm" property="listBaiDang" id="baiDang">
			<tr>
				<bean:define id="idBaiDang" name="baiDang" property="idBaiDang"></bean:define>
						<td style="text-align: center;"><bean:write name="baiDang" property="tenBaiDang" /></td>
						<td style="text-align: center;"><bean:write name="baiDang" property="gia" /></td>	
						<td style="text-align: center;"><bean:write name="baiDang" property="thoiGianDang" /></td>
						<td style="text-align: center;"><bean:write name="baiDang" property="namSanXuat" /></td>
						<td>
						<html:link action="/xemChiTiet?idBaiDang=${idBaiDang}">Chi tiết</html:link>-
						<html:link action="/duyetBaiDang?idBaiDang=${idBaiDang}">Duyệt</html:link>-
						<html:link action="/xoaBaiDang?idBaiDang=${idBaiDang}">Xóa</html:link>
						</td>
			</tr>
		</logic:iterate>
	</tbody>  
 </table>
 </div>
</div>
</body>
</html>