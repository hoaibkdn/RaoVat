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
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery-1.11.2.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/styles-write.css">
<script type="text/javascript" src="ckeditor/ckeditor.js"></script>
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/styles.css" />
<link rel="stylesheet" href="css/styles-insert.css" />
<link rel="stylesheet" href="css/styles-log.css" />
<link rel="stylesheet" href= "css/style-lable.css"/>
<script type="text/javascript">
	function _loadImage() {
		var inputFile = document.getElementById('inputFile');
		var fReader = new FileReader();
		fReader.readAsDataURL(inputFile.files[0]);
		fReader.onloadend = function(event) {
			var imgPreview = document.getElementById('imgPreview');
			var btUpload = document.getElementById('btUpload');
			imgPreview.setAttribute('src', event.target.result);
			btUpload.disabled = false;
		}
	}
</script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="benTrai.jsp"></jsp:include>
<div class="col-md-8 col-md-offset-3 control-border margin-box">

		<html:form action="/dangBai" enctype="multipart/form-data">
			<div class="col-sm-12">
				<div class="col-sm-12 title-main">ĐĂNG MUA</div>
				<div class="col-sm-12">
					<hr></hr>
				</div>

				<div class="form-group col-sm-12 log-insert">
					<label class="control-label col-sm-2">Tên sản phẩm(*):</label>
					<div class="col-sm-10 ">
						<html:text property="tenBaiDang" styleClass="form-control"></html:text>
						<html:errors property="tieuDeError" />
					</div>
				</div>
				<div class="form-group col-sm-12 log-insert">
					<label class="control-label col-sm-2">Loại đồ cổ(*):</label>
					<div class="col-sm-3">
						<html:select property="idDanhMuc" styleClass="form-control">
							<html:optionsCollection name="baiDangForm"
								property="dmLst" label="tenDanhMuc" value="idDanhMuc" />
						</html:select>
					</div>
				</div>
				<div class="form-group col-sm-12 log-insert">
					<label class="control-label col-sm-2">Năm sản xuất:</label>
					<div class="col-sm-10 ">
						<html:textarea property="namSanXuat" styleClass="form-control"></html:textarea>
						<html:errors property="moTaError" />
					</div>
				</div>
				
				<div class="form-group col-sm-12 log-insert">
					<label class="control-label col-sm-2 log-insert">Hình ảnh(*):</label>
					<div class="col-sm-8">

						<html:file styleId="inputFile" property="fileHinhAnh"
							onchange="_loadImage();" />
						<html:errors property="fileHinhAnhError" />
						<div class="col-sm-12 img-insert">
							<img id="imgPreview" class="img-thumbnail preview" width="250px"
								height="200px" />
						</div>
					</div>
				</div>
				
				<div class="form-group col-sm-12 log-insert">
					<label class="control-label col-sm-2">Nội dung(*):</label>
					<div class="col-sm-10">
						<html:textarea property="noiDung" styleClass="ckeditor"></html:textarea>
						<html:errors property="noiDungError" />
					</div>
				</div>
				<div class="form-group col-sm-12 log-insert">
					<label class="control-label col-sm-2">Định giá:</label>
					<div class="col-sm-10 ">
						<html:textarea property="gia" styleClass="form-control"></html:textarea>
						<html:errors property="moTaError" />
					</div>
				</div>
				
				<div class="form-group col-sm-12" >
					<label>Vui lòng điền đủ thông tin có dấu *</label>
				</div>
				
				<div class="form-group col-sm-12 log-insert">
					<div class="col-sm-10">
						<div class="col-sm-6">
							<html:submit property="submit" value="submit"
								styleClass="btn btn-danger">Đăng bài</html:submit>
						</div>
					</div>
				</div>
				
			</div>
		</html:form>
	</div>
</body>
</html>