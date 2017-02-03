package com.hrms.dao.core;

import org.hibernate.Criteria;

import com.hrms.entities.core.TestEntity;

public class TestMDDAO extends BaseDetailDAO<TestEntity,String>  {

	@Override
	protected Criteria getMainCriteria() {
		return getSession().createCriteria(EntityClass);
	}
	
	

}
