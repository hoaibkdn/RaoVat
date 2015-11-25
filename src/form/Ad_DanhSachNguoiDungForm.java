package form;

import java.util.ArrayList;

import model.bean.NguoiDungBean;

import org.apache.struts.action.ActionForm;

public class Ad_DanhSachNguoiDungForm extends ActionForm
{
	ArrayList<NguoiDungBean> listNguoiDung;
	String tenDangNhap;
	private String matKhau;
	private String tenNguoiDung;
	private String email;
	private String soDienThoai;
	private String diaChi;
	private int phanQuyen;
	private String thoiGianDangNhapGanNhat;
	private String trangThai; //khoa, chua khoa
	private String gioiTinh;
	private String anhDaiDien;
	private String submit;
	private String timKiemText;
	
	
	public String getTimKiemText() {
		return timKiemText;
	}
	public void setTimKiemText(String timKiemText) {
		this.timKiemText = timKiemText;
	}
	public String getSubmit() {
		return submit;
	}
	public void setSubmit(String submit) {
		this.submit = submit;
	}
	public ArrayList<NguoiDungBean> getListNguoiDung() {
		return listNguoiDung;
	}
	public void setListNguoiDung(ArrayList<NguoiDungBean> listNguoiDung) {
		this.listNguoiDung = listNguoiDung;
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
	public String getTenNguoiDung() {
		return tenNguoiDung;
	}
	public void setTenNguoiDung(String tenNguoiDung) {
		this.tenNguoiDung = tenNguoiDung;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getPhanQuyen() {
		return phanQuyen;
	}
	public void setPhanQuyen(int phanQuyen) {
		this.phanQuyen = phanQuyen;
	}
	public String getThoiGianDangNhapGanNhat() {
		return thoiGianDangNhapGanNhat;
	}
	public void setThoiGianDangNhapGanNhat(String thoiGianDangNhapGanNhat) {
		this.thoiGianDangNhapGanNhat = thoiGianDangNhapGanNhat;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getAnhDaiDien() {
		return anhDaiDien;
	}
	public void setAnhDaiDien(String anhDaiDien) {
		this.anhDaiDien = anhDaiDien;
	}
	
	
}
