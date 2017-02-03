package com.hrms.service.jobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.dao.core.IBaseDAO;
import com.hrms.dao.jobs.OrgsDAO;
import com.hrms.entities.jobs.OrgsEntity;
import com.hrms.service.core.BaseService;

@Service
public class OrgsService extends BaseService<OrgsEntity, String> {

	@Autowired OrgsDAO orgsDAO;

	@Override
	public IBaseDAO<OrgsEntity, String> getEntityDAO() {

		return orgsDAO;
	}
	
	
}
