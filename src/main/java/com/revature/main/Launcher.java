package com.revature.main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.utils.Computation;
public class Launcher {

	public static void main(String[] args) {
		//2
		Computation.powerOfLength(1);
		//3
		System.out.println("Sum of the result of the individual integers raised to the "
				+ "power of the length equal to "
				+ "original passed number is?: " + Computation.powerOfLength(1));
		try(Connection connection = com.revature.utils.ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM bank_accounts";
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

	}

}
