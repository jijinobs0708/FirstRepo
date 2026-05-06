package Mavenproject;

public class BufferClass {
 public static void main(String[] args)
 {
	StringBuffer sb = new StringBuffer("Hello");
	System.out.println(sb);
	StringBuilder sbs = new StringBuilder("Hi");
	System.out.println(sbs);
	
	//insert() - used to insert a new string on the current string based on the index position
	
	System.out.println(sb.insert(5,123));
	
	//append() - adding a new string to the end
	
	System.out.println(sb.append(1.2));
	
	//replace() - to replace a string based on index position
	
	System.out.println(sb.replace(5, 11,"world"));
	
	//delete() - to delete a string based on index position
	
	System.out.println(sb.delete(5, 10));
	
	//reverse() - used to reverse a string
	
	System.out.println(sb.reverse());
	
}
}