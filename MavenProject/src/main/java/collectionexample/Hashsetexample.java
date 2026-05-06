package collectionexample;

import java.util.HashSet;

public class Hashsetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> sh = new HashSet<String>();
HashSet<String> s = new HashSet<String>();
sh.add("add");
sh.add("add");
sh.add(null);
sh.add(null);
sh.add("example");
s.add("123");
s.add("west");
System.out.println(sh);
sh.remove(null);
System.out.println(sh);
System.out.println(sh.contains("example"));
sh.addAll(s);
System.out.println(sh);
System.out.println(sh.containsAll(s));
s.clear();
System.out.println(s);
	}

}
