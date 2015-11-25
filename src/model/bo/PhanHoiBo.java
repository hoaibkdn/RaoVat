package model.bo;

import model.dao.PhanHoiDao;

public class PhanHoiBo 
{
	PhanHoiDao pHDao = new PhanHoiDao();
	
	//goi phan hoi
	public boolean instPhanHoi(String idBaiDang, String tenDangNhap, String noiDung)
	{
		return pHDao.insPhanHoi(idBaiDang, tenDangNhap, noiDung);
	}
	
	//get noi dung phan hoi
	public String getContentPH(String tenDangNhap)
	{
		return pHDao.getNoiDung(tenDangNhap);
	}
}
