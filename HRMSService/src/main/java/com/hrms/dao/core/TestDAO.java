package com.hrms.dao.core;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hrms.entities.core.TestEntity;

@Repository

public class TestDAO extends BaseDAO<TestEntity,String> {

}
