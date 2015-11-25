package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.BaiDangBean;

public class BaiDangDao {
	DataBase db = new DataBase();
	
	//Dang bai viet 
	public boolean dangBai(String idBaiDang, String tenDangNhap, String idDanhMuc, String tenBaiDang,
			String noiDung, String hinhAnh, String thoiGianDang, float gia, String idLoaiBaiDang, int trangThai,
			int luotLike, int luotView, String namSanXuat)
	{
		boolean temp = true;
		String sql = "insert into BAIDANG(idBaiDang, tenDangNhap, idDanhMuc, tenBaiDang, noiDung, " +
				"hinhAnh, thoiGianDang, gia, idLoaiBaiDang, trangThai, luotLike, luotView, namSanXuat) " 
				  +"values('"+idBaiDang+"','"+tenDangNhap+"', '"+idDanhMuc+"', '"+tenBaiDang+"','"+noiDung+"'," +
				  		"'"+hinhAnh+"','"+thoiGianDang+"',"+gia+",'"+idLoaiBaiDang+"',"+trangThai+"," +
				  				""+luotLike+","+luotView+","+namSanXuat+")";
		temp = db.updateData(sql);
		System.out.println(sql);
		return temp;
	}
	
	//get id tu dong trong bai viet
	public String getIdTuDongBaiViet() {
		IdProcess idProcess = new IdProcess();
		System.out.println("BD" + idProcess.getID("idBaiDang", "BaiDang"));
		return "BD" + idProcess.getID("idBaiDang", "BaiDang");
		
	}
	
	//get list tat ca ca bai dang theo Loai bai dang va Trang thai
	public ArrayList<BaiDangBean> getAllBaiDang(String idLoaiBaiDang, int trangThai)
	{
		db.openConnection();
		ArrayList<BaiDangBean> baiDangLst = new ArrayList<BaiDangBean>();
		BaiDangBean baiDang;
		String qr = "Select * from BAIDANG where idLoaiBaiDang = '"+idLoaiBaiDang+"' and trangThai = "+trangThai+"";
		System.out.println(qr);
		ResultSet rs = null;
		rs = db.getResultSet(qr);
		System.out.println(qr);
		try {
			while(rs.next())
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
				baiDangLst.add(baiDang);
				System.out.println("bai dang ban day: "+baiDang);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			db.closeConnection();
		}
		return baiDangLst;
	}
	
