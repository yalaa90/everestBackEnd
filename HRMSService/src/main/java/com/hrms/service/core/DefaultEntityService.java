package com.hrms.service.core;

import org.springframework.stereotype.Repository;

import com.hrms.dao.core.IBaseDAO;
import com.hrms.entities.core.BaseEntity;

@Repository
public class DefaultEntityService <T extends BaseEntity> extends BaseService<T,String> {

	@Override
	public IBaseDAO getEntityDAO() {
		// TODO Auto-generated method stub
		return null;
	}

}
