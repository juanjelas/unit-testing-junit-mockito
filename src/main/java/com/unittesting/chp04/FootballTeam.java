package com.unittesting.chp04;

public class FootballTeam implements Comparable<FootballTeam> {

	private int gamesWon;

	public FootballTeam(int i) {
		if (i < 0)
			throw new IllegalArgumentException();
		this.gamesWon = i;
	}

	public int getGamesWon() {
		return this.gamesWon;
	}

	@Override
	public int compareTo(FootballTeam otherTeam) {
		return gamesWon - otherTeam.getGamesWon();
	}

}
