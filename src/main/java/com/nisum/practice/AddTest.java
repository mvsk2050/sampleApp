package com.nisum.practice;

public class AddTest {

	public static void main(String[] args) {
		
		TestInterface evenOdd = res -> {
			if (res %2 == 0) {
				System.out.println("Even");
			}
			else {
				System.out.println("Odd");
			}
			return 0;
		}; 
		evenOdd.test(1);
	}

}
