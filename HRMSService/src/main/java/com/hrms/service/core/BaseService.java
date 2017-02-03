package com.hrms.service.core;

import java.io.Serializable;
import java.util.List;

import com.hrms.entities.core.BaseEntity;

public abstract class BaseService<T extends BaseEntity, pk extends Serializable> implements IBaseService<T,pk> {

	
	@Override
	public void save(T entity) {

		getEntityDAO().save(entity);
	}
	
	@Override
	public void save(List<T> entities) {
		entities.forEach(i -> getEntityDAO().save(i));
		
	}

	@Override
	public void delete(T entity) {
		getEntityDAO().delete(entity);		
	}

	
	@Override
	public void delete(pk id) {
		getEntityDAO().delete(id);		
	}
	
	@Override
	public T findByUser(String user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T get(pk id) {
	 
		return getEntityDAO().get(id);
	}

	@Override
	public List<T> getAll() {
		 
		return getEntityDAO().getAll();
	}

	

}
