package com.internship.companyeg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.internship.companyeg.model.Employee;
import com.internship.companyeg.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getEmployees() 
	{
		List<Employee> employees = employeeRepository.findAll();
		return employees;
	}

	public Employee addEmployee(Employee employee) {
		Employee savedEmployee = employeeRepository.save(employee);
		return savedEmployee;
	}

}
