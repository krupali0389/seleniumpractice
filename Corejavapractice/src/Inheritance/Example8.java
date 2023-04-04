package Inheritance;

class F {
	F() {
		System.out.println("I zero para");
	}
}

class E extends F {
	E(int a) {
		System.out.println("I am single para");
	}
	
}

class G extends E {
	G(double e) {
		super(12);
		System.out.println("i am double para");

	}
	
}
class H extends G{
	H(int a,int b){
		super(9.8);
		System.out.println("i am int int para");
	}
	
}

public class Example8 {

	public static void main(String[] args) {

		H e1 = new H(1,2);

	}

}
