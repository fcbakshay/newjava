package logical_programs;

public class sample7_count_number_of_digit_in_number{

	public static void main(String[] args) {
		int a=856482465;
		int count=0;
		while(a>0) 
		{
			a=a/10;
			count++;
			
		}
		System.out.println("no of digits:"+count);
	}

}
