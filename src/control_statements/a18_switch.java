package control_statements;

public class a18_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char input= 1;
		switch (input) {
		case 1:
			System.out.println("cash deposited");
			break;
		case 2:
			System.out.println("cash withdrawl");
			break;
		case 3:
			System.out.println("mini statement");
			break;
		case 4:
			System.out.println("balance enquiry");
			break;

		default:
			System.out.println("invalid input");

		}
	}
}
