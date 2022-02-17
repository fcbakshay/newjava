package logical_programs;

public class sample13_without_changing_index_reverse_string {

	public static void main(String[] args) {
		String s="akshay turate" ;
		String [] name=s.split(" ");
		for(int i=0;i<name.length;i++) {
			for(int j=name[i].length()-1;j>=0;j-- ) 
				System.out.print(name[i].charAt(j));
			
		}
	}

}
