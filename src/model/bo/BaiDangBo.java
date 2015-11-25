package model.bo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import model.bean.BaiDangBean;
import model.dao.BaiDangDao;

public class BaiDangBo {
	BaiDangDao baiDangDAO = new BaiDangDao();
	
	//insert bai dang
	public boolean InsBaiDang(String idBaiDang, String tenDangNhap, String idDanhMuc, String tenBaiDang,
			String noiDung, String hinhAnh, String thoiGianDang, float gia, String idLoaiBaiDang, int trangThai,
			int luotLike, int luotView, String namSanXuat)
	{
		return baiDangDAO.dangBai(idBaiDang, tenDangNhap, idDanhMuc, tenBaiDang, noiDung, hinhAnh, 
				thoiGianDang, gia, idLoaiBaiDang, trangThai, luotLike, luotView,namSanXuat);
	}
	
	//get id bai dang tu dong
	public String getIdBaiDang()
	{
		return baiDangDAO.getIdTuDongBaiViet();
	}
	
	public String getThoiGianHienTai() 
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();		
		return dateFormat.format(date);
	}
	
	
	//get list bai đăng bán
	public ArrayList<BaiDangBean> getBaiDangList(String idLoaiBaiDang, int trangThai)
	{
		return baiDangDAO.getAllBaiDang(idLoaiBaiDang,trangThai);
	}
	
	//get lich su bai dang
	public ArrayList<BaiDangBean> getLichSu(String tenDangNhap)
	{
		return baiDangDAO.getLichSuDang(tenDangNhap);
	}
	
	//get bai dang theo tu khoa tim kiem
	public ArrayList<BaiDangBean> getBaiDangTuKhoa(String tuKhoa, String idLoaiBaiDang)
	{
		return baiDangDAO.getBaiDangTimKiem(tuKhoa, idLoaiBaiDang);
	}
	
	//duyet bai dang
	public boolean duyetBai(String idBaiDang)
	{
		return baiDangDAO.duyetBaiDang(idBaiDang);
	}
	
	//xoa bai dang
	public boolean xoaBai(String idBaiDang)
	{
		return baiDangDAO.deletetBaiDangChuaDuyet(idBaiDang);
	}
	
	//get tat ca bai da dang cua nguoi dung
	public ArrayList<BaiDangBean> getAllBaiDang()
	{
		return baiDangDAO.getBaiDangAll();
	}
	
	//get bai dang theo gia
	public ArrayList<BaiDangBean> bdGia(float giaThap, float giaCao)
	{
		return baiDangDAO.bdGiaLst(giaThap, giaCao);
	}
	
	//get bai dang theo ten
	public ArrayList<BaiDangBean> getbdTen(String ten)
	{
		return baiDangDAO.bdTenLst(ten);
	}
	
	//get bai dang theo nam san xuat
	public ArrayList<BaiDangBean> getbdNam(String nam)
	{
		return baiDangDAO.bdNamLst(nam);
	}
	
	//get bai dang theo danh muc
	public ArrayList<BaiDangBean> getbdDanhMuc(String idDanhMuc)
	{
		return baiDangDAO.bdDanhMucLst(idDanhMuc);
	}
	
	//tim kiem bai dang chua duyet
	public ArrayList<BaiDangBean> getTK(String tuKhoa, String idLoaiBaiDang, int trangThai)
	{
		return baiDangDAO.getTimKiemBd(tuKhoa, idLoaiBaiDang, trangThai);
	}
	
	//get bai dang can fix
	public BaiDangBean getFix(String idBaiDang)
	{
		return baiDangDAO.getBaiDangFix(idBaiDang);
	}
	
	//update bai dang fixed
	public boolean updateBaiDang(String tenBaiDang, String idDanhMuc, String namSanXuat, 
			String hinhAnh, String noiDung, float gia)
	{
		return baiDangDAO.updateFixed(tenBaiDang, idDanhMuc, namSanXuat, hinhAnh, noiDung, gia);
	}
}

