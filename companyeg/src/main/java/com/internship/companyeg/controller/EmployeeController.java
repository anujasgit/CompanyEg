package com.internship.companyeg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.internship.companyeg.model.Employee;
import com.internship.companyeg.service.EmployeeService;

@RestController
@RequestMapping("/companyeg/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/getEmployees")
	public List<Employee> getEmployees()
	{
		List<Employee> employees = employeeService.getEmployees();
		return employees;
	}

	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee) {
		Employee savedEmployee = employeeService.addEmployee(employee);	
		return savedEmployee;
	}
	
}
