package com.cg.service;

import java.util.List;

import com.cg.entity.Test;

public interface TestServiceI {
	
    public Test addTest(Test t );
	
	public void deleteTest(int testId );
	
	public void updateTest(int testId);

	public List<Test> getAllTest();

}
