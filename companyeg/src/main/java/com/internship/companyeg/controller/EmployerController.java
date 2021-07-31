package com.internship.companyeg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.internship.companyeg.model.Employer;
import com.internship.companyeg.service.EmployerService;

@RestController
@RequestMapping("/companyeg/employer")
public class EmployerController {
	
	@Autowired
	EmployerService employerService;

	@PostMapping("/add")
	public Employer addEmployer(@RequestBody Employer employer) 
	{
		Employer savedEmployer = employerService.addEmployer(employer);
		return savedEmployer;
	}
	
	@GetMapping("/getTeachers")
	public List<Employer> getEmployers() 
	{
		List<Employer> allEmployers = employerService.getEmployers();
		return allEmployers;
	}
	
}
