package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.NguoiDungBean;

public class NguoiDungDao {
	DataBase db = new DataBase();
	
	//Kiem tra thong tin nguoi dung dang nhap 
	public boolean isTaiKhoan(String tenDangNhap, String matKhau)
	{
		boolean check = true;
		db.openConnection();
		String qr = String.format("Select tenDangNhap, matKhau from NGUOIDUNG " +
				"where tenDangNhap = '%s' and matKhau = '%s'", tenDangNhap, matKhau);
		System.out.println(qr);
		ResultSet rs = null;
		try {
			rs = db.getResultSet(qr);
			if(rs.next())
			{
				check = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			db.closeConnection();
		}
		return check;
	}
	
	//get mat khau tu tenDangNhap
	public String getMK(String tenDangNhap)
	{
		db.openConnection();
		String matKhau = null;
		String qr = String.format("select matKhau from NGUOIDUNG where tenDangNhap ='%s'", tenDangNhap);
		System.out.println(qr);
		ResultSet rs = null;
		try {
			rs = db.getResultSet(qr);
			if(rs.next())
			{
				matKhau = rs.getString("matKhau");
			}
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			db.closeConnection();
		}
		return matKhau;
	}
	
	//get ten nguoi dung tu ten đăng nhập
	public String getTenNguoiDung(String tenDangNhap)
	{
		String tenNguoiDung = null;
		db.openConnection();
		String qr = String.format(" select tenNguoiDung from NGUOIDUNG"
				 +" where tenDangNhap = '%s'", tenDangNhap);
		ResultSet rs = null;
		rs = db.getResultSet(qr);
		try {
			if(rs.next())
			{
				tenNguoiDung = rs.getNString("tenNguoiDung");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			db.closeConnection();
		}	
		return tenNguoiDung;
	}
	
	//kiem tra chua dang nhap
	public boolean isDangNhap(String tenDangNhap)
	{
		db.openConnection();
		String qr = String.format("select * from NGUOIDUNG where tenDangNhap = '%s' ", tenDangNhap);
		
		return true;
	}
	
	public ArrayList<NguoiDungBean> getListNguoiDung() {
		db.openConnection();
		String qr = "SELECT tenDangNhap,tenNguoiDung,email,trangThai,soDienThoai,diaChi,thoiGianDangNhapGanNhat,phanQuyen FROM NGUOIDUNG ";
		System.out.println(qr);
		ArrayList<NguoiDungBean> listNguoiDung = new ArrayList<NguoiDungBean>();
		NguoiDungBean nd = null;
		ResultSet rs = db.getResultSet(qr);;
		try{

			while(rs.next())
			{
				nd=new NguoiDungBean();
				nd.setTenDangNhap(rs.getNString("tenDangNhap"));
				nd.setTenNguoiDung(rs.getNString("tenNguoiDung"));
				nd.setEmail(rs.getNString("email"));
				nd.setSoDienThoai(rs.getNString("soDienThoai"));
				nd.setDiaChi(rs.getNString("diaChi"));
				nd.setTrangThai(rs.getNString("trangThai"));
				nd.setPhanQuyen(rs.getInt("phanQuyen"));
				nd.setThoiGianDangNhapGanNhat(rs.getNString("thoigianDangNhapGanNhat"));
				listNguoiDung.add(nd);
				System.out.println("nguoi dung"+nd);
			}
		}
		catch(Exception e){
			
		}
			db.closeConnection();
		return listNguoiDung;
	}

	public boolean deleteNguoiDung(String tenDangNhap) {
		db.openConnection();
		String sql=String.format("DELETE from NGUOIDUNG where tenDangNhap = '"+tenDangNhap+"'");
		return db.updateData(sql);
	}

	public boolean khoaNguoiDung(String tenDangNhap) {
		db.openConnection();
		String sql=String.format("UPDATE NGUOIDUNG set trangThai='block' where tenDangNhap = '"+tenDangNhap+"'");
		return db.updateData(sql);
	}

	public NguoiDungBean getThongTin(String tenDangNhap) {
		db.openConnection();
		
		NguoiDungBean nd = null;
		String qr = "Select tenDangNhap,tenNguoiDung,email,soDienThoai,diaChi,thoiGianDangNhapGanNhat from NGUOIDUNG where tenDangNhap = '"+tenDangNhap+"'";
		//System.out.println(qr);
		ResultSet rs = null;
		
		try {
			rs = db.getResultSet(qr);
			while(rs.next())
			{
				nd=new NguoiDungBean();
				nd.setTenDangNhap(rs.getString("tenDangNhap"));
				nd.setTenNguoiDung(rs.getString("tenNguoiDung"));
				nd.setEmail(rs.getString("email"));
				nd.setSoDienThoai(rs.getString("soDienThoai"));
				nd.setDiaChi(rs.getString("diaChi"));
				nd.setThoiGianDangNhapGanNhat(rs.getString("thoigianDangNhapGanNhat"));
				System.out.println(rs.getString("tenDangNhap")+"------------------------");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			db.closeConnection();
		}
		return nd;
	}
	
	//get trang thai cua nguoi dung
	public String getTrangThai(String tenDangNhap)
	{
		String trangThai = null;
		db.openConnection();
		String qr = String.format("select trangThai from NGUOIDUNG where tenDangNhap = '%s'", tenDangNhap);
		System.out.println(qr);
		ResultSet rs = db.getResultSet(qr);
		try {
			if(rs.next())
			{
				trangThai = rs.getNString("trangThai");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			db.closeConnection();
		}
		return trangThai;
	}
	
	//get nguoi dung voi "tu khoa"
	public ArrayList<NguoiDungBean> getSearch(String tuKhoa)
	{
		ArrayList<NguoiDungBean> ndLst = new ArrayList<NguoiDungBean>();
		NguoiDungBean nd = null;
		db.openConnection();
		String qr = "Select * from NGUOIDUNG where tenDangNhap like '%"+tuKhoa+"%' " +
				"or tenNguoiDung like '%"+tuKhoa+"%' or email like '%"+tuKhoa+"%' or soDienThoai like '%"+tuKhoa+"%' " +
				"or diaChi like '%"+tuKhoa+"%' or thoiGianDangNhapGanNhat like '%"+tuKhoa+"%' or gioiTinh like '%"+tuKhoa+"%'";
		ResultSet rs = db.getResultSet(qr);
		try {
			while(rs.next())
			{
				nd = new NguoiDungBean();
				nd.setTenDangNhap(rs.getNString("tenDangNhap"));
				nd.setTenNguoiDung(rs.getNString("tenNguoiDung"));
				nd.setEmail(rs.getNString("email"));
				nd.setSoDienThoai(rs.getNString("soDienThoai"));
				nd.setDiaChi(rs.getNString("diaChi"));
				nd.setTrangThai(rs.getNString("trangThai"));
				nd.setPhanQuyen(rs.getInt("phanQuyen"));
				nd.setThoiGianDangNhapGanNhat(rs.getNString("thoigianDangNhapGanNhat"));
				ndLst.add(nd);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ndLst;
	}
}
