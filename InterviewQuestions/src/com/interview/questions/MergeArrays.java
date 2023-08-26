package com.interview.questions;

import java.util.Arrays;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * Array 1 = [2, 3, 50, 62, 35, 11, 100]
Array 2 = [50, 11, 4, 3, 1, 20, 11]
Output:
1) Merge into single array removing duplicates
2) Display only duplicates and occurrence
    50: 2
    11: 3
 */
public class MergeArrays {

	public static void main(String[] args) {
		int[] array1 = new int[] {2, 3, 50, 62, 35, 11, 100,11,11};
		int[] array2 = new int[] {50, 11, 4, 3, 1, 20, 11};
		
		mergeInto(array1,array2);
	//	System.out.println("-----------------");
	//	uniqueOccurrences(array1,array2);
	}
	public static void mergeInto(int[] array1, int[] array2) {
		Set<Integer> set  = Stream.of(array1,array2)
				.flatMapToInt(x->Arrays.stream(x))
				.boxed()
				.collect(Collectors.toSet());
		
		set.forEach(x->System.out.print(x+" "));
	}
	public static void uniqueOccurrences(int[] array1, int[] array2) {
		Stream.of(array1,array2)
			.flatMapToInt(x->Arrays.stream(x))
			.boxed()
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
			.entrySet()
			.stream()
			.filter(x->x.getValue()>1)
			.forEach(k->System.out.println(k));
	}

}
