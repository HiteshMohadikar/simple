package hitesh.mvc.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import hitesh.mvc.helper.Constants;

public class ConnectionProvider {
	static Connection con = null ;
	public static Connection getConnection() throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(Constants.sqlurl,Constants.sqlid, Constants.sqlpass);
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
	
}
