package exceptionclass;

public class Exceptionclassone {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int age = 17;
		if(age>18)
		{
			System.out.println("Eligible for voiting");
			
		}
		
		else
		{
			throw new Exception("Not Eligible for voting");
		}
	}

}
