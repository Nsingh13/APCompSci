package Assignment05;

import java.util.Scanner;

public class Runner {
	public static double totalArea = 0;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many circles Are there?");
		int numOfCircles = in.nextInt();
		
		for(int i=1; i<numOfCircles+1; i++){
			System.out.println("What is the radius of the circle #"+i);
			double rad = in.nextDouble();
			Circles c = new Circles(rad);
			totalArea = totalArea + c.areaOfCircle();
		}
		
		System.out.println("How many rectangles Are there?");
		int numOfRectangles = in.nextInt();
		
		for(int i=1; i<numOfRectangles+1; i++){
			System.out.println("What is the length of rectangle #"+i);
			double length = in.nextDouble();
			System.out.println("What is the width of rectangle #"+i);
			double width = in.nextDouble();
			Rectangle r1 = new Rectangle(length,width);
			totalArea = totalArea+r1.areaOfRectangle();
			
			System.out.println("If the middle of rectangle #"+i+" is hallow type the length else type 0");
			double ilength = in.nextDouble();
			System.out.println("If the middle of rectangle #"+i+" is hallow type the width else type 0");
			double iwidth = in.nextDouble();
			Rectangle r2 = new Rectangle(ilength,iwidth);
			totalArea = totalArea-r2.areaOfRectangle();
			
			
			
		}
		
		System.out.println("How many triangles are there?");
		int numOfTriangles = in.nextInt();
		
		for(int i=1; i<numOfTriangles+1; i++){
			System.out.println("What is the length of triangle #"+i);
			double length = in.nextDouble();
			System.out.println("What is the height of triangle #"+i);
			double height = in.nextDouble();
			Triangle t = new Triangle(length,height);
			totalArea = totalArea+t.areaOfTriangle();
		}
		System.out.println("The total area:"+totalArea+" whatevr units you want ^2");
			
		
		
		
		
		
	
		
		
	
	}

}
