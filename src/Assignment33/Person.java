package Assignment33;

public class Person {
	private String name;
	private String number;
	private String email;

	public Person(String na, String num, String em) {
		name = na;
		number = num;
		email = em;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public String getEmail() {
		return email;
	}

	public boolean equals(Person p) {
		boolean na = getName().equals(p.getName());
		boolean nu = getNumber().equals(p.getNumber());
		boolean em = getEmail().equals(p.getEmail());
		return na && nu && em;
	}

	@Override
	public String toString() {
		return name + ", " + number + ", " + email;
	}
}
