package com.arrays.meduim;

public class LongestPeak {

	public static void main(String[] args) {
		
		//int[] array = {1, 1, 1, 2, 3, 10, 12, -3, -3, 2, 3, 45, 800, 99, 98, 0, -1, -1, 2, 3, 4, 5, 0, -1, -1};
		int[] array = {1, 2, 3, 2, 1, 1};
		getLongestPeak(array);
		
	}
	
	public static int getLongestPeak(int[] array) {
		
		int[] left = new int[array.length];
		for(int i = 1;i<array.length;i++) {
			if(array[i-1] < array[i]) {
				left[i] = left[i-1]+1;
			}
		}
		print(array);
		System.out.println();
		System.out.println("----------");
		print(left);
		int[] right = new int[array.length];
		for(int j=array.length-2 ; j>=0 ;j--) {
			if(array[j+1] < array[j]) {
				right[j] = right[j+1]+1;
			}
		}
		System.out.println();
		System.out.println("----------");
		print(right);
		int max = 0;
		for(int i = 0 ;i< array.length ;i++) {
			if(left[i] !=0 && right[i]!=0) {
				max = Math.max(left[i]+right[i]+1, max);
			//	System.out.println("max "+max);
			}
		}
		System.out.println("max "+max);

		return max;
	}
	public static void print(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	

}
