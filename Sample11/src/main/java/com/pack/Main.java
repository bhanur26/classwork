package com.pack;

//import javax.swing.plaf.synth.SynthStyle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String args[])
	{
		ApplicationContext fact=new ClassPathXmlApplicationContext("beans.xml");
		User u=(User)fact.getBean("User");
		System.out.println(u);
	}

}
