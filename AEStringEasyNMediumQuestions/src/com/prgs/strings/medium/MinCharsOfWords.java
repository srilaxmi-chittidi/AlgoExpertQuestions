package com.prgs.strings.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinCharsOfWords {

	public static void main(String[] args) {
		String[] words = new String[] {"this", "that", "did", "deed", "them!", "a"};
		char[] chars = getMinCharsOfWords(words);
		System.out.println(chars.length);
		for(Character c : chars) {
			System.out.print(c+" ");
		}
	}
	
	public static char[] getMinCharsOfWords(String[] words) {
		
		Map<Character,Integer> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		for(String word : words) {
			Map<Character,Integer> temp = new HashMap<>();
			for(Character c : word.toCharArray()) {
				temp.put(c, temp.getOrDefault(c, 0)+1);
				if(!map.containsKey(c)) {
					map.put(c, map.getOrDefault(c, 0)+1);
					sb.append(c);
				}else if(temp.get(c)>map.get(c)){
					map.put(c, map.getOrDefault(c, 0)+1);
					sb.append(c);
				}
			}
		}
		
		return sb.toString().toCharArray();
	}

}
