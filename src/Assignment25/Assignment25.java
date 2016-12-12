package Assignment25;

public class Assignment25 {
    public static void main(String[] args) {
	int students = 1000;
	boolean[] lockersOpen = new boolean[students + 1];
	for (int i = 1; i <= students + 1; i++) {
	    for (int j = i; j <= (students); j += i) {
		lockersOpen[j] = !lockersOpen[j];
	    }
	}
	for (int i = 0; i <= students; i++) {
	    if (lockersOpen[i] == true) {
		System.out.println(i);
	    }
	}
    }
}