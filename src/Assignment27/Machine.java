package Assignment27;

public class Machine {

    private int rows, balls;
    private int[] slotState;

    public Machine(int r, int ba) {
	rows = r;
	balls = ba;
	slotState = new int[rows + 1];

    }

    public int getBalls() {
	return balls;

    }

    public int getRows() {
	return rows;

    }

    public int[] getSlots() {
	return slotState;

    }

    public void run() {
	BallPlacement p = new BallPlacement();
	for (int i = 0; i < balls; i++) {
	    System.out.println("");
	    slotState[p.placement(getRows())]++;

	}
	System.out.println("");

    }

}
