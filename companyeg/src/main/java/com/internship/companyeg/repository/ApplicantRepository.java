package com.internship.companyeg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.internship.companyeg.model.Applicant;

public interface ApplicantRepository extends JpaRepository<Applicant, Integer>{

	Applicant findByName(String name);

}
