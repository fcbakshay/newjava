package this_and_super;

public class a3this {
	char a = 'A';

	public void div() {
		int a = 55;
		System.out.println(a);
		System.out.println(this.a);
	}

	public static void main(String[] args) { // call main method in same class
		a3this a3 = new a3this();
		a3.div();
	}
}