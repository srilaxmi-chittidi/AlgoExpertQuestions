package com.prgs.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CommonChars {

	public static void main(String[] args) {
		String str[] = {"abc","bc","bcd"};
		String st[] = getCommonChars(str);
		Arrays.stream(st).forEach(System.out::println);
	}

	public static String[] getCommonChars(String[] str) {
		
		return Arrays.stream(str)
					.map(s->s.chars()
							.mapToObj(c->String.valueOf((char)c))
							.collect(Collectors.toSet()))
					.reduce((value,combined)->{ value.retainAll(combined);
					 							 return value;
					 							})
					.get().toArray(new String[0]);
	}
}
