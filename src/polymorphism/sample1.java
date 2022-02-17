package polymorphism;

public class sample1 
{
public void addition(int a,int b) 
{
	int sum=a+b;
	System.out.println("sum of the 2 number is "+sum);
}
public void addition(int a,int b,int c)   //methodoverloading
{
	int add=a+b+c;
	System.out.println("sum of 3 numbers is "+add);
}
public static void main(String[] args) 
{
sample1 s1=new sample1();
s1.addition(20, 10);
s1.addition(14, 18, 21);
}
}
