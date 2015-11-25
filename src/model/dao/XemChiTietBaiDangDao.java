package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.bean.BaiDangBean;

public class XemChiTietBaiDangDao {

	DataBase db = new DataBase();
	
	//get bai dang tu idBaiDang
	public BaiDangBean getBaiDang(String idBaiDang)
	{
		BaiDangBean baiDang = null;
		db.openConnection();
		String qr = String.format("Select * from BAIDANG where idBaiDang = '%s'", idBaiDang);
		ResultSet rs =  db.getResultSet(qr);
		try {
			if(rs.next())
			{
				baiDang = new BaiDangBean();
				baiDang.setIdBaiDang(rs.getNString("idBaiDang"));
				baiDang.setTenDangNhap(rs.getNString("tenDangNhap"));
				baiDang.setIdDanhMuc(rs.getNString("idDanhMuc"));
				baiDang.setTenBaiDang(rs.getNString("tenBaiDang"));
				baiDang.setNoiDung(rs.getNString("noiDung"));
				baiDang.setHinhAnh(rs.getNString("hinhAnh"));
				baiDang.setThoiGianDang(rs.getNString("thoiGianDang"));
				baiDang.setGia(rs.getFloat("gia"));
				baiDang.setIdLoaiBaiDang(rs.getNString("idLoaiBaiDang"));
				baiDang.setTrangThai(rs.getInt("trangThai"));
				baiDang.setLuotLike(rs.getInt("luotLike"));
				baiDang.setLuotView(rs.getInt("luotView"));
				baiDang.setNamSanXuat(rs.getNString("namSanXuat"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			db.closeConnection();
		}
		return baiDang;
	}
	
	//tang luot xem
	public boolean TangLuotXem(String idBaiViet) {
		int luotXem = layLuotXem(idBaiViet);
		luotXem++;
		String sql = String.format(
				"update BaiViet set LuotXem='%d' where idBaiViet='%s'",
				luotXem, idBaiViet);
		System.out.println(sql);
		return db.updateData(sql);
	}
	
	//lay luot xem 
	private int layLuotXem(String idBaiDang) {
		db.openConnection();
		
		// lay so luot xem bai viet
		int luotXem = 0;
		String lSql = String.format(
				"select luotView from BAIDANG where idBaiDang='%s'", idBaiDang);
		System.out.println(lSql);
		ResultSet rs = db.getResultSet(lSql);
		try {
			if (rs.next()) {
				try {
					luotXem = rs.getInt("LuotXem");
				} catch (NullPointerException e) {
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			db.closeConnection();
		}
		return luotXem;
	}

}
