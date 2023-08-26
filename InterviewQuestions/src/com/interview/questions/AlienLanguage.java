package com.interview.questions;

public class AlienLanguage {

	public static void main(String[] args) {

		//String[] words = {"word","world","row"};
		//String order = "worldabcefghijkmnpqstuvxyz";
		String[] words ={"hello","leetcode"};
		String order = "hlabcdefgijkmnopqrstuvwxyz";
		System.out.println(isInOrdered(words,order));
	}

	public static boolean isInOrdered(String[] words, String order) {
			for(int j=1;j<words.length;j++) {
				for(int i=0;i<Math.min(words[j].length(),words[j-1].length());i++) {
					if(order.indexOf(words[j-1].charAt(i)) == order.indexOf(words[j].charAt(i))){
						continue;
					}
					if(order.indexOf(words[j-1].charAt(i)) > order.indexOf(words[j].charAt(i))) {
						return false;
					}else {
						return true;
					}
				}
			}
		return true;
	}
}
/**
In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.

Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographically in this alien language.

Example 1:

Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"

Output: true

Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.


JobTwine Interviewer
just now
Example 2:

Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"

Output: false

Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.
*/