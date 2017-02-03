package com.hrms.dto.core;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.hrms.service.core.BaseService;
import com.hrms.service.core.TestService;

@Retention(RUNTIME)
@Target(FIELD)
public @interface EntityService {

	Class<? extends BaseService> value();

	 
}


