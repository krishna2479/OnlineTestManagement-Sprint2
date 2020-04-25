package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.TestDaoI;
import com.cg.entity.Test;

@Service
public class TestServiceImp implements TestServiceI {
	
	@Autowired
	TestDaoI testdao;

	@Override
	public Test addTest(Test t) {
		// TODO Auto-generated method stub
		return testdao.addTest(t);
	}

	@Override
	public void deleteTest(int testId) {
		// TODO Auto-generated method stub
		testdao.deleteTest(testId);
	}

	@Override
	public void updateTest(int testId) {
		// TODO Auto-generated method stub
		testdao.updateTest(testId);
	}

}
