package model.bo;

import java.util.ArrayList;

import model.bean.NguoiDungBean;
import model.dao.NguoiDungDao;

public class NguoiDungBo {
	NguoiDungDao ndDao = new NguoiDungDao();
	
	//kiem tra ten dang nhap
	public boolean isNguoiDung(String tenDangNhap, String matKhau)
	{
		return ndDao.isTaiKhoan(tenDangNhap, matKhau);
	}
	
	//get mat khau tu ten Dang nhap
	public String getMatKhau(String tenDangNhap)
	{
		return ndDao.getMK(tenDangNhap);
	}
	
	//get ten nguoi dung tu tên đăng nhập
	public String getUser(String tenDangNhap)
	{
		return ndDao.getTenNguoiDung(tenDangNhap);
	}
	
	public ArrayList<NguoiDungBean> getListNguoiDung(){
		return ndDao.getListNguoiDung();
	}

	public boolean deleteNguoiDung(String tenDangNhap) {
		// TODO Auto-generated method stub
		return ndDao.deleteNguoiDung(tenDangNhap);
	}

	public boolean khoaNguoiDung(String tenDangNhap) {
		// TODO Auto-generated method stub
		return ndDao.khoaNguoiDung(tenDangNhap);
	}

	public NguoiDungBean getThongTin(String tenDangNhap) {
		// TODO Auto-generated method stub
		return ndDao.getThongTin(tenDangNhap);
	}
	
	//get trang thai tu tai khoan nguoi dung
	public String getTrangThaiNd(String tenDangNhap)
	{
		return ndDao.getTrangThai(tenDangNhap);
	}
	
	//tim kiem nguoi dung tu TUKHOA
	public ArrayList<NguoiDungBean> getNdSearch(String textSearch)
	{
		return ndDao.getSearch(textSearch);
	}
}
