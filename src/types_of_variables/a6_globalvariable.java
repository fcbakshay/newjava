package types_of_variables;

public class a6_globalvariable {
	static int a = 20;
	static int b = 30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(a);
System.out.println(b);
m9();
a6_globalvariable a1=new a6_globalvariable();
a1.m10();

	}

	public static void m9() {
		int c = 50;
		int d = 60;
		System.out.println(c);
		System.out.println(d);
	}

	public void m10() {
		char e = 'd';
		float f = 20f;
		System.out.println(e);
		System.out.println(f);
	}
}
