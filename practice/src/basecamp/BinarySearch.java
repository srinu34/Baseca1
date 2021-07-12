package basecamp;

import java.util.Scanner;

public class BinarySearch {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s[] = input();
		int result = test(s);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + "index " + result);

	}

	private static int test(String[] s) {
		int l = 0, r = s.length - 1;
		System.out.println("Enter the String to search element:");
		String s1 = sc.nextLine();

		while (l <= r) {
			int m = l + (r - l) / 2;

			int res = s1.compareTo(s[m]);

			// Check if x is present at mid
			if (res == 0) {
				return m;
			}

			// If x greater, ignore left half
			if (res > 0) {
				l = m + 1;
			}

			// If x is smaller, ignore right half
			else {
				r = m - 1;
			}
		}

		return -1;
	}

	private static String[] input() {
		System.out.println("Enter the no of String:");
		int n = sc.nextInt();
		sc.nextLine();
		String s[] = new String[n];
		for (int i = 0; i < s.length; i++) {
			System.out.println("Enter the String:");
			String s1 = sc.nextLine();
			s[i] = s1;

		}
		return s;
	}

}
