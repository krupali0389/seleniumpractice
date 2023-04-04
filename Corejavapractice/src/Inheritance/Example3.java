package Inheritance;
class vehicle{           //multi level inheritanc
	void scooty(){
		System.out.println("i am Scooty");
	}
}
class vehicle1 extends vehicle{
	void honda(){
		System.out.println("i am honda");
	}
}
class vehicle2 extends vehicle1{
	void passion(){
		System.out.println("i am passion");
	}
}
public class Example3 {

	
	 
	
	public static void main(String[] args) {
		vehicle2 e1=new vehicle2();
		e1.scooty();
		e1.honda();
		e1.passion();
		
		

	}

}
