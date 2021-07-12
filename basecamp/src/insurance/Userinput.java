package insurance;

import java.util.Scanner;

public class Userinput {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Insurance[] insurance = new Insurance[50];
		boolean flag = true;
		do {
			System.out.println("Enter the choice:");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				// 1.add policy details to the system and display all policy details present in
				// system
				// >add policy details
				// >display all policy details
				insurance = addpolicydetails();
				displayallpolicydetails(insurance);
				break;
			case 2:
				// 2.display policies whose premimum fee is less than or equal to given amount
				// for given mode
				// example.if input is given as 5000 and mode as"quarterly",display policies
				// whose premium fee is less than or equal to 5000 with mode as "quarterly"
				// > given premimum amount compare the given policyamount lessthan or equal and
				// given mode also its same
				// >display all details
				displaypremimumfeepolicy(insurance);
				break;
			case 3:
				// 3.sort policy details by number and display all policy details present in
				// system.
				// >sort policy details using number
				// >display that policy details
				Insurance[] sortdetails = sortpolicydetails(insurance);
				displaysortingdetails(sortdetails);
				break;
			case 4:
				// 4.update premium fee details for given policy number
				// >update the premimumfee details for given number based
				updatepremimumfeedetails(insurance);
				break;
			case 5:
				// 5.Exit.
				exit();
				flag = false;
				break;
			default:
				System.out.println("Enter vaild choice:");
				break;
			}
		} while (flag);

	}

	private static void exit() {
		System.out.println("+++++Successfully Exit++++++");

	}

	private static void updatepremimumfeedetails(Insurance[] insurance) {
		System.out.println("Enter Number do you want update:");
		int number = sc.nextInt();
		System.out.println("Enter new premimumfee:");
		double newpremimumfee = sc.nextDouble();
		for (int i = 0; i < insurance.length; i++) {
			if (insurance[i].getNumber() == number) {
				insurance[i].setPremimumfee(newpremimumfee);
				System.out.println("++++Updated Successfully++++");
			}

		}
	}

	private static void displaysortingdetails(Insurance[] sortdetails) {
		for (int i = 0; i < sortdetails.length; i++) {
			System.out.println("id           " + sortdetails[i].getId());
			System.out.println("number       " + sortdetails[i].getNumber());
			System.out.println("type         " + sortdetails[i].getType());
			System.out.println("premimumfee  " + sortdetails[i].getPremimumfee());
			System.out.println("premimummode " + sortdetails[i].getPremimummode());
			System.out.println();

		}

	}

	private static Insurance[] sortpolicydetails(Insurance[] insurance) {

		for (int i = 0; i < insurance.length - 1; i++) {
			for (int j = 0; j < insurance.length - 1 - i; j++) {
				if (insurance[j].getNumber() > insurance[j + 1].getNumber()) {
					Insurance temp = insurance[j];
					insurance[j] = insurance[j + 1];
					insurance[j + 1] = temp;
				}
			}
		}

		return insurance;
	}

	private static void displaypremimumfeepolicy(Insurance[] insurance) {
		System.out.println("Enter premimum fee:");
		double premimumfee = sc.nextDouble();
		System.out.println("Enter premimummode:");
		String mode = sc.next();
		for (int i = 0; i < insurance.length; i++) {
			if (insurance[i].getPremimumfee() <= premimumfee) {
				if (insurance[i].getPremimummode().equals(mode)) {
					System.out.println("id           " + insurance[i].getId());
					System.out.println("number       " + insurance[i].getNumber());
					System.out.println("type         " + insurance[i].getType());
					System.out.println("premimumfee  " + insurance[i].getPremimumfee());
					System.out.println("premimummode " + insurance[i].getPremimummode());
					System.out.println();

				}
			}

		}

	}

	private static void displayallpolicydetails(Insurance[] insurance) {
		for (int i = 0; i < insurance.length; i++) {
			System.out.println("id           " + insurance[i].getId());
			System.out.println("number       " + insurance[i].getNumber());
			System.out.println("type         " + insurance[i].getType());
			System.out.println("premimumfee  " + insurance[i].getPremimumfee());
			System.out.println("premimummode " + insurance[i].getPremimummode());
			System.out.println();

		}
	}

	private static Insurance[] addpolicydetails() {
		System.out.println("Enter how many number of policy details do you what enter:");
		int nopolicy = sc.nextInt();
		Insurance[] alldetails = new Insurance[nopolicy];
		for (int i = 0; i < alldetails.length; i++) {
			System.out.println("Enter the id:");
			byte id = sc.nextByte();
			System.out.println("Enter the policy number:");
			int number = sc.nextInt();
			System.out.println("Enter the Type:");
			String type = sc.next();
			System.out.println("Enter the premimumfee:");
			double premimumfee = sc.nextDouble();
			System.out.println("Enter the primummode");
			String premimummode = sc.next();
			alldetails[i] = new Insurance(id, number, type, premimumfee, premimummode);
			System.out.println("++++++++Details Entered Successfully+++++++++");
			System.out.println();

		}

		return alldetails;
	}

}
