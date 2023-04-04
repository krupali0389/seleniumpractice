package Methods;

public class MethodsExample3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getQuetiontAndreminder(54, 45);

	}

	static void getQuetiontAndreminder(int a, int b) {
		System.out.println("value of a:"+a);
		System.out.println("value of b:"+b);
		int quetiont = a / b;
		int reminder = a % b;
		System.out.println("Quetiont is :" + quetiont);
		System.out.println("reminder is :" + reminder);
	}

}