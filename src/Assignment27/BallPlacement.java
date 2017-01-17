package Assignment27;

import java.util.Random;

public class BallPlacement {

    Random rand = new Random();

    public int placement(int rows) {
	int loc = 0;
	for (int i = 0; i < rows; i++) {

	    boolean dir = rand.nextBoolean();
	    if (dir == true) {
		System.out.print("R");
		loc++;

	    } else {
		System.out.print("L");

	    }

	}

	return loc;

    }

}
