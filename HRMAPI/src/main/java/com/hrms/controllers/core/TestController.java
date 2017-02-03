package com.hrms.controllers.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.dto.core.TestDTO;
import com.hrms.service.core.GenericDTOService;
import com.hrms.service.core.TestServiceDTO;

@RestController
@RequestMapping("test")
public class TestController extends AbsFormMDController<TestDTO> {

	@Autowired TestServiceDTO testService;

	@Override
	GenericDTOService<TestDTO> getDTOService() {
		 
		return testService;
	}
  
	/* 
	@RequestMapping(value="save",method=RequestMethod.POST)
	public SuccessResponse<TestEntity> saveEntity( @RequestBody TestEntity entity) {
		
	getEntityService().save(entity);
		return new SuccessResponse<TestEntity> (entity);
	}*/
	
	

}
