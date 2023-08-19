package com.prgs.strings.medium;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		getReverseString("AlgoExpert is the best!");
	}
	
	public static String getReverseString(String string) {
		
		int size = string.length();
		int start=0,i=0;
		
		List<String> words = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		if(size <2 ) return string;
		for(i=1;i<size;i++) {
			Character prevChar = string.charAt(i-1), currChar = string.charAt(i);
			if((prevChar == ' ' || currChar == ' ') && prevChar != currChar) {
				words.add(string.substring(start,i));
				start =i;
			}
		}
		words.add(string.substring(start,i));
		for(i=words.size()-1;i>=0;i--) {
			sb.append(words.get(i));
			System.out.println(sb);
		}
		return sb.toString();
	}

}
