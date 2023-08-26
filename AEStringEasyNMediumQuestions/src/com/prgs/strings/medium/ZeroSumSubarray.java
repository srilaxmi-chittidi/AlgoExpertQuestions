package com.prgs.strings.medium;

import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubarray {

	public static void main(String[] args) {
		int[] nums = {-5,-5,2,3,-2};
		boolean result = isZeroSumSubArray(nums);
		System.out.println(result);
	}
	
	public static boolean isZeroSumSubArray(int[] nums) {
		
		Set<Integer> set = new HashSet<>();
		int sum =0;
		for(int num : nums) {
			sum = sum+num;
			if(set.contains(sum))
				return true;
			set.add(sum);
			System.out.println("------"+sum+"-----");
			set.stream().forEach(System.out::println);
		}
		return false;
	}
}
