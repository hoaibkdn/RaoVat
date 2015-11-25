package form;

import java.util.ArrayList;

import model.bean.BaiDangBean;
import model.bean.DanhMucBean;
import net.sourceforge.jtds.jdbc.DateTime;

import org.apache.struts.action.ActionForm;

public class DanhSachBaiDangBanForm extends ActionForm{
	private String idBaiDang;
	private String tenBaiDang;
	private String tenNguoiDang;
	private String idDanhMuc;
	private String danhMuc;
	private String tenDanhMuc;
	private String noiDung;
	private String hinhAnh;
	private String thoiGianDang;
	private float gia;
	private int trangThai;
	private int luotLike;
	private int luotView;
	private int luotNhanXet;
	private int xemThem = 1;
	private ArrayList<BaiDangBean> baiDangBanLst;
	private BaiDangBean dangBanChiTiet;
	private String loaiBaiDang;
	private String tenSanPham;
	private ArrayList<DanhMucBean> dmLst;
	private String giaThap;
	private String giaCao;
	private String submit;
	private String tatCa;
	private String namSanXuat;
	private String noiDungPhanHoi;
	private String noiDungPH;
	
	public String getNoiDungPH() {
		return noiDungPH;
	}
	public void setNoiDungPH(String noiDungPH) {
		this.noiDungPH = noiDungPH;
	}
	public String getNoiDungPhanHoi() {
		return noiDungPhanHoi;
	}
	public void setNoiDungPhanHoi(String noiDungPhanHoi) {
		this.noiDungPhanHoi = noiDungPhanHoi;
	}
	public String getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(String namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	public String getTatCa() {
		return tatCa;
	}
	public void setTatCa(String tatCa) {
		this.tatCa = tatCa;
	}
	public String getLoaiBaiDang() {
		return loaiBaiDang;
	}
	public void setLoaiBaiDang(String loaiBaiDang) {
		this.loaiBaiDang = loaiBaiDang;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public ArrayList<DanhMucBean> getDmLst() {
		return dmLst;
	}
	public void setDmLst(ArrayList<DanhMucBean> dmLst) {
		this.dmLst = dmLst;
	}
	public String getGiaThap() {
		return giaThap;
	}
	public void setGiaThap(String giaThap) {
		this.giaThap = giaThap;
	}
	public String getGiaCao() {
		return giaCao;
	}
	public void setGiaCao(String giaCao) {
		this.giaCao = giaCao;
	}
	public String getSubmit() {
		return submit;
	}
	public void setSubmit(String submit) {
		this.submit = submit;
	}
	public int getLuotNhanXet() {
		return luotNhanXet;
	}
	public void setLuotNhanXet(int luotNhanXet) {
		this.luotNhanXet = luotNhanXet;
	}
	public BaiDangBean getDangBanChiTiet() {
		return dangBanChiTiet;
	}
	public void setDangBanChiTiet(BaiDangBean dangBanChiTiet) {
		this.dangBanChiTiet = dangBanChiTiet;
	}
	public int getXemThem() {
		return xemThem;
	}
	public void setXemThem(int xemThem) {
		this.xemThem = xemThem;
	}
	public ArrayList<BaiDangBean> getBaiDangBanLst() {
		return baiDangBanLst;
	}
	public void setBaiDangBanLst(ArrayList<BaiDangBean> baiDangBanLst) {
		this.baiDangBanLst = baiDangBanLst;
	}
	public String getIdBaiDang() {
		return idBaiDang;
	}
	public void setIdBaiDang(String idBaiDang) {
		this.idBaiDang = idBaiDang;
	}
	public String getTenBaiDang() {
		return tenBaiDang;
	}
	public void setTenBaiDang(String tenBaiDang) {
		this.tenBaiDang = tenBaiDang;
	}
	public String getTenNguoiDang() {
		return tenNguoiDang;
	}
	public void setTenNguoiDang(String tenNguoiDang) {
		this.tenNguoiDang = tenNguoiDang;
	}
	public String getIdDanhMuc() {
		return idDanhMuc;
	}
	public void setIdDanhMuc(String idDanhMuc) {
		this.idDanhMuc = idDanhMuc;
	}
	public String getDanhMuc() {
		return danhMuc;
	}
	public void setDanhMuc(String danhMuc) {
		this.danhMuc = danhMuc;
	}
	public String getTenDanhMuc() {
		return tenDanhMuc;
	}
	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
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
	public String getThoiGianDang() {
		return thoiGianDang;
	}
	public void setThoiGianDang(String thoiGianDang) {
		this.thoiGianDang = thoiGianDang;
	}
	public float getGia() {
		return gia;
	}
	public void setGia(float gia) {
		this.gia = gia;
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
	
}
