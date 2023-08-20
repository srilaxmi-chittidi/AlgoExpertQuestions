package com.prgs.strings.medium;

public class LongestPalidromeSubString {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("abaxyzzyxf"));
	}

	public static String longestPalindrome(String str) {
		if(str.length() == 0 || str.length() == 1) return str;
		int[] strIndexes = {0,1};
		
		for(int i=1 ; i<str.length() ; i++) {
			int[] odd = findPalindromeBetween(str,i-1,i+1);
			int[] even = findPalindromeBetween(str,i-1,i);
			
			int[] greaterBetweenTwo = odd[1]-odd[0] > even[1]-even[0] ? odd:even;
			strIndexes = ((strIndexes[1] - strIndexes[0]) > (greaterBetweenTwo[1] - greaterBetweenTwo[0])) ?
					strIndexes : greaterBetweenTwo;
		}
		
		return str.substring(strIndexes[0],strIndexes[1]+1);
	}
	
	public static int[] findPalindromeBetween(String str, int left, int right) {
		while(left>=0 && right < str.length()) {
			if(str.charAt(left) != str.charAt(right)) 	break;
			left--;
			right++;
		}
		return new int[] {left+1,right-1};
	}
}
