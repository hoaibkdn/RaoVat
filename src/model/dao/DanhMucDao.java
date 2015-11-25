package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.DanhMucBean;

public class DanhMucDao {
	DataBase db = new DataBase();
	
	//get id va ten danh muc
	public ArrayList<DanhMucBean> getDanhMuc()
	{
		db.openConnection();
		ArrayList<DanhMucBean> danhMucLst = new ArrayList<DanhMucBean>();
		DanhMucBean danhMuc;
		String qr = "Select * from DANHMUC";
		System.out.println(qr);
		ResultSet rs = null;
		rs = db.getResultSet(qr);
		try {
			while(rs.next())
			{
				danhMuc = new DanhMucBean();
				danhMuc.setIdDanhMuc(rs.getString("idDanhMuc"));
				danhMuc.setTenDanhMuc(rs.getNString("tenDanhMuc"));
				danhMucLst.add(danhMuc);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			db.closeConnection();
		}
		return danhMucLst;
	}
}
