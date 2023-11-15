package com.service;

import java.util.List;

import com.User.PostDetails;

public interface IPostService {

	public boolean addNotes(String Title, String Content, int uid );
	public List<PostDetails> getPosts(int id);
	public boolean editNote(String title, String content, int uid);
	public boolean deleteNote(int postid);
}
