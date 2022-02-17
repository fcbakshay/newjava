package arrays;

import java.util.Arrays;

public class chararray4 {

	public static void main(String[] args) {
		char[] c = { 'w', 's', 'a', 'l' };

		Arrays.sort(c);
		for (int i = 3; i >= 0; i--) {
			System.out.println(c[i]);
		}

		System.out.println("-----------------------------------");
		for (int i = 0; i <= c.length - 1; i++) {
			System.out.println(c[i]);
		}

	}

}
