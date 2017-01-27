package Assignment28;

import java.util.Scanner;

public class Player {
	private String peice;
	private String name;

	public Player(String p, String n) {
		peice = p;
		name = n;
	}

	public void turn(Board b) {
		boolean run = false;

		int loc = 0;
		while (!run) {
			Scanner scan = new Scanner(System.in);
			System.out.println("It is " + name + " turn to move");

			String x = scan.next();
			if (x.equals("1") || x.equals("2") || x.equals("3") || x.equals("4") || x.equals("5") || x.equals("6")
					|| x.equals("7") || x.equals("8") || x.equals("9")) {

				loc = Integer.valueOf(x);
				if (b.checkMove(loc)) {

					break;

				}

			} else {
				System.out.println("Invalid Move");
			}

		}
		b.addPeice(loc, peice);
	}
}
