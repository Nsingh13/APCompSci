package Assignment29;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double[][] mat1 = new double[2][2];
		double[][] mat2 = new double[1][2];

		Matrix coefMat = new Matrix(mat1);
		Matrix solMat = new Matrix(mat2);

		System.out.println("Enter a, b, and c for the first equation:");
		System.out.print("Enter A:\n");
		double A1 = scan.nextDouble();
		System.out.print("Enter B:\n");
		double B1 = scan.nextDouble();
		System.out.print("Enter C:\n");
		double C1 = scan.nextDouble();

		System.out.println("Enter a, b, and c for the second equation:");
		System.out.print("Enter A:\n");
		double A2 = scan.nextDouble();
		System.out.print("Enter B:\n");
		double B2 = scan.nextDouble();
		System.out.print("Enter C:\n");
		double C2 = scan.nextDouble();

		coefMat.populate(A1, B1, C1, A2, B2, C2);
		solMat.populate(A1, B1, C1, A2, B2, C2);
	}

}
