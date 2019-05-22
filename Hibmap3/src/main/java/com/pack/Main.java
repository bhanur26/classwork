package com.pack;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Categories c1=new Categories();
		c1.setCatid(100);
		c1.setCatname("A");
		
		Categories c2=new Categories();
		c1.setCatid(101);
		c1.setCatname("B");
		
		Items i1=new Items();
		i1.setItemid(200);
		i1.setItemname("X");
	
		Items i2=new Items();
		i1.setItemid(201);
		i1.setItemname("Y");
		
		Set s1=new HashSet();
		s1.add(i1);
		s1.add(i2);
		c1.setItems(s1);
		c2.setItems(s1);
		
		s.persist(c1);
		s.persist(c2);
		
		t.commit();
		System.out.println("INSERTED SUCCESSFULLY");
		s.close();
		
		// TODO Auto-generated method stub

	}

}
