package com.arrays.meduim;

public class MajorityElement {

	public static void main(String[] args) {
		int[] array = {1,2,3,2,2,1,2};
		System.out.println(getMajorityElement(array));
	}
	
	public static int getMajorityElement(int[] array) {
		
		int count = 0;
		int answer = array[0];
		
		for(int value : array) {
			if(count == 0) {
				answer = value;
			}
			if(value == answer) {
				count++;
			}else {
				count--;
			}
		}
		return answer;
	}
}
