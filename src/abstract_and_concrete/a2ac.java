package abstract_and_concrete;

public class a2ac extends a1ac // complete class (concrete class)
{
	public void m2() {
		System.out.println("method m2 completed in concrete class");
	}

	public static void main(String[] args) {
		a2ac a1 = new a2ac();
		a1.m1();
		a1.m2();
	}
}
