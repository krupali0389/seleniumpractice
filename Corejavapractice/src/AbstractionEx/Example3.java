package AbstractionEx;
abstract class vehicle{
	
	abstract void tyres();
}
 class bike extends vehicle{
	 void tyres(){
		 System.out.println("two tyres");
	 }
	 
 }
 class Auto extends vehicle{
	void tyres(){
		System.out.println("three tyres");
	}
}
class Bus extends vehicle{
	void tyres(){
		System.out.println("six tyres");
	}
}
public class Example3 {

	
	
	 
	public static void main(String[] args) {
	Bus e1=new Bus();
		e1.tyres();

	}

}
