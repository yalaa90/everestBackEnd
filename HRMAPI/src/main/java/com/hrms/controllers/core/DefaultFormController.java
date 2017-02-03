package com.hrms.controllers.core;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hrms.entities.core.BaseEntity;
import com.hrms.response.core.SuccessResponse;

public abstract class DefaultFormController<T extends BaseEntity> extends AbsFormController<T> {

	 
	
	@RequestMapping(value="save",method=RequestMethod.POST)
	public SuccessResponse<Boolean> save(@RequestBody T entity) {

		getEntityService().save(entity);
		return new SuccessResponse<Boolean>(true);
	}
	
	@RequestMapping(value="{id}/delete",method=RequestMethod.DELETE)
	public SuccessResponse<Boolean> delete(@PathVariable("id") String id) {
		
		getEntityService().delete(id);
		return new SuccessResponse<Boolean>(true);
		
	}
	
	@RequestMapping(value="{id}/show",method=RequestMethod.GET)
	public SuccessResponse<T> show(@PathVariable("id") String id) {
		T model;	
		 
		model = getEntityService().get(id);	
		return new SuccessResponse<T>(model);
	}
	
	@RequestMapping(value="show", method=RequestMethod.GET)
	public SuccessResponse<List<T>> showAll() {
		
		List<T> models = getEntityService().getAll();
		return new SuccessResponse<List<T>>(models);
		
	}
}
