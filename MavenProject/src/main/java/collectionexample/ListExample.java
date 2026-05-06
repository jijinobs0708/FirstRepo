package collectionexample;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> a= new ArrayList<String>();
System.out.println(a);

//add() - to add elements in collection or in the list

a.add("Hello");
a.add("Hello");
a.add(null);
a.add(null);
a.add("Testing");
a.add("Green");
System.out.println(a.indexOf("Testing"));

//indexOf() - to return the index of an element, if there is repeated element it returns the first element
System.out.println(a.indexOf("Hello"));

//lastIndexOf() - used to return the index of an element, if there s any repeated element the last one will be returned
System.out.println(a.lastIndexOf("Hello"));

//remove() - to remove a particular element or object ,index based and object based
System.out.println(a.remove(0));
System.out.println(a);

//get() - to retrieve an element from collection

System.out.println(a.get(2));

//contains() - to check whether a element is present in a collection
System.out.println(a.contains("Testing"));
System.out.println(a.contains("World"));

//isEmpty() - to check whether a collection is empty or not
System.out.println(a.isEmpty());

//size() - to return the size or length of the collection
System.out.println(a.size());

for(int i=0; i<a.size(); i++)
{
	System.out.println(a.get(i));
}
for(String var:a)
{
	System.out.println(var);
}

	}

}
