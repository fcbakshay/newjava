package abstract_and_concrete;

public class a4ac extends a3ac
{
public void m2() 
{
	System.out.println("m2 completed in concrete class");
}
public void m3() 
{
	System.out.println("m3 completed in concrete class");
}
public static void main(String[] args) 
{
a4ac a4=new a4ac();
a4.m1();
a4.m2();
a4.m3();
}
}
