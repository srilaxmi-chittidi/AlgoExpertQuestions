package com.prgs.strings;

public class PalindromeCheck {

	public static void main(String[] args) {
		System.out.println(isPalindrome("abcba"));
		System.out.println(isPalindrome("Atta"));
		System.out.println(isPalindrome("lemong"));
	}
	
	public static boolean isPalindrome(String str) {
		
		char[] charArray = str.toCharArray();
		int size = charArray.length-1;
		int counter = 0;
		for(int i=0;i<size;i++) {
			if(charArray[i] != charArray[size-i] && size-i>0 ) {
				counter++;
			}
		}
		return counter>0 ? false :true;
	}

}
