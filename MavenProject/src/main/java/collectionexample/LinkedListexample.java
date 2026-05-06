package collectionexample;

import java.util.LinkedList;

public class LinkedListexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> li = new LinkedList<String>();
LinkedList<String> b = new LinkedList<String>();
li.add("Home");
li.add("Home");
li.add(null);
li.add(null);
li.add("Sweet");
li.add("manual");
System.out.println(li);
System.out.println(li.indexOf("Sweet"));
System.out.println(li.lastIndexOf("Home"));
System.out.println(li.remove(2));
System.out.println(li);
System.out.println(li.get(3));
System.out.println(li.contains("manual"));
System.out.println(li.isEmpty());
System.out.println(li.size());
b.add("Java");
b.add("progm");
System.out.println(li.addAll(b));
System.out.println(li);
System.out.println(li.containsAll(b));
	}

}
