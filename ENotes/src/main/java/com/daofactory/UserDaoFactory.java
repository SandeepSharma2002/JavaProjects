package com.daofactory;

import com.dao.IUserDao;
import com.dao.UserDao;

public class UserDaoFactory {

	private UserDaoFactory() {}
	
	private static IUserDao userDao = null;
	
	public static IUserDao getUserDao()
    {
   	 if(userDao == null)
   	 {
   		 userDao  =  new UserDao();
   	 }
   	 return userDao;
    }
	
}
