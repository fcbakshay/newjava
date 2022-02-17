package interfaceprinciple;

public class a5 implements a3,a4// implementataion class sub class
{
	public void m1() {
		System.out.println("m1 method from a3 completed in implementation class");
	}

	public void m2() {
		System.out.println("m2 method from a3 completed in implementation class");
	}

	public void m3() {
		System.out.println("m3 metgod from  a4 completed in inplementation class");
	}

	public void m4() {
		System.out.println("m4 method from a4 completed in implementation class");
	}
public static void main(String[] args) 
{
a5 a=new a5();
a.m1();
a.m2();
a.m3();
a.m4();
}
}
