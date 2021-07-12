package basecamp;

import java.util.Scanner;

public class Amstrong {
	int sum, rem;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int sum = new Amstrong().amstrong(num);

		if (sum == num) {
			System.out.println("Amstrong number" + sum);
		} else {
			System.out.println("Not Amstrong number" + sum);
		}
	}

	public int amstrong(int num) {

		if (num > 0) {
			rem = num % 10;
			sum = sum + (rem * rem * rem);
			amstrong(num / 10);
		}

		return sum;
	}

}
