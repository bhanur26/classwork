package com.pack.Dao;

import com.pack.model.Customer;

public interface CustomerDao {
	
	public void insertCustomer(Customer c);
	public void updateCustomer(Customer c1);
	public void deleteCustomer(int num);
	public Customer fetchCustomerById(int num);

}
