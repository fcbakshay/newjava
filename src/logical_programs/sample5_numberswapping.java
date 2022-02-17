package logical_programs;

public class sample5_numberswapping {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("before swapping no are:"+a+" "+b);
		
		b=a+b-(a=b);
		
		System.out.println("after swapping no are:"+a+" "+b);

	}

}
