package com.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String args[]) {
		
		SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Employee e1=new Employee();
		e1.setName("Bhanu");
		Regular_Employee e2=new Regular_Employee();
		e2.setName("puppy");
		e2.setSalary(20000);
		e2.setBonus(1000);
		Contract_Employee e3=new Contract_Employee();
		e3.setName("balu");
		e3.setPay_hour(10);
		e3.setContract_duration("2 hr");
		
		
		s.persist(e1);
		s.persist(e2);
		s.persist(e3);
		t.commit();
		System.out.println("INSERTED SUCCESSFULLY");
		s.close();
		
	}
	
}
