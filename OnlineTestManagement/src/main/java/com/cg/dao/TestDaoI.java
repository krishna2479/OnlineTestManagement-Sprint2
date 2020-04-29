package com.cg.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.entity.Test;


@Repository
public interface TestDaoI {


	public Test addTest(Test t);
	
    public void deleteTest(int testId);
	
	public void updateTest(int testId);

	public List<Test> getAllTest();
	
	

}
