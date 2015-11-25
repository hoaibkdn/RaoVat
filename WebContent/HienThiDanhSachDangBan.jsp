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
<link rel="stylesheet" href="css/bootstrap.min.css" />
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/styles-log.css">
<link rel="stylesheet" type="text/css" href="css/tab.css">
<link rel="stylesheet" type="text/css" href="css/styles-write.css">
<link rel="stylesheet" href="css/styles.css" />
<link rel="stylesheet" href="css/myStyleSheet.css" />
<link rel="stylesheet" href="css/style-lable.css" />
<script type="text/javascript" src="js/myJavaScript.js"></script>
<%@include file="/header.jsp"%>
<html:form action="/danhSachBan">
<div><%@include file="/benTrai.jsp"%></div>
<div class = "col-md-8 margin-box">
<div class = "row">
<div class="col-md-12 control-border"><h3 class="text-center ">Danh sách bài đăng</h3>
<div class="row margin-top">
	<div class = "col-md-2"><label>Tìm kiếm:</label></div>
	<div class = "col-md-8">
         <html:text property="tatCa" name="danhSachBaiDangBanForm" styleClass="form-control"></html:text>
     </div>
     <div class ="col-md-2">
     	<html:submit styleClass="btn btn-warning" property="submit" value="Tìm kiếm" />
     </div>
</div>
<div class = "row">
<div id="search-indicator" class="col-md-2 btn btn-link btn-xs">Tìm kiếm nâng cao</div>
</div>
<div class="row form-group advanced-search" style="padding-left: 20px; padding-right: 20px;">
<div class="row">
     <div class="form-group col-sm-4">
         <label>Tên sản phẩm:</label>
         <html:text property="tenSanPham" name="danhSachBaiDangBanForm" styleClass="form-control"></html:text>
     </div>
     <div class="form-group col-sm-4">
         <label>Năm sản xuất:</label>
         <html:text property="namSanXuat" name="danhSachBaiDangBanForm" styleClass="form-control"></html:text>
     </div>
     <div class="form-group col-md-4">
          <label>Loại sản phẩm:</label>
						<html:select name ="danhSachBaiDangBanForm" property="idDanhMuc" styleClass="form-control">
							<html:option value="0">--Chọn loại sản phẩm --</html:option>
						<html:optionsCollection name = "danhSachBaiDangBanForm" property="dmLst"
								label="tenDanhMuc" value="idDanhMuc"/>
								
						</html:select>
	</div>
</div>
<div class="row">
<div class="col-md-2 col-md-offset-1"><label>Giá:</label></div>
        <div class="col-md-4">
          <html:select name="danhSachBaiDangBanForm" property="giaThap" styleClass="form-control">
                      <html:option value="0">Giá thấp nhất</html:option>
                      <html:option value="3trieu">3 triệu</html:option>
                      <html:option value="2trieu">2 triệu</html:option>
                      <html:option value="1trieu">1 triệu</html:option>
                      <html:option value="thapHon">Thấp hơn</html:option>
           </html:select>
        </div>
     	<div class="col-md-4">
          <html:select name="danhSachBaiDangBanForm" property="giaCao" styleClass="form-control">
                      <html:option value="0">Giá cao nhất</html:option>
                      <html:option value="10trieu">10 triệu</html:option>
                      <html:option value="50trieu">50 triệu</html:option>
                      <html:option value="100trieu">100 triệu</html:option>
                      <html:option value="caoHon">Cao hơn</html:option>
           </html:select>
       </div>
</div>
</div>
</div>
<div class="col-md-12 control-border margin-top">
<%@include file="/tab_BaiDang.jsp"%>
<div class = "row col-md-12" >
<div class = "col-md-12">
<div class = "panel panel-danger">
<div class = "penal-body">
<logic:notEmpty name="danhSachBaiDangBanForm" property="baiDangBanLst">
	<div class="col-sm-12">
		<logic:iterate name="danhSachBaiDangBanForm" property="baiDangBanLst" id="baiDang">
			<bean:define id="idBaiDang" name="baiDang" property="idBaiDang" />
				<div class="col-sm-12" style="padding-bottom: 20px; padding-top: 20px; border-bottom: 1px dashed #CCC; clear: both;">
					<div class="col-sm-3 img-post">
						<html:link action="/xemChiTiet?idBaiDang=${idBaiDang}">
						
							<!-- Hình ảnh -->
							<bean:define id="hinhAnh" name="baiDang" property="hinhAnh" />
								<img alt="" src="${hinhAnh}" width="100%;" height="130px;">
						</html:link>
					</div>

						<!--  -->
					<div class="col-sm-9">
						<div class="col-sm-12 link">
						
							<!-- Tiêu đề -->
							<label style="font: 600 20px/20px 'Roboto', Arial;"> 
								<html:link style="color: #9C2A2A;"
									action="/xemChiTiet?idBaiDang=${idBaiDang}">
									<bean:write name="baiDang" property="tenBaiDang" />
								</html:link>
							</label>
						</div>

						<!-- Thời gian đăng -->
						<div class="col-sm-12">
							<label style="font-size: 10px; color: #9C2A2A;"> Đăng lúc: <bean:write name="baiDang" property="thoiGianDang" />
							</label>
						</div>

						<!-- Lượt xem -->
						<div class="col-sm-12">
							<label style="font-size: 11px; color: #9C2A2A;">
							<bean:write name="baiDang" property="luotView" /> lượt xem 
							</label>
						</div>

						<!-- Mô tả -->
						<div class="col-sm-12 link" style="color: black;">
							<p>
								<bean:write name="baiDang" property="noiDung" />
								...<html:link 
									action="/xemChiTiet?idBaiDang=${idBaiDang}">Đọc tiếp</html:link>
							</p>
						</div>
					</div>
				</div>
			</logic:iterate>
			
			<bean:define id="xemThem" name="danhSachBaiDangBanForm" property="xemThem" />
				<logic:equal value="0" name="xemThem">
					<div class="col-sm-offset-5 col-sm-2" style="margin-top: 10px; 
						padding-bottom: 20px; font-size: 18px; padding-left: 10px;">
				    	<a href="javascript:goback();" class="btn btn-danger">Quay lại</a>
				    </div>
					<div class="col-sm-12"
						style="padding-top: 10px; padding-bottom: 10px; 
						 margin-top: 10px; font-size: 16px; color: white;
						 border: 1px solid white;">
						<p>Số lượng bài viết đang được cập nhât...</p>
					</div>
				</logic:equal>
				<logic:notEqual value="0" name="xemThem">
				    <div class="col-sm-offset-5 col-sm-12">
				    	<logic:notEqual value="1" name="xemThem">
				    		<div class="col-sm-2" style="margin-top: 10px; padding-bottom: 20px; font-size: 18px; padding-left: 10px;">
				    		<a href="javascript:goback();" class="btn btn-danger">Quay lại</a>
				    		</div>
				    	</logic:notEqual>
						<div class="col-sm-2"
							style="margin-top: 10px; padding-bottom: 20px; font-size: 18px; padding-left: 10px;">
							<html:link action="/xemnhieubaiviethon?${xemThem}"
							styleClass="btn btn-danger" styleId="xemNhieu">Xem nhiều hơn...</html:link>
						</div>
					</div>
				</logic:notEqual>
			</div>
		</logic:notEmpty>
	</div>
	</div>
	</div>
	</div>
	</div>
</div>
</div>
</html:form>
</body>
</html>