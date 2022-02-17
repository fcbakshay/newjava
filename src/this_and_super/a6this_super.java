package this_and_super;

public class a6this_super extends a5this
{
int b=20;

public void m1() 
{
int b=100;
System.out.println(b);
System.out.println(this.b);
System.out.println(super.b);
}
public static void main(String[] args)
{
a6this_super a6=new a6this_super();
a6.m1();
}
}

