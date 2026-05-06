package interfaceexample;

public class HDFC implements RBI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI obj = new HDFC();
		obj.recurringDeposit(100000, 2, .05);
	}

	@Override
	public void recurringDeposit(double amount, int duration, double rate) {
		// TODO Auto-generated method stub
		
			double maturityAmount = amount*(1+rate*duration);
			 System.out.println("Amount deposited: " + amount);
			 System.out.println("Duration: " + duration + " years");
		        System.out.println("Interest Rate: " + (rate * 100) + "%");
			System.out.println("Maturity Amount:" + maturityAmount);
			}
			
			
		}
	


