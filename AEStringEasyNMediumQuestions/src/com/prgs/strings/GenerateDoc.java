package com.prgs.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenerateDoc {

	public static void main(String[] args) {
	//	System.out.println(generateDoc("Bste!hetsi ogEAxpelrt x ","AlgoExpert is the Best!"));
		System.out.println(generateDocument("Bste!hetsi ogEAxpelrt x ","AlgoExpert is the Best!"));
	}

	// Java 8 ** All test cases or not passed
	public static Boolean generateDoc(String characters, String document) {
		
		return Stream.of(document.split(""))
								.sorted()
								.collect(Collectors.toList())
								.equals(Stream.of(characters.split(""))
												.sorted()
												.collect(Collectors.toList()));
	}
	public static Boolean generateDocument(String characters, String document) {
		Map<Character,Integer> map = new HashMap<>();
		
		for(char c : characters.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
	
		for(char c : document.toCharArray()) {
			if(!map.containsKey(c) || map.get(c) == 0) return false;
		//	map.put(c, map.get(c)-1);
		}
		return true;
	}
}

/**

*/