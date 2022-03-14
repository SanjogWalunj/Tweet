package com.quest.corebasics;

import java.util.List;
import java.util.Scanner;

public class Login implements UserDao{
	UserDao userDao ;
		
		@Override
		public List<User> viewAllUser() {
			// TODO Auto-generated method stub
			return userDao.viewAllUser();
		}
		
		@Override
		public List<User> viewAllTweet() {
			// TODO Auto-generated method stub
			return userDao.viewAllTweet();
		}
		
		@Override
		public User postTweet(User user) {
			// TODO Auto-generated method stub
			return userDao.postTweet(user);
		}
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			System.out.println("Enter User Name: ");
			String userName = sc.nextLine();

			System.out.println("Enter Password:");
			String password = sc.nextLine();

			if ("ganesh".equals(userName) && "123".equals(password)) {
				System.out.println("User Successfully Login In...");
			} else {
				System.out.println("InValid Username Or Password");
			}
		}

	}
	

	
}
