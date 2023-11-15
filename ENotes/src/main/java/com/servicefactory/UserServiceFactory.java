package com.servicefactory;

import com.service.IUserService;
import com.service.UserService;

public class UserServiceFactory {

private UserServiceFactory() {}

	private static IUserService userService = null;
	
	public static IUserService getUserService()
	{
		if(userService == null)
			userService = new UserService();
		return userService;
	}
	
}
