package exceptionclass;

public class Exceptionclassname {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try
	{
		int a = 2;
	
		int b = 0;
		int c = a/b;
		System.out.println(c);//Arithmetic exception
	}
	 catch(ArithmeticException e)
	{
		System.out.println("Handled");
	}
		finally {
			System.out.println("Imp code");
		}
	System.out.println("Exit code");
		 try{
			 int[] arr = {1,2,3,4};
		 
		System.out.println(arr[4]); // arrayindex outof bound exception
		 }
		 
		 catch(ArrayIndexOutOfBoundsException f)
		 {
			 System.out.println("handled");
		 }
		/* String v = null;
		System.out.println(v.length());*/ //Nullpointer exception
	
	}

}
