package collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class sample7_treeset {

	public static void main(String[] args) {
		TreeSet tr=new TreeSet();
		tr.add(500);
		tr.add(100);
		tr.add(300);
		tr.add(800);
		tr.add(400);
		tr.add(900);
		tr.add(100);
		tr.add(600);
		
	
		
		System.out.println(tr);
		System.out.println(tr.contains(400));
		System.out.println(tr.first());
		System.out.println(tr.last());
		System.out.println(tr.isEmpty());
		System.out.println(tr.pollFirst());
		System.out.println(tr);
		System.out.println(tr.pollLast());
		System.out.println(tr);
		System.out.println(tr.remove(500));
		System.out.println(tr);
		System.out.println(tr.add(100));
		System.out.println(tr);
		System.out.println(tr.size());
		System.out.println("........print data by iterator......");
		Iterator itr=tr.iterator();
		
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		System.out.println("...........print data by for each loop.......");
		for(Object o:tr) 
		{
			System.out.println(o);
		}
		
		
		
		
		
	}

}
