package polymorphism;

public class sample3 extends sample2
{
public void car()    //method overriding
{
	System.out.println("seltos");
}
	
	
	public static void main(String[] args)
	{
		sample3 s2=new sample3();
		s2.car();
		s2.home();
		s2.money();
		

	}

}
