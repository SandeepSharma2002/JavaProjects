package com.service;

import com.User.UserDetails;
import com.dao.IUserDao;
import com.daofactory.UserDaoFactory;


public class UserService implements IUserService {

	private IUserDao userDao;
	@Override
	public String addUser(UserDetails user) {
		userDao = UserDaoFactory.getUserDao();
		if(userDao != null) return userDao.addUser(user);
		else return "failure";
	}
	@Override
	public UserDetails LoginUser(String Email, String Password) {
		userDao = UserDaoFactory.getUserDao();
		if(userDao != null) return userDao.LoginUser(Email, Password);
		else return null;
	}
}
