package com.hrms.test.core;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hrms.controllers.core.TestController;
import com.hrms.dto.core.TestDTO;
import com.hrms.entities.core.TestEntity;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/config/root-context.xml", "classpath:/config/servlet-context.xml",
		"classpath:/config/hibernate-context.xml  " })
public class EmployeeTest {

	@Autowired
	private TestController testController;

	/*
	 * @Test public void test() { try { TestEntity entity = new TestEntity();
	 * entity.setAge(5); entity.setCode("1"); testController.save(entity);
	 * System.out.println(entity.id); Object obj =
	 * testController.show(entity.id); System.out.println(obj); }
	 * catch(Exception ex) {
	 * 
	 * System.out.println(ex.getMessage()); }
	 * 
	 * }
	 */
	/*
	 * @Test public void testList() { try {
	 * 
	 * System.out.println(testController.showAll().getData()); } catch
	 * (Exception e) { System.out.println(e.getMessage()); }
	 * 
	 * }
	 */

/*	@Test
	public void testDelete() {
		try {
			TestEntity entity = new TestEntity();
			entity.setAge(5);
			entity.setCode("1");
			
			testController.save(entity);
			testController.delete(entity.id);
		SuccessResponse<TestEntity> res=testController.show(entity.id);
		System.out.println(res.getData());
		} catch (Exception e) {
			System.out.println(e);
		}

	}*/
	@Autowired TestController testContoller;
	
	@Test
	public void TestDTO() {
		
		try {
			TestDTO dto = new TestDTO();
			TestEntity entity = new TestEntity();
			entity.setCode("1");
			TestEntity entity2 = new TestEntity();
			entity2.setCode("1");
			TestEntity entity3 = new TestEntity();
			entity3.setCode("1");
			TestEntity entity4 = new TestEntity();
			entity4.setCode("1");
			TestEntity entity5 = new TestEntity();
			entity5.setCode("1");
			List <TestEntity> list = new ArrayList<TestEntity>();
			list.add(entity2);
			list.add(entity3);
			list.add(entity4);
			list.add(entity5);
			
			dto.setTest(entity);
			dto.setTestList(list);
			
			testContoller.save(dto);

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
