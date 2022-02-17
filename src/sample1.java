
public class sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=0;

int c;

try
{
	c=a/b;
}
catch(ArithmeticException e)
{
	System.out.println("arithmatic exception handled");
	c=a/1;
	System.out.println(c);
	
}
		
	}

}
