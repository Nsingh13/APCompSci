package Assignment33;

import java.io.IOException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Contact list filename: ");
		String file = scan.nextLine();
		Contacts contacts = new Contacts();
		contacts.addFromFile(file);
		System.out.println(contacts.toString());
	}
}
