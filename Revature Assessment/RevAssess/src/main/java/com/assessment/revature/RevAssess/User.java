package com.assessment.revature.RevAssess;

public class User {
	private static int id;
	private static String firstName;
	private static String lastName;
	private static String username;
	private static String password;
	private static String role;
	
	
	
	/*
	 * public User(int id, String firstName, String lastName, String username,
	 * String password, String role) { id = 4; firstName = "Esu"; lastName = "Obu";
	 * username = "eobu"; password = "eobu111"; role = "programmer";
	 * 
	 * }
	 */
	 
	//Constructor for User object (letter b requirement)
	public User(int id, String firstName, String lastName, String username,  String password, String role) {
		System.out.println("Full name: " + firstName + " " + lastName + " ,id: " + id + " ,username: " + username + " ,password: " + password + " ,role: " + role);
	}
	
	

	public static int getId() {
		return id;
	}


	public static void setId(int id) {
		User.id = id;
	}


	public static String getFirstName() {
		return firstName;
	}


	public static void setFirstName(String firstName) {
		User.firstName = firstName;
	}


	public static String getLastName() {
		return lastName;
	}


	public static void setLastName(String lastName) {
		User.lastName = lastName;
	}


	public static String getUsername() {
		return username;
	}


	public static void setUsername(String username) {
		User.username = username;
	}


	public static String getPassword() {
		return password;
	}


	public static void setPassword(String password) {
		User.password = password;
	}


	public static String getRole() {
		return role;
	}


	public static void setRole(String role) {
		User.role = role;
	}


	

}
