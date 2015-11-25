package form;

import java.util.ArrayList;

import model.bean.BaiDangBean;

import org.apache.struts.action.ActionForm;

public class Ad_LichSuNguoiDungDangBaiForm extends ActionForm
{

	private String idBaiDang;
	private String idDanhMuc;
	private String TenBaiDang;
	private String noiDung;
	private float gia;
	private String thoiGianDang;
	private String idLoaiBaiDang;
	private String namSanXuat;
	private ArrayList<BaiDangBean> listBaiDang;
	private ArrayList<String> nguoiDangLst;
	private String nguoiDang;
	
	
	
	public String getNguoiDang() {
		return nguoiDang;
	}
	public void setNguoiDang(String nguoiDang) {
		this.nguoiDang = nguoiDang;
	}
	public ArrayList<String> getNguoiDangLst() {
		return nguoiDangLst;
	}
	public void setNguoiDangLst(ArrayList<String> nguoiDang) {
		this.nguoiDangLst = nguoiDang;
	}
	public String getIdBaiDang() {
		return idBaiDang;
	}
	public void setIdBaiDang(String idBaiDang) {
		this.idBaiDang = idBaiDang;
	}
	public String getIdDanhMuc() {
		return idDanhMuc;
	}
	public void setIdDanhMuc(String idDanhMuc) {
		this.idDanhMuc = idDanhMuc;
	}
	public String getTenBaiDang() {
		return TenBaiDang;
	}
	public void setTenBaiDang(String tenBaiDang) {
		TenBaiDang = tenBaiDang;
	}
	public String getNoiDung() {
		return noiDung;
	}
	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	public float getGia() {
		return gia;
	}
	public void setGia(float gia) {
		this.gia = gia;
	}
	public String getThoiGianDang() {
		return thoiGianDang;
	}
	public void setThoiGianDang(String thoiGianDang) {
		this.thoiGianDang = thoiGianDang;
	}
	public String getIdLoaiBaiDang() {
		return idLoaiBaiDang;
	}
	public void setIdLoaiBaiDang(String idLoaiBaiDang) {
		this.idLoaiBaiDang = idLoaiBaiDang;
	}
	public String getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(String namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	public ArrayList<BaiDangBean> getListBaiDang() {
		return listBaiDang;
	}
	public void setListBaiDang(ArrayList<BaiDangBean> listBaiDang) {
		this.listBaiDang = listBaiDang;
	}
	
	
}
