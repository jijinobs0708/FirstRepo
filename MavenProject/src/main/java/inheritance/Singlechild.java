package inheritance;

public class Singlechild extends Singleparent {
	
public void details()
{
	System.out.println("This is child class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Singlechild obj = new Singlechild();
obj.details();
obj.display();
Singleparent obj1 = new Singleparent();
obj1.display();

	}

}
