package arrays;

public class multidimensional_intarray {

	public static void main(String[] args) {
	int [][] m=new int [2][3];
	//        0   1   2
	//   0    40 50 60
   //    1    30 50 70
	
	m[0][0]=40;
	m[0][1]=50;
	m[0][2]=60;
	m[1][0]=30;
	m[1][1]=50;
	m[1][2]=70;
	
	
	for(int i=0;i<=1;i++) 
	{
		for(int j=0;j<=2;j++) 
		{
			System.out.print(m[i][j]+" ");
		}
		System.out.println();
	}
	
	
	}

}
