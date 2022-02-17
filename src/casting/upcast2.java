package casting;

public class upcast2 extends upcast1
{
public void addition() 
{
	int a=70;
	int b=20;
	int ans=a+b;
	System.out.println(ans);
}
public static void main(String[] args) {
	
	
	upcast1 a1=new upcast2();
	a1.addition();
	a1.subtraction();
	
}
}
