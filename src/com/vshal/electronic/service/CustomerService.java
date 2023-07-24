package com.vshal.electronic.service;

import com.vshal.electronic.dao.CustomerDao;
import com.vshal.electronic.dto.Customer;

public class CustomerService {
	CustomerDao customerdao = new CustomerDao();
	public Customer insertCustomerService(Customer customer)
	{
		try {
			System.out.println("Service Class started");
			Customer customer2;
			if(customer.getCustomerId()<=999)
			{
				customer2 = customerdao.insertCustomer(customer);
				
			}
			else {
				System.out.println("Id shold be Less Than 4 Digit");
			}
			
//			int nameLength = customer.getCustomerName().length();
//			if(nameLength<=16)
//			{
//				customer2 = customerdao.insertCustomer(customer);
//				
//			}
//			else {
//				System.out.println("Name shold be Less Than 16 Character");
//			}
			
//			int addrLength = customer.getCustomerAddress().length();
//			if(addrLength<=20)
//			{
//				customer2 = customerdao.insertCustomer(customer);
//				
//			}
//			else {
//				System.out.println("Name shold be Less Than 16 Character");
//			}
//			int phoneLength = customer.getCustomerPhone().length();
//			long phoneNo = customer.getCustomerPhone();
//			int phoneLength=0;
//			while(phoneNo>0)
//			{
//				phoneNo = phoneNo/10;
//				phoneLength++;
//				
//			}
//			if(phoneLength==10)
//			{
//				customer2 = customerdao.insertCustomer(customer);
//				
//			}
//			else {
//				System.out.println("Name shold be Less Than 16 Character");
//			}	
			return customer;
		} catch (NullPointerException e) {
//			 TODO: handle exception
			e.printStackTrace();
		}
		return customer;
	}
	//===============UPDATING NAME , EMAIL, PHONE , ADDRESS==================================
	//Updating CustomerName
	public int updateCustomerNameService(int id , String name)
	{
		return customerdao.updateCustomerName(id, name);
	}
	
	//Updating CustomerEmail
	public int updateCustomerEmailService(int id , String email)
	{
		return customerdao.updateCustomerEmail(id, email);
	}
	
	//Updating CustomerPhone
	public int updateCustomerPhoneService(int id , long phone)
	{
		return customerdao.updateCustomerPhone(id, phone);
	}
		
	//Updating CustomerAddress
	public int updateCustomerAddressService(int id , String address)
	{
		return customerdao.updateCustomerAddress(id, address);
	}
	
	//Updating CustomerAddress
	public int deleteCustomerService(int id)
	{
		return customerdao.deleteCustomer(id);	
	}
	
	//Updating CustomerAddress
	public void deleteCustomerService()
	{
		customerdao.displayCustomer();		
	}	
}
