package Assignment28;

public class Board {

	String[][] board;

	public Board(String[][] b) {

		board = b;

	}

	// This piece populates the board
	public void popBoard() {
		int i = 1;
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 3; x++) {
				board[x][y] = String.valueOf(i);
				i++;

			}
		}

	}

	// this prints the board to the console
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

	// This takes a board location and give the Y axis position
	public int convertY(int loc) {

		int y;

		if (loc > 0 && loc < 4) {
			y = 0;
		} else if (loc > 3 && loc < 7) {
			y = 1;
		} else {
			y = 2;
		}
		return y;
	}

	// This takes a board location and give the X axis position
	public int convertX(int loc) {

		int x;

		if (loc == 1 || loc == 4 || loc == 7) {
			x = 0;
		} else if (loc == 2 || loc == 5 || loc == 8) {
			x = 1;
		} else {
			x = 2;
		}
		return x;
	}

	// This adds a peice to the board
	public void addPeice(int loc, String p) {

		board[convertX(loc)][convertY(loc)] = p;

	}

	// This determines is the move is legal
	public boolean checkMove(int loc) {

		if (board[convertX(loc)][convertY(loc)].equals("X") || board[convertX(loc)][convertY(loc)].equals("Y")) {
			System.out.println("Invalid Move");
			return false;

		} else if (loc > 9 || loc < 1) {
			return false;
		}

		else {
			return true;
		}

	}

	// This look if a player has won the game
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
