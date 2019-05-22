package com.pack;

import org.springframework.beans.factory.annotation.Autowired;

public class FisrtBean {
   
	private SecondBean secondBean;
	private String name;
	 @Autowired
	public FisrtBean(SecondBean secondBean, String name) {
		super();
		this.secondBean = secondBean;
		this.name = name;
	}
	public void check()
	{
		secondBean.check1();
	}

	
	
}
