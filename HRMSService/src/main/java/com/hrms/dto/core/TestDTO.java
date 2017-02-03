package com.hrms.dto.core;

import java.util.List;

import com.hrms.entities.core.TestEntity;
import com.hrms.service.core.TestService;

public class TestDTO extends BaseDTO {

	@EntityService(TestService.class)
	@Master()
	TestEntity test;
	
	@EntityService(TestService.class)
	List<TestEntity> testList;

	public TestEntity getTest() {
		return test;
	}

	public void setTest(TestEntity test) {
		this.test = test;
	}

	public List<TestEntity> getTestList() {
		return testList;
	}

	public void setTestList(List<TestEntity> testList) {
		this.testList = testList;
	}
	
}
