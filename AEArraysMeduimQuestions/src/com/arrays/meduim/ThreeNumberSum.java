package com.arrays.meduim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {

	public static void main(String[] args) {
		int[] array = new int[] {12, 3, 1, 2, -6, 5, -8, 6};
		int target = 0;
		List<Integer[]> list =threeNumberSum(array, target);
		list.stream().forEach(x->Arrays.stream(x).forEach(System.out::println));
	}

  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {

	  List<Integer[]> results = new ArrayList<>();
	  Arrays.sort(array);
	  
	  int currentIdx = 0;
	  int leftIdx = currentIdx+1;
	  int rightIdx = array.length-1;
	  int sum =0;
	  
	  
	  while(currentIdx < array.length -1) {
		  
		  sum = add(currentIdx,leftIdx,rightIdx,array);

		  if(sum == targetSum) {
			  results.add(new Integer[] {array[currentIdx],array[leftIdx],array[rightIdx]});
			  leftIdx = leftIdx+1;
			  rightIdx = rightIdx-1;
		  }
		  if(sum < targetSum) {
			  leftIdx = leftIdx+1;
		  }else {
			  rightIdx = rightIdx-1;
		  }
		  if(leftIdx >= rightIdx) {
			  currentIdx = currentIdx+1;
			  leftIdx = currentIdx+1;
			  rightIdx = array.length -1;
		  }
	  }
	  return results;
    }
  
  public static int add(int currentIdx,int leftIdx,int rightIdx,int[] array) {
	  return array[currentIdx] + array[leftIdx] + array[rightIdx];
  }
}
