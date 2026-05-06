package abstractexample;

public abstract class AbstractParent {
	
	public AbstractParent()
	{
		System.out.println("Testing");
		
	}

	public abstract void display();
	 public abstract int sum(int a , int b);
	  public void diff(int a, int b)
	  {
		 
		  int diffe = a-b;
		  System.out.println(diffe);
		  
	  }
	  
}
