package com.vshal.electronic.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomerConnection {
	public static Connection customerConnection()
	{
		try {
			//Load and Register Driver
			Class.forName("com.mysql.jdbc.Driver");
			//Create Connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer_with_crud_operation","root","root");
			System.out.println(conn);
			return conn;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
}
