package constructor;

public class a8multic 
{
//	multipal constructor in same class
int num1;
int num2;
char grade;
String name;

a8multic(int a,int b,char c)
{
	num1=a;
	num2=b;
	grade=c;
}
a8multic(String d)
{
	name=d;
}
void add() 
{
	int sum=num1+num2;
	System.out.println("ADDITION="+sum);
	char Grade=grade;
	System.out.println("GRADE="+Grade);
}
void info() 
{
	String NAME=name;
			System.out.println(NAME);
}

public static void main(String[] args) 
{
a8multic a8=new a8multic(500,500,'Z');
a8.add();
a8multic a9=new a8multic("akshay");
a9.info();
}
}
