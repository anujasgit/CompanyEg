package com.internship.companyeg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.internship.companyeg.model.Visitors;
import com.internship.companyeg.service.VisitorsService;

@RestController
@RequestMapping("/companyeg/visitors")
public class VisitorsController {

	@Autowired
	VisitorsService visitorsService;
	
	@PostMapping("/add")
	public Visitors addVisitor(@RequestBody Visitors visitor) 
	{
		Visitors savedVisitor = visitorsService.addVisitor(visitor);
		return savedVisitor;
	}
	
	@GetMapping("/getVisitors")
	public List<Visitors> getAllVisitors()
	{
		List<Visitors> allVisitors = visitorsService.getAllVisitors();
		return allVisitors;
	}
	
	@GetMapping("/getVisitorsByDate/{date}")
	public List<Visitors> getVisitorsByDate(@PathVariable String date)
	{
		List<Visitors> visitorsOnTheDay = visitorsService.getVisitorsByDate(date);
		return visitorsOnTheDay;
	}
	
	@GetMapping("/getTotalVisitorsByDate/{date}")
	public long getVisitorsCount(@PathVariable String date)
	{
		long visitorsCount = visitorsService.getVisitorsCount(date);
		return visitorsCount;
	}
	
}
