package Assignment28;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[][] playBoard = new String[3][3];
		Board board = new Board(playBoard);
		String x = "X";
		String o = "O";
		int loc;

		Player player1 = new Player(x);
		Player player2 = new Player(o);

		boolean isPlayer1 = true;

		System.out.println("Welcome to Tic Tac Toe");

		board.populateBoard();
		board.printBoard();

		for (int i = 0; i < 9; i++) {

			if (isPlayer1) {
				System.out.println("");
				System.out.print("Player1's turn to move:");
				loc = scan.nextInt();
				System.out.println("");
				player1.move(loc, board);
				if (board.determineWinner()) {
					System.out.println("Player 1 wins ");
					break;
				}

			} else {
				System.out.println("");
				System.out.print("Player2's turn to move:");
				loc = scan.nextInt();
				System.out.println("");
				player2.move(loc, board);
				if (board.determineWinner()) {
					System.out.println("Player 2 wins ");
					break;
				}

			}

			isPlayer1 = !isPlayer1;

		}

	}

}
