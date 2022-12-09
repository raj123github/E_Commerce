package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserRegistration {
	PreparedStatement ps= null;
	Connection connect= null;
	public void insertUserData(String firstName, String lastName, String address, String mailid,long mobileNumber ) {
	try {
		ConnectionTest con=new ConnectionTest();
		connect=con.getConnection();
		ps=connect.prepareStatement("insert into regiTable(firstName, lastName, address, mailid, mobileNumber)values(?,?,?,?,?)");
				ps.setString(1,"firstName");
				ps.setString(2,"lastName");
				ps.setString(3,"address");
				ps.setString(4,"mailid");
				ps.setLong(5, mobileNumber);
				int i=ps.executeUpdate();
				System.out.println("Record inserted succesfully...."+i);
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	public static void main(String[] args) throws SQLException{
		
	
		User_Login log=new User_Login ();           
		log.login();
		//int num;
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<3; i++) {
		System.out.print("Enter first name ");
		String firstName=scan.next();
		System.out.print("Enter last name ");
		String lastName=scan.next();
		System.out.print("Enter Address  ");
		String address=scan.next();
		System.out.print("Enter mailid ");
		String mailid=scan.next();
		System.out.print("Enter mobile no ");
		long mobileNumber=scan.nextLong();
		System.out.print("Registration succesfully done...");
		UserRegistration user= new UserRegistration();
		user.insertUserData(firstName, lastName, address, mailid, mobileNumber);
		
	}
		scan.close();
	}
}

