package stringclassmethods;

public class a2 {

	public static void main(String[] args) {
		String s1 = "implementation";
		String s2 = "";
		String s3 = "QWERTY";

		System.out.println(s1.length());   //14

		System.out.println(s2.length());   //0

		System.out.println(s3.length());    //6

		System.out.println(s1.isEmpty());    //false

		System.out.println(s2.isEmpty());  //true
		System.out.println(s3.isEmpty());     //fase
		
		
		System.out.println(s1.toUpperCase());    //IMPLEMENTATION
		System.out.println(s3.toLowerCase());      //qwerty
		
		
	}
	

}
