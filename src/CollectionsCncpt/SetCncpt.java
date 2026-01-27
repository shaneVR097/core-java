package CollectionsCncpt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class SetCncpt {
	public static void main(String[] args) {
		System.out.println("hash set");
		HashSet hsh=new HashSet();
		hsh.add(1);
		hsh.add("abchfg");
		hsh.add(8.789f);
		hsh.add(true);
		System.out.println(hsh);
		
		hsh.remove(1);
		System.out.println(hsh);
		System.out.println(hsh.remove(2));
		
		HashSet<String> hs2=new HashSet<String>();
		hs2.add("hola amigo");
		hs2.add("kaise ho ?");
		hs2.add("thik ho ?");
		System.out.println(hs2);
		
		System.out.println("linked list hash set");
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("mon");
		lhs.add("tues");
		lhs.add("sun");
		lhs.add("sat");
		System.out.println(lhs);
		System.out.println(lhs.add(null)); //only one null element allowed
		System.out.println(lhs);
		System.out.println(lhs.add("mon")); //duplicate element not allowed
		System.out.println(lhs);
		System.out.println(lhs.add(null)); //not more than one null element
		System.out.println(lhs.contains("tues"));
		System.out.println(lhs.contains("thurs"));
		
		System.out.println("tree set");
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(2);
		System.out.println(t);
		t.add(3);
		System.out.println(t);
		t.add(4);
		System.out.println(t);
		t.add(5);
		System.out.println(t);
		t.add(1);
		System.out.println(t);
		
		System.out.println("conversion of array list to tree set");
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(2);
		al.add(2);
		al.add(3);
		al.add(2);
		System.out.println(al);
		HashSet<Integer> hs3=new HashSet<Integer>(al);
		System.out.println(hs3);
		al.clear();
		al.addAll(hs3);
		System.out.println(al);
	}
}
