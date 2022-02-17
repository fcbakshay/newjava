package control_statements;

public class a14_elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks =62;

		if (marks >= 65) {
			System.out.println("distinction");
		} else if (marks >= 60) {
			System.out.println("first class");
		} else if (marks >= 55) {
			System.out.println("higher second class");
		} else if (marks >= 50) {
			System.out.println("higher class");
		}
		else if(marks<=34) 
		{
			System.out.println("fail");
		}
	}
}