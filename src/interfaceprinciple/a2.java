package interfaceprinciple;

public class a2 implements a1 {    //implementation class
	public void m1() {
		System.out.println("m1 completed at implementation class");   
	}

	public void m2() {
		System.out.println("m2 completed at implementation class");
	}
	
	public static void main(String[] args) {
	
		a2 a=new a2();
		a.m1();
		a.m2();
		
		
		
		
	}
}
