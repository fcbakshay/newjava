package this_and_super;

public class a1this 
{
	int a=20;
public void name() 
{
int a=10;
System.out.println(a);
System.out.println(this.a);
}

	public static void main(String[] args) // call main method in same class
{
	
a1this a1=new a1this();
a1.name();


}
}
