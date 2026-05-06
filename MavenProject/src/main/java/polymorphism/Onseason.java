package polymorphism;

public class Onseason {
	int price = 5000;
	
 public void discount(String month)
 {
	 if(month.equals ("June")||month.equals("July"))
	 
	 {
		double discounted = price *.40;
		System.out.println("Onseason discount: "+ " "+ discounted);
	 }
 }
}
