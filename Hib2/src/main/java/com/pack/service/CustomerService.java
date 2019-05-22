package com.pack.service;

import java.util.List;

import com.pack.model.Customer;

public interface CustomerService {
	
	public  void insertCustomer(Customer c);
	public /*void*/int updateCustomer(Customer c1);
	public void deleteCustomer(int num);
	public /*Customer*/List<Customer> fetchCustomerById();
	

}
