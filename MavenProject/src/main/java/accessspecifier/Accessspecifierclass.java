package accessspecifier;

public class Accessspecifierclass {
public void pubmethod()
{
	System.out.println("This is a public method");
}
private void privmethod()
{
	System.out.println("This is a private method");
}
void dismethod()
{
	System.out.println("This is a default method");
}
protected void protmethod()
{
	System.out.println("This is a protected method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accessspecifierclass obj  = new Accessspecifierclass();
		obj.dismethod();
		obj.privmethod();
		obj.protmethod();
		obj.pubmethod();
	}

}
