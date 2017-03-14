package Assignment32;

import java.util.Scanner;

/**
 * This class outlines a Volleyball or Racquetball simulation depending on the
 * String specified in the constructor.
 * 
 * The simulation is run when <code>runSim()</code> is called and utilizes the
 * recursive method <code>PlayUntilWin()</code>
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class VolleyRacquetSim {
	/**
	 * Differentiates the two games.
	 */
	private boolean winByTwo = false;

	/**
	 * New <code>VolleyRacquetSim</code> instance
	 */
	private double prob;
	private double numOfGames;

	public VolleyRacquetSim(String game) {
		/* initialize winByTwo */
		if (game.equalsIgnoreCase("volleyball")) {
			winByTwo = true;
		}

	}

	public void runSim() {
		Scanner in = new Scanner(System.in);

		/* Get user input for probability and number of simulations */

		System.out.println("What is the probability that team A wins a volley?");
		prob = in.nextDouble();

		while (!(prob > 0 && prob < 1)) {

			System.out.println("Invalid input must be between 0 and 1");
			prob = in.nextDouble();

		}

		System.out.println("How many simulations should you run");
		numOfGames = in.nextInt();

		while (numOfGames <= 0) {

			System.out.println("Games must be greater than 0");
			numOfGames = in.nextInt();

		}

		int teamAWins = 0;
		int teamBWins = 0;

		for (int i = 0; i < numOfGames; i++) {

			String winner = playUntilWin("Team A", "Team B", prob, 0, 0);
			System.out.println("Game " + (i + 1) + " Winner: " + winner);
			if (winner.equals("Team A")) {
				teamAWins++;
			} else {
				teamBWins++;
			}

		}
		double percent;
		if (teamAWins > teamBWins) {
			percent = (teamAWins / numOfGames) * 100;

			System.out.println("Team A Won " + percent + "% of games");

		} else {
			percent = (teamBWins / numOfGames) * 100;

			System.out.println("Team 1 wins:" + teamBWins + "/" + numOfGames + "=" + percent + "%");
		}

		/*
		 * Loop for the number of simulations specified. Call
		 * <code>playUntilWin()</code> and print results
		 */

	}

	public String playUntilWin(String server, String receiver, double probWinVolley, int serverScore, int recScore) {
		/* Create the recursive method based on the outline from class */

		if (serverScore >= 15) {

			if (serverScore - recScore >= 2 || !winByTwo) {
				return server;
			}

		}

		double rand = Math.random();

		if (rand < probWinVolley) {

			serverScore++;
			return playUntilWin(server, receiver, probWinVolley, serverScore, recScore);
		} else {

			return playUntilWin(receiver, server, 1 - probWinVolley, recScore, serverScore);
		}

	}
}