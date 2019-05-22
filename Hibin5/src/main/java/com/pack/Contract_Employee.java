package com.pack;

public class Contract_Employee extends Employee {

	private float Pay_hour;
	private String Contract_duration;
	
	
	public float getPay_hour() {
		return Pay_hour;
	}
	public void setPay_hour(float pay_hour) {
		Pay_hour = pay_hour;
	}
	public String getContract_duration() {
		return Contract_duration;
	}
	public void setContract_duration(String contract_duration) {
		Contract_duration = contract_duration;
	}
	
}
