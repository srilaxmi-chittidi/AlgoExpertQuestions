package com.prgs.strings;

public class LongestPalidromeSubString {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("abaxyzzyxf"));
	}

	public static String longestPalindrome(String str) {

        int size=str.length();
        int start =0;
        int end = 0;

        boolean[][] dp = new boolean[size][size];

        for(int i=0;i<size;i++){
            for(int j=0;j+i <size;j++){
                dp[j][i+j] = str.charAt(j) == str.charAt(i+j) && (j <2 || dp[j+1][j+i-1]);
                if(dp[j][i+j] && j> end-start) {
                    start =j;
                    end = j+i;
                }
            }
        }      
        return str.substring(start,end+1);
	}
}
