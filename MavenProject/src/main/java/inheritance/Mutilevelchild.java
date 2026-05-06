package inheritance;

public class Mutilevelchild extends Multilevelintermediate{
	public void childmethod()
	{
		System.out.println("Multilevelchild");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mutilevelchild obj = new Mutilevelchild();
obj.childmethod();
obj.intermediatemethod();
obj.parentmethod();
	}

}
