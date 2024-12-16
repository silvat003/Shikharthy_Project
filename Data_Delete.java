package javafiles;

import java.sql.Connection;
import java.sql.PreparedStatement;

import VO.ResultVO;
import VO.UserVO;
import dbconnection.DBconnect;

public class Data_Delete {
	
	public Connection con = null;
	public PreparedStatement ps = null;
	ResultVO rvo=new ResultVO();
	
	public ResultVO datadelete(UserVO uvo)
	{
		try {
			
			String email=uvo.getEmail();
			DBconnect dc = new DBconnect();
			con = dc.dbConnect();
			
//			SQL Query 
			String deleteQuery = "DELETE FROM mytable WHERE email=?";
			ps = con.prepareStatement(deleteQuery);
			ps.setString(1, email);
			
			
//			CHeck the status of the transaction
			int i = ps.executeUpdate();
			System.out.println(ps);
			
			if (i>0) {
				System.out.println("Deleted");
			} else {
				System.out.println("Failed");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rvo;
		
	}
	

}
