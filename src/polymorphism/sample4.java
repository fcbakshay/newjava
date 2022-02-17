package polymorphism;

public class sample4 
{
public void m1(int a,int b) 
{
	int c=a+b;
	System.out.println("answer is:"+c);
}
public void m1(int a,int b,int c) 
{
	int x=a+b+c;
	
	System.out.println("answer is:"+x);

	
}
public static void main(String[] args) {
	
	sample4 s4=new sample4();
	s4.m1(50, 50);
	s4.m1(20, 45, 70);
}
}
