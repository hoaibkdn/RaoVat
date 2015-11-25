package model.bo;

import java.util.ArrayList;

import model.bean.DanhMucBean;
import model.dao.DanhMucDao;

public class DanhMucBo {
	DanhMucDao dmDao = new DanhMucDao();
	//get danh muc
	public ArrayList<DanhMucBean> getDanhMucLst()
	{
		return dmDao.getDanhMuc();
	}
}
