package com.revature.RevAsset;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String role;
	
	public void setUserId(int id) {
		this.id = id;
	}
	
	public int getUserId () {
		return id;
	}
	
	public void setFirstName (String first) {
		this.firstName = first;
	}
	
	public String getFirstName () {
		return firstName;
	}
	
	public void setLastName (String last) {
		this.lastName = last;
	}
	
	public String getLastName () {
		return lastName;
	}
	
	public void setUserName (String u) {
		this.username = u;
	}
	
	public String getUserName () {
		return username;
	}
	
	public void setPassword (String p) {
		this.password = p;
	}
	
	public String getPassword () {
		return password;
	}
	
	public void setRole (String r) {
		this.role = r;
	}
	
	public String getRole () {
		return role;
	}
	
	public User () {
		super ();
	}
	
	public User (int id, String first, String last, String u, String p, String r) {
		super ();
		this.id = id;
		this.firstName = first;
		this.lastName = last;
		this.username = u;
		this.password = p;
		this.role = r;
	}
	
	public void UserOutput () {
		System.out.println("first Name: " + firstName +'\n'+
							"last Name: " + lastName +'\n'+
							"role: " + role);
	}
}
