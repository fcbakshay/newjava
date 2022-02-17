package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class sample2_arraylist {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("AKSHAY");
		a1.add(6541233);
		a1.add('c');
		a1.add(null);
		a1.add("TURTAE");
		
		System.out.println(a1);
		System.out.println(a1.contains('c'));
		System.out.println(a1.get(3));
		System.out.println(a1.indexOf("AKSHAY"));
		System.out.println(a1.isEmpty());
		System.out.println(a1.size());
		
		a1.add(3, 100);
		System.out.println(a1);
		
		a1.remove(1);
		System.out.println(a1);
		System.out.println(a1.set(2, 'a'));
		System.out.println(a1);
		
		System.out.println("...........print arraylist data using iterator cursor...........");
		
		Iterator itr=a1.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		System.out.println("...........print arraylist data using listiterator cursor............");
		
		ListIterator litr=a1.listIterator();
		
		while(litr.hasNext()) 
		{
			System.out.println(litr.next());
		}
			System.out.println("...........print arraylist data using for loop............");
			
			for(int i=0;i<=a1.size()-1;i++) 
			{
				System.out.println(a1.get(i));
			}
			
			System.out.println("...........print arraylist data using each loop............");
			
			for(Object o:a1) 
			{
				System.out.println(o);
			}
			
			
			
		}
		
		
		
		
		

	}


