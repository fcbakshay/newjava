package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class sample5_hashset {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("akshay");
		hs.add(65854);
		hs.add(88.65f);
		hs.add('Z');
		hs.add("akshay");
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("akshay"));
		hs.remove("akshay");
		System.out.println(hs);
		System.out.println("........print data by iterator cursor..........");
		Iterator itr=hs.iterator();
		
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		System.out.println(".......print data by for each loop........");
		for(Object oj:hs) 
		{
			System.out.println(oj);
		}
	
		
		

		
		
		
	}

}
