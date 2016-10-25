package Assignment05;


public class Circles {

	private double r;
	private double pi = Math.PI;
	
	public Circles(double radius){
		r = radius; 
	}
	
	public double areaOfCircle(){
	
		double area = pi*Math.pow(r, 2);
		return area;
	}
}

