package com.pack.Service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pack.Dao.CustomerDao;
import com.pack.form.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	private static Logger log=Logger.getLogger(CustomerServiceImpl.class);
	private CustomerDao customerDao;
	
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Transactional
	public void addCustomer(Customer c) {
		
		log.info("inside service add customer");
		customerDao.addCustomer(c);
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void updateCustomer(Customer c) {
		
		log.info("Update Customer");
		customerDao.updateCustomer(c);
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public List<Customer> listCustomer() {
		// TODO Auto-generated method stub
		
		List<Customer> l=customerDao.listCustomer();
		return l;
	}

	@Override
	@Transactional
	public Customer getCustomerById(Integer cid) {
		// TODO Auto-generated method stub
		Customer c=customerDao.getCustomerById(cid);
		return c;
	}

	@Override
	@Transactional
	public void removeCustomer(Integer cid) {
		
		customerDao.removeCustomer(cid);
		// TODO Auto-generated method stub
		
	}

}
