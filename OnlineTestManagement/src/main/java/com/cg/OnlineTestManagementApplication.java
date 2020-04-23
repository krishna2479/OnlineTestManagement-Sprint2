package com.cg;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.TestDaoI;
import com.cg.entity.Question;
import com.cg.entity.Test;

//@Transactional
@SpringBootApplication
public class OnlineTestManagementApplication implements CommandLineRunner {
	
	@Autowired
	TestDaoI testdao;

	public static void main(String[] args) {
		SpringApplication.run(OnlineTestManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Test t = new Test();
		t.setTestId(101);
		t.setTestTitle("JavaTest");
		t.setTestTotalMarks(50);
		t.setTestMarksScored(40);
		
		testdao.create(t);
		System.out.println("Test added successfully..");
		
	}

}
