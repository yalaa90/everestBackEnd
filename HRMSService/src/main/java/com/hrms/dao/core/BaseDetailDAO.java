package com.hrms.dao.core;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;

import com.hrms.entities.core.BaseEntity;

public abstract class BaseDetailDAO <T extends BaseEntity, pk extends Serializable> extends BaseDAO<T, pk> {

	protected abstract Criteria getMainCriteria();
	
	public List<T> getDetail(){
		return getMainCriteria().list();
	}
}
