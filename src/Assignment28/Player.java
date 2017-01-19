package Assignment28;

public class Player {
	String peice;

	public Player(String p) {
		peice = p;

	}

	public void move(int loc, Board board) {
		int x, y;

		if (loc == 1 || loc == 4 || loc == 7) {
			x = 0;
		} else if (loc == 2 || loc == 5 || loc == 8) {
			x = 1;
		} else {
			x = 2;
		}

		if (loc == 1 || loc == 2 || loc == 3) {
			y = 0;
		} else if (loc == 4 || loc == 5 || loc == 6) {
			y = 1;
		} else {
			y = 2;
		}
		board.addPeice(x, y, peice);
		board.printBoard();

	}

}