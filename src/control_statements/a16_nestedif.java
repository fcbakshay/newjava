package control_statements;

public class a16_nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = "fcbakshay";
		String password = "fcb10";

		if ("fcbakshay" == username) {
			System.out.println("username valid");
			if ("fcb10" == password) {
				System.out.println("password valid");
			} else {
				System.out.println("password invalid");
			}
		} else {
			System.out.println("username invalid");
		}

	}

}
