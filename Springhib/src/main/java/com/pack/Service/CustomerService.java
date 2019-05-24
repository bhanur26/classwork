package com.pack.Service;

import java.util.List;

import com.pack.form.Customer;

public interface CustomerService {
	
	public void addCustomer(Customer c);
	public void updateCustomer(Customer c);
	public List<Customer> listCustomer();
	public Customer getCustomerById(Integer cid);
	public void removeCustomer(Integer cid);
}
