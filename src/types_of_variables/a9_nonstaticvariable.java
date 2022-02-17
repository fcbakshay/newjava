package types_of_variables;

public class a9_nonstaticvariable {
	int a = 10;

	public static void main(String[] args) {
		a9_nonstaticvariable a1 = new a9_nonstaticvariable();
		System.out.println(a1.a);
		a9_nonstaticvariable b1 = new a9_nonstaticvariable();
		b1.m2();
		m1();

	}

	public static void m1() {
		int b = 20;
		System.out.println(b);
		a9_nonstaticvariable c1 = new a9_nonstaticvariable();
		System.out.println(c1.a);
	}

	public void m2() {
		int c = 30;
		System.out.println(c);
		System.out.println(a);
	}
}
