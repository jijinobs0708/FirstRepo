package superkeyword;

public class Superconstructorchild extends Superconstructorparent{
public Superconstructorchild()
{
	super();
	System.out.println("Child COnstructor");
}
public Superconstructorchild(int a , int b)
{
	super(6,4);
	System.out.println(a+" "+b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superconstructorchild obj = new Superconstructorchild();
		Superconstructorchild obj1 = new Superconstructorchild(10,15);
	}

}
