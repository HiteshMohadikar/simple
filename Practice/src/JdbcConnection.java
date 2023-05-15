
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class JdbcConnection {
	public static Connection con = null;
	
	public Connection getConnection(Connection con) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user"  ,"root" , "root");
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return con;
	}
	
	public boolean getUserDetails(String userid , String password) {
		try {
			
			String querry = "SELECT * FROM user WHERE userid = ? AND password = ?";
			PreparedStatement ps = con.prepareStatement(querry );
			ps.setString(1, userid);
			ps.setString(2, password);
			System.out.println(ps);
			ResultSet rs = ps.executeQuery();
			System.out.println(rs);
			if(rs.next()) {
				rs.getString("userid");
				rs.getString("password");
				System.out.println(rs);
			}
			} catch (Exception e) {
			e.printStackTrace();
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		
		JdbcConnection jdbc = new JdbcConnection();
		jdbc.getConnection(con);
		
		
	}
}
