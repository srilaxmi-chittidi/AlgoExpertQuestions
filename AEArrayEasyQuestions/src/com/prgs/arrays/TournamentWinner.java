package com.prgs.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TournamentWinner {

	public static final int HOME_TEAM_WON = 1;
	public static void main(String[] args) {

		List<List<String>> competitions = new ArrayList<>();
		competitions.add(Arrays.asList("HTML","C#"));
		competitions.add(Arrays.asList("C#","Python"));
		competitions.add(Arrays.asList("Python","HTML"));
		
		List<Integer> results = Arrays.asList(0,0,1);
		System.out.println(tournamentWinner(competitions,results));
	
	}

	public static String tournamentWinner(List<List<String>> competitions, List<Integer> results) {
		
		String currentBestTeam = "";
		Map<String , Integer> scores = new HashMap<>();
		scores.put(currentBestTeam, 0);
		for(int idx =0 ;idx < competitions.size(); idx++) {
			
			List<String> comp = competitions.get(idx);
			int result = results.get(idx);
			String homeTeam = comp.get(0);
			String awayTeam = comp.get(1);

			String winner = (result == HOME_TEAM_WON) ? homeTeam : awayTeam;
			updatesScores(winner , 3 , scores);
			if(scores.get(winner) > scores.get(currentBestTeam)) {
				currentBestTeam = winner;
			}
		}
		scores.forEach((k,v)->System.out.println(k+" "+v));
		
		return currentBestTeam;
	}
	
	public static void updatesScores(String winner , int points , Map<String , Integer> scores) {
		
		if(!scores.containsKey(winner)) {
			scores.put(winner, 0);
		}
		scores.put(winner, scores.get(winner)+points);
	}
}
