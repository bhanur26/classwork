package com.pack;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue(value="reg_emp")
@Table(name="emp602")
@PrimaryKeyJoinColumn(name="id")
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
