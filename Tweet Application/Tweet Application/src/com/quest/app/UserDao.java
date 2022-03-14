package com.quest.app;

import java.util.List;

public interface UserDao {

	public void registration(User user);
	
	public boolean login(String emailId, String Password);
	
	public void postTweet(User user);
	
	public List<User> viewTweet();
	
	public void forgetPassword(String UserName);
	
}
