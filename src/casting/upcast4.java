package casting;

public class upcast4 extends upcast3
{
	public void info() {
		String Name = "ashish";
		int rollno = 57;
		char grade = 'B';
		System.out.println(Name);
		System.out.println(rollno);
		System.out.println(grade);
}
	public void sub() 
	{
		int a=50;
		int b=10;
		int ans=a-b;
		System.out.println(ans);
	}
	public static void main(String[] args) {
		
		upcast3 a3=new upcast4();
		a3.add();
		a3.info();
		
		
		
	}
}