package com.prgs.strings.medium;

import java.util.LinkedList;
import java.util.List;

public class ValidIpAddresses {

	public static void main(String[] args) {
		List<String> results = getValidIpAddr("1921680");
		results.stream().forEach(System.out::println);
	}
	
	public static List<String> getValidIpAddr(String string){
		
		List<String> results = new LinkedList<>();
		int size = string.length();
		for(int i=0 ; i<size-3 ; i++) {
			for(int j=i+1 ; j<size-2 ; j++) {
				for(int k=j+1 ; k<size-1 ; k++) {
					String p1 = string.substring(0,i+1);
					String p2 = string.substring(i+1,j+1);
					String p3 = string.substring(j+1,k+1);
					String p4 = string.substring(k+1);
					if(validIpPart(p1) && validIpPart(p2) && validIpPart(p3) && validIpPart(p4)) {
						results.add(new String(p1+"."+p2+"."+p3+"."+p4));
						System.out.println(new String(p1+"."+p2+"."+p3+"."+p4));
					}
				}
			}
		}
		return results;
	}
	public static boolean validIpPart(String part) {
		return Integer.parseInt(part)<256 &&
				(part.length() > 1 &&
					part.charAt(0) != '0' || part.length() == 1);
	}
}
