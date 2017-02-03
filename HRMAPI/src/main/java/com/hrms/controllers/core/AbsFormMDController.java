package com.hrms.controllers.core;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hrms.dto.core.BaseDTO;
import com.hrms.response.core.SuccessResponse;
import com.hrms.service.core.GenericDTOService;

public abstract class AbsFormMDController<T extends BaseDTO> extends AbsController{
	
	abstract GenericDTOService<T> getDTOService();
	
	  
	@RequestMapping(value="save",method=RequestMethod.POST)
	public SuccessResponse<String> save(@RequestBody T dto) {
		
		String id= getDTOService().Save(dto).getId();
		return new SuccessResponse<String>(id);
	}
	
	@RequestMapping(value="{id}/show",method=RequestMethod.GET)
	public SuccessResponse<T> show(@PathVariable("id") String id) {
		 
		T dto = getDTOService().get(id);	
		return new SuccessResponse<T>(dto);
	}
	
}
