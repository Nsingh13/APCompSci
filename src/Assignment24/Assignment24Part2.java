package Assignment24;

import java.util.Random;
import java.util.Scanner;

public class Assignment24Part2 {

    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	System.out.println("How many rolls?");
	int rolls = input.nextInt();
	int[] arr = new int[6];
	for (int i = 0; i < rolls; i++) {
	    int x = rand.nextInt(6) + 1;
	    arr[x - 1]++;
	}
	for (int i = 0; i < 6; i++) {
	    System.out.println((i + 1) + ": " + arr[i]);
	}

	System.out.println("");
	int maxValue = 0;
	for (int i = 0; i < 6; i++) {
	    if (arr[i] > maxValue) {
		maxValue = arr[i];
	    }
	}
	int scale = maxValue / 9;

	for (int i = 0; i < 9; i++) {
	    System.out.println(yAxis(maxValue, scale, i, arr));
	}
	System.out.println("\t--------------------------------------------------------");
	System.out.println("\t\t1\t2\t3\t4\t5\t6");

    }

    public static String yAxis(int maxValue, int scale, int i, int[] arr) {

	String line = "";
	int yValue = maxValue - (scale * i);
	line += yValue + "\t|";
	for (int a = 0; a < 6; a++) {
	    if (yValue <= arr[a]) {
		line += "\t*";

	    } else {
		line += "\t";
	    }

	}

	return line;

    }

}
