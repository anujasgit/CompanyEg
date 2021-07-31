package com.internship.companyeg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.internship.companyeg.model.Visitors;

public interface VisitorsRepository extends JpaRepository<Visitors, Integer>{

	List<Visitors> findByDateOfVisit (String date);

	long countByDateOfVisit(String date);

}
