package Assignment32;

import java.util.Scanner;

/**
 * This class contains the main method and runs the simulation.
 * 
 * NO CHANGES NEED TO BE MADE TO THIS FILE.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class SimRunner {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("What game are you simulating? ");
		String game = in.next();

		while (!game.equalsIgnoreCase("volleyball") && !game.equalsIgnoreCase("racquetball")) {
			System.out.print("Error. Volleyball or Racquetball? ");
			game = in.next();
		}

		VolleyRacquetSim sim = new VolleyRacquetSim(game);
		sim.runSim();
	}
}