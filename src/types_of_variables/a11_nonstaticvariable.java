package types_of_variables;

public class a11_nonstaticvariable {
	int a = 100;

	public static void main(String[] args) {
		a11_nonstaticvariable a1 = new a11_nonstaticvariable();
		System.out.println(a1.a);
		m1();
		a11_nonstaticvariable c1 = new a11_nonstaticvariable();
		c1.m2();
		a10_nonstaticvariable d1 = new a10_nonstaticvariable();
		d1.m2();
	}

	public static void m1() {
		int b = 50;
		System.out.println(b);
		a11_nonstaticvariable b1 = new a11_nonstaticvariable();
		System.out.println(b1.a);
	}

	public void m2() {
		int c = 20;
		System.out.println(c);
		System.out.println(a);
	}
}
