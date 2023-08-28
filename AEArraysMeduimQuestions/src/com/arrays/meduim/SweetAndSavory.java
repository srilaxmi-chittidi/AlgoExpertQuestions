package com.arrays.meduim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SweetAndSavory {

	public static void main(String[] args) {
		int[] dishes = new int[] {-3,-5,1,7};
		int target = 8;
		int[] bestPair =sweetAndSavory(dishes, target);
		Arrays.stream(bestPair).forEach(System.out::println);
	}
	
	public static int[] sweetAndSavory(int[] dishes, int target) {

		  List<Integer> sweetDishes = new ArrayList<>();
		    List<Integer> savoryDishes = new ArrayList<>();

		    for(int dish : dishes){
		      if(dish < 0){
		        sweetDishes.add(dish);
		      }else{
		        savoryDishes.add(dish);
		      }
		    }
		    sweetDishes.sort(Comparator.comparingInt(Math::abs));
		    savoryDishes.sort(Comparator.naturalOrder());

		    int[] bestPair = new int[2];
		    int bestDiff = Integer.MAX_VALUE;
		    int sweetIndex =0; int savoryIndex = 0;
		    
		    while(sweetIndex < sweetDishes.size() && savoryIndex < savoryDishes.size()){
		      
		      int currentSum = sweetDishes.get(sweetIndex) + savoryDishes.get(savoryIndex);
		      if(currentSum <=  target){
		        int currentDiff = target-currentSum;
		        if(currentDiff < bestDiff){
		          bestDiff = currentDiff;
		          bestPair[0] = sweetDishes.get(sweetIndex);
		          bestPair[1] = savoryDishes.get(savoryIndex);
		        }
		        savoryIndex++;
		      }else{
		        sweetIndex++;
		      }
		    }
		    return bestPair;
		  } 
}
