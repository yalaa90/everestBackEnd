package com.hrms.service.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.dao.core.IBaseDAO;
import com.hrms.dao.core.TestDAO;
import com.hrms.entities.core.TestEntity;

@Service
public class TestService extends BaseService<TestEntity,String> {

	@Autowired TestDAO testDAO;
	
	@Override
	public IBaseDAO<TestEntity, String> getEntityDAO() {
		return testDAO;
	}

 
	 
	 

}
