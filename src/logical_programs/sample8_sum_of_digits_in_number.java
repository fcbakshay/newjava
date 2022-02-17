package logical_programs;

public class sample8_sum_of_digits_in_number {

	public static void main(String[] args) {
		int a=4586;
		int sum=0;
		
		while(a>0) 
		{
			sum=sum+a%10;
			a=a/10;
		}
System.out.println("the sum of digits are:"+sum);
	}

}
