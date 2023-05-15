package hitesh.mvc.dao;

import java.sql.SQLException;

import hitesh.mvc.modal.User;

public interface SimpleDao {

	boolean checkUserCredencial(String userid, String password) throws SQLException;

	User getUserDetails(String uid) throws SQLException;

	

}
