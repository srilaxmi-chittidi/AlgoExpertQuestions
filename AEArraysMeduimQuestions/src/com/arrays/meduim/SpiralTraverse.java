package com.arrays.meduim;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {

	public static void main(String[] args) {
		int[][] inputArr = new int[][]  { {1, 2, 3, 4}, 
										  {12, 13, 14, 5}, 
										  {11, 16, 15, 6}, 
										  {10, 9, 8, 7}  };
		List<Integer> output = getSpiralTraverseArray(inputArr);
	}

	public static List<Integer> getSpiralTraverseArray(int[][] inputArr) {
		
		if(inputArr.length == 0) return new ArrayList<>();
		List<Integer> output = new ArrayList<>();
		int rows = inputArr.length;
		int cols = inputArr[0].length;
		spiralFill(inputArr, 0, rows-1,0,cols-1,output);
		output.stream().forEach(System.out::println);

		return output;
		
	}
	public static void spiralFill(int[][] inputArr,int startRow,int endRow,
												   int startCol, int endCol,List<Integer> output) {
		if(startRow > endRow || startCol > endCol) return;
		
		for(int col =startCol ; col <= endCol ;col++) {
			output.add(inputArr[startCol][col]);
		}
		for(int row = startRow+1;row <= endRow ; row++) {
			output.add(inputArr[row][endCol]);
		}
		for(int col = endCol-1; col >= startCol; col--) {
			if(startRow == endRow) break;
			output.add(inputArr[endRow][col]);
		}
		for(int row = endRow-1; row >= startRow+1; row--) {
			if(startCol == endCol) break;
			output.add(inputArr[row][startCol]);
		}
	
		spiralFill(inputArr,startRow+1,endRow-1,startCol+1,endCol-1,output);
		}

}
