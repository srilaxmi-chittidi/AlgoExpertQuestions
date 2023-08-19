package com.prgs.strings;

public class CaesarCypher {

	public static void main(String[] args) {
		System.out.println(caesarCypherEncryptor("abc",2)); //cde
		System.out.println(caesarCypherEncryptor("yza",2)); //abc
		System.out.println(caesarCypherEncryptor("xyz",2)); //zab
	}
	
	public static String caesarCypherEncryptor(String str,int key) {
		StringBuilder sb = new StringBuilder();
		int size = str.length();
		for(int i=0;i<size;i++) {
			int ascii = str.charAt(i)+(key%26);
			if(ascii > 'z') 
				ascii = ascii-26;
			sb.append((char)ascii);
		}
		return sb.toString();
	}
}
