package com.prgs.strings.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNums {

	public static void main(String[] args) {
		int[] results = missingNumbers(new int[] {1,4,3});
		Arrays.stream(results).forEach(System.out::println);
	}
	 public static int[] missingNumbers(int[] nums) {
	    Set<Integer> set = new HashSet<>();
	    for(int i=1;i<=nums.length+2;i++){
	      set.add(i);
	    }
	    for(int num :nums){
	      set.remove(num);
	    }
	    List<Integer> list = new ArrayList<>(set);
	    System.out.println(set.size());
	    return new int[] {list.get(0),list.get(1)};
	}

}
