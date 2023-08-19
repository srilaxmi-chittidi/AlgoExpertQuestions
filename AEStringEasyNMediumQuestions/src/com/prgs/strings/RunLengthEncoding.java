package com.prgs.strings;

public class RunLengthEncoding {

	public static void main(String[] args) {
		System.out.println(runLengthEncoding("AAAAAAAAAAABBBBBBBDDDDDDDDD"));
	}

	public static String runLengthEncoding(String str) {
		
		StringBuilder sb = new StringBuilder();
		int i=0,j=0;
		
		while(j<str.length()) {
			if(str.charAt(i) == str.charAt(j) && (j-i)<9) {
				j++;
			}else {
				sb.append(Integer.toString(j-i)).append(str.charAt(i));
				i=j;
			}
		}
		if(i>-1) {
			sb.append(j-i).append(str.charAt(str.length()-1));
		}
		return sb.toString();
	}
}
