package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

			public static void main(String args[])
			{
				ApplicationContext fact=new ClassPathXmlApplicationContext("beans.xml");
				
				
				
				Sample s=(Sample)fact.getBean("Bhanu");
				System.out.println(s);
				
				
				Sample s1=(Sample)fact.getBean("Bhanu");
				System.out.println(s1);
			}
			
}
				