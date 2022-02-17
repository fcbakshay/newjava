package constructor;

public class a5udc 
{
//step1.variable declaration	
int a;  
int b;
//user defined constructor in same class
a5udc()
{
//	variable initialization
	a=15;
	b=15;

}
//variable usage
public void add() 
{
	int sum=a+b;
	System.out.println("sum="+sum);
}
public static void main(String[] args) 
{
a5udc a5=new a5udc();
a5.add();
a5.sub();
}

void sub() 
{
	int sub=a-b;
	System.out.println("answer="+sub);
}
}
