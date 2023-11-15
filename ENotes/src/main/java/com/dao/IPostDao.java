package com.dao;

import java.util.List;

import com.User.PostDetails;

public interface IPostDao {
	
	public boolean addNotes(String title, String content, int uid);
	public List<PostDetails> getPosts(int id);
	public boolean editNote(String title, String content, int uid);
	public boolean deleteNote(int postid);
}
