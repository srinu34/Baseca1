package basecamp;

import java.util.Scanner;

public class Email {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s[] = input();
		String[] s2 = test(s);
		for (int i = 0; i < s2.length; i++) {
			System.out.println(s2[i]);
		}
	}

	private static String[] input() {
		System.out.println("Enter number do u wnat enter the email:");
		int number = sc.nextInt();
		sc.nextLine();
		String[] s = new String[number];
		for (int i = 0; i < s.length; i++) {

			System.out.println("Enter the Email Address:");
			String email = sc.nextLine();
			boolean valid = validation(email);
			while (!valid) {
				System.out.println("Email.not valid Enter correct email address:");
				email = sc.nextLine();
				valid = validation(email);
			}
			s[i] = email;
		}
		return s;
	}

	private static boolean validation(String email) {
		String valid = "";
		if (email.length() <= 10) {
			return false;
		} else {
			for (int i = email.length() - 10; i < email.length(); i++) {
				valid += email.charAt(i);

			}
			// System.out.println(valid);
			if (valid.equals("@gmail.com"))
				return true;
			else
				return false;
		}
	}

	private static String[] test(String[] s) {
		String[] so = new String[2];

		for (int i = 0; i < s.length; i++) {
			String s1 = " ";
			for (int j = 0; j < s[i].length(); j++) {
				if (s[i].charAt(j) == '@') {
					s1 = s1 + "at";
				} else if (s[i].charAt(j) == '.') {
					s1 = s1 + "dot";
				} else {
					s1 = s1 + s[i].charAt(j);
				}
			}
			so[i] = s1;

		}
		return so;

	}

}
