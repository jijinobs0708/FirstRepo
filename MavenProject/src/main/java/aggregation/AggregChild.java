package aggregation;

public class AggregChild {
	String Address;
	Aggreg ref;
	
public AggregChild(String Address, Aggreg ref)
{
	this.Address = Address;
	this.ref = ref;
	
}

public void display()
{
	
	System.out.println("Student name:"+ ref.Studentname +" " + "Roll no:"+ref.rollno);
	System.out.println("Address:"+ Address);
}
	public static void main(String[] args) {
		// TODO Auto-generated method 
Aggreg obj1 = new Aggreg("Jijin", 21);
		AggregChild obj = new AggregChild("Trivandrum", obj1);
		obj.display();
	}

}
