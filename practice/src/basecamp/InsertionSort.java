package basecamp;

import java.util.Scanner;

public class InsertionSort {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double a[] = input();
		double sortedArray[] = test(a);
		System.out.println("==============");
		for (int i = 0; i < sortedArray.length; i++) {

			System.out.println(sortedArray[i]);

		}

	}

	private static double[] test(double[] a) {
		for (int i = 1; i < a.length; ++i) {
			double value = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > value) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = value;
		}
		return a;
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
