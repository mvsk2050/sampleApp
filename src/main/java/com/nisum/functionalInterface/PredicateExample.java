package com.nisum.functionalInterface;

import java.util.function.Predicate;

public class PredicateExample {

	public static Boolean testVehicle(String s) {
		
		if (s.equals("hi")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Predicate<String> p = PredicateExample::testVehicle;
		Boolean b = p.test("hii");
		System.out.println(b);
	}

}
