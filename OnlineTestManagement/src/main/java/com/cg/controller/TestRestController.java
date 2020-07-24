package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Test;
import com.cg.exception.InvalidException;
import com.cg.exception.TestException;
import com.cg.service.TestServiceI;

@CrossOrigin(origins="*")
@RestController
public class TestRestController {
	@Autowired
	TestServiceI testservice;
	
	
	@PostMapping("/add")
	public ResponseEntity<String> addTest(@RequestBody Test t){
		if(t.getTestTotalMarks()>100)throw new TestException("Total Marks should be less than 100");
		testservice.addTest(t);
		return new ResponseEntity<String>("Test added ", HttpStatus.OK);
	}
	
	
	@GetMapping(value="/alltest")
	public ResponseEntity <List<Test>> getTestList(){
		List<Test> lt = testservice.getAllTest();
		return new ResponseEntity<List<Test>>(lt,HttpStatus.OK);
	}
		
	@DeleteMapping("/delete/{testId}")
	public String deleteTestById(@PathVariable int testId)
	{
		testservice.deleteTest(testId);
		return "Test deleted.";
	}
	

	@PutMapping("/update/{testId}")
	public String updateTestById(@PathVariable int testId,@RequestBody Test t)
	{
		testservice.updateTest(testId,t);
		return "Test updated.";
	}
  
  }