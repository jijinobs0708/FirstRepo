package inheritance;

public class Hrapf extends Basicdedbonus{
double totalsalary;
public void totalsal()
{
	totalsalary = basic+hra-pf-ded+bon; 
}
public void detailedslip()
{
	System.out.println("SALARY SLIP");
	System.out.println("basic:"+ basic);
	System.out.println("HRA:"+ hra);
	System.out.println("PF:"+ pf);
	System.out.println("Deduction:"+ ded);
	System.out.println("Bonus:"+ bon);
	System.out.println("Total Salary:"+ totalsalary);
}
}
