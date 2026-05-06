package modifier;

import accessspecifier.Accessspecifierclass;

public class Childmodifier2 extends Accessspecifierclass
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childmodifier2 obj = new Childmodifier2();
		obj.protmethod();
		obj.pubmethod();
		Accessspecifierclass obj1 = new Accessspecifierclass();
		obj1.pubmethod(); //protected accessspecifier cannot be accessed from parent
	}

}
