package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
public class ConnectionTest {

	Connection connect=null;

	public Connection getConnection() {
		try {
			Class.forName ("com.mysql.cj.jdbc.Driver");     
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		    
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return connect;
	}
}
		


