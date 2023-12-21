package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbutil 
{

	Connection cn=null;
	
	public Connection getconnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/himanshu","root","");
			System.out.println("Connection Established...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cn;
}
}
