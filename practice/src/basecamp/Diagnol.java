package basecamp;

public class Diagnol {

	public static void main(String[] args) {
		double a[][] = { { 1.1, 2.2, 5.3 }, { 4.4, 5.5, 6.6 }, { 7.7, 8.8, 9.9 } };

		test(a);
	

	}

	public static void test(double[][] a) {
		double sum = 0, sum1 = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i][i];
		}
		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < a[i].length; k++) {

				if (i + k == a[i].length - 1) {
					sum1 = sum1 + a[i][k];
				}
			}

		}
		System.out.println("Primary Diagonal Matrix==" + sum);
		System.out.println("Secondary Diagonal Matrix==" + sum1);
		

	}

}
