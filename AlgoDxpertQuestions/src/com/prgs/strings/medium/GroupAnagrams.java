package com.prgs.strings.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("yo");
		list.add("act");
		list.add("flop");
		list.add("tac");
		list.add("foo");
		list.add("cat");
		list.add("oy");
		list.add("olfp");
		List<List<String>> results = getGroupAnagrams(list);
		results.stream().forEach(System.out::println);
	}
	public static List<List<String>> getGroupAnagrams(List<String> words){
		List<List<String>> results = new ArrayList<>();
		Map<String,List<String>> map = new HashMap<>();
		for(String word : words) {
			char[] charArray = word.toCharArray();
			Arrays.sort(charArray);
			String str = new String(charArray); 
			if(!map.containsKey(str)) {
				map.put(str, new ArrayList<>());
			}
			map.get(str).add(word);
		}
		results.addAll(map.values());
		return results;
	}

}
