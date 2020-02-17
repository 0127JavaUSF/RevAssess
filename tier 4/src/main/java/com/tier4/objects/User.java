package com.tier4.objects;

import com.tier4.vary.Role;

public class User {

	int id;
	String firstName, lastName, username, password;
	Role role;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	
	public int getRoleId()
	{
		if (role.toString().equals("ADMIN"))
		{
			return 1;
		}
		else if (role.toString().equals("DEV"))
		{
			return 2;
		}
		else if (role.toString().equals("BASIC_USER"))
		{
			return 3;
		}
		else if (role.toString().equals("PREMIUM_USER"))
		{
			return 4;
		}
		else if (role.toString().equals("LOCKED"))
		{
			return 5;
		}
		else
			return 0;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (role != other.role)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	public User(int id, String firstName, String lastName, String username, String password, Role role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	public User(int id, String firstName, String lastName, String username, String password, int role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		
		if (role == 1)
		{
			this.role = Role.valueOf("ADMIN");
		}
		else if (role == 2)
		{
			this.role = Role.valueOf("DEV");
		}
		else if (role == 3)
		{
			this.role = Role.valueOf("BASIC_USER");
		}
		else if (role == 4)
		{
			this.role = Role.valueOf("PREMIUM_USER");
		}
		else if (role == 5)
		{
			this.role = Role.valueOf("LOCKED");
		}
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
