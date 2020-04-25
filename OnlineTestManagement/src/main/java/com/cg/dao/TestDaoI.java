package com.cg.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entity.Test;

@Transactional
@Repository
public interface TestDaoI {


	public Test addTest(Test t);
	
    public void deleteTest(int testId);
	
	public void updateTest(int testId);
	
	

}
