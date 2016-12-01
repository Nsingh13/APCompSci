package Assignment24;

import java.util.Random;
import java.util.Scanner;

public class Assignment24 {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	System.out.println("How many rolls?");
	int rolls = input.nextInt();
	int[] arr = new int [6];
	for (int i = 0; i < rolls; i++) {
	    int x = rand.nextInt(6)+1;
	    arr[x-1]++;
	}
	for (int i = 0; i < 6; i++) {
	    System.out.println((i+1)+": "+ arr[i]);
	}
	

    }

}
