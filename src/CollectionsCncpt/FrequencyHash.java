package CollectionsCncpt;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyHash {
	public static void main(String[] args) {
		String str="mississippi";
		char[] chr=str.toCharArray();
		Map<Character, Integer> freq=new HashMap<Character, Integer>();
		for(char c:chr) {
			freq.put(c, freq.getOrDefault(c, 0)+1);
		}
		
		for(Entry<Character, Integer> ent:freq.entrySet()) {
			System.out.println(ent.getKey()+" - "+ent.getValue());
		}
		
	}
}
