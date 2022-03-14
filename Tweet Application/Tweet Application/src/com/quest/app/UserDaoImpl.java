package com.quest.app;

import java.util.List;
import java.util.Scanner;

import com.quest.corebasics.User;

public class UserDaoImpl implements UserDao {

	static User register = new User();
	
	@Override
	public void registration(User user) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in);) {

			System.out.println("Enter Your First Name : ");
			String firstname = sc.nextLine();
			register.setFirstName(firstname);

			System.out.print(" Enter password : ");
			String password = sc.nextLine();
			register.setPassword(password);

			System.out.print(" Enter emailId : ");
			String emailId = sc.nextLine();
			register.setEmailId(emailId);
			
			System.out.println(register.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean login(String emailId, String Password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void postTweet(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> viewTweet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void forgetPassword(String UserName) {
		// TODO Auto-generated method stub
		
	}

}
