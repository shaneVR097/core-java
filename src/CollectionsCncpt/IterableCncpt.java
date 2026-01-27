package CollectionsCncpt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterableCncpt {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		Iterator<Integer> i=al.iterator();
		System.out.println("---------------");
		
		while(i.hasNext())
			System.out.println(i.next());
		ListIterator<Integer> li=al.listIterator();
		
		System.out.println("---------------");
		while(li.hasNext())
			System.out.println(li.next());
		
		System.out.println("---------------");
		while(li.hasPrevious())
			System.out.println(li.previous());
	}
}
