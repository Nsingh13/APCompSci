package Assignment28;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] boardSet = new String[3][3];
		String X = "X";
		String O = "O";

		System.out.println("Welcome to Tic Tac Toe");

		System.out.print("Enter name of Player 1:");
		String name1 = scan.nextLine();

		System.out.print("Enter name of Player 2:");
		String name2 = scan.nextLine();
		// Decalring objects for the game
		Player player1 = new Player(X, name1);
		Player player2 = new Player(O, name2);
		Board board = new Board(boardSet);
		// This initializes the game
		board.popBoard();
		board.printBoard();

		boolean isPlayerOne = true;

		// This loop runs player turn
		for (int i = 0; i < 9; i++) {
			System.out.println("");
			if (isPlayerOne) {

				player1.turn(board);
			} else {
				player2.turn(board);
			}
			isPlayerOne = !isPlayerOne;
			System.out.println("");
			board.printBoard();
			if (board.determineWinner()) {
				if (isPlayerOne) {
					System.out.println(name1 + " Wins!!!");
				} else {
					System.out.println(name2 + " Wins!!!");
				}
				System.exit(0);
			}

		}
		System.out.println("It is a tie!!! You both suck");

	}

}
