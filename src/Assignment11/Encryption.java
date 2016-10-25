package Assignment11;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class Encryption {
    public static int[] array = new int[100];
    public static int[] postArray = new int[100];
    public static String input;
    public static int randomKey;
    public static final int primeKey = 1000;

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	randomKey = rand.nextInt(200) + 100;
	System.out.println("Would you like to (encrypt) or (decrypt)");
	String type = scan.nextLine();

	if (type.equals("encrypt")) {
	    System.out.println("What would you like to encrypt");
	    input = scan.nextLine();
	    encrypt();
	}

	if (type.equals("decrypt")) {
	    System.out.println("What would you like to decrypt");
	    input = scan.nextLine();
	    decrypt();
	}

    }

    public static void decrypt() {
	populate();
	organize();
	printD();
    }

    public static void encrypt() {
	populate();
	munlipulate();
	printE();
    }

    public static void populate() {
	for (int i = 0; i < input.length(); i++) {
	    array[i] = Integer.valueOf(input.charAt(i));
	}

    }

    public static void munlipulate() {
	int modifier = 0;
	for (int i = 0; i < input.length(); i++) {

	    int change = primeKey / randomKey;
	    postArray[i] = array[i] + (change - modifier);
	    modifier++;
	}

    }

    public static void organize() {
	int modifier = 0;
	int key = array[input.length() - 1];
	for (int i = 0; i < input.length(); i++) {
	    int change = primeKey / key;
	    postArray[i] = array[i] - (change - modifier);
	    modifier++;
	}

    }

    public static void printE() {
	for (int i = 0; i < input.length(); i++) {
	    char x = (char) postArray[i];

	    System.out.print(x);
	}
	char key = (char) randomKey;
	System.out.println(key);
	System.out.println("");
	main(null);

    }

    public static void printD() {
	for (int i = 0; i < input.length() - 1; i++) {
	    char x = (char) postArray[i];

	    System.out.print(x);

	}
	System.out.println("");
	main(null);

    }

}
