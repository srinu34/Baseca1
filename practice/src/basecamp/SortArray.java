package basecamp;

import java.util.Scanner;

public class SortArray {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double a[] = input();

	}

	private static double[] input() {
		System.out.println("Enter the no of float element:");
		int num = sc.nextInt();
		double a[] = new double[num];
		System.out.println("Enter the elements:");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextDouble();

		}

		return a;
	}

}
