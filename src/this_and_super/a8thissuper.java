package this_and_super;

public class a8thissuper extends a7thissuper
{
int x=25;

public void m2() 
{
char B='Z';
System.out.println(B);
System.out.println(this.x);
System.out.println(super.a);
System.out.println(super.b);
System.out.println(super.c);
}
public static void main(String[] args)
{
	a8thissuper a8=new a8thissuper();
	a8.m2();
	
}
}