	//get Lich Su bai dang tu tenDangNhap
	public ArrayList<BaiDangBean> getLichSuDang(String tenDangNhap)
	{
		db.openConnection();
		ArrayList<BaiDangBean> lichSuDangLst = new ArrayList<BaiDangBean>();
		BaiDangBean baiDang = null;
		String qr = String.format("Select idBaiDang, tenBaiDang, thoiGianDang, trangThai, gia, idLoaiBaiDang from BAIDANG " +
				"where tenDangNhap = '%s' order by idBaiDang desc", tenDangNhap);
		System.out.println(qr);
		ResultSet rs = db.getResultSet(qr);
		try {
			while (rs.next())
			{
				baiDang = new BaiDangBean();
				baiDang.setIdBaiDang(rs.getNString("idBaiDang"));
				baiDang.setTenBaiDang(rs.getNString("tenBaiDang"));
				baiDang.setThoiGianDang(rs.getNString("thoiGianDang"));
				baiDang.setIdLoaiBaiDang(rs.getNString("idLoaiBaiDang"));
				baiDang.setGia(rs.getFloat("gia"));
				baiDang.setTrangThai(rs.getInt("trangThai"));
				lichSuDangLst.add(baiDang);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			db.closeConnection();
		}
		return lichSuDangLst;
	}
	
	//get list bai dang theo "tu khoa"
	public ArrayList<BaiDangBean> getBaiDangTimKiem(String tuKhoa, String idLoaiBaiDang)
	{
		db.openConnection();
		ArrayList<BaiDangBean> baiDangLst = new ArrayList<BaiDangBean>();
		BaiDangBean baiDang;
		String qr = "Select * from BAIDANG where idLoaiBaiDang = '"+idLoaiBaiDang+"' and " +
				"(tenBaiDang like '%"+tuKhoa+"%' or noiDung like '%"+tuKhoa+"%' or namSanXuat like '%"+tuKhoa+"%') ";
		ResultSet rs = null;
		rs = db.getResultSet(qr);
		System.out.println(qr);
		try {
			while(rs.next())
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
				baiDangLst.add(baiDang);
				System.out.println("bai dang ban day: "+baiDang);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			db.closeConnection();
		}
		return baiDangLst;
	}
	
	
	//duyet bai dang voi tu loai bai dang
	public boolean duyetBaiDang(String idBaiDang) {
		db.openConnection();
		String sql=String.format("UPDATE BAIDANG set trangThai = 1 where idBaiDang = '"+idBaiDang+"'");
		System.out.println(sql);
		return db.updateData(sql);
	}
	
	//xoa bai dang tu loai bai dang
	public boolean deletetBaiDangChuaDuyet(String idBaiDang) {
		db.openConnection();
		String sql=String.format("DELETE from BAIDANG where idBaiDang = '"+idBaiDang+"'");
		return db.updateData(sql);
		
	}
	
	//get danh sach bai dang va nguoi dang
	public ArrayList<BaiDangBean> getBaiDangAll()
	{
		BaiDangBean baiDang = null;
		ArrayList<BaiDangBean> bdLst = new ArrayList<BaiDangBean>();
		db.openConnection();
		String qr = "select tenBaiDang, noiDung, gia, thoiGianDang, namSanXuat, b.trangThai, n.tenNguoiDung " +
				"from BAIDANG b inner join NGUOIDUNG n " +
				"on b.tenDangNhap = n.tenDangNhap " +
				"order by idBaiDang desc";
		
		System.out.println(qr);
		ResultSet rs = db.getResultSet(qr);
		try {
			while(rs.next())
			{
				baiDang = new BaiDangBean();
				baiDang.setTenDangNhap(rs.getNString("tenNguoiDung"));
				baiDang.setTenBaiDang(rs.getNString("tenBaiDang"));
				baiDang.setNoiDung(rs.getNString("noiDung"));
				baiDang.setThoiGianDang(rs.getNString("thoiGianDang"));
				baiDang.setGia(rs.getFloat("gia"));
				baiDang.setNamSanXuat(rs.getNString("namSanXuat"));
				baiDang.setTrangThai(rs.getInt("trangThai"));
				bdLst.add(baiDang);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			db.closeConnection();
		}
		
		return bdLst;
	}
	
	//get bai dang theo gia
	public ArrayList<BaiDangBean> bdGiaLst(float giaThap, float giaCao)
	{
		ArrayList<BaiDangBean> bdLst = new ArrayList<BaiDangBean>();
		BaiDangBean baiDang = null;
		db.openConnection();
		String qr = String.format("Select * from  BAIDANG where gia >= %d and gia <= %d", giaThap, giaCao);
		ResultSet rs = db.getResultSet(qr);
		try {
			while(rs.next())
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
				bdLst.add(baiDang);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			db.closeConnection();
		}
		return bdLst;
	}
	
	//get bai dang theo ten
	public ArrayList<BaiDangBean> bdTenLst(String ten)
	{
		ArrayList<BaiDangBean> bdLst = new ArrayList<BaiDangBean>();
		BaiDangBean baiDang = null;
		db.openConnection();
		String qr = String.format("Select * from  BAIDANG where tenBaiDang like '%s'", ten);
		ResultSet rs = db.getResultSet(qr);
		try {
			while(rs.next())
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
				bdLst.add(baiDang);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			db.closeConnection();
		}
		return bdLst;
	}
	
	//get bai dang theo nam san xuat
	public ArrayList<BaiDangBean> bdNamLst(String namSanXuat)
	{
			ArrayList<BaiDangBean> bdLst = new ArrayList<BaiDangBean>();
			BaiDangBean baiDang = null;
			db.openConnection();
			String qr = String.format("Select * from  BAIDANG where namSanXuat like '%s'", namSanXuat);
			ResultSet rs = db.getResultSet(qr);
			try {
				while(rs.next())
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
					bdLst.add(baiDang);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally
			{
				db.closeConnection();
			}
			return bdLst;
	}
	
	//get bai dang theo danh muc
	public ArrayList<BaiDangBean> bdDanhMucLst(String idDanhMuc)
	{
		ArrayList<BaiDangBean> bdLst = new ArrayList<BaiDangBean>();
		BaiDangBean baiDang = null;
		db.openConnection();
		String qr = String.format("Select * from  BAIDANG where idDanhMuc like '%s'", idDanhMuc);
		ResultSet rs = db.getResultSet(qr);
		try {
			while(rs.next())
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
				bdLst.add(baiDang);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			db.closeConnection();
		}
		return bdLst;
	}
	
	//tim kiem bai dang theo "TUKHOA"
	public ArrayList<BaiDangBean> getTimKiemBd(String tuKhoa, String idLoaiBaiDang, int trangThai )
	{
		db.openConnection();
		ArrayList<BaiDangBean> timKiemLst = new ArrayList<BaiDangBean>();
		BaiDangBean baiDang = null;
		String qr = "Select * from BAIDANG where trangThai = "+trangThai+" and idLoaiBaiDang = '"+idLoaiBaiDang+"' " +
				"and (tenBaiDang like '%"+tuKhoa+"%' or namSanXuat like '%"+tuKhoa+"%'  " +
						"or thoiGianDang like '%"+tuKhoa+"%')";
		ResultSet rs = db.getResultSet(qr);
		try {
			while(rs.next())
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
				baiDang.setNamSanXuat(rs.getNString("namSanXuat"));
				timKiemLst.add(baiDang);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			db.closeConnection();
		}
		return timKiemLst;
	}
	
	//get ten bai dang tu idBaiDang
	public String getTenBaiDang(String idBaiDang)
	{
		String ten = null;
		db.openConnection();
		String qr = "Select tenBaiDang from BAIDANG where idBaiDang = '"+idBaiDang+"'";
		ResultSet rs = db.getResultSet(qr);
		try {
			if(rs.next())
			{
				ten = rs.getNString("tenBaiDang");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			db.closeConnection();
		}
		return ten;
	}
	
	//get bai dang theo idBaiDang
	public BaiDangBean getBaiDangFix(String idBaiDang)
	{
		BaiDangBean baiDang = new BaiDangBean();
		db.openConnection();
		String qr = String.format("Select * from BAIDANG where idBaiDang = '%s'", idBaiDang);
		ResultSet rs = db.getResultSet(qr);
		System.out.println(qr);
		try {
			if(rs.next())
			{
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
	
	//update bai dang
	public boolean updateFixed(String tenBaiDang, String idDanhMuc, String namSanXuat, 
			String hinhAnh, String noiDung, float gia)
	{
		
		String qr = "Update BAIDANG set tenBaiDang = '"+tenBaiDang+"', idDanhMuc = '"+idDanhMuc+"', " +
				"namSanXuat = '"+namSanXuat+"', hinhAnh = '"+hinhAnh+"', noiDung = '"+noiDung+"', gia = '"+gia+"'";
		System.out.println(qr);
		boolean fix = db.updateData(qr);
		return fix;
	}
}






















