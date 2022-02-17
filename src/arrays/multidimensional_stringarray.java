package arrays;

public class multidimensional_stringarray {

	public static void main(String[] args) {
		String[][] s = new String[2][3];
		// 0 1 2
		// 0 sin cos tan
		// 1 cot sec cosec

		s[0][0] = "sin";
		s[0][1] = "cos";
		s[0][2] = "tan";
		s[1][0] = "cot";
		s[1][1] = "sec";
		s[1][2] = "cosec";

		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.print(s[i][j] + " ");
			}
			System.out.println();
		}

	}

}
