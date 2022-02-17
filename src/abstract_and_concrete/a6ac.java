package abstract_and_concrete;

public class a6ac extends a5ac
{
public void subtraction() 
{
	int a=20;
	int b=10;
	int sub=a-b;
	System.out.println("answer is:"+sub);
}
public static void main(String[] args) {
	a6ac a6=new a6ac();
	a6.addition();
	a6.subtraction();
}
}
