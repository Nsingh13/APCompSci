package Assignment03;
import java.util.Scanner;
/*
 * Sean Kelker
 * assignment 3 part 3
 * 8/25/16
 * 
 * 
 * 
 * 
 * 
 */
public class Assignment3Part3 {

	public static void main(String[] args) {
		Scanner scan = (new Scanner(System.in));
		System.out.println("What is the cost per ft^2 in tile");
		double cost = scan.nextDouble();
		System.out.println("What is the width of the room in ft");
		double width = scan.nextDouble();
		System.out.println("What is the width of the room in ft");
		double length = scan.nextDouble();
		System.out.println("What is the length of tile");
		double lengthoftile = scan.nextDouble();
		
		double areatile = lengthoftile*lengthoftile;
		double arearoom = length*width;
		double tileneeded = arearoom/areatile;
		System.out.println("It will cost $"+tileneeded*cost+" for tile");
		
		
		
		
	
		
		
	}

}
