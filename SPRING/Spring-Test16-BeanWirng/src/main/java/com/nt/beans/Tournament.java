package com.nt.beans;

import java.util.Arrays;

public class Tournament {

	private String[] games;
	
	public Tournament() {
	System.out.println("Tournament O-param Constructer");
	}

	public void setGames(String[] games) {
		this.games = games;
	}

	@Override
	public String toString() {
		return "Tournament [games=" + Arrays.toString(games) + "]";
	}

}
