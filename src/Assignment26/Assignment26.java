package Assignment26;

import java.util.Scanner;

import javax.sound.midi.Sequence;

public class Assignment26 {
    public static void main(String[] args) {
	String sequence = null;
	int pos = 0;
	Boolean end = true;

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the DNA strand:");
	sequence = scan.nextLine();
	char[] fowardSequence = new char[sequence.length()];
	char[] backwardSequence = new char[sequence.length()];
	int a = fowardSequence.length - 1;

	for (int i = 0; i < fowardSequence.length; i++) {
	    fowardSequence[i] = sequence.charAt(i);
	}
	for (int i = 0; i < fowardSequence.length; i++) {
	    if (fowardSequence[i] == 'A') {
		fowardSequence[i] = 'T';
	    } else if (fowardSequence[i] == 'T') {
		fowardSequence[i] = 'A';
	    } else if (fowardSequence[i] == 'C') {
		fowardSequence[i] = 'G';
	    } else if (fowardSequence[i] == 'G') {
		fowardSequence[i] = 'C';
	    }

	}
	System.out.println("The reverse compliment is");
	int j = 0;
	for (int i = fowardSequence.length - 1; i >= 0; i--) {
	    backwardSequence[j] = fowardSequence[i];
	    j++;

	}
	for (int i = 0; i < backwardSequence.length; i++) {
	    System.out.print(backwardSequence[i]);

	}
    }
}
