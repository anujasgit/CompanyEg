package com.internship.companyeg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.internship.companyeg.model.Visitors;
import com.internship.companyeg.repository.VisitorsRepository;

@Service
public class VisitorsService {

	@Value("${email.host-smtp}")
	private String hostSmtp;
	
	@Value("${email.host-port}")
	private String hostPort;
	
	@Value("${email.username}")
	private String username;
	
	@Value("${email.password}")
	private String password;
	
	@Autowired
	VisitorsRepository visitorsRepository;
	
	public Visitors addVisitor(Visitors visitor) 
	{
		Visitors savedVisitor = visitorsRepository.save(visitor);
		return savedVisitor;
	}

	public List<Visitors> getAllVisitors() 
	{
		List<Visitors> allVisitors = visitorsRepository.findAll();
		return allVisitors;
	}

	public List<Visitors> getVisitorsByDate(String date) {
		List<Visitors> visitorsOnTheDay = visitorsRepository.findByDateOfVisit(date);
		return visitorsOnTheDay;
	}

	public long getVisitorsCount(String date)
	{
		long visitorsCount = visitorsRepository.countByDateOfVisit(date);
		return visitorsCount;
	}
	
}
