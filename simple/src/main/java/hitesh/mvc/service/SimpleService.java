package hitesh.mvc.service;

import java.sql.SQLException;

import hitesh.mvc.modal.User;

public interface SimpleService {

	boolean checkUserCredencial(String userid, String password) throws SQLException;

	User getUserDetails(String uid);

}
