package interfaceexample;

public interface ParentInterface {
	public abstract void display();
	public static final int a= 2;
	int b= 12;
	default void sum()
	{
		/*a = 3;
		b= 10;*/ //cannot initialise another value as it is declared final
		int c = a+b;
		System.out.println(c);
	}
	public static void interfaceex()
	{
		int s = 6;
		System.out.println(s);
	}
}
