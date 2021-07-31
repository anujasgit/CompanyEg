package com.internship.companyeg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.internship.companyeg.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
