package arrays;

import java.util.Arrays;

public class chararray3 {

	public static void main(String[] args) {
		char [] c=new char[4];
		
		c[0]='r';
		c[1]='c';
		c[2]='k';
		c[3]='x';
		
		Arrays.sort(c);
		for(int i=0;i<=c.length-1;i++) 
		{
			System.out.println(c[i]);
		}
	}

}
