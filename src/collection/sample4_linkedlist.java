package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class sample4_linkedlist {

	public static void main(String[] args) {
		LinkedList llt=new LinkedList();
		llt.add("velocity");
		llt.add(45651);
		llt.add('q');
		llt.add("velocity");
		llt.add(55.12f);
		llt.add(null);
		llt.add(null);
		
		
		System.out.println(llt);
		System.out.println(llt.contains("velocity"));
		System.out.println(llt.get(2));
		System.out.println(llt.indexOf(45651));
		System.out.println(llt.isEmpty());
		
		llt.add(2, 'Q');
		System.out.println(llt);
		llt.remove(3);
		System.out.println(llt);
		
		llt.set(3, "vtc");
		System.out.println(llt);
		
		System.out.println(".........print data by iterator cursor........");
		
		Iterator itr=llt.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
			
			
			System.out.println(".......print data by listiterator cursor........");
			ListIterator ltr=llt.listIterator();
			
			while(ltr.hasNext()) 
			{
				System.out.println(ltr.next());
				
				System.out.println(".........print data by for loop.....");
				
				for(int i=0;i<=llt.size()-1;i++) 
				{
					System.out.println(llt.get(i));
				}
				System.out.println(".......print data by for each loop");
				
				for(Object oj:llt) 
				{
					System.out.println(oj);
				}
				
				
			}
			
			
			
			
		}

	}

}
