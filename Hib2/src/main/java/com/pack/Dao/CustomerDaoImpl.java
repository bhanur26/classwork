package com.pack.Dao;



import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pack.HibernateUtil;
import com.pack.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	public void insertCustomer(Customer c) {
		// TODO Auto-generated method stub
		Session s=HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		try {
			t=s.beginTransaction();
			s.save(c);
			t.commit();
		}
		catch(HibernateException e) {
			t.rollback();
			e.printStackTrace();
			
		}
		finally {
			s.close();
		}
	}

	public /*void*/int  updateCustomer(Customer c1) {
        Session s=HibernateUtil.getSessionFactory().openSession();
        Transaction t=null;
        int i=0;
        try 
        {
            t=s.beginTransaction();
          //Using Session methods
            /*Customer c=(Customer)s.get(Customer.class, c1.getCustid());
            if(c!=null) 
            {
                 c.setAddress(c1.getAddress());
                 c.setAge(c1.getAge());
                 c.setSalary(c1.getSalary());
                 s.update(c);
            }
            else 
            {
                 System.out.println("no customer found");
            }*/
            
            //using hql methods
            
            String query="Update Customer c set c.address=:add,c.salary=:sal,c.age=:age where c.custid=:cid";
            Query q=s.createQuery(query);
            q.setParameter("cid",c1.getCustid());
            q.setParameter("add",c1.getAddress());
            q.setParameter("age",c1.getAge());
            q.setParameter("sal",c1.getSalary());
            i=q.executeUpdate();
            
            
            
            
            t.commit();
            
        }
        catch (HibernateException e) {
            // TODO: handle exception
            System.out.println("=-=>"+e);
            t.rollback();
            e.printStackTrace();
        }
        finally {
            s.close();
        }
		return i;

	}
	public void deleteCustomer(int num) {
		// TODO Auto-generated method stub
		Session s=HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		try {
			t=s.beginTransaction();
			Customer c1=(Customer)s.get(Customer.class,num);
			if(c1!=null) {
				s.delete(c1);
			}
			t.commit();
		}
		catch(HibernateException e) {
			t.rollback();
			e.printStackTrace();
		}
		finally {
			s.close();
		}
	}

	public /*Customer*/List<Customer> fetchCustomerById() {
		
		// TODO Auto-generated method stub
		List<Customer> list=null;
		Session s=HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		Customer c1=null;
		try {
			t=s.beginTransaction();
//            c1=(Customer)s.get(Customer.class, num);
			String hql="from Customer";
			Query query=s.createQuery(hql);
			list=query.list();
            t.commit();
		}
		catch(HibernateException e) {
			t.rollback();
			e.printStackTrace();
		}
		finally {
			s.close();
		}
		
		
		return list;
		
	}

	

	
	

}
