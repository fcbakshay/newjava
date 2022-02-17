package arrays;

import java.util.Arrays;

public class stringarray4 {

	public static void main(String[] args) {
		String[] s = { "tanaji", "pratik", "sagar", "vishal" };

		Arrays.sort(s);
		for (int i = 0; i <= s.length - 1; i++) {
			System.out.println(s[i]);
		}
		
	System.out.println("------------------");
for(int i=3;i>=0;i--) 
{
	System.out.println(s[i]);
}
	}

}
