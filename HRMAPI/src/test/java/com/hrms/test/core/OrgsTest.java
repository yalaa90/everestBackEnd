package com.hrms.test.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hrms.controllers.jobs.OrgsController;
import com.hrms.entities.jobs.OrgsEntity;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/config/root-context.xml", "classpath:/config/servlet-context.xml",
		"classpath:/config/hibernate-context.xml  " })
public class OrgsTest {

	@Autowired
	OrgsController orgsController;

	@Test
	public void test() {
		try {
			OrgsEntity orgs = new OrgsEntity();
			orgs.setName("الجهه");
			orgs.setCode("123");
			orgs.setStatus(true);
			orgs.setNote("ملاحظات");
			orgsController.save(orgs);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
