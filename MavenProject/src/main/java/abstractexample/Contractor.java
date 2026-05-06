package abstractexample;

public class Contractor extends Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Contractor obj = new Contractor();
Employee ref = new Contractor();
System.out.println("Salary:" + ref.calculateSalary(350, 8));
	}

	@Override
	public int calculateSalary(int pay, int hr) {
		// TODO Auto-generated method stub
		return pay*hr;
	}

}