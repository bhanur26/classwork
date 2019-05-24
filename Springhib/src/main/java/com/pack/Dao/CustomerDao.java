package com.pack.Dao;

import java.util.List;

import com.pack.form.Customer;

public interface CustomerDao {

	public void addCustomer(Customer c);
	public void updateCustomer(Customer c);
	public List<Customer> listCustomer();
	public Customer getCustomerById(Integer cid);
	public void removeCustomer(Integer cid);
	
}
