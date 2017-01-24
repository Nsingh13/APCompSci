package Assignment29;

public class Matrix {
	double[][] matrix;

	public Matrix(double[][] m) {
		matrix = m;

	}

	public void populate(double a, double b, double c, double d, double s1, double s2) {
		if (matrix.length == 1) {
			matrix[0][0] = a;
			matrix[0][1] = c1;
		} else {
			matrix[0][0] = a1;
			matrix[1][0] = a2;
			matrix[0][1] = b1;
			matrix[1][1] = b2;
		}

	}
}
