package Assignment04;
import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the temperature you want to convert");
		double temp = scan.nextDouble();
		System.out.println("If the temp is celcius type 1 else type 0");
		double c = scan.nextDouble();
		System.out.println("If the temp is farenheight type 1 else type 0");
		double f = scan.nextDouble();
		double ctemp = ((9/5)*(temp-32));
	//	double ftemp = (temp*1.8)+(32);
	//	double finaltemp = ctemp;
		System.out.println("The converted temp is " + ctemp);
	}

}