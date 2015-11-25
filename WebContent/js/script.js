function isDuyet(){
var flag = confirm("Bạn có muốn duyệt bài viêt này hay không?");
if(flag == true){
return true;
}
return false;

}

function isHuy(){
var flag = confirm("Bạn có muốn hủy bài viết này hay không?");
if(flag == true){
return true;
}
return false;

}

function isMo(){
var flag = confirm("Bạn có muốn mở tài khoản cho người dùng này hay không?");
if(flag == true){
return true;
}
return false;

}

function isKhoa(){
var flag = confirm("Bạn có muốn khóa tài khoản đối với người dùng này không?");
if(flag == true){
return true;
}
return false;

}

function isXoa(){
	var flag = confirm("Bạn có muốn xoá bài viết này hay không?");
	if(flag == true){
		return true;
	}
	return false;
}
