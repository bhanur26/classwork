package com.pack.service;

import java.util.List;

import com.pack.Dao.CustomerDaoImpl;
import com.pack.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	public void insertCustomer(Customer c) {
		// TODO Auto-generated method stub
		
		new CustomerDaoImpl().insertCustomer(c);
	}

	public /*void*/int updateCustomer(Customer c1) {
		// TODO Auto-generated method stub
		return new CustomerDaoImpl().updateCustomer(c1);
	}

	public void deleteCustomer(int num) {
		// TODO Auto-generated method stub
		new CustomerDaoImpl().deleteCustomer(num);
	}

	public /*Customer*/List<Customer> fetchCustomerById() {
		// TODO Auto-generated method stub
		return new CustomerDaoImpl().fetchCustomerById();
	}
	
			
}
