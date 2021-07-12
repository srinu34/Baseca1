package practice1;

public class Pbrm9 {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, // 9,2,3
				{ 4, 5, 6 }, // 4,5,6
				{ 7, 8, 9 } };// 7,8,1
		test(a);
	}

	public static void test(int a[][]) {
		int t = a[0][0];
		a[0][0] = a[a.length - 1][a[0].length - 1];
		a[a.length - 1][a[0].length - 1] = t;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();

		}

	}
}
