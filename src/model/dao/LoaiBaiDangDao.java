package model.dao;

import java.util.ArrayList;

import model.bean.LoaiBaiDangBean;

public class LoaiBaiDangDao {

	DataBase db = new DataBase();
	
	//get list loai bai dang
	public ArrayList<LoaiBaiDangBean> getLoaiBaiDang()
	{
		ArrayList<LoaiBaiDangBean> loaiBaiDangLst = new ArrayList<LoaiBaiDangBean>();
		return loaiBaiDangLst;
	}
}
