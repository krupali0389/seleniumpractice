package Inheritance;
class Animal{
	void dog(){
		System.out.println("i am dog");
	}
}
class Animal1 extends Animal{
	void cat(){
		System.out.println("i am cat");
	}
}
class Animal2 extends Animal{
	void cow(){
		System.out.println("i am cow");
	}
}
class Animal3 extends Animal{
	void goat(){
		System.out.println("i am goat");
	}
}

public class Example4 {

	
	 
	
	public static void main(String[] args) {
		Animal3 e1=new Animal3();
		e1.dog();
		e1.goat();//herirarical
		Animal2 e3=new Animal2 ();
		e3.cow();
		
		
		

	}

}
