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
	
	//@Autowired
	//TestDaoI testdao;

	public static void main(String[] args) {
		SpringApplication.run(OnlineTestManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

	//@Override
	//public void run(String... args) throws Exception {
		
	//	Test t = new Test();
	//	t.setTestId(105);
	//	t.setTestTitle("SpringBoot");
	//	t.setTestTotalMarks(50);
	//	t.setTestMarksScored(42);
		
	//	testdao.addTest(t);
	//	System.out.println("Test added successfully..");
		
	//}

}
