package polymorphism;

public class Offseason extends Onseason{
	public void discount(String month)
	 {
		 if((month != "June")&&(month !="July"))
		 
		 {
			 super.discount("June");
			double discounted= price *.15;
			System.out.println("Offseason discount: "+ " " + discounted);
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Offseason obj = new Offseason();
obj.discount("Sept");
	}

}
