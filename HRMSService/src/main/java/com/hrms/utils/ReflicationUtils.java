package com.hrms.utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.hrms.dto.core.BaseDTO;
import com.hrms.dto.core.EntityService;
import com.hrms.dto.core.Master;

public class ReflicationUtils {

	public static List<Field> getClassMemeber(BaseDTO dto) {
		List<Field> list = new ArrayList<Field>();
		Class<?> dtoClass = dto.getClass();
		for (Field f : dto.getClass().getDeclaredFields()) {
			
			if (f.isAnnotationPresent(EntityService.class)) {
				 list.add(f);
			}
		}
		return list;
	}
	
	public static boolean isMaster(String name,BaseDTO dto) {
		try {
			return dto.getClass().getDeclaredField(name).isAnnotationPresent(Master.class);
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
