package com.internship.companyeg.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.internship.companyeg.controller.EmployeeController;
import com.internship.companyeg.model.Applicant;
import com.internship.companyeg.model.Employee;
import com.internship.companyeg.repository.ApplicantRepository;
import com.internship.companyeg.repository.EmployeeRepository;

@Service
public class ApplicantService {

	@Autowired
	ApplicantRepository applicantRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;

	public Applicant addApplicant(Applicant applicant) {
		Applicant savedApplicant = applicantRepository.save(applicant);
		return savedApplicant;
	}

	public Applicant updateApplicationStatus(Applicant applicant, String name)
	{
		applicant.setName(name);
		Applicant updatedDetails = applicantRepository.save(applicant);
		
		String applicantName = updatedDetails.getName();
		String applicantAddress = updatedDetails.getAddress();
		int applicantAge = updatedDetails.getAge();
		String applicantEmail = updatedDetails.getEmail();
		int applicantPhone = updatedDetails.getPhone();
		
		LocalDate currentDate = LocalDate.now();
		String applicantJoiningDate = currentDate.toString();
		
		System.out.println(applicantName);
		System.out.println(applicantAddress);
		System.out.println(applicantAge);
		System.out.println(applicantEmail);
		System.out.println(applicantPhone);
		System.out.println(applicantJoiningDate);
		
		Employee employee = new Employee();
		employee.setName(applicantName);
		employee.setAddress(applicantAddress);
		employee.setAge(applicantAge);
		employee.setEmail(applicantEmail);
		employee.setPhone(applicantPhone);
		employee.setJoiningDate(applicantJoiningDate);
		
		employeeRepository.save(employee);
		
		return updatedDetails;
	}

	public List<Applicant> getApplicantDetails() 
	{
		List<Applicant> applicantDetails = applicantRepository.findAll();
		return applicantDetails;
	}

	public Applicant getApplicantDetailsByName(String name)
	{
		Applicant applicantDetails = applicantRepository.findByName(name);
		return applicantDetails;
	}
	
}
