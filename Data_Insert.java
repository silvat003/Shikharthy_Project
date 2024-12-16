package javafiles;

import java.sql.Connection;
import java.sql.PreparedStatement;

import VO.ResultVO;
import VO.UserVO;
import dbconnection.DBconnect;

public class Data_Insert {
	
	public Connection con = null;
	public PreparedStatement ps = null;
	ResultVO rvo=new ResultVO();
	
	public ResultVO dataInsert(UserVO uvo) {
		try {
//			Take User Input
			String fname=uvo.getFname();
			String lname=uvo.getLname();
			String email=uvo.getEmail();
			String password=uvo.getPassword();
			
//			DB COnnection Test
			DBconnect dc = new DBconnect();
			con = dc.dbConnect();
			
//			SQL Query 
			String insertQuery = "INSERT INTO mytable VALUES(DEFAULT, ?, ?, ?, ?)";
			ps = con.prepareStatement(insertQuery);
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, email);
			ps.setString(4, password);
			
//			CHeck the status of the transaction
			int i = ps.executeUpdate();
			System.out.println(ps);
			
			if (i>0) {
				System.out.println("Inserted");
			} else {
				System.out.println("Failed");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return rvo;

	}
}
