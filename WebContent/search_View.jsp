<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>Tìm kiếm</title>
</head>
<body>
<html:form action="/timKiemTongQuat" styleClass="form-inline">
<h3 class="text-center">Danh sách bài đăng</h3>
     <div class="form-group">
         <label>Tên sản phẩm:</label>
         <html:text property="tenSanPham" name="timKiemTongQuatForm" styleClass="form-control"></html:text>
     </div>
     <div class="form-group">
          <label>Loại sản phẩm:</label>
          <div class="col-sm-3">
						<html:select property="idDanhMuc" styleClass="form-control">
						<html:optionsCollection name = "timKiemTongQuatForm" property="dmLst"
								label="tenDanhMuc" value="idDanhMuc"/>
						</html:select>
					</div>
     </div>
     <div class="form-group">
          <label>Giá:</label>
          <html:select name="timKiemTongQuatForm" property="giaThap" styleClass="form-control">
                      <html:option value="Tat ca">Giá thấp nhất</html:option>
                      <html:option value="Da duyet">3 triệu</html:option>
                      <html:option value="Chua duyet">2 triệu</html:option>
                      <html:option value="Chua duyet">1 triệu</html:option>
                      <html:option value="Chua duyet">Thấp hơn</html:option>
           </html:select>
     </div>
     <div class="form-group">
     	<div class="col-sm-3">
          <html:select name="timKiemTongQuatForm" property="giaCao" styleClass="form-control">
                      <html:option value="Tat ca">Giá cao nhất</html:option>
                      <html:option value="Da duyet">10 triệu</html:option>
                      <html:option value="Chua duyet">50 triệu</html:option>
                      <html:option value="Chua duyet">100 triệu</html:option>
                      <html:option value="Chua duyet">Cao hơn</html:option>
           </html:select>
       </div>
     </div>
     <div class="form-group">
         <label>Loại bài đăng:</label>
         <html:select name="timKiemTongQuatForm" property="loaiBaiDang" styleClass="form-control">
                    <html:option value="Tat ca">Tất cả</html:option>
                      <html:option value="Dang ban">Đăng bán</html:option>
                      <html:option value="Dang mua">Đăng mua</html:option>
         </html:select>
     </div>
     <html:submit styleClass="btn btn-default" property="submit" value="Tìm kiếm" />
                </html:form>
</body>
</html>