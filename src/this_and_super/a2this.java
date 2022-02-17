package this_and_super;

public class a2this {
	int b = 50;

	public void add() {
		int b = 20;
		System.out.println(b);
		System.out.println(this.b);
	}

	public static void main(String[] args) // call main method in same class
	{
		a2this a2 = new a2this();
		a2.add();

	}
}
