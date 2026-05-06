package interfaceexample;

public class MultiChild implements Multipleparent1, Multipleparent2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiChild obj = new MultiChild();
		obj.display();
		obj.display2();
		obj.test();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Parent1");
	}

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("Parent2");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("testing");
		System.out.println("Hello");
	}

}
