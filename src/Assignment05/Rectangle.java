package Assignment05;

public class Rectangle {
	private double l;
	private double w;
	
	
	
	public Rectangle(double length, double width){
		l = length; 
		w = width;
	}
	
	public double areaOfRectangle(){
	
		double area = l*w;
		return area;
	}
}
