package collectionexample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("World");
		a.add("Automation");
		a.add("Color");
		a.add("test");
		System.out.println(a);
		ArrayList<String> b = new ArrayList<String>();
		b.add("Hi");
		b.add("Jijin");
		System.out.println(b);
		
		//addAll() - to add 2 list or add new to the current list
		System.out.println(a.addAll(b));
		System.out.println(a);
		
		//containsAll() - to check whether a list is present in another
		System.out.println(a.containsAll(b));
		System.out.println(b.containsAll(a));
		
		Iterator<String> c = a.iterator();
		while(c.hasNext())
			{
			System.out.println(c.next());
		
			}
		c.remove();
System.out.println(a);

//clear() - to clear the list

b.clear();
System.out.println(b);
		
	}

}
