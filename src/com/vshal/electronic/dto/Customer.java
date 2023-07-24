package com.vshal.electronic.dto;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerEmail;
	private long customerPhone;
	private String customerAddress;
	
	
	public Customer(){
		super();
	}
	
	
	public Customer(int customerId, String customerName, String customerEmail, long customerPhone, String customerAddress)
	{
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
		this.customerAddress = customerAddress;
		
	}
	
	
	//=================CUSTOMER ID=====================================
	public int getCustomerId()
	{
		return this.customerId;
	}
	
	public void setCustomerId(int customerId)
	{
		this.customerId = customerId;
	}
	
	//=================CUSTOMER NAME=====================================
	public String getCustomerName()
	{
		return this.customerName;
	}
		
	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}
	
	//=================CUSTOMER EMAIL=====================================
	public String getCustomerEamil()
	{
		return this.customerEmail;
	}
			
	public void setCustomerEmail(String customerEmail)
	{
		this.customerEmail = customerEmail;
	}
	
	//=================CUSTOMER PHONE=====================================
	public long getCustomerPhone()
	{
		return this.customerPhone;
	}
				
	public void setCustomerPhone(long customerPhone)
	{
		this.customerPhone = customerPhone;
	}
	
	//=================CUSTOMER ADDRESS=====================================
	public String getCustomerAddress()
	{
		return this.customerAddress;
	}
				
	public void setCustomerAddress(String customerAddress)
	{
		this.customerAddress = customerAddress;
	}
	

}
