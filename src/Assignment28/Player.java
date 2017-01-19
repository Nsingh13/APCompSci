package Assignment28;

public class Player {
	String peice;
	String playerName;

	public Player(String p, String pn) {
		peice = p;
		playerName = pn;

	}

	public String getName() {
		return playerName;

	}

	public static int convertX(int loc) {
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

	public static int convertY(int loc) {
		int y;
		if (loc == 1 || loc == 2 || loc == 3) {
			y = 0;
		} else if (loc == 4 || loc == 5 || loc == 6) {
			y = 1;
		} else {
			y = 2;
		}
		return y;
	}

	public void move(int loc, Board board) {

		board.addPeice(convertX(loc), convertY(loc), peice);
		board.printBoard();

	}

}