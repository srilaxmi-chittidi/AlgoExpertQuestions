package com.prgs.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Semordnilap {

	public static void main(String[] args) {
		System.out.println(getSemordnilapPairs(new String[]{"dog", "god"}));
	}

	public static ArrayList<ArrayList<String>> getSemordnilapPairs(String[] words) {
		Set<String> wordSet = new HashSet<>();
		ArrayList<ArrayList<String>> results = new ArrayList<>();
		for(String word : words) {
			String reverse = new StringBuilder(word).reverse().toString();
			if(wordSet.contains(reverse)) {
				ArrayList<String> list = new ArrayList<>();
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
