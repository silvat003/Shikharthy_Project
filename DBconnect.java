package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {

		// TODO Auto-generated method stub
public Connection con = null;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBconnect dc = new DBconnect();
		dc.dbConnect();
	}
	
	public Connection dbConnect() {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
			
			System.out.println("Connection Successful");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return con;
	}
		
}


