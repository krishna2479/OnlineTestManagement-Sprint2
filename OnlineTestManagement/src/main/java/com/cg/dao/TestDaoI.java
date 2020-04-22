package com.cg.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entity.Test;

@Transactional
@Repository
public interface TestDaoI {


	void create(Test t);
	

	
	

}
