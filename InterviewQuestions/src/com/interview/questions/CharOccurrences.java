package com.interview.questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** 
Input
ArrayList = ['A', 'a', 'B', 'b', 'd', 'e', 'E', 'e']
Output
-->ArrayList = ['A', 'B', 'D', 'E']
--> A: 2, B: 2, E: 3
 */
public class CharOccurrences {

	public static void main(String[] args) {
		List<Character> list  = Stream.of('A', 'a', 'B', 'b', 'd', 'e', 'E', 'e').toList();
		getOccurrences(list);
		getOccurrencesInJava8(list);
		
	}
	public static Map<Character,Integer> getOccurrences(List<Character> list){
		Map<Character, Integer> map = new HashMap<>();
		for(Character c: list) {
			c = Character.toUpperCase(c);
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		return map;
	}
	public static void getOccurrencesInJava8(List<Character> list){
		list.stream()
			.collect(Collectors.groupingBy(
						   c->Character.toUpperCase(c),
						   Collectors.counting()))
			.forEach((k,v)->System.out.println(k+" "+v));;
	}
}
