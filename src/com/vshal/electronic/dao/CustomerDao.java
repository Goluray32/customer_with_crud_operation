package com.vshal.electronic.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping;
import com.vshal.electronic.customer.CustomerConnection;
import com.vshal.electronic.dto.Customer;

public class CustomerDao {
	
	Connection conn = CustomerConnection.customerConnection();
	
	//FOR INSERTING THE DATA
	public Customer insertCustomer(Customer customer) {
		try {
			PreparedStatement pst = conn.prepareStatement("insert into customer values(?,?,?,?,?)");
			System.out.println("CustomerDao Class 2 started");
//			System.out.println(pst);
			pst.setInt(1, customer.getCustomerId());
			pst.setString(2, customer.getCustomerName());
			pst.setString(3, customer.getCustomerEamil());
			pst.setLong(4, customer.getCustomerPhone());
			pst.setString(5, customer.getCustomerAddress());
			System.out.println(pst);
//			System.out.println("=======");
//			System.out.println(pst.execute());
//			System.out.println("=====2==");
			pst.execute();
			
			System.out.println("Data Stored");
			
			return customer;

		} catch (SQLException | NullPointerException  e) {
			// TODO: handle exception
			e.printStackTrace();
		}	
		return null;
	}
	//FOR UPDATING THE CUSTOMER NAME
	public int updateCustomerName(int id, String name)
	{
		try {
			PreparedStatement pst = conn.prepareStatement("update customer set name =? where id =?");
			pst.setString(1, name);
			pst.setInt(2, id);	
			
			System.out.println("Customer Name Updated");
			
			return pst.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}
	
	//FOR UPDATING THE CUSTOMER EMAIL
		public int updateCustomerEmail(int id, String email)
		{
			try {
				PreparedStatement pst = conn.prepareStatement("update customer set email =? where id =?");
				pst.setString(1, email);
				pst.setInt(2, id);	
				
				System.out.println("Customer Email Updated");
				
				return pst.executeUpdate();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return 0;
		}
		
		//FOR UPDATING THE CUSTOMER PHONE
			public int updateCustomerPhone(int id, long phone)
				{
				try {
					PreparedStatement pst = conn.prepareStatement("update customer set phone =? where id =?");
					pst.setLong(1, phone);
					pst.setInt(2, id);	
						
					System.out.println("Customer Phone Updated");
						
					return pst.executeUpdate();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				return 0;
			}
			
		//FOR UPDATING THE CUSTOMER ADDRESS
		public int updateCustomerAddress(int id, String address)
			{
			try {
				PreparedStatement pst = conn.prepareStatement("update customer set address =? where id =?");
				pst.setString(1, address);
				pst.setInt(2, id);						
				System.out.println("Customer Address Updated");
						
				return pst.executeUpdate();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
				return 0;
		}	
		
		//=============================UPDATION COMPLETED=========================================
		
		//DELETING THE CUSTOMER DETAILS
		public int deleteCustomer(int id)
		{
		try {
			PreparedStatement pst = conn.prepareStatement("delete from customer where id=?");
			pst.setInt(1, id);	
			
			int del=pst.executeUpdate();
			
			if(del==1){
				System.out.println("Customer Details is Deleted");
			}
			else {
				System.err.println("Given Details is not present");
			}
					
			return pst.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			return 0;
	}
		
	public void displayCustomer()
	{
		try {
			PreparedStatement pst = conn.prepareStatement("select * from customer");
			
			ResultSet resultSet=pst.executeQuery();
			
			while(resultSet.next())
			{
				int id= resultSet.getInt("id");
				String name = resultSet.getString("name");
				String email = resultSet.getString("email");
				long phone = resultSet.getLong("phone");
				String address = resultSet.getString("address");
				
				System.out.println("Id : "+id);
				System.out.println("Name : "+name);
				System.out.println("Price : "+email);
				System.out.println("Color : "+phone);
				System.out.println("Color : "+address);
				
				System.out.println("==================================================");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	
	
		

		

}
