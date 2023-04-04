package Methods;

public class MethodOverloading {

	static double res;
	 static public void square(){
		System.out.println("no parameter method called");
	}
	static public void square(int number){
		res=number*number;
		System.out.println("method with integer Argument called:"+res);
		
		
	}
	static public void square(double number){
		res=number*number;
		System.out.println("Method with double Argument called:"+res);
	}
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading.square();
		MethodOverloading.square(2.3);
	    MethodOverloading.square(4);
		

	}

}
