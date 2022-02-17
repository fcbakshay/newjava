package logical_programs;

import java.util.Scanner;

public class sample10_accept_input_from_user {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("name of the student");
		String text1 = scan.next();
		System.out.println("name:"+text1);
		System.out.println("name of the school");
		String text2 = scan.next();
		System.out.println("name:"+text2);
	}

}
