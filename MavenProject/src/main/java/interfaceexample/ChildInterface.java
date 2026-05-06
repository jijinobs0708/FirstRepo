package interfaceexample;

public class ChildInterface implements ParentInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ParentInterface obj = new ChildInterface();
obj.display();
ParentInterface.interfaceex();
obj.sum();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Interface method");
	}

}
