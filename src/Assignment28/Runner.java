package Assignment28;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Runner {

	private static boolean isPlayer1 = true;
	private static boolean twoPlayer;

	private static String[][] playBoard = new String[3][3];

	private static Scanner scan = new Scanner(System.in);
	private static Board board = new Board(playBoard);
	private static Random rand = new Random();

	public static void main(String[] args) {
		String x = "X";
		String o = "O";
		String player1Name;
		String player2Name;

		System.out.println("Welcome to Tic Tac Toe");
		System.out.println("Enter Name of Player 1:");
		player1Name = scan.next();
		System.out.println("Enter Name of Player 2:");
		player2Name = scan.next();

		Player player2 = new Player(o, player2Name);
		Player player1 = new Player(x, player1Name);

		board.populateBoard();
		board.printBoard();

		for (int i = 0; i < 9; i++) {
			if (isPlayer1) {
				runTurn(player1);

			} else {

				runTurn(player2);
			}

			isPlayer1 = !isPlayer1;
		}

	}

	public static void runTurn(Player p) {
		int loc = 0;
		System.out.println("");
		System.out.print(p.getName() + "'s turn to move:");

		try {
			loc = scan.nextInt();

		} catch (InputMismatchException e) {

			System.out.println("Error!");
			invalidMove(p);
		}

		if (board.checkSpot(loc)) {
			p.move(loc, board);

		} else {
			invalidMove(p);
		}

		if (board.determineWinner()) {

			System.out.println(p.getName() + "'s WINS!!!!!! (╯°□°)╯︵ ┻━┻:");
			System.out.println("Would you like to play again (Yes/No)");

			String play = scan.next();

			if (play.equals("Yes")) {
				main(null);
			} else {
				System.exit(0);
				System.out.println("Goodbye");
			}

		}

	}

	public static void invalidMove(Player p) {
		System.out.println("Invalid Move Try Again");
		runTurn(p);

	}

}
