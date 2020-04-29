package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Test;
import com.cg.service.TestServiceI;

@RestController
@RequestMapping({"/test"})
public class TestRestController {
	@Autowired
	TestServiceI testservice;
	 
	@PostMapping("/add")
	public String addTest(@RequestBody Test t)
	{
		Test t1=testservice.addTest(t);
		return t1.getTestTitle() +  "added";
  
	
		}
	
	@GetMapping(value="/alltest")
	public List<Test> getTestList()
	{
		return testservice.getAllTest();
	}
		

	@DeleteMapping("/delete")
	public String deleteTestById(@PathVariable int testId)
	{
		testservice.deleteTest(testId);
		return "deleted..";
	}
	
	@PutMapping("/update/{test}")
	public String updateTestById(@PathVariable int testId)
	{
		testservice.updateTest(testId);
		return "updated..";
	}
  
  }