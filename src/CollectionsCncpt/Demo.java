package CollectionsCncpt;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
public class Demo {
	public static void main(String[] args) {
		//generic -> same type element <data type>
		//non genenric different type element
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("a");
		a1.add("b");
		a1.add("c");
		System.out.println(a1);
		System.out.println(a1.get(1));
		for(String str: a1) {
			System.out.println(str);
		}
		a1.remove(2);
		try {
			System.out.println(a1.get(2));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		List<String> a2=new ArrayList<String>(); //UC
		a2.add("d");
		a2.add("e");
		a2.add("f");
		System.out.println(a2);
		a2.set(1, "s");
		System.out.println(a2);
		
		ArrayList a3=new ArrayList();
		a3.add(1);
		a3.add("a");
		a3.add(9.8f);
		a3.add(false);
		a3.add(-109);
		
		System.out.println(a3);
		System.out.println(a3.get(0).getClass()==a3.get(1).getClass());
		System.out.println(a3.get(0).getClass()==a3.get(4).getClass());
		a3.set(4, (byte)(-128));
		System.out.println(a3.get(0).getClass()==a3.get(4).getClass());
		a3.addAll(a2);
		System.out.println(a3);
		a3.add(new Student(0,null));
		System.out.println(a3.get(8).toString());
		
		ArrayList<Student> stu=new ArrayList<Student>();
		stu.add(new Student(10,"hari"));
		stu.add(new Student(11,"om"));
		for(int i=0;i<stu.size();i++) {
			System.out.println(stu.get(i).toString());
		}
	}
}

