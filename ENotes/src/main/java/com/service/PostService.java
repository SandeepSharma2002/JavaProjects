package com.service;

import java.util.List;

import com.User.PostDetails;
import com.dao.IPostDao;
import com.dao.PostDao;
import com.daofactory.PostDaoFactory;

public class PostService implements IPostService{

	private IPostDao postDao;
	
	@Override
	public boolean addNotes(String Title, String Content, int uid) {
		postDao = PostDaoFactory.getPostDao();
		if(postDao !=  null) return postDao.addNotes(Title, Content, uid);
		else
		return false;
	}

	@Override
	public List<PostDetails> getPosts(int id) {
		postDao = PostDaoFactory.getPostDao();
		if(postDao !=  null) return postDao.getPosts(id);
		else
		return null;
	}

	@Override
	public boolean editNote(String Title, String Content, int uid) {
		postDao = PostDaoFactory.getPostDao();
		if(postDao !=  null) return postDao.editNote(Title, Content, uid);
		else
		return false;
	}

	@Override
	public boolean deleteNote(int postid) {
		postDao = PostDaoFactory.getPostDao();
		if(postDao !=  null) return postDao.deleteNote(postid);
		else
		return false;
	}
}
