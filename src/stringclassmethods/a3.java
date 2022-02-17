package stringclassmethods;

public class a3 {

	public static void main(String[] args) {
		String s1 = "polymorphism";
		String s2 = " POLYMORPHISM";
		String s3 = "poly";
		String s4 = "POLY";
		String s5 = "POLY";
        System.out.println(s4.equals(s5));
		System.out.println(s1.equalsIgnoreCase(s2));
System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s1.equals(s2));

		System.out.println(s1.contains(s3));
		
		System.out.println(s1.contains(s4));
		System.out.println(s2.contains(s4));
		
		
		System.out.println(s1.charAt(6));
		System.out.println(s2.charAt(3));
		
		System.out.println(s1.startsWith("po"));
		System.out.println(s2.endsWith("SM"));
		System.out.println(s1.indexOf("y"));
		System.out.println(s2.indexOf("O"));
		System.out.println(s2.lastIndexOf("O"));
		System.out.println(s1.substring(4));
		System.out.println(s2.substring(7));
		System.out.println(s1.substring(0,4));
		
		System.out.println(s2.substring(4,12));		
		System.out.println(s1+s2);		
		System.out.println(s1.concat(s2));
	  System.out.println(s1.replace("polymorphism","inheritance" ));	
		
		
		
		
		
		
		
		
	}

}
