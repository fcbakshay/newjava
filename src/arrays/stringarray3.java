package arrays;

import java.util.Arrays;

public class stringarray3 {

	public static void main(String[] args) {
		String [] s=new String[4];
		s[0]="rahul";
		s[1]="akash";
		s[2]="yash";
		s[3]="siddhu";
		
		Arrays.sort(s);
		for(int i=0;i<=s.length-1;i++) 
		{
			System.out.println(s[i]);
		}

	}

}
