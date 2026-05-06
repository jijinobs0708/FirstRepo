package polymorphism;

public class OverridingChild extends OverridingParent
{
	public void display()
	{
		super.display();
		System.out.println("This is the child");
	}
	public int sum(int a, int b)
	{
		System.out.println(super.sum(3, 9));
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


OverridingChild obj = new OverridingChild();
obj.display();
System.out.println(obj.sum(5, 6));
obj.diff(4, 3);

}
	@Override
	public void diff(int a, int b) {
		// TODO Auto-generated method stub
		super.diff(10, 3);
		System.out.println(a-b);
		
	}
}