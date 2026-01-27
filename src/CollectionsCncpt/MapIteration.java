package CollectionsCncpt;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapIteration {
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(23, "A");
		map.put(32, "B");
		map.put(12, "C");
		for(Entry<Integer, String> ent: map.entrySet()) {
			System.out.println(ent.getKey()+" - "+ent.getValue());
		}
	}
}
