package com.oops.collections;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {

		List<Student> list=new ArrayList<>();
		
		
		list.add(new Student("Gautam"));
		list.add(new Student("Rahul"));
		System.out.println(list);
	}

}
