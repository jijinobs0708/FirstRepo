package inheritance;

public class Console {
	double basic;
	double ded;
	double bon;
	
public void basdedbon()
{
	double CTC = 50000;
	basic = (40.0/100)*CTC;
	ded = 12.0/100 *basic;
	bon = basic*0.10;
	System.out.println("Basic Salary :" + basic);
	System.out.println("Deduction :" + ded);
	System.out.println("bonus :" + bon);
}	
}


