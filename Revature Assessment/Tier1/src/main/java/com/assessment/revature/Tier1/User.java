package com.assessment.revature.Tier1;

public class User {

	private  int id;
	private  String firstName;
	private  String lastName;
	private  String username;
	private  String password;
	private  String role;
	
	
	public User(int id, String firstName, String lastName, String username,  String password, String role) {
		System.out.println("Full name: " + firstName + " " + lastName + " ,id: " + id + " ,username: " + username + " ,password: " + password + " ,role: " + role);
	}
	
	

	public  int getId() {
		return id;
	}


	public  void setId(int id) {
		this.id = id;
	}


	public  String getFirstName() {
		return firstName;
	}


	public  void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public  String getLastName() {
		return lastName;
	}


	public  void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public  String getUsername() {
		return username;
	}


	public  void setUsername(String username) {
		this.username = username;
	}


	public  String getPassword() {
		return password;
	}
	
	public  void setRole(String role) {
		this.role = role;
	}


	public  String getRole() {
		return role;
	}
	
	
}
