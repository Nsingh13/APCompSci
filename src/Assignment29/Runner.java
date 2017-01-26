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

		System.out.println(A1 + "X +" + B1 + "Y = " + C1 + ", " + A2 + "X + " + B2 + "Y = " + C2);
		coefMat.populate(A1, B1, A2, B2, C1, C2);
		solMat.populate(A1, B1, A2, B2, C1, C2);

		if (coefMat.slopeCheck(solMat.getMat())) {
			solMat.solutions(coefMat.findInverse());
		}
	}

}
