package com.prgs.strings.medium;

public class OneEdit {

	public static void main(String[] args) {
		System.out.println(isOneEdit("ab","a")); /* expected true , got false */
		System.out.println(isOneEdit("helo","hello"));

	}
	/** One test case is failed*/
	public static boolean isOneEdit(String stringOne,String stringTwo) {
		
		if(stringOne.equals(stringTwo)) return true;
		if(Math.abs(stringOne.length()-stringTwo.length()) > 1) return false;
		
		StringBuilder sOne = new StringBuilder(stringOne);
		StringBuilder sTwo = new StringBuilder(stringTwo);
		
		Boolean isEdited = false;
		
		for(int i=0 ; i<Math.min(stringOne.length(), stringTwo.length()) ; i++) {
			if(sOne.charAt(i) == sTwo.charAt(i)) continue;
			
			if(sOne.length() == sTwo.length()) {
				sOne.setCharAt(i, sTwo.charAt(i));
				isEdited = true;
			}else if(sOne.length() > sTwo.length()) {
				sTwo.insert(i, sOne.charAt(i));
				isEdited = true;
			}else if(sOne.length() < sTwo.length()) {
				sOne.insert(i, sTwo.charAt(i));
				isEdited = true;
			}
			break;
		}
		
		if(!isEdited) {
			if(sOne.length() > sTwo.length()) {
				sOne.append(sTwo.charAt(sTwo.length()-1));
			}
			if(sOne.length() < sTwo.length()) {
				sTwo.append(sOne.charAt(sOne.length()-1));
			}
		}
		
		return sOne.toString().equals(sTwo.toString());
		
	}
}
