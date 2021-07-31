package com.internship.companyeg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.internship.companyeg.model.Employer;
import com.internship.companyeg.repository.EmployerRepository;

@Service
public class EmployerService {
	
	@Autowired
	EmployerRepository employerRepository;

	public Employer addEmployer(Employer employer) {
		Employer savedEmployer = employerRepository.save(employer);
		return savedEmployer;
	}

	public List<Employer> getEmployers() {
		List<Employer> allEmployers = employerRepository.findAll();
		return allEmployers;
	}

}
