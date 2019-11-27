package com.nis.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {

	public static List<String> vehicleTypes(List<String> vehiclesList) {
		
		return vehiclesList.stream().collect(Collectors.toList());
	}
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		l.add("bikes");
		l.add("cars");
		l.add("buses");
		Function<List<String>, List<String>> f = FunctionExample::vehicleTypes;
		System.out.println(f.apply(l));
	}

}
