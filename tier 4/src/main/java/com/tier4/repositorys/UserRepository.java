package com.tier4.repositorys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

import com.tier4.interfaces.CrudRepository;
import com.tier4.objects.User;
import com.tier4.vary.Role;
import com.tier4.connection.ConnectionUtil;


public class UserRepository implements CrudRepository<User>{

	public User save(User user) {
		try(Connection connection = ConnectionUtil.getConnection()) {
			String sql = "INSERT INTO APP_USER (user_id, first_name, last_name, username, password, role_id) " +
					" VALUES (?, ?, ?, ?, ?, ?) RETURNING *";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setInt(1, user.getId());
			statement.setString(2, user.getFirstName());
			statement.setString(3, user.getLastName());
			statement.setString(4, user.getUsername());
			statement.setString(5, user.getPassword());
			statement.setInt(6, user.getRoleId());
			
			ResultSet result = statement.executeQuery();
			
			if(result.next()) {
				int id = result.getInt("user_id");
				String firstName= result.getString("first_name");
				String lastName = result.getString("last_name");
				String username = result.getString("username");
				String password = result.getString("password");
				int roleId = result.getInt("role_id");
				return new User(id, firstName, lastName, username, password, roleId);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	
	}

	public Set<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public User findById(Integer id) {
		try(Connection connection = ConnectionUtil.getConnection()) {
			String sql = "SELECT user_id, first_name, last_name, username, password, USER_ROLE.name FROM APP_USER " +
					"LEFT JOIN USER_ROLE ON USER_ROLE.role_id = APP_USER.role_id " +
					"WHERE user_id = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setInt(1, id);
			
			ResultSet result = statement.executeQuery();
			
			if(result.next()) {
				id = result.getInt("user_id");
				String firstName= result.getString("first_name");
				String lastName = result.getString("last_name");
				String username = result.getString("username");
				String password = result.getString("password");
				Role role = Role.valueOf(result.getString("name"));
				return new User(id, firstName, lastName, username, password, role);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;	
	}

	public boolean update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public User findUserByUsername(String username)
	{
		return null;
	}
	
	public User findUserByCredentials(String username, String pw)
	{
		return null;
	}

}
