package jdbc;

import java.sql.SQLException;
import java.util.List;

public interface DAOUsers {
	
	Users getUser(int id) throws SQLException;
	List<Users> getAllUsers() throws SQLException;
	void addUser(Users user) throws SQLException;
	void updateUser(Users user) throws SQLException;
	void deleteUser(int id) throws SQLException;

}
