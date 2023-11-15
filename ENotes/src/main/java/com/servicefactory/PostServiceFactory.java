package com.servicefactory;
import com.service.IPostService;
import com.service.PostService;

public class PostServiceFactory {

	private PostServiceFactory() {}
	
	private static IPostService Postservice = null;
	
	public static IPostService getPostService() {
		if (Postservice == null) {
			Postservice = new PostService();
		}
		return Postservice;
	}
}
