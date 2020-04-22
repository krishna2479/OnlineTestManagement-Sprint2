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

	
}
