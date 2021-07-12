package basecamp;

import java.util.Scanner;

public class IdempodentMatrix {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int matrix[][] = new int[2][2];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("Enter Elements of row:"+i+"column "+j);
				matrix[i][j] = sc.nextInt();

			}
		}
		boolean isIdempodent = isIdempodent(matrix);
		if (isIdempodent) {
			System.out.println("The given matrix is idempodent:");
		} else {
			System.out.println("The given matrix is not idempodent:");
		}
	}

	private static boolean isIdempodent(int[][] matrix) {
		int result[][] = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				for (int j2 = 0; j2 < matrix.length; j2++) {
					result[i][j] += (matrix[i][j2] * matrix[j2][j]);

				}

			}

		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] == result[i][j]) {
					return true;
				}

			}
		}
		return false;
	}

}
