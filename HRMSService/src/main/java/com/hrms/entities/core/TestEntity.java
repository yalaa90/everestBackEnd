package com.hrms.entities.core;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

public class TestEntity extends BaseEntityCodeName{

	private Integer age;
	
	private String lastName;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
