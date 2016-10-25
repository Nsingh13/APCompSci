package Project0;
import java.util.Scanner;

import InClassCode.Circle;


public class CircleCalulations {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		double rad = in.nextDouble();
		
		Circle c = new Circle(rad);
		
		double area = c.areaOfCircle();
		
		System.out.println(area);
		
		
	}

}
