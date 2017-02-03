package com.hrms.entities.core;

import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Type;

@MappedSuperclass
public abstract class BaseEntityCodeName extends BaseEntityCode {

	@Type(type="org.hibernate.type.StringNVarcharType")
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
