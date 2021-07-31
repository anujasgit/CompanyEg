package com.internship.companyeg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	private String address;
	private int age;
	private String email;
	private int phone;
	private String joiningDate;
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public int getPhone() {
		return phone;
	}
	public String getJoiningDate() {
		return joiningDate;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public void setJoiningDate(String joiningDate) 
	{
		this.joiningDate = joiningDate;
	}
	
	
}
