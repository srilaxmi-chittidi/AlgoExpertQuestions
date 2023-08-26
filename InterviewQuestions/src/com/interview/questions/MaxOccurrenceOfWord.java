package com.interview.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxOccurrenceOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMaxCountOfWord("I am am best, best, best right right right right"));
	}

	public static String getMaxCountOfWord(String input) {
		return Arrays.stream(input.split(" "))
					.collect(Collectors.groupingBy(Function.identity(), 
							Collectors.counting()))
					.entrySet()
					.stream()
					.sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
					.findFirst()
					.get()
					.getKey();
					
	}
}
