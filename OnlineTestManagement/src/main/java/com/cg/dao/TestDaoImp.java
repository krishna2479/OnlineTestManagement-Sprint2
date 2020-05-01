package com.cg.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entity.Test;


@Repository
public class TestDaoImp implements TestDaoI {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public Test addTest(Test t) {
		em.persist(t);
		return t;
	
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

	@Override
	public List<Test> getAllTest() {
		Query query = em.createQuery("from Test t");
		return query.getResultList();
	}

	

	
}
