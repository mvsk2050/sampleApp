package com.nis.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamOperations {

	public static void main(String[] args) {
		
		List<Integer> listOdd  = Arrays.asList(3, 5, 7);
		List<Integer> listEven  = Arrays.asList(4, 2, 6, 8);
		
		List<List<Integer>> combine = Arrays.asList(listOdd, listEven);
		System.out.println(combine);
		combine.stream().flatMap(x -> x.stream()).forEach(System.out::println);
		
		List<String> words = Arrays.asList("one", "two", "onetwothree");
		Optional<String> op = words.stream().reduce((word1, word2) -> word1.length() > word2.length()?word1:word2);
		op.ifPresent(System.out::println);
		
		
	}

}
