package com.pack;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="table4")
public class Teacher {
	
	@Id
	@Column(name="sid")
	private int teacherid;
	@Column(name="tname",length=20)
	private String teachername;
	public int getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	
	private Set Student;
	public Set getStudent() {
		return Student;
	}
	public void setStudent(Set student) {
		Student = student;
	}
	
	
}