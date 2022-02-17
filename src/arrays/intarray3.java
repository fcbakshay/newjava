package arrays;

import java.util.Arrays;

public class intarray3 {

	public static void main(String[] args) {
	int [] a=new int [4];

	a[0]=50;
	a[1]=20;
	a[2]=80;
	a[3]=10;
	
	Arrays.sort(a);
	for(int i=0;i<=a.length-1;i++) 
	{
		System.out.println(a[i]);
	}
	
	
	}

}
