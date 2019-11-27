package com.nisum.functionalInterface;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void getCarDetails(String name, String color) {
		
		System.out.println("Car Details: " +name+ "," +color);
	}
	public static void main(String[] args) {
		
		BiConsumer<String, String> bic = BiConsumerExample::getCarDetails;
		bic.accept("hundai", "blue");
		bic.accept("honda", "green");
		BiConsumer<String, String> bicc = (name, color) -> System.out.println(name+" "+color);
		bicc.accept("maruthi", "white");
	}

}
