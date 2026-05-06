package aggregation;

public class Childaggregation {
	int roll;
	int add;
	Parentaggregation ref;
	
public Childaggregation(int roll, int add,Parentaggregation ref)
{
	this.roll = roll;
	this.add = add;
	this.ref = ref;
}
public void display()
{
	System.out.println("Roll no =" +roll+ "Add=" + add);
	System.out.println(ref.no +  ref.name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parentaggregation obj1 = new Parentaggregation(4, "Jijin");

		Childaggregation obj = new Childaggregation(21, 2934,obj1);
		obj.display();
	}

	
}
