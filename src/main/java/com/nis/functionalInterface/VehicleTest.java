package com.nis.functionalInterface;
public class VehicleTest implements Vehicle {
	
	public static void main(String[] args) {
		
		VehicleTest vt = new VehicleTest();
		System.out.println(vt.color("red"));
	}

	@Override
	public String color(String s) {
	
		return s;
	}
}
