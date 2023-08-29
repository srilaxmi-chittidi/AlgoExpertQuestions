package com.arrays.meduim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {

	public static void main(String[] args) {
		int[][] intervals = new int[][] {
		    {2, 3},
		    {4, 5},
		    {6, 7},
		    {8, 9},
		    {1, 10}
		};
		int[][] results = getMergedIntervals(intervals);
		for(int i=0;i<results.length;i++) {
			for(int j=0;j<results[0].length;j++) {
				System.out.print(results[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static int[][] getMergedIntervals(int[][] intervals){
		
		List<int[]> mergedIntervals = new ArrayList<int[]>();
		int[][] sortedIntervals = intervals.clone();
		Arrays.sort(sortedIntervals, (a,b) -> Integer.compare(a[0],b[0]));
		
		int[] currentInterval = sortedIntervals[0];
		mergedIntervals.add(currentInterval);
		
		for(int[] nextInterval : sortedIntervals) {
			int currentIntervalEnd = currentInterval[1];
			int nextIntervalStart = nextInterval[0];
			int nextIntervalEnd = nextInterval[1];
			
			if(currentIntervalEnd >= nextIntervalStart) {
				currentInterval[1] = Math.max(currentIntervalEnd, nextIntervalEnd);
			}else {
				currentInterval = nextInterval;
				mergedIntervals.add(currentInterval);
			}
		}
		return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
	}
}
