package Assignment33;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contacts {
	private List<Person> people;

	public Contacts() {
		people = new ArrayList<Person>();
	}

	public void addPerson(String na, String nu, String em) {
		people.add(new Person(na, nu, em));
		sortContacts();
	}

	public void addFromFile(String file) throws IOException {
		Scanner scan = new Scanner(new File(file));
		while (scan.hasNext()) {
			String line = scan.nextLine();
			people.add(new Person(grabName(line), grabNumber(line), grabEmail(line)));
		}
		scan.close();
		sortContacts();
	}

	private String grabName(String line) {
		int nameLength = line.indexOf(",");
		return line.substring(0, nameLength);
	}

	private String grabNumber(String line) {
		int numberStart = line.indexOf(",") + 2;
		int numberStop = line.lastIndexOf(",") - 1;
		return line.substring(numberStart, numberStop);
	}

	private String grabEmail(String line) {
		int emailStart = line.lastIndexOf(",") + 1;
		return line.substring(emailStart);
	}

	private void sortContacts() {
		Person temp;
		for (int i = 1; i < people.size(); i++) {
			for (int j = i; j > 0; j--) {
				if (people.get(j).getName().compareTo(people.get(j - 1).getName()) < 0) {
					temp = people.get(j);
					people.set(j, people.get(j - 1));
					people.set(j - 1, temp);
				}
			}
		}
	}

	public Person getContact(String name) {
		int start = 0;
		int end = people.size() - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (name.equals(people.get(mid))) {
				return people.get(mid);
			}

			if (name.compareTo(people.get(mid).getName()) < 0) {
				end = mid - 1;
			}

			else {
				start = mid + 1;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		String list = "";
		for (Person p : people) {
			list += p.getName() + ", " + p.getNumber() + ", " + p.getEmail() + "\n";
		}
		return list;
	}
}