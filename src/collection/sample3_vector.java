package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class sample3_vector {

	public static void main(String[] args) {
		Vector v=new Vector();
		
		v.add("akshay");
		v.add(78568);
		v.add('q');
		v.add(null);
		v.add(null);
		v.add(741235);
		
		
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.contains('q'));
		System.out.println(v.get(3));
		System.out.println(v.indexOf(741235));
		System.out.println(v);
		v.add(2, 'Q');
		System.out.println(v);
		
		v.remove(3);
		System.out.println(v);
		
		System.out.println("........print vector data by iterator");
		Iterator itr =v.iterator();
		
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
			
		}
		System.out.println("........print vector data by listiterator");
		
		ListIterator litr=v.listIterator();
		
		while(litr.hasNext()) 
		{
			System.out.println(litr.next());
		}

		System.out.println("........print vector data by for loop");
		
		for(int i=0;i<=v.size()-1;i++) 
		{
			System.out.println(v.get(i));
		}
		System.out.println("........print vector data by each loop");
		
		for(Object oj:v) 
		{
			System.out.println(oj);
		}
		System.out.println("........print vector data by enumeration");
		Enumeration enu=v.elements();
		while(enu.hasMoreElements()) 
		{
			System.out.println(enu.nextElement());
		}
		
		
		
	}

}
