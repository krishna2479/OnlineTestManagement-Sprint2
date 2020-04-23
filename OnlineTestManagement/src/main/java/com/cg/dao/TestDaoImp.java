package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entity.Test;

@Transactional
@Repository
public class TestDaoImp implements TestDaoI {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void create(Test t) {
		em.persist(t);
	
	}

	@Override
	public void deleteTest(int testId) {
		
		Test t=em.find(Test.class, testId);
		em.remove(t);
	}

	@Override
	public void updateTest(int testId) {
		
		Test t1=em.find(Test.class, testId);
		t1.setTestTitle("Java Test");
		System.out.println("Updated...");
		em.flush();
	}

	

	
}
