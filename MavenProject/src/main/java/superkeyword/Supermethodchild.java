package superkeyword;

public class Supermethodchild extends Supermethodparent
{
public void display()
{
	System.out.println("Testing");
	this.sample();
}

public void sample()
{
	System.out.println("Automation");
	System.out.println(super.sum(12, 13));
}
	public static void main(String[] args) {
		
		Supermethodchild obj = new Supermethodchild();
		obj.display();
		obj.supermethod();
	}

}
