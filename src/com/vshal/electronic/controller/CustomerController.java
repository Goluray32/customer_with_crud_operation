package com.vshal.electronic.controller;

import java.security.Provider.Service;
import java.util.Scanner;

import com.vshal.electronic.dto.Customer;
import com.vshal.electronic.service.CustomerService;
	
public class CustomerController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomerService customerService = new CustomerService();
		System.out.println("**************************PERFORM CRUD OPERATION**************************8");
		System.out.println("1.Insert\n2.Update\n3.Delete\n4.Display\n");
		System.out.print("Enter You Choice : ");
		int choice = sc.nextInt();
	
		
		switch(choice)
		{
			case 1 : {
				System.out.println("*********************INSERT QUERY IMPLEMENTING********************");
				System.out.print("Enter Your Id : ");
				int id = sc.nextInt();
				System.out.print("Enter Your Name : ");
				String name = sc.next();
				System.out.print("Enter Your Email : ");
				String email = sc.next();
				System.out.print("Enter Your Phone : ");
				long phone = sc.nextLong();
				System.out.print("Enter Your Address : ");
				String address = sc.next();
				
				Customer customer = new Customer(id,name,email,phone,address);
				customerService.insertCustomerService(customer);
				
				
				
			}//INSERTION
			break;
			
			case 2 : {
				System.out.println("**************************UPDATE THE CUSTOMER DETAILS**************************8");
				System.out.println("1.Update Name\n2.Update Email\n3.Update Phone\n4.Update Address\n");
				System.out.print("Enter You Choice : ");
				int choice2 = sc.nextInt();
				
				switch(choice2)
				{
				case 1 :
				{
					System.out.println("*********************You Are Updating Name********************");
					System.out.print("Enter Your Id : ");
					int id = sc.nextInt();
					System.out.print("Enter Your Name : ");
					String name = sc.next();
					customerService.updateCustomerNameService(id, name);
				}
				break;
				case 2 :
				{
					System.out.println("*********************You Are Updating Email********************");
					System.out.print("Enter Your Id : ");
					int id = sc.nextInt();
					System.out.print("Enter Your Email : ");
					String email = sc.next();
					customerService.updateCustomerEmailService(id, email);
				}
				break;
				case 3 :
				{
					System.out.println("*********************You Are Updating Phone********************");
					System.out.print("Enter Your Id : ");
					int id = sc.nextInt();
					System.out.print("Enter Your Phone : ");
					long phone = sc.nextLong();
					customerService.updateCustomerPhoneService(id, phone);	
				}
				break;
				case 4 :
				{
					System.out.println("*********************You Are Updating Address********************");
					System.out.print("Enter Your Id : ");
					int id = sc.nextInt();
					System.out.print("Enter Your Address : ");
					String address = sc.next();
					customerService.updateCustomerAddressService(id, address);
				}
				break;
			}		
				
//				System.out.println("*********************UPDATE QUERY IMPLEMENTING********************");
//				System.out.print("Enter Your Id : ");
//				int id = sc.nextInt();
//				System.out.print("Enter Your Name : ");
//				String name = sc.next();
				
//				Customer customer = new Customer(id,name,email,phone,address);
//				customerService.updateCustomerService(id, name);		
			}//UPDATE BLOCK
			break;
			
			
			case 3 :
			{
				System.out.println("*********************DELETE CUSTOMER DETAILS********************");
				System.out.print("Enter Your Id : ");
				int id = sc.nextInt();
				
				customerService.deleteCustomerService(id);
			}
			break;
			
			case 4 :
			{
				System.out.println("*********************DISPLAY CUSTOMER DETAILS********************");
	
				
				customerService.deleteCustomerService();
			}
			break;
			
		}
		
	}

}
