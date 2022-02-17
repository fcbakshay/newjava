package types_of_variables;

public class a7_staticvariable {
	
	static int a=2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(a);
m1();
a7_staticvariable a1=new a7_staticvariable();
a1.m2();

	}
public static void m1() 
{
	int b=4;
	System.out.println(b);
	System.out.println(a);
}
public void m2() 
{
	int c=6;
	System.out.println(c);
	System.out.println(a);
}
}
