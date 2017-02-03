package com.hrms.entities.core;

import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Type;

@MappedSuperclass
public abstract class BaseEntityCode extends BaseEntity{

	@Type(type="org.hibernate.type.StringNVarcharType")
	public String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
}
