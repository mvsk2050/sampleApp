package com.nis.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaTest {

	public static void main(String[] args) {
		
		List<String> str = Arrays.asList("abc", "bcd", "bc", "def");
		
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student(1, "kumar"));
		stuList.add(new Student(2, "maku"));
		
		stuList
			.stream()
			.filter(s -> s.getName().startsWith("k"))
			.sorted()
			.forEach(s -> System.out.println(s.getId()));
		
		str.stream().filter(s -> s.length()>3).collect(Collectors.toList());
		System.out.println(str);
		
		List<Integer> numList = Arrays.asList(3, 5, 8, 6, 9);
		List<Integer> disList = numList.stream().map(n -> n * n).distinct().collect(Collectors.toList());
		System.out.println(disList);
	}
}
