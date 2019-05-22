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
		Teacher t1=new Teacher();
		t1.setTeacherid(100);
		t1.setTeachername("mam");
		
		Student st=new Student();
		st.setStudentid(100);
		st.setStudentname("bhanu");
		
		
		Student st1= new Student();
		st1.setStudentid(100);
		st1.setStudentname("bhanu");
		
		Set s1=new HashSet();
		s1.add(st);
		s1.add(st1);
		t1.setStudent(s1);
		s.persist(t1);
		t.commit();
		System.out.println("INSERTED SUCCESSFULLY");
		s.close();

	}

}
