package Inheritance;
class father{
	void ss(){
		System.out.println("i am father");
	}
}
class Doughter extends father{
	void bb(){
		System.out.println("i am daughter");
	}
}
public class Example2 {

	
	 
	 
	public static void main(String[] args) {
		Doughter e1=new Doughter();
		e1.ss();
		e1.bb();
		

	}

}
