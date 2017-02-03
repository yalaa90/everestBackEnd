package com.hrms.service.core;

import java.io.Serializable;
import java.util.List;

import com.hrms.dao.core.IBaseDetailDAO;
import com.hrms.entities.core.BaseEntity;

public abstract class BaseDetailService<T extends BaseEntity, pk extends Serializable> extends BaseService<T,pk> implements IBaseDetailService<T,pk> {

	public List<T> getDetail(){
		 return ((IBaseDetailDAO<T,pk>)getEntityDAO()).getDetail();
	}
}
