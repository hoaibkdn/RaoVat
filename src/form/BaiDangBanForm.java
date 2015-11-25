package form;

import java.util.ArrayList;

import model.bean.DanhMucBean;
import net.sourceforge.jtds.jdbc.DateTime;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

public class BaiDangBanForm extends ActionForm{
	private String idBaiDang;
	private String tenDangNhap;
	private String idDanhMuc;
	private String danhMuc;
	private String tenDanhMuc;
	private String tenBaiDang;
	private String noiDung;
	private String hinhAnh;
	private DateTime thoiGianDang;
	private float gia;
	private String idLoaiBaiDang;
	private String tenLoaiBaiDang;
	private int trangThai;
	private int luotLike;
	private int luotView;
	private String thongBao;
	private String submit;
	private String namSanXuat; 
	ArrayList<DanhMucBean> dmLst;
	FormFile fileHinhAnh;
	
	public String getDanhMuc() {
		return danhMuc;
	}
	public void setDanhMuc(String danhMuc) {
		this.danhMuc = danhMuc;
	}
	public ArrayList<DanhMucBean> getDmLst() {
		return dmLst;
	}
	public void setDmLst(ArrayList<DanhMucBean> dmLst) {
		this.dmLst = dmLst;
	}
	public String getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(String namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	public String getSubmit() {
		return submit;
	}
	public void setSubmit(String submit) {
		this.submit = submit;
	}
	public String getIdBaiDang() {
		return idBaiDang;
	}
	public void setIdBaiDang(String idBaiDang) {
		this.idBaiDang = idBaiDang;
	}
	public String getTenDangNhap() {
		return tenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	public String getIdDanhMuc() {
		return idDanhMuc;
	}
	public void setIdDanhMuc(String idDanhMuc) {
		this.idDanhMuc = idDanhMuc;
	}
	public String getTenBaiDang() {
		return tenBaiDang;
	}
	public void setTenBaiDang(String tenBaiDang) {
		this.tenBaiDang = tenBaiDang;
	}
	public String getNoiDung() {
		return noiDung;
	}
	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public DateTime getThoiGianDang() {
		return thoiGianDang;
	}
	public void setThoiGianDang(DateTime thoiGianDang) {
		this.thoiGianDang = thoiGianDang;
	}
	public float getGia() {
		return gia;
	}
	public void setGia(float gia) {
		this.gia = gia;
	}
	public String getIdLoaiBaiDang() {
		return idLoaiBaiDang;
	}
	public void setIdLoaiBaiDang(String idLoaiBaiDang) {
		this.idLoaiBaiDang = idLoaiBaiDang;
	}
	public int getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}
	public int getLuotLike() {
		return luotLike;
	}
	public void setLuotLike(int luotLike) {
		this.luotLike = luotLike;
	}
	public int getLuotView() {
		return luotView;
	}
	public void setLuotView(int luotView) {
		this.luotView = luotView;
	}
	public FormFile getFileHinhAnh() {
		return fileHinhAnh;
	}
	public void setFileHinhAnh(FormFile fileHinhAnh) {
		this.fileHinhAnh = fileHinhAnh;
	}
	public String getTenDanhMuc() {
		return tenDanhMuc;
	}
	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}
	public String getTenLoaiBaiDang() {
		return tenLoaiBaiDang;
	}
	public void setTenLoaiBaiDang(String tenLoaiBaiDang) {
		this.tenLoaiBaiDang = tenLoaiBaiDang;
	}
	public String getThongBao() {
		return thongBao;
	}
	public void setThongBao(String thongBao) {
		this.thongBao = thongBao;
	}
	
	
}
