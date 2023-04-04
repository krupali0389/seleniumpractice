package Inheritance;

class Dd {
	int i = 12;
}

class Bb extends Dd {
	int i = 30;

	void Aa(int i) {
		System.out.println(super.i);//parent class calling
	}

}
public class Example6 {
	



	public static void main(String[] args) {
		Bb e1 = new Bb();
		e1.Aa(10);
		

	}

}
