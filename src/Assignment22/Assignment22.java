package Assignment22;

import java.util.Scanner;

public class Assignment22 {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String str = input.nextLine();
	int[] gearValues = new int[str.length()];
	int[] indexValues = new int[str.length()];
	int tNum = 0;
	boolean x = true;
	for (int i = 0; i < str.length(); i++) {
	    if (str.substring(i, i + 1).equals("T")) {
		indexValues[tNum] = i;
		tNum++;

	    }

	}

	double g1 = Integer.valueOf(str.substring(0, indexValues[0]));
	double g2 = Integer.valueOf(str.substring(indexValues[tNum - 2] + 1, indexValues[tNum - 1]));
	double rot = (g1 / g2) * 10;

	String dir;
	if (tNum % 2 == 0) {
	    dir = "CC";

	} else {
	    dir = "C";
	}
	System.out.println(rot + " ," + dir);
    }

}
