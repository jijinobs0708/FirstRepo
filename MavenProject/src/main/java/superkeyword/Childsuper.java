package superkeyword;

public class Childsuper extends Parentsuper
{
	public void display()
	{
		System.out.println(super.color); // as we cannot call super variable in main method , have to create another meth
	}
String color = "green";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Childsuper obj = new Childsuper();
System.out.println(obj.color); //to call instance variable we have to give printing statement, in that has to call obj
obj.display();
	}

}
