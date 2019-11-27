package com.nisum.functionalInterface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample implements Supplier<Integer>{

	public static void main(String[] args) {
		
		SupplierExample s = new SupplierExample();
		System.out.println(s.get());
	}

	@Override
	public Integer get() {
		
		Integer i = new Random().nextInt(10);
		return i;
	}
}
