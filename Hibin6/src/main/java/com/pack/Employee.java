package com.pack;

import javax.persistence.*;

@Entity
@Table(name="EMP600")
@Inheritance(strategy=InheritanceType.JOINED)
//@DiscriminatorColumn(name="emp_type",discriminatorType=DiscriminatorType.STRING)
//@DiscriminatorValue(value="emp")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Employee() {
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
