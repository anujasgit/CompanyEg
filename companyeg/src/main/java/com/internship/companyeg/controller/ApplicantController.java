package com.internship.companyeg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.internship.companyeg.model.Applicant;
import com.internship.companyeg.service.ApplicantService;

@RestController
@RequestMapping("/companyeg/applicant")
public class ApplicantController {

	@Autowired
	ApplicantService applicantService;
	
	@PostMapping("/add")
	public Applicant addApplicant(@RequestBody Applicant applicant) 
	{
		Applicant savedApplicant = applicantService.addApplicant(applicant);
		return savedApplicant;
	}
	
	@PutMapping("/updateApplicationStatusByApplicant/{name}")
	public Applicant updateApplicationStatus(@RequestBody Applicant applicant, @PathVariable String name) 
	{
		Applicant updatedDetails = applicantService.updateApplicationStatus(applicant, name);
		return updatedDetails;
	}
	
	@GetMapping("/getApplicantDetails")
	public List<Applicant> getApplicantDetails()
	{
		List<Applicant> applicantDetails = applicantService.getApplicantDetails();
		return applicantDetails;
	}
	
	@GetMapping("/getApplicantDetailsByName/{name}")
	public Applicant getApplicantDetailsByName(@PathVariable String name) 
	{
		Applicant applicantDetails = applicantService.getApplicantDetailsByName(name);
		return applicantDetails;
	}

}
