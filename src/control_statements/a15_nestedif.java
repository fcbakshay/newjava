package control_statements;

public class a15_nestedif {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method 
		String username="akki007";
		String password="abc123";
		
		
		if("akki007"==username) 
		{
			
					System.out.println("username correct");
					
					if("abc123"==password) 
					{
						System.out.println("correct password");
					}
					else 
					{
						System.out.println("password invalid");
					}
		}
		else 
		{
			System.out.println("username invalid");
		}
}
	
	
}