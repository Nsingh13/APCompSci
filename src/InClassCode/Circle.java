package InClassCode;

public class Circle {

	private double r;
	private double pi = Math.PI;
	
	public Circle(double radius){
		r = radius; 
	}
	
	public double areaOfCircle(){
	
		double area = pi*Math.pow(r, 2);
		return area;
	}
}
