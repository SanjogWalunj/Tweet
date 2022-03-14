package com.quest.corebasics;

import java.util.List;

public interface UserDao {

	public User postTweet(User user);
	
	public List<User> viewAllTweet();
	
	public List<User> viewAllUser();
}
