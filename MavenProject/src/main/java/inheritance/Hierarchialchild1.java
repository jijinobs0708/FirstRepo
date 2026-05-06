package inheritance;

public class Hierarchialchild1 extends Hierarchialparent{
	public void callchild()
	{
	System.out.println("This is child1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierarchialchild1 obj = new Hierarchialchild1();
		obj.callchild();
		obj.callparent();
	}

}
