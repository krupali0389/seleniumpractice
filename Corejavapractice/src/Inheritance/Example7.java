package Inheritance;
class Ww{
	void S(){
		System.out.println("I am method S");
	}
}
class Tt extends Ww{
	void S(){
		super.S();
		System.out.println("I am override method");
	}
}
public class Example7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tt e1=new Tt();
	

	}

}
