package types_of_variables;

public class a10_nonstaticvariable {
	String a = "good morning";

	public static void main(String[] args) {
		a10_nonstaticvariable a1 = new a10_nonstaticvariable();
		System.out.println(a1.a);
		m1();
		a10_nonstaticvariable b1 = new a10_nonstaticvariable();
		b1.m2();
	}

	public static void m1() {
		String b = "good afternoon";
		System.out.println(b);
		a10_nonstaticvariable c1 = new a10_nonstaticvariable();
		System.out.println(c1.a);
	}

	public void m2() {
		String c = "good evening";
		System.out.println(c);
	}
}
