package Assignment10;

/**
 * 
 * 
 * @author Sean Kelker
 * @version 9/27/16
 */
public class RentalCar {
    // instance variables
    private String license;
    private String make;
    private String model;
    private int code;

    // Constructor for RentalCar objects
    public RentalCar(String l, String ma, String mo) {
	license = l;
	make = ma;
	model = mo;
    }

    // pre: none
    // post: returns make as a String
    public String getMake() {
	return make;
    }

    // pre: none
    // post: returns model as a String
    public String getModel() {
	return model;
    }

    // pre: none
    // post: returns license as a String
    public String getLicense() {
	return license;
    }

    // pre: none
    // post: returns the three digits in the license as an int
    private int getThreeDigits() {
	int threeDigits = Integer.valueOf(license.substring(3));
	return threeDigits;
    }

    // pre: returns the three letters in the license as a String
    private String getLetters() {
	String threeLetters = license.substring(0, 3);
	return threeLetters;
    }

    // pre: none
    // post: returns the sum of the ascii values of the three digits in the
    // license as an int
    private int getAsciiVal() {
	char character1 = getLetters().charAt(0);
	char character2 = getLetters().charAt(1);
	char character3 = getLetters().charAt(2);
	int ascii1 = (int) character1;
	int ascii2 = (int) character2;
	int ascii3 = (int) character3;
	int sum = ascii1 + ascii2 + ascii3;
	return sum;
    }

    private int getsumVal() {
	int totalSum = getAsciiVal() + getThreeDigits();
	return totalSum;

    }

    private String getLetterVal() {
	int totalSum = getAsciiVal() + getThreeDigits();
	int letterVal = totalSum % 26;
	String letter = String.valueOf(Character.toChars(letterVal + 65));
	return letter;

    }

    // pre: none
    // post: returns the code as a String
    private String getCode() {

	String stringCode = getLetterVal() + Integer.toString(getsumVal());
	return stringCode;
    }

    // pre: none
    // post: prints info of object as String
    @Override
    public String toString() {
	return getMake() + " " + getModel() + "\n" + getLicense() + ":" + getCode();
    }

}