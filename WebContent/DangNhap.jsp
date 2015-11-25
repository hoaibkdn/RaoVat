<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="css/style-login.css" />
<link rel="stylesheet" href="css/styles.css" />
<link rel="stylesheet" href="css/styles-log.css" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/style-lable.css" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" >
<title>Đăng nhập</title>
</head>
<body>
<div class="home-login-area" style="display: block; padding-top: 200px;">
		<div class="col-md-4 col-md-offset-4 control-border" >
		<div class="title" >
						<span>ĐĂNG NHẬP</span>
					</div>
		<div class="box-content-step" >
				<html:form action="/dangNhap">
					<div class = "row">
						<div class="col-md-4 col-md-offset-1"><label class="control-label">Tên đăng nhập:</label></div>
						<div class="col-md-7 log-text">
							<html:text property="tenDangNhap" styleClass="form-control"/>								
						</div>
					</div>
					<div class = "row">
						<div class="col-md-4 col-md-offset-1"><label class="control-label">Mật khẩu:</label></div>
						<div class="col-md-7 log-text">
							<html:password property="matKhau" styleClass="form-control"/>
						</div>
						
					</div>
					<div class="col-md-12">
						<bean:write name="nguoiDungForm" property="thongBaoDangNhap"/>
					</div>
					<div class="col-md-offset-2">
						<div class="col-md-6 col-md-offset-6">
							<html:submit value="Dang nhap" property="submit"
								styleClass="btn btn-warning"></html:submit>
						</div>
					</div>
				</html:form>
			</div>
		</div>
</div>
</body>
</html>