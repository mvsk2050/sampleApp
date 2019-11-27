package com.nisum.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	static void getCarModel(String s) {
		System.out.println("Model of the car: "+s);
	}
	
	static void getAllCars(List<String> carList) {
		
		System.out.println("List of all cars: "+carList);
	}
	public static void main(String[] args) {
		
		Consumer<String> c = ConsumerExample::getCarModel;
		c.accept("sedan");
		c.accept("suv");
		
		List<String> l = Arrays.asList("maruthi", "hundai", "honda");
		Consumer<List<String>> clist = ConsumerExample::getAllCars;
		clist.accept(l);
	}

}
