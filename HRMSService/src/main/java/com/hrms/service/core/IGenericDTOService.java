package com.hrms.service.core;

import com.hrms.entities.core.BaseEntity;

public interface IGenericDTOService <T extends BaseEntity> {
	Boolean Save( T dto);
}
