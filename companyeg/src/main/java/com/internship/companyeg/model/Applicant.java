package com.internship.companyeg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Applicant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	private String address;
	private int age;	
	private String email;
	private int phone;
	
	private String dateOfTheInterview;
	private String timeOfTheInterview;
	private String employer;
	
	private boolean applicationStatus;
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getEmail() {
		return email;
	}
	public int getPhone() {
		return phone;
	}
	public String getDateOfTheInterview() {
		return dateOfTheInterview;
	}
	public String getTimeOfTheInterview() {
		return timeOfTheInterview;
	}
	public String getEmployer() {
		return employer;
	}
	public boolean isApplicationStatus() {
		return applicationStatus;
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
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public void setDateOfTheInterview(String dateOfTheInterview) {
		this.dateOfTheInterview = dateOfTheInterview;
	}
	public void setTimeOfTheInterview(String timeOfTheInterview) {
		this.timeOfTheInterview = timeOfTheInterview;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public void setApplicationStatus(boolean applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
