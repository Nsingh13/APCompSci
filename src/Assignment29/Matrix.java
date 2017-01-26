package Assignment29;

public class Matrix {
	double[][] matrix;
	double[][] inverseMatrix = new double[3][3];

	public Matrix(double[][] m) {
		matrix = m;

	}

	public void populate(double a, double b, double c, double d, double s1, double s2) {
		if (matrix.length == 1) {
			matrix[0][0] = s1;
			matrix[0][1] = s2;
		} else {
			matrix[0][0] = a;
			matrix[1][0] = b;
			matrix[0][1] = c;
			matrix[1][1] = d;
		}

	}

	public double[][] findInverse() {

		double determinant = 1 / ((matrix[0][0] * matrix[1][1]) - (matrix[1][0] * matrix[0][1]));
		inverseMatrix[0][0] = determinant * matrix[1][1];
		inverseMatrix[1][0] = determinant * matrix[1][0] * -1;
		inverseMatrix[0][1] = determinant * matrix[0][1] * -1;
		inverseMatrix[1][1] = determinant * matrix[0][0];
		return inverseMatrix;

	}

	public void solutions(double[][] inv) {

		double sol1 = (matrix[0][0] * inv[0][0]) + (matrix[0][1] * inv[1][0]);
		double sol2 = (matrix[0][0] * inv[0][1]) + (matrix[0][1] * inv[1][1]);
		System.out.println("The solutions are (" + sol1 + ", " + sol2 + ")");

	}

	public boolean slopeCheck(double[][] cMat) {
		double m1 = (matrix[0][0] / matrix[0][1]) * -1;
		double b1 = (cMat[0][0] / matrix[1][0]);

		double m2 = (matrix[1][0] / matrix[1][1]) * -1;
		double b2 = (cMat[0][1] / matrix[1][1]);

		if (m1 == m2) {
			if (b1 == b2) {
				System.out.println("Infinite Solutions");
			} else {
				System.out.println("No solution");
			}
			return false;

		} else {
			return true;
		}

	}

	public double[][] getMat() {
		return matrix;

	}

}
