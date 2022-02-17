 package control_statements;

public class a11_elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 60;

		if (marks >= 65) {
			System.out.println("distinction");
		} else if (marks >= 60) {
			System.out.println("first class");
		} else if (marks >= 55) {
			System.out.println("higher second class");
		} else if (marks >= 50) {
			System.out.println("second class");
		} else if (marks >= 35) {
			System.out.println("pass");
		}
	}

}
