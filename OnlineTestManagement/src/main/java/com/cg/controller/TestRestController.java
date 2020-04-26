package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Test;
import com.cg.service.TestServiceImp;

@RestController
@RequestMapping({"/test"})
public class TestRestController {
	@Autowired
	TestServiceImp testserviceimp;
	 
	@PostMapping("/add")
	public String createTest(@RequestBody Test t)
	{
		Test t1=testserviceimp.addTest(t);
		return t1.getTestTitle() +  "added";
  
	
		}
		

	@DeleteMapping("/deleteById/{testId}")
	public String deletetestById(@PathVariable int testId)
	{
		testserviceimp.deleteTest(testId);
		
		return "deleted..";
	}
	
	
  @ExceptionHandler(Exception.class)
  public String inValid(Exception e) {
	  return e.getMessage();
  }
  
  }