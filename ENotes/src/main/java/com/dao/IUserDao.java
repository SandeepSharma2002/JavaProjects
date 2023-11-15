package com.dao;

import com.User.UserDetails;

public interface IUserDao {

	public String addUser(UserDetails user);
	public UserDetails LoginUser(String Email, String Password);
}
