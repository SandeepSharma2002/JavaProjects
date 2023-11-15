package com.User;

import java.io.Serializable;

public class UserDetails implements Serializable {
	
	private static final long serialVersionUID =1L;
	
	private String Name;
	private String Email;
	private String Password;
	private int Id;
	
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		
		return "Student [Password=" + Password + ", Name=" + Name + ", Email=" + Email + "]";
	}
	
	
	
}
