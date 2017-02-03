package com.hrms.dao.core;

import java.io.Serializable;
import java.util.List;

public interface IBaseDAO <T,pk extends Serializable> {

	void save(final T entity);
	void delete(final T entity);
	void delete(final pk id);
 
	T findActives();
	T findByUser(final String user);
	
	T get(final pk id);
	List<T> getAll();
}
