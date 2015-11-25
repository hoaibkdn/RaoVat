<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="css/style-lable.css" />
<script type="text/javascript" src="js/script.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Quan ly nguoi dung</title>
</head>
<body>
<%@include file="/header.jsp"%>
<%@include file="/Ad_BenTrai.jsp"%>
<div class="col-md-8 control-border margin-box">
  <div class="row"><h3 class="text-center">Danh sách người dùng</h3></div>
                <html:form action="/danhSachNguoiDung" styleClass="form-inline">
                  <div class="row" style="margin-top: 30px;" >
                    	<div class = "col-md-2" style="margin-left: 30px;"><label>Tìm kiếm:</label></div>
							<div class = "col-md-3">
         					<html:text property="timKiemText" style="margin-left: -30px;" name="ad_DanhSachNguoiDungForm" styleClass="form-control"></html:text>
     						</div>
     						<div class ="col-md-2" style="margin-left: 20px;"><label>Trạng thái :</label></div>
     						<div class = "col-md-2">
     						<html:select name="ad_DanhSachNguoiDungForm" property="trangThai" styleClass="form-control" style="margin-left: -30px;">
                      		<html:option value="Tat ca">Tất cả</html:option>
                      		<html:option value="block">Đã khóa</html:option>
                      		<html:option value="active">Hoạt động</html:option>
                    		</html:select>
     						</div>
     						<div class ="col-md-2">
     						<html:submit styleClass="btn btn-warning" property="submit" value="Tìm kiếm" />
     						</div>
                  </div>
                </html:form>
          		</div>    		
<div class="col-md-8 control-border margin-box margin-top">
<div style="margin-top: 20px">
<table class="table table-bordered">
    <thead>
        <tr>
            <th class ="table-content">Tên đăng nhập</th>
            <th class ="table-content">Tên người dùng</th>
            <th class ="table-content">Email</th>
            <th class ="table-content">Số điện thoại</th>
            <th class ="table-content">Địa chỉ</th>
            <th class ="table-content">Lần đăng nhập gần nhất</th>
            <th class ="table-content">Chức năng</th>
       </tr>
   </thead>        
   <tbody id="showtable">
		<logic:iterate name="ad_DanhSachNguoiDungForm" property="listNguoiDung" id="nguoiDung">
			<tr>
				<bean:define id="tenDangNhap" name="nguoiDung" property="tenDangNhap"></bean:define>
						<td style="text-align: center;"><bean:write name="nguoiDung" property="tenDangNhap" /></td>
						<td style="text-align: center;"><bean:write name="nguoiDung" property="tenNguoiDung" /></td>
						<td style="text-align: center;"><bean:write name="nguoiDung" property="email" /></td>
						<td style="text-align: center;"><bean:write name="nguoiDung" property="soDienThoai" /></td>	
						<td style="text-align: center;"><bean:write name="nguoiDung" property="diaChi" /></td>
						<td style="text-align: center;"><bean:write name="nguoiDung" property="thoiGianDangNhapGanNhat"/></td>
						<td>
						<bean:define id="tenDangNhap" name="nguoiDung"
										property="tenDangNhap"></bean:define> 
							<bean:define id="trangThai" name="nguoiDung" property="trangThai"></bean:define>
							<logic:equal name="nguoiDung" property="trangThai"
										value="active">
								<html:link action="/khoaNguoiDung?tenDangNhap=${tenDangNhap}"><html:img src="icon/lock.png"/></html:link>
							</logic:equal>
						<html:link action="/xoaNguoiDung?tenDangNhap=${tenDangNhap}&trangThai=active" onclick="return isKhoa()">Xóa</html:link>
						</td>
			</tr>
		</logic:iterate>
	</tbody>    
 </table>
 </div>
 </div>
</body>
</html>