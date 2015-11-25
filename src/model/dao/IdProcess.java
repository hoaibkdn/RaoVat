package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class IdProcess{

	DataBase db = new DataBase();
	
	//xu ly cat 3 so cuoi cua ID o vi tri cuoi cung trong Bang
	public int getID(String id, String tenBang){
		//String idProcess = null;
		int idInt = 0;
		db.openConnection();
		//cat so tu id
		String qr = "SELECT MAX(cast(SUBSTRING("+id+",3,3)as int)) as iD "
				+ "FROM  "+tenBang+" ";
		
		ResultSet rs = db.getResultSet(qr);
		try {
			if(rs.next()){
				idInt = rs.getInt("iD");
				//System.out.println("cat chuoi: "+idInt);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			db.openConnection();
		}
		return idInt+1;
	}
}
