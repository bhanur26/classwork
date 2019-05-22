package com.pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Sample {

	@Autowired
	@Qualifier("User2")
	private User User;

	public Sample() {
		System.out.println("HI");
	}
	public void display()
	{
		System.out.println(User.getName());
	}
	public void display1()
	{
		System.out.println(User.getAge());
	}
	
}
