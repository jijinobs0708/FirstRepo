package collectionexample;

import java.util.HashSet;
import java.util.Set;

public class Setoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> a = new HashSet<String>();
a.add("Obsqura");
a.add("Obsqura");
a.add(null);
a.add(null);
a.add("Test");
System.out.println(a);
a.remove(null);
System.out.println(a); //cannot use index method in set. rest all can be used. contains(),containsAll(),add(),addAll()
	}

}
