package Assignment05;

public class Triangle {
	private double l;
	private double h;
	
	
	
	public Triangle(double length, double height){
		l = length; 
		h = height;
	}
	
	public double areaOfTriangle(){
	
		double area = l*h*.5;
		return area;
	}
}
