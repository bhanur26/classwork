package com.pack.service;

import com.pack.model.Customer;

public interface CustomerService {
	
	public  void insertCustomer(Customer c);
	public /*void*/int updateCustomer(Customer c1);
	public void deleteCustomer(int num);
	public Customer fetchCustomerById(int num);
	

}
