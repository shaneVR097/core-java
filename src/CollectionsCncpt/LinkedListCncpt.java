package CollectionsCncpt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class LinkedListCncpt {
	public static void main(String[] args) {
		System.out.println("linked-list");
		List<String> ll=new LinkedList<String>();
		ll.add("abc");
		ll.add("xyz");
		ll.add("efg");
		System.out.println(ll);
		ll.add("mno"); //insert at last
		System.out.println(ll);
		ll.add(3, "pqr"); //insert in between
		System.out.println(ll);
		System.out.println(ll.remove("efg")); //remove matching element
		System.out.println(ll);
		System.out.println(ll.remove("efs")); //remove matching element
		System.out.println(ll);
		
		System.out.println("vector");
		List<String> vct=new Vector<String>();
		vct.add("abc");
		vct.add("xyz");
		vct.add("efg");
		System.out.println(vct);
		vct.add("mno"); //insert at last
		System.out.println(vct);
		vct.add(3, "pqr"); //insert in between
		System.out.println(vct);
		System.out.println(vct.remove("efg")); //remove matching element
		System.out.println(vct);
		System.out.println(vct.remove("efs")); //remove matching element
		System.out.println(vct);
		
		System.out.println("stack");
		Stack<String> stk=new Stack<>();
		stk.push("abc");
		stk.push("xyz");
		stk.push("efg");
		System.out.println(stk);
		stk.push("mno"); //insert at last
		System.out.println(stk);
//		stk.push(3, "pqr"); //insert in between not possible
		System.out.println(stk);
		System.out.println(stk.peek());
		System.out.println(stk.pop()); //remove only top element
		System.out.println(stk);
		System.out.println(stk.remove("efs")); //remove matching element
		System.out.println(stk);
	}
}
