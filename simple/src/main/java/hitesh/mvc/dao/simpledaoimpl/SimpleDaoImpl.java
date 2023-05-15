package hitesh.mvc.dao.simpledaoimpl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import hitesh.mvc.connections.JdbcBaseDao;
import hitesh.mvc.dao.SimpleDao;
import hitesh.mvc.modal.User;

public class SimpleDaoImpl extends JdbcBaseDao implements SimpleDao {
	
	public SimpleDaoImpl(Connection con) {
		this.con = con;
	}
	
	
	
	User user = new User();
	@Override
	public boolean checkUserCredencial(String userid , String password) throws SQLException{
		
		String sqlQuery = "SELECT name FROM user  WHERE userid = ? AND password = ? ";
		try {
			PreparedStatement ps = con.prepareStatement(sqlQuery);
			ps.setString(1, userid);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public User getUserDetails(String uid) throws SQLException {
		try {
			String querry = "SELECT uid , name FROM user WHERE uid = ?";
			PreparedStatement ps = con.prepareStatement(querry);
			ps.setString(1, uid);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				user.setUid(rs.getInt(1));
				user.setName(rs.getString("name"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return user;
		
	}
	
}
