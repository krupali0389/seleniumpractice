package Methods;

public class MethodsExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int x=12,y=18;
		System.out.println("before swaping value of x" +x);
		System.out.println("before swaping value of y" +y);
		swapNumber(x,y);
	}
	static void swapNumber(int x,int y){
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("after swaping value of x"+x);
		System.out.println("after swapin value of y"+y);
		

	}

}
