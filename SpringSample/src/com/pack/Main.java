package com.pack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

		public static void main(String[] args)
		{
			Resource res=new ClassPathResource("beans.xml");
			BeanFactory fact=new XmlBeanFactory(res);
			HelloWorld h=(HelloWorld)fact.getBean("helloWorld");
			System.out.println(h.getMessage());
		}
	
}
