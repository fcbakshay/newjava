package collection;

import java.util.ArrayList;

public class sample1_arraylist {

	public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add("Akshay");
	a.add("Turate");
	a.add(100);
	a.add('A');
	a.add(null);
	a.add(546582);
	
	
	System.out.println(a);
	System.out.println(a.isEmpty());
	System.out.println(a.size());
	System.out.println(a.contains("Turate"));
	
	System.out.println(a);  
	a.add(3, 'B');          //right shift operation
	System.out.println(a);
	a.remove(4);             //left shift operation
	System.out.println(a);
	a.set(2, 400);           //update info
	System.out.println(a);
  System.out.println(a.indexOf(546582));	
  System.out.println(a.get(2));
	
	
	
	

	}

}
