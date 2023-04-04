package Methods;

public class MethodOverloading2 {

	public void square(){
		System.out.println("No parameter method called");
	}
	public void square(int number){
		int square=number*number;
		System.out.println("Method with Integer Argument:"+square);
	}
	public void square(float number){
		float square=number*number;
		System.out.println("method with float Argument:"+square);
	}
	 
	 
	public static void main(String[] args) {
	MethodOverloading2 obj=new MethodOverloading2();
	obj.square(2.5f);
	obj.square();
	obj.square(3);

	}

}
