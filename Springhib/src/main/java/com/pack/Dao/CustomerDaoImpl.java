package com.pack.Dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.pack.form.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	
	
	private static Logger log=Logger.getLogger(CustomerDaoImpl.class);
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addCustomer(Customer c) {
		
		log.info("inside dao's add customer");
		sessionFactory.getCurrentSession().save(c);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCustomer(Customer c) {
		
		sessionFactory.getCurrentSession().update(c);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> listCustomer() {
		// TODO Auto-generated method stub
		
		Query q=sessionFactory.getCurrentSession().createQuery("from Customer");
		List l=q.list();
		return l;
	}

	@Override
	public Customer getCustomerById(Integer cid) {
		// TODO Auto-generated method stub
		Query q=sessionFactory.getCurrentSession().createQuery("from Customer c where c.id=:id");
		q.setParameter("id",cid);
		Customer c=(Customer)q.uniqueResult();
		return c;
	}

	@Override
	public void removeCustomer(Integer cid) {
		// TODO Auto-generated method stub
		Customer c=(Customer)sessionFactory.getCurrentSession().get(Customer.class,cid);
		if(c!=null) {
			sessionFactory.getCurrentSession().delete(c);
		}
	}

}
