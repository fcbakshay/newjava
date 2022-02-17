package arrays;

public class multidimensional_chararray {

	public static void main(String[] args) {
		char [][] c=new char [3][3];
		
		//0    1        2       
	//	0 v    k        f
	//	1 e    s        d
	//	2 q    x        b
		
	c[0][0]='v';
	c[0][1]='k';
	c[0][2]='f';
	c[1][0]='e';
	c[1][1]='s';
	c[1][2]='d';
	c[2][0]='q';
	c[2][1]='x';
	c[2][2]='b';
	
	for(int i=0;i<=2;i++) 
	{
		for(int j=0;j<=2;j++) 
		{
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
	
	
	
	}

}
