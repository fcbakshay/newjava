package arrays;

import java.util.Arrays;

public class intarray4 {

	public static void main(String[] args) {
	
		
		int [] b= {30,60,10,40,5};
		
		Arrays.sort(b);
		for(int i=0;i<=b.length-1;i++) 
		{
			System.out.println(b[i]);
		}
		System.out.println("-----------------");
for(int i=4;i>=0;i--) 
{
	System.out.println(b[i]);
}
	}

}
