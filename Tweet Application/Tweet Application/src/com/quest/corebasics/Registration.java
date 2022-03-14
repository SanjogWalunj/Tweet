package com.quest.corebasics;

import java.util.Scanner;

public class Registration {
	static User register = new User();

	public static void main(String[] args) {

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
}
