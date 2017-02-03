package com.hrms.service.core;

import java.io.Serializable;
import java.util.List;

import com.hrms.dao.core.IBaseDAO;
import com.hrms.entities.core.BaseEntity;

public interface IBaseService<T extends BaseEntity, pk extends Serializable> {
	
	IBaseDAO<T,pk> getEntityDAO();
	
	void save(final T entity);
	
	void save(final List<T> entities);
	void delete(final T entity);
	void delete(final pk id);
 
	T findByUser(final String user);
	
	T get(final pk id);
	List<T> getAll();
	

}
