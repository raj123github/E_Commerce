package com.test;

import java.util.Scanner;

public class User_Login {

	//public static void main(String[] args) {
	public void login() {                                          //method
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter user name=");
		String username=scan.next();
		System.out.println("Enter password=");
		String password=scan.next();
		/*System.out.println("If you are not registerd");
		//String ActualPassword= "pass@123";
		String register=scan.next();*/
		
		
		if("Ram".equals(username) && "pass@123".equals(password)) {
			System.out.println("User is succesfully login.....");
			System.exit(0);                                         //terminate the jvm if if else block is fulfilled
		}else {
			System.out.println("Invalid username or password....");
		
		}
		
		System.out.println("First register yourself...");
	
	}

}
