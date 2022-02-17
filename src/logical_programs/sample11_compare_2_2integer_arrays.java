package logical_programs;

import java.util.Arrays;

public class sample11_compare_2_2integer_arrays {

	public static void main(String[] args) {
		int [] a1= {20,40,60};
		int [] a2= {80,70,10};
		int [] a3= {60,40,20};
		int [] a4= {20,40,60};
		
		
		System.out.println(Arrays.equals(a1, a2));
		System.out.println(Arrays.equals(a1, a3));
		System.out.println(Arrays.equals(a1, a4));
		

	}

}
