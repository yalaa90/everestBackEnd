package com.hrms.service.core;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hrms.dto.core.BaseDTO;
import com.hrms.dto.core.EntityService;
import com.hrms.entities.core.BaseEntity;
import com.hrms.utils.ReflicationUtils;

public class GenericDTOService<T extends BaseDTO> {

	public BaseDTO Save(T dto) {
		ReflicationUtils.getClassMemeber(dto).forEach(i -> {

			BaseService service = GetService(i);
			String x = i.getName();
			Object obj = getDataResult(dto, x);

			if (obj instanceof BaseEntity) {
				service.save((BaseEntity) obj);
				if(ReflicationUtils.isMaster(x, dto)) {
					dto.setId(((BaseEntity) obj).getId());
				}
			}
			if (obj instanceof List) {
				service.save((List<BaseEntity>) obj);
			}
		});

		return dto;
	}

	public BaseService GetService(Field field) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/config/root-context.xml");

		return context.getBean(field.getAnnotation(EntityService.class).value());

	}

	public Object getDataResult(T dto, String x) {
		Object obj = new Object();
		try {
			obj = dto.getClass().getMethod("get" + x.substring(0, 1).toUpperCase() + x.substring(1)).invoke(dto);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	public T get(String id) {
		
	}
}
