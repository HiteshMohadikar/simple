package hitesh.mvc.service.simpleserviceimpl;

import java.sql.Connection;

import java.sql.SQLException;

import hitesh.mvc.connections.ConnectionProvider;
import hitesh.mvc.dao.SimpleDao;
import hitesh.mvc.dao.simpledaoimpl.SimpleDaoImpl;
import hitesh.mvc.modal.User;
import hitesh.mvc.service.SimpleService;

public class SimpleServiceImpl implements SimpleService {
	
	
	
	@Override
	public boolean checkUserCredencial(String userid , String password) throws SQLException {
		
		try {
			Connection con = null;
			
			con =ConnectionProvider.getConnection();
			SimpleDao dao = new SimpleDaoImpl(con);
			return dao.checkUserCredencial(userid, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	User user;
	@Override
	public User getUserDetails(String uid) {
		try {
			Connection con = null;
			
			con = ConnectionProvider.getConnection();
			SimpleDao dao = new SimpleDaoImpl(con);
			User user = dao.getUserDetails(uid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return user;
		
	}

}
