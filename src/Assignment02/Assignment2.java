package Assignment02;

import java.util.Scanner;

/*
 * 8/23/16
 * Sean Kelker
 * 
 * 
 * 
 * 
 */
public class Assignment2 {
	public static void main(String[] args) {
		int dollars;
		int quater;
		int dime;
		int nickel;
		int penny;
		double change;

		System.out.println("What price you want?");
		Scanner scan = new Scanner(System.in);

		double price = scan.nextDouble();

		System.out.println("How much did you pay me");

		double money = scan.nextDouble();
		change = money - price;

		if (price > money)
			System.out.println("Not enought money go away");
		change = change * 100;
		dollars = (int) (change / 100);
		change = change - (dollars * 100);

		quater = (int) (change / 25);
		change = change - (quater * 25);

		dime = (int) (change / 10);
		change = change - (dime * 10);

		nickel = (int) (change / 5);
		change = change - (nickel * 5);

		penny = (int) (change / 1);
		change = change - (penny * 1);

		System.out.println("Your Change is:");
		System.out.println(dollars + " Dollars");
		System.out.println(quater + " Quarters");
		System.out.println(dime + " Dimes");
		System.out.println(nickel + " Nickels");
		System.out.println(penny + " Pennies");

	}
}