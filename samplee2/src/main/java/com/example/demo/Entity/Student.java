package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EmployeeS")
public class Student {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id;
	
	private String name;
	private int age;
	private long salary;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getsalary() {
		return salary;
	}
	public void setsalary(long salary) {
		this.salary=salary;
	}
	
	
	public Student(long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary=salary;
	}
		
}
	
	
	
	    
