package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class sample6_linkedhashset {

	public static void main(String[] args) {
		LinkedHashSet lkh = new LinkedHashSet();
		lkh.add("velocity");
		lkh.add(78958);
		lkh.add('d');
		lkh.add(45.2f);
		lkh.add(null);
		lkh.add("velocity");
		lkh.add(null);

		System.out.println(lkh);

		System.out.println(lkh.contains(45.2f));
		System.out.println(lkh.isEmpty());
		System.out.println(lkh.remove('d'));
		System.out.println(lkh);
		System.out.println(lkh.size());
		System.out.println(lkh);
		System.out.println("........print data by iterator cursor.....");
		Iterator itr=lkh.iterator();
		
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		System.out.println("........print data by for eachr.....");
		
		for(Object oj:lkh) 
		{
			System.out.println(oj);
		}

	}

}
