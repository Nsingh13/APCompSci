package Assignment28;

import java.util.Random;
import java.util.Scanner;

public class Runner {

	private static boolean isPlayer1 = true;
	private static boolean twoPlayer;

	private static String[][] playBoard = new String[3][3];

	private static Board board = new Board(playBoard);
	private static Random rand = new Random();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String x = "X";
		String o = "O";
		String player1Name;
		String player2Name;

		// System.out.println("Welcome to Tic Tac Toe");
		//
		// System.out.println("Enter Name of Player 1:");
		// player1Name = scan.next();
		// System.out.println("Enter Name of Player 2:");
		// player2Name = scan.next();
		player2Name = "";
		player1Name = "";

		Player player1 = new Player(x, player1Name);
		Player player2 = new Player(o, player2Name);

		board.populateBoard();
		board.printBoard();

		for (int i = 0; i < 9; i++) {
			if (isPlayer1) {
				runTurn(player1);

			} else {

				runTurn(player2);
			}

			isPlayer1 = !isPlayer1;
			board.printBoard();

		}

	}

	public static void runTurn(Player p) {

		p.move(p.getMove(), board);

	}

	public static void invalidMove(Player p) {
		System.out.println("Invalid Move Try Again");
		runTurn(p);

	}

}
