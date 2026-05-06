package aggregation;

public class Aggregratechil {
	String batchname;
	int year;
	AggregatePar refer;
		public Aggregratechil(String batchname, int year,AggregatePar refer )
		{
			this.batchname = batchname;
			this.year = year;
			this.refer = refer;
			
		}
	public void display()
	{
		System.out.println("batchname =" + batchname+" "+ "Year =" + year);
		System.out.println(refer.color +" "+ refer.num);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggregatePar obj1 = new AggregatePar("red", 45);
		Aggregratechil obj = new Aggregratechil("Biomed", 2004,obj1 );
		obj.display();
	}

}
