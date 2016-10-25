package Homework0;
/*
 * 
 * 8/30/16
 * Sean Kelker
 * 
 * 
 * 
 */



import java.util.Scanner;

public class Homework0 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give a 4 digit number");
		int input = in.nextInt();
		
		int a = input/1000; 
		int b = (input%1000)/100; 
		int c = (input%100)/10;
		int d = (input%10)/1;
		
		System.out.println("The digits are ");
		System.out.print(a+" ");
		System.out.print(b+" ");
		System.out.print(c+" ");
		System.out.print(d+" ");
		
	

	}

}
