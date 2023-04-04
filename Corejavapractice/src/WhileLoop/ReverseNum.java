package WhileLoop;

public class ReverseNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123;
		int rev = 0;// rev=3
		while (num != 0) {
			int temp = num % 10;// 123%10=3//12%10=2
			rev = rev * 10 + temp;// 0*10+3=3//3*+10=32
			num = num / 10;// 123/10=12//12/10=1
		}
		System.out.println(rev);

	}

}
