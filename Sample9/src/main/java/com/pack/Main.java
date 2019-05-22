package com.pack;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String args[])
	{
		AbstractApplicationContext Context=new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld h=(HelloWorld)Context.getBean("HelloWorld");
		System.out.println(h.getMessage());
		Context.registerShutdownHook();
	}
	
}
