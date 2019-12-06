package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAOUsersImpl implements DAOUsers {

	final String driver =  "com.mysql.cj.jdbc.Driver";
	final String url = "jdbc:mysql://localhost:3306/classicmodels?serverTimezone=UTC";
	final String userdb = "root";
	final String pwd = "admin";
	List <Users> listall;
	Connection conn;
	String sql;
	PreparedStatement pstmt;
	ResultSet rs;
	Users user;

	@Override
	public Users getUser(int id) throws SQLException {

		user = null;
		// ora metto in conn il metodo x connettermi a db, se ritrona null esce se no fa l'if
		conn = ConnessioneDB.openConnect(driver, url, userdb, pwd);
		if(conn != null) {
			sql= "Select * From users where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();

			if(!rs.isBeforeFirst()) System.out.println("attualmente non sono presenti dati per l'id specificato!");
			else {
				while(rs.next()) {
					user = new Users();
					user.setId(rs.getInt("id"));
					user.setNome(rs.getString("name"));
					user.setAddress(rs.getString("address"));
					user.setEmail(rs.getString("email"));
					user.setPhone(rs.getString("phone"));
				}
			}
		}
		return user;
	}

	@Override
	public List <Users> getAllUsers() throws SQLException {
		listall = new ArrayList<>();

		conn = ConnessioneDB.openConnect(driver, url, userdb, pwd);
		if(conn != null) {
			sql= "Select * From users";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			if(!rs.isBeforeFirst()) System.out.println("attualmente non sono presenti dati per l'id specificato!");
			else {
				while(rs.next()) {
					user = new Users();
					user.setId(rs.getInt("id"));
					user.setNome(rs.getString("name"));
					user.setAddress(rs.getString("address"));
					user.setEmail(rs.getString("email"));
					user.setPhone(rs.getString("phone"));
					listall.add(user);
				}

			}
		}
		return listall;
	}

	@Override
	public void addUser(Users user) throws SQLException {

		if (user != null) {
			conn = ConnessioneDB.openConnect(driver, url, userdb, pwd);
			if(conn != null) {
				sql= "Insert into users(id, nome, address, email, phone) values(?,?,?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, user.getId());
				pstmt.setString(2, user.getNome());
				pstmt.setString(3, user.getAddress());
				pstmt.setString(4, user.getEmail());
				pstmt.setString(5, user.getPhone());
				pstmt.executeUpdate();
				System.out.println("*** inserimento avvenuto correttamente ***");
			}
		}else {
			System.out.println("nessun riferimento è stato passato per elaborare dati");
		}
	}
	@Override
	public void updateUser(Users user) throws SQLException {

		if (user != null) {
			conn = ConnessioneDB.openConnect(driver, url, userdb, pwd);
			if(conn != null) {
				sql= "Update users Set name = ?, address = ?, email = ?, phone = ? where id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, user.getNome());
				pstmt.setString(2, user.getAddress());
				pstmt.setString(3, user.getEmail());
				pstmt.setString(4, user.getPhone());
				pstmt.setInt(5, user.getId());
				pstmt.executeUpdate();
				System.out.println("*** aggiornamento avvenuto correttamente ***");
			}
		}else {
			System.out.println("nessun riferimento è stato passato per la variazione dei dati");
		}

	}

	@Override
	public void deleteUser(int id) throws SQLException {

		user = null;
		conn = ConnessioneDB.openConnect(driver, url, userdb, pwd);
		
		if (conn != null) {
			sql= "Delete from users Where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			
			System.out.println("*** cancellazione avvenuto correttamente ***");
		} else {
			System.out.println("nessun riferimento è stato passato per la cancellazione dei dati");
		}
	}

	public boolean checkUserId (int id) throws SQLException {

		conn = ConnessioneDB.openConnect(driver, url, userdb, pwd);

			sql= "Select id From users where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeQuery();
			rs=pstmt.executeQuery();
		return rs.isBeforeFirst();
}
}
