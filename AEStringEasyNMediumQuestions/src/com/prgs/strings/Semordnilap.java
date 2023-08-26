package com.prgs.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Semordnilap {

	public static void main(String[] args) {
		System.out.println(getSemordnilapPairs(new String[]{"dog", "god"}));
	}

	public static List<List<String>> getSemordnilapPairs(String[] words) {
		Set<String> wordSet = new HashSet<>();
		List<List<String>> results = new ArrayList<>();
		for(String word : words) {
			String reverse = new StringBuilder(word).reverse().toString();
			if(wordSet.contains(reverse)) {
				List<String> list = new ArrayList<>();
				list.add(reverse); list.add(word);
				results.add(list);
				wordSet.remove(word);
			}else {
				wordSet.add(word);
			}
		}
		return results;
		
	}
}
