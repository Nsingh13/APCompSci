package Assignment30;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * This program finds the largest sum of all hourglasses in a 6x6 grid of
 * integers.
 * 
 * EXAMPLE
 * 
 * 1 3 2 1 1 1 2 3 3 -4 5 5 3 -2 11 12 3 3 2 2 1 1 2 2 1 1 2 1 1 11 2 3 22 21 1
 * 1 1
 * 
 * There are 16 hourglasses that follow the pattern below:
 * 
 * a b c d e f g
 * 
 * So few from above (top left and bottom left) include:
 * 
 * 1 3 2 3 3 -2 11
 * 
 * 2 2 1 1 2 3 22
 * 
 * @author (your name)
 * @version 1/31/2017
 */

public class Hourglass {
	static int[][] grid = new int[6][6];

	public static void main(String[] args) throws IOException {
		readFile();
		largestHourglass();
	}

	// pre: none
	// post: prints value of largest hourglass in grid
	public static void largestHourglass() {

		int biggest = 0;

		// TODO implement this method to find the largest sum
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {

				int row1 = grid[x][y] + grid[x][y + 1] + grid[x][y + 2];
				int row2 = grid[x + 1][y + 1];
				int row3 = grid[x + 2][y] + grid[x + 2][y + 1] + grid[x + 2][y + 2];

				int num = row1 + row2 + row3;

				if (num > biggest) {
					biggest = num;
				}
			}

		}
		System.out.println(biggest);

	}

	// pre: none
	// post: populates grid with values from text file
	public static void readFile() throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.print("What is the name of the file? "); // enter the full
															// name (ex:
															// "grid.txt")
		String fileName = in.next();

		int r = 0;
		int c = 0;
		Scanner inFile = new Scanner(new File(fileName));

		while (inFile.hasNext()) // stop parsing file when there are no more
									// values
		{
			grid[r][c++] = inFile.nextInt(); // populate our 2D array with
												// integers from file

			if (c > 5) {
				r++;
				c = 0;
			}
		}
	}
}
