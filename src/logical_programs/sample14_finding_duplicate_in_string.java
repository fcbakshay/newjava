package logical_programs;

public class sample14_finding_duplicate_in_string {

	public static void main(String[] args) {
		String a = "akksshay";
		char l = 0;
		int count = 0;

		for (int i = 0; i < a.length(); i++) {
			for (int j = i + 1; j < a.length(); j++) {
				if (a.charAt(i) == a.charAt(j)) {
					l = a.charAt(i);
					count++;
					System.out.print(l);
				}
			}
		}

	}
}