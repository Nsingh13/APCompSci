package Assignment26;

import java.util.Scanner;

import javax.sound.midi.Sequence;

public class Assignment26 {
    public static void main(String[] args) {
	String Sequence = null;
	int pos = 0;
	Boolean end = true;

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the DNA strand:");
	Sequence = scan.nextLine();
	String[] y = new String[Sequence.length()];
	int a = y.length - 1;

	for (int i = 0; i < y.length; i++) {
	    y[i] = Sequence.substring(i, i + 1);
	}
	for (int i = 0; i < y.length; i++) {
	    if (y[i].equals("A")) {
		y[i] = "T";
	    } else if (y[i].equals("T")) {
		y[i] = "A";
	    } else if (y[i].equals("G")) {
		y[i] = "C";
	    } else if (y[i].equals("C")) {
		y[i] = "G";
	    }

	}
	System.out.println("The reverse compliment is");
	for (int i = 0; i < y.length; i++) {

	    System.out.print(y[a]);
	    a--;
	}
    }
}
