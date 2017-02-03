package com.hrms.controllers.jobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.controllers.core.DefaultFormController;
import com.hrms.entities.jobs.OrgsEntity;
import com.hrms.service.core.IBaseService;
import com.hrms.service.jobs.OrgsService;

@RestController
@RequestMapping("orgs")
public class OrgsController  extends DefaultFormController<OrgsEntity>{

	@Autowired OrgsService orgsService;
	@Override
	public IBaseService getEntityService() {
		
		return orgsService;
	}

}
