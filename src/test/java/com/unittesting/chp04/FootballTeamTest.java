package com.unittesting.chp04;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.unittesting.chp04.FootballTeam;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class FootballTeamTest {

	private static final int MATCHES_WON = 3;

	public Object[] nbOfGamesWon() {
		return $(0, 1, 3);
	}

	@Test
	@Parameters(method = "nbOfGamesWon")
	public void constructorShouldSetGamesWon(int gamesWon) {
		FootballTeam team = new FootballTeam(gamesWon);
		assertEquals(gamesWon, team.getGamesWon());
	}

	public Object[] illegalNbOfGamesWon() {
		return $(-10, -1);
	}

	@Test(expected = IllegalArgumentException.class)
	@Parameters(method = "illegalNbOfGamesWon")
	public void constructorShouldThrowExceptionForIllegalGamesNb(int illegalNbOfGames) {
		new FootballTeam(illegalNbOfGames);
	}

	private static final int ANY_NUMBER = 123;

	@Test
	public void shouldBePossibleToCompareTeams() {
		FootballTeam team = new FootballTeam(ANY_NUMBER);
		assertTrue("FootballTeam should implement Comparable", team instanceof Comparable);
	}

	@Test
	public void teamsWithMoreMatchesWonShouldBeGreater() {
		FootballTeam team_2 = new FootballTeam(2);
		FootballTeam team_3 = new FootballTeam(3);
		assertTrue(team_3.compareTo(team_2) > 0);
	}

	@Test
	public void teamsWithLessMatchesWonShouldBeLesser() {
		FootballTeam team_2 = new FootballTeam(2);
		FootballTeam team_3 = new FootballTeam(3);
		assertTrue("team with " + team_2.getGamesWon() + " games won should be ranked after the team with "
				+ team_3.getGamesWon() + " games won", team_2.compareTo(team_3) < 0);
	}

	@Test
	public void teamsWithSameNumberOfMatchesWonShouldBeEqual() {
		FootballTeam teamA = new FootballTeam(2);
		FootballTeam teamB = new FootballTeam(2);
		assertTrue("both teams have won the same number of games: " + teamA.getGamesWon() + " vs. "
				+ teamB.getGamesWon() + " and should be ranked equal", teamA.compareTo(teamB) == 0);
	}
}
