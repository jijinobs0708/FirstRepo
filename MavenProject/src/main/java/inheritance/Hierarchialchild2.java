package inheritance;

public class Hierarchialchild2 extends Hierarchialparent {
public void call()
{
System.out.println("This is child2");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hierarchialchild2 obj = new Hierarchialchild2();
obj.call();
obj.callparent();
	}

}
