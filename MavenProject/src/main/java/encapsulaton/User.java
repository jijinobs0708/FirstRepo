package encapsulaton;

public class User {
private int pin;

public int getPin() {
	return pin;
}

public void setPin(int pin) {
	this.pin = pin;
}

public void validatepin()
{
	if (pin==1001)
	{
		System.out.println("Valid Pin");
	}
	else if (pin==1234)
	{
		System.out.println("Valid Pin");
	}
	else if (pin==1212)
	{
		System.out.println("Valid Pin");
	}
	
	else
	{
		System.out.println("Invalid Pin");
	}
}
}
