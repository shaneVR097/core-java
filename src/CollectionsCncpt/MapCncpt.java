package CollectionsCncpt;

import java.util.Collection;
import java.util.HashMap;
import java.util.TreeMap;

public class MapCncpt {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("key", 12);
		hm.put(23, "xyz");
		System.out.println(hm);
		System.out.println(hm.get("key"));
		hm.put(23, "qas");
		System.out.println(hm);
		
		HashMap<Integer, String> hm2=new HashMap<Integer, String>();
		hm2.put(1, "shy");
		hm2.put(2, "kri");
		System.out.println(hm2);
		hm2.put(2, "sub");
		System.out.println(hm2);
		System.out.println(hm2.get(1));
		System.out.println(hm2.getOrDefault(2, "default value"));
		System.out.println(hm2.getOrDefault(3, "default value"));
		System.out.println(hm2.remove(1));
		System.out.println(hm2);
		System.out.println(hm2.remove(2, "sub"));
		System.out.println(hm2);
		hm2.put(1, "shy");
		hm2.put(2, "kri");
		hm2.replace(2, "sub");
		System.out.println(hm2);
		hm2.replace(1, "shy", "div");
		System.out.println(hm2);
		System.out.println(hm2.keySet());
		System.out.println(hm2.entrySet());
		
		Collection<Integer> cl1=hm2.keySet();
		System.out.println(cl1);
		Collection<String> cl2=hm2.values();
		System.out.println(cl2);
		
		TreeMap<String, Integer> tm=new TreeMap<String, Integer>();
		tm.put("xyz", 10);
		tm.put("abz", 10);
		tm.put("abc", 20);
		System.out.println(tm);
	}
}