package CollectionsCncpt;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertArray {
	public static void main(String[] args) {
		String[] arr= {"a","b","a","c"};
		List<String> ls = Arrays.asList(arr);
		Set<String> set = new HashSet<String>(ls);
//		Set<String> set2 = new HashSet<String>(arr);
		System.out.println(ls);
		System.out.println(set);
	}
}
