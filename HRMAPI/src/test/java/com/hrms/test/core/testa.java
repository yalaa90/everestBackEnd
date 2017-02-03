package com.hrms.test.core;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class testa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.asList("jackal","kangaroo","lemur")
		.parallelStream()
		.map(s -> s.length()).reduce((x,y)-> x+y).get());
		
		
	}
	
	

	 
}
