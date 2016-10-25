package Project0;

/**
 * Write a description of class Solver here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Solver 
{
	private double length, girth, weight;

	public Solver(double l, double g, double w) 
	{

		length = l;
		girth = g;
		weight = w;

	}

	public boolean weightPass() 
	{

		if (weight > 70) {
			return false;
		}

		else {
			return true;
		}

	}

	public boolean sizePass()
    {
		double size = length + girth;
		
    	if(size>100){
    		return false;
    	}
    	else{
    		return true;
    	}
    }

	

}
