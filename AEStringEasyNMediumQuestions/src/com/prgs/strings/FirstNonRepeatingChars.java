package com.prgs.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChars {

	public static void main(String[] args) {
		System.out.println(firstNonRepChar("abcdcaf"));
	}

	public static int firstNonRepChar(String str) {
		
		Entry<String, Long> e = Arrays.stream(str.split(""))
		      .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		      .entrySet()
		      .stream()
		      .filter(x->x.getValue()==1)
		      .findFirst()
		      .get();
		
		if(!e.getKey().isEmpty() && !e.getKey().isBlank()) {
			System.out.println(e.getKey());
			return str.indexOf(e.getKey());
		}
		return -1;
	}
}
