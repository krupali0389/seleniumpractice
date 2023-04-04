package AbstractionEx;
abstract class vehicle{
	 abstract void start();
}
class car extends vehicle{
	void start(){
		System.out.println("start with key");
	}
}
class bike extends vehicle{
	void start(){
		System.out.println("start with self");
	}
}
public class Example2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//vehicle e1=new vehicle(); object not create abstract method
		car e1=new car();
		e1.start();
		bike e2=new bike();
		e2.start();

	}

}
