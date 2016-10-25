package Assignment10;

import java.util.Scanner;

public class RentalCarRunner 
{
	
		public static void main(String[] args) 
		{
			Scanner scan = new Scanner(System.in);
			String licensePlate;
			String make;
			String model;
			
			System.out.println("What is you license plate number");
			licensePlate = scan.nextLine();
			
			System.out.println("What is the make of your car");
			make = scan.nextLine();
			
			System.out.println("What is the model");
			model = scan.nextLine();
			
			RentalCar license = new RentalCar(licensePlate,make,model);
			
			System.out.println(license.toString());
			
			
	}

}
