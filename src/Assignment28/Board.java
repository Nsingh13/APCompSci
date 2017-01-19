package Assignment28;

public class Board {
	String[][] board = new String[3][3];

	public Board(String[][] br) {
		board = br;
	}

	public void populateBoard() {
		int inc = 1;
		for (int y = 0; y < board[0].length; y++) {
			for (int x = 0; x < board.length; x++) {

				board[x][y] = Integer.toString(inc);
				inc++;
			}
		}

	}

	public void printBoard() {
		int line = 0;
		for (int y = 0; y < board[0].length; y++) {
			System.out.println("");
			for (int x = 0; x < board.length; x++) {
				if (x == 0) {
					System.out.print(board[x][y]);
					System.out.print("   |");
				} else if (x == 2) {
					System.out.println("   " + board[x][y]);
				} else {
					System.out.print("   " + board[x][y]);
					System.out.print("   |");

				}

			}

			if (line != 2) {
				System.out.println("------------------");
			}
			line++;

		}
	}

	public void addPeice(int x, int y, String p) {

		board[x][y] = p;

	}

	public boolean determineWinner() {

		boolean winner = false;

		for (int x = 0; x < 3; x++) {
			if (board[x][0].equals(board[x][1]) && board[x][1].equals(board[x][2])) {

				winner = true;

			}

		}
		for (int y = 0; y < 3; y++) {
			if (board[0][y].equals(board[1][y]) && board[0][y].equals(board[2][y])) {

				winner = true;

			}

		}
		if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
			winner = true;
		}
		if (board[2][0].equals(board[1][1]) && board[1][1].equals(board[0][2])) {
			winner = true;
		}
		return winner;

	}
	
}