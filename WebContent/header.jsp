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
<script src="js/ie/respond.min.js" cache="false">
		</script>
		<script src="js/ie/html5.js" cache="false">
		</script>
		<script src="js/ie/fix.js" cache="false">
		</script>
    <link type="text/css" href="css/plug_mmenu.all.css" rel="stylesheet"/>
    <link type="text/css" href="css/flexslider.css" rel="stylesheet"/>
    <link type="text/css" href="css/bootstrap.min.css" rel="stylesheet"/>
    <link type="text/css" href="css/styles.css" rel="stylesheet"/>
    <link type="text/css" href="css/style-lable.css" rel="stylesheet"/>
<script language="javascript">
    function changeImage() {

        if (document.getElementById("idBtn").src == "icon/Point-Rouge.png") 
        {
            document.getElementById("idBtn").src = "icon/77_grey-dot.png";
        }
        else 
        {
            document.getElementById("idBtn").src = "icon/Point-Rouge.png";
        }
    }
</script>
</head>
<body>
<!-- Menu -->
<html:form action="/trangChu">
<div class="col-sm-2 col-sm-offset-10 control-log-in" >
<logic:empty name="nguoiDungForm" property="tenDangNhap">
	<html:link action="/dangNhap">Đăng nhập </html:link>
					/
	<html:link action="#"> Đăng ký</html:link>
</logic:empty>
	<logic:notEmpty name="nguoiDungForm" property="tenDangNhap">
	<html:link action="/dangXuat">Đăng Xuất</html:link>
	<html:submit property="ngaySinh" value="?" styleClass="size btn btn-danger btn-radius margin-top" >
	</html:submit>
	</logic:notEmpty>
</div>
</html:form>
<div>
<div style="background: url('imgHeader/banner2v1.png'); 
		height: 500px; width: 100%;">
</div>
<!-- <div class="flexslider">
  <ul class="slides">
    <li data-thumb="slide1-thumb.jpg">
      <img src="imgHeader/banner1.png" />
    </li>
    <li data-thumb="slide2-thumb.jpg">
      <img src="imgHeader/banner2v1.png" />
    </li>
    <li data-thumb="slide3-thumb.jpg">
      <img src= "imgHeader/banner3v3.png"/>
    </li>
    <li data-thumb="slide4-thumb.jpg">
      <img src= "imgHeader/banner4v1.png"/>
    </li>
  </ul>
</div>
</div> -->
    <!-- Start slider -->
   <!--  <div class="slider flexslider" id="slider">
        <ul class="slides">
            <li>
                <div class="item" style="background: url(imgHeader/banner3v3.png) center;">
                </div><!-- item -->
        <!--    </li>
            <li>
                <div class="item" style="background: url(imgHeader/banner4v1.png) center;">
                </div><!-- item -->
          <!--  </li>
        </ul>
    </div> -->
    <!-- End slider -->
    
    
</div>
	<script src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery/jquery.mmenu.min.all.js"></script>
    <script type="text/javascript" src="js/jquery/jquery.flexslider-min.js"></script>
    <script type="text/javascript" src="js/main.js"></script>
</body>
</html>