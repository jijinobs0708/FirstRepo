package Mavenproject;

public class Stringexample {
	public static void main(String[]args)
	{
String a = "Hello";
System.out.println(a);
String b = new String("Hi");
System.out.println(b);
	// TODO Auto-generated method stub
    //Length() -used to find the size or length of string
System.out.println(a.length());
//charAT() - used to return character based on index position
System.out.println(a.charAt(3));

//concat() -used to add the new string to last of the current string
System.out.println(a.concat(b));
System.out.println(a);
//contains() - used to check whether a character or word in present in the string

System.out.println(a.contains("hello"));

//toUppercase() - used to convert the lower case to upper case letter

System.out.println(a.toUpperCase());

//toLowercase() - used to convert the upper case to lower case letter

System.out.println(a.toLowerCase());

//isEmpty() - to check whether a string is empty or not

System.out.println(a.isEmpty());
System.out.println(b.isEmpty());
//equals - used to check whether 2 strings are equal or not,if equal return true else return false
String s1 ="java";
String s2 = "java";
String s3 = "Java";
String s4 = new String("java");
String s5 = new String ("java");
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3)); //false- since the cases are different
System.out.println(s1.equals(a));

//equalsignorecase() - used to check whether the values are same and ignore the case
//== operator is used to compare the object ref,meaning it if 2 variables pointing to the same memory location
// equals method is used to compare the value of objects
System.out.println(s1.equalsIgnoreCase(s3));
System.out.println(s1==s2);
System.out.println(s4.equals(s5));
System.out.println(s4==s5); //as its new keyword checks the memeory location, and as its 2 diff location gives false
//valueof() - to convert any datatype to string
 int f = 10;
 System.out.println(String.valueOf(f));
 
//trim() - remove the leading and trailing spaces in string
   
 String s6 = "    Hi to the new world    ";
 System.out.println(s6.trim());
 
 //substring() - to extract a part of the string
 System.out.println(s6.substring(7));
 System.out.println(s6.substring(7,14));
 
 
 
 
 
 
 
		 
	}
	
}
