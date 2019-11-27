package com.nisum.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RetrieveStudentInfo {

	public static void main(String[] args) {

		List<Student> stu = Arrays.asList(new Student(1, "kumar"), new Student(2, "kk"));

		List<Student> stuTemp = stu.stream().map(temp -> {
			temp.getId();
			temp.getName();
			return temp;
		}).collect(Collectors.toList());
		System.out.println(stuTemp);
		
	}
}
