package Inheritance;

public class son3 extends father2 
{
	public void laptop() 
	{
	System.out.println("laptop:asus");
}
	public static void main(String[] args) 
	{
	son3 s3=new son3();
	s3.bunglow();
	s3.car();
	s3.cash();
	s3.laptop();
	}
}