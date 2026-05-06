package superkeyword;

public class Childdivisible extends Parentdivisible {
public void display()
{
	int value = super.sum(20, 30);
System.out.println(value);
if(value%10==0)
{
	System.out.println("Value is divisible by 10");
}
else
{
    System.out.println("Value is not divisible by 10");
}
}
public static void main(String args[])
{
	Childdivisible obj = new Childdivisible();
	obj.display();
}
}
