package Assignment28;

import java.util.Random;
import java.util.Scanner;

public class Runner {

	private static boolean isPlayer1 = true;
	private static boolean twoPlayer;
	private static int loc;

	private static String[][] playBoard = new String[3][3];
	private static String x = "X";
	private static String o = "O";

	private static Scanner scan = new Scanner(System.in);
	private static Board board = new Board(playBoard);
	private static Random rand = new Random();
	private static Player player1 = new Player(x);
	private static Player player2 = new Player(o);

	public static void main(String[] args) {

		System.out.println("Welcome to Tic Tac Toe");

		board.populateBoard();
		board.printBoard();

		for (int i = 0; i < 9; i++) {

			if (isPlayer1) {
				System.out.println("");
				System.out.print("Player1's turn to move:");
				runTurn(player1);

				if (board.determineWinner()) {

					System.out.println("Player 1 wins ");
				}

			} else {
				System.out.println("");
				System.out.print("Player2's turn to move:");
				runTurn(player2);

				if (board.determineWinner()) {

					System.out.println("Player 2 wins ");
				}

			}

			isPlayer1 = !isPlayer1;
		}
	}

	public static void runTurn(Player p) {

		loc = scan.nextInt();
		System.out.println("");
		p.move(loc, board);

	}

}
