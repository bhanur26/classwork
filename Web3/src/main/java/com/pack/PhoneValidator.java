package com.pack;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneValidator implements ConstraintValidator<Phone,String>{

	@Override
	public void initialize(Phone arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String phoneNo, ConstraintValidatorContext ctx) {
		if(phoneNo==null) {
			return false;
		}
		// TODO Auto-generated method stub
		if(phoneNo.matches("\\d{10}")) return true;
		else
		return false;
	}
	
	

}
