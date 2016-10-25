package Assignment07;

import java.util.Scanner;

public class DayofWeek {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("What is the first day");
	int dayofweek1 = scan.nextInt();
	System.out.println("How many days later would you like to know");
	int dayofweek2 = scan.nextInt();
	
	
	if(dayofweek1 == 1){
		System.out.println("Day one is Monday");
	}
	if(dayofweek1 == 2){
		System.out.println("Day one is Tuesday");
	}
	if(dayofweek1 == 3){
		System.out.println("Day one is Wednesday");
	}
	if(dayofweek1 == 4){
		System.out.println("Day one is Thursday");
	}
	if(dayofweek1 == 5){
		System.out.println("Day one is Friday");
	}
	if(dayofweek1 == 6){
		System.out.println("Day one is Saturday");
	}
	if(dayofweek1 == 7){
		System.out.println("Day one is Sunday");
	}
	
	
	int day2 = (dayofweek1+dayofweek2)%7;
	
	
	if(day2 == 1){
		System.out.println("Day two is Monday");
	}
	if(day2 == 2){
		System.out.println("Day two is Tuesday");
	}
	if(day2 == 3){
		System.out.println("Day two is Wednesday");
	}
	if(day2 == 4){
		System.out.println("Day two is Thursday");
	}
	if(day2 == 5){
		System.out.println("Day two is Friday");
	}
	if(day2 == 6){
		System.out.println("Day two is Saturday");
	}
	if(day2 == 7){
		System.out.println("Day two is Sunday");
	}
	
}
}

