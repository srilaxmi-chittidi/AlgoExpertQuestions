package com.prgs.strings.medium;

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
		
		Map<Character,Integer> global = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		for(String word : words) {
			Map<Character,Integer> local = new HashMap<>();
			for(Character c : word.toCharArray()) {
				local.put(c, local.getOrDefault(c, 0)+1);
				if(!global.containsKey(c)) {
					global.put(c, global.getOrDefault(c, 0)+1);
					sb.append(c);
				}else if(local.get(c)>global.get(c)){
					global.put(c, global.getOrDefault(c, 0)+1);
					sb.append(c);
				}
			}
		}
		
		return sb.toString().toCharArray();
	}

}
