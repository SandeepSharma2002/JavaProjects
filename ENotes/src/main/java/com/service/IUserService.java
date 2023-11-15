package com.service;

import com.User.UserDetails;

public interface IUserService {

	public String addUser(UserDetails user);
	public UserDetails LoginUser(String Email, String Password);
}
