package abstractexample;

public class Abstractchild extends AbstractParent
{
public void display1()
{
	System.out.println("Hello");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractchild obj = new Abstractchild();
		obj.display();
		AbstractParent ref = new Abstractchild();
		ref.display();
		System.out.println(ref.sum(12, 14));
		obj.diff(3, 2);
		obj.display1();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
	System.out.println("This is the abstraction method");
	
	}

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
