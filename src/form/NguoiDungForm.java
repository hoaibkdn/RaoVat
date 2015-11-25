package form;

import model.bean.NguoiDungBean;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

public class NguoiDungForm extends ActionForm{
	String idNguoiDung;
	String tenDangNhap;
	String matKhau;
	String thoiGianDangNhap;
	int phanQuyen;
	String submit;
	NguoiDungBean nguoiDung;
	String hoTen;
	int gioiTinh;
	String dangKy;
	String luu;
	String email;
	String ngaySinh;
	String soDienThoai;
	String diaChiLienHe;
	String thongBaoDangNhap;
	FormFile fileHinhAnh;
	String anhDaiDien;
	String thongBao;
	public String getIdNguoiDung() {
		return idNguoiDung;
	}
	public void setIdNguoiDung(String idNguoiDung) {
		this.idNguoiDung = idNguoiDung;
	}
	public String getTenDangNhap() {
		return tenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getThoiGianDangNhap() {
		return thoiGianDangNhap;
	}
	public void setThoiGianDangNhap(String thoiGianDangNhap) {
		this.thoiGianDangNhap = thoiGianDangNhap;
	}
	public int getPhanQuyen() {
		return phanQuyen;
	}
	public void setPhanQuyen(int phanQuyen) {
		this.phanQuyen = phanQuyen;
	}
	public String getSubmit() {
		return submit;
	}
	public void setSubmit(String submit) {
		this.submit = submit;
	}
	public NguoiDungBean getNguoiDung() {
		return nguoiDung;
	}
	public void setNguoiDung(NguoiDungBean nguoiDung) {
		this.nguoiDung = nguoiDung;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getDangKy() {
		return dangKy;
	}
	public void setDangKy(String dangKy) {
		this.dangKy = dangKy;
	}
	public String getLuu() {
		return luu;
	}
	public void setLuu(String luu) {
		this.luu = luu;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getDiaChiLienHe() {
		return diaChiLienHe;
	}
	public void setDiaChiLienHe(String diaChiLienHe) {
		this.diaChiLienHe = diaChiLienHe;
	}
	public String getThongBaoDangNhap() {
		return thongBaoDangNhap;
	}
	public void setThongBaoDangNhap(String thongBaoDangNhap) {
		this.thongBaoDangNhap = thongBaoDangNhap;
	}
	public FormFile getFileHinhAnh() {
		return fileHinhAnh;
	}
	public void setFileHinhAnh(FormFile fileHinhAnh) {
		this.fileHinhAnh = fileHinhAnh;
	}
	public String getAnhDaiDien() {
		return anhDaiDien;
	}
	public void setAnhDaiDien(String anhDaiDien) {
		this.anhDaiDien = anhDaiDien;
	}
	
	
}
