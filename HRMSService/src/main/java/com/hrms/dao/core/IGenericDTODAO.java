package com.hrms.dao.core;

import com.hrms.dto.core.BaseDTO;

public interface IGenericDTODAO <T extends BaseDTO>{

	T get(T dto);
	
	boolean save(T dto);
	
	boolean delete(T dto);
	

}
