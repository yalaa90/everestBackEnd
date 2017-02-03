package com.hrms.controllers.core;

import com.hrms.entities.core.BaseEntity;
import com.hrms.service.core.IBaseService;

public interface IFormController<T extends BaseEntity> {

	IBaseService<T,String> getEntityService();
}
