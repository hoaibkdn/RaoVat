package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PhanHoiDao 
{
	DataBase db = new DataBase();
	
	//goi phan hoi khi duyet bai, xoa bai
	public boolean insPhanHoi(String idBaiDang, String tenDangNhap, String noiDung)
	{
		
		String qr = String.format("insert into PHANHOI values('%s','%s','%s') ", idBaiDang, tenDangNhap, noiDung);
		boolean ins = db.updateData(qr);
		return ins;
	}
	
	//get noi dung phan hoi tu ten dang nhap
	public String getNoiDung(String tenDangNhap)
	{
		String noiDung = null;
		db.openConnection();
		String qr = "Select noiDung from PHANHOI where tenDangNhap = '"+tenDangNhap+"'";
		System.out.println(qr);
		ResultSet rs = db.getResultSet(qr);
		try {
			if(rs.next())
			{
				noiDung = rs.getNString("noiDung");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			db.closeConnection();
		}
		return noiDung;
	}
}
