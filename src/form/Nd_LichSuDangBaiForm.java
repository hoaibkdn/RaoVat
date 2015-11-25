package form;

import java.util.ArrayList;

import model.bean.BaiDangBean;

import org.apache.struts.action.ActionForm;

public class Nd_LichSuDangBaiForm extends ActionForm{

	private String trangThai;
	private String loai;
	private String idBaiDang;
	private String tenBaiDang;
	private ArrayList<BaiDangBean> lichSuDang;
	private String submit;
	private String btnSua;
	private String btnXoa;
	
	
	public String getBtnSua() {
		return btnSua;
	}
	public void setBtnSua(String btnSua) {
		this.btnSua = btnSua;
	}
	public String getBtnXoa() {
		return btnXoa;
	}
	public void setBtnXoa(String btnXoa) {
		this.btnXoa = btnXoa;
	}
	public String getSubmit() {
		return submit;
	}
	public void setSubmit(String submit) {
		this.submit = submit;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public String getLoai() {
		return loai;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
	public ArrayList<BaiDangBean> getLichSuDang() {
		return lichSuDang;
	}
	public void setLichSuDang(ArrayList<BaiDangBean> lichSuDang) {
		this.lichSuDang = lichSuDang;
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
	
	
}
