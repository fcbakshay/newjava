package this_and_super;

public class a10thissuper extends a9thissuper
{
int a=100;
public void m3() 
{
int a=250;
System.out.println(a);
System.out.println(this.a);
System.out.println(super.a);
}
public static void main(String[] args) 
{
	a10thissuper a10=new a10thissuper();
	a10.m3();
}
}
