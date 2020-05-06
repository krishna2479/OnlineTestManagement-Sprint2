package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.TestDaoI;
import com.cg.entity.Test;

@Transactional
@Service
public class TestServiceImp implements TestServiceI {
	
	@Autowired
	TestDaoI testdao;
/****************************************************************
 * Method - addTest
 * description - add the new object of class Test
 * @param testId - Test's id
 * @return - object of class Test
 * @author - Krishna Kant
 * created date - 17-APR-2020
 ******************************************************************/
	@Override
	public Test addTest(Test t) {
		// TODO Auto-generated method stub
		return testdao.addTest(t);
	}
	/****************************************************************
	 * Method - deleteTest
	 * description - delete the object of class Test by testId
	 * @param testId - Test's id
	 * @return - null
	 * @author - Krishna Kant
	 * created date - 17-APR-2020
	 ******************************************************************/
	@Override
	public void deleteTest(int testId) {
		// TODO Auto-generated method stub
		testdao.deleteTest(testId);
	}
	/****************************************************************
	 * Method - updateTest
	 * description - update the object of class Test with reference of testId
	 *               and save the updated object in variable updatedTest
	 * @param testId - Test's id
	 * @param updatedTest - new object to store updated values
	 * @return - updated object of class Test
	 * @author - Krishna Kant
	 * created date - 20-APR-2020
	 ******************************************************************/

	@Override
	public void updateTest(int testId, Test updatedTest )
	{
	  Test test=testdao.findById(testId);
	   test=updatedTest;
	   testdao.updateTest(test);
	}
	
	/****************************************************************
	 * Method - getAllTest
	 * description - get all the data from the table
	 * @return - all the object of class Test
	 * @author - Krishna Kant
	 * created date - 21-APR-2020
	 ******************************************************************/
	@Override
	public List<Test> getAllTest() {
		return testdao.getAllTest();
	}

}