package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

import com.revature.models.User;

public class UserRepository<T> implements CrudRepository<T> {

	@Override
	public T save(T t) {//actually should return a user
		User newUser = new User();
		try(Connection connection = com.revature.utils.ConnectionUtil.getConnection()){
			String sql = "INSERT INTO public.user_role " + 
					" (name)" + 
					" VALUES('sweetguy');"
;
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("Bank account name is " + rs.getString("bank_account_name") + " gil balance is: " + rs.getInt("gil_balance"));
			}
					
					
					
					System.out.println();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return t;
	}

	@Override
	public Set<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(T t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteById(T t) {
		// TODO Auto-generated method stub
		return false;
	}

}
