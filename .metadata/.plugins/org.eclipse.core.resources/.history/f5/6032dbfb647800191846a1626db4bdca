package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	 public static void main(String args[])
	 {
		 ApplicationContext fact=new ClassPathXmlApplicationContext("beans.xml");
		 InjectCollection s=(InjectCollection)fact.getBean("Bhanu");
		 System.out.println(s.getName1());
		 System.out.println(s.getName2());
		 System.out.println(s.getName3());
		 System.out.println(s.getName4());
	 }

}
