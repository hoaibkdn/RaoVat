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
<link href="css/style-lable.css">
<title>Danh sách đã đăng</title>
</head>
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="benTrai.jsp"></jsp:include>
<body>
<div class="col-md-8 col-xs-12">
				<div class="panel panel-danger">
                	<h3 class="text-center">Danh sách bài đăng</h3>
                <html:form action="/lichSuDang" styleClass="form-inline">
                  <div class="row">
                    <div class = "col-md-3 col-md-offset-2" ><label>Loại bài đăng :</label></div>
                    <div class = "col-md-3 "><label>Trạng thái :</label></div>
                  </div>
                  <div class="row">
                    <div class = "col-md-3 col-md-offset-2" >
                    <html:select name="nd_LichSuDangBaiForm" property="loai" styleClass="form-control">
                      <html:option value="Tat ca">Tất cả</html:option>
                      <html:option value="Dang ban">Đăng bán</html:option>
                      <html:option value="Dang mua">Đăng mua</html:option>
                    </html:select>
                    </div>
                    <div class = "col-md-3 ">
                    <html:select name="nd_LichSuDangBaiForm" property="trangThai" styleClass="form-control">
                      <html:option value="Tat ca">Tất cả</html:option>
                      <html:option value="Da duyet">Đã duyệt</html:option>
                      <html:option value="Chua duyet">Chưa duyệt</html:option>
                    </html:select>
                  </div >
                  <div class = "col-md-2">
                  <html:submit styleClass="btn btn-warning" property="submit" value="Tim Kiem">Tìm kiếm</html:submit>
                  </div>
                  </div>
                  
                </html:form>
          		</div>
<div class=" panel panel-default panel-danger">
	<div class="bs-example" style="margin: 10px">
 <table class="table table-bordered">
    <thead>
        <tr>
            <th class ="table-content">Tên bài đăng</th>
            <th class ="table-content">Thời gian đăng</th>
            <th class ="table-content">Giá</th>
            <th class ="table-content">Trạng thái</th>
            <th class ="table-content">Chức năng</th>
       </tr>
   </thead>        
   <tbody id="showtable">
		<logic:iterate name="nd_LichSuDangBaiForm" property="lichSuDang" id="baiDang">
			<tr>
				<bean:define id="idBaiDang" name="baiDang" property="idBaiDang" />
				<bean:define id="tenBaiDang" name="baiDang" property="tenBaiDang" />
				<td><bean:write name="baiDang" property="tenBaiDang" /></td>
				<td><bean:write name="baiDang" property="thoiGianDang" /></td>
				<td><bean:write name="baiDang" property="gia" /></td>
				<td><bean:write name="baiDang" property="trangThai" /></td>
				<td><html:button styleClass="btn btn-warning" property="btnSua" value="Sửa">Sửa</html:button>
					<html:button styleClass="btn btn-danger" property="btnXoa" value="Xóa">Xóa</html:button>
				</td>
			</tr>
		</logic:iterate>
	</tbody>
      
 </table>
 </div>
 </div>
 </div>
</body>
</html>