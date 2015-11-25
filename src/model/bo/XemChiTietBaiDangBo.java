package model.bo;

import model.bean.BaiDangBean;
import model.dao.XemChiTietBaiDangDao;

public class XemChiTietBaiDangBo {

	XemChiTietBaiDangDao chiTietDao = new XemChiTietBaiDangDao();
	
	//get bai dang ban tu idBaiDang
	public BaiDangBean getBaiDang(String idBaiDang)
	{
		return chiTietDao.getBaiDang(idBaiDang);
	}
	
	//tang luot View
	public boolean tangLuotView(String idBaiDang)
	{
		return chiTietDao.TangLuotXem(idBaiDang);
	}
}
