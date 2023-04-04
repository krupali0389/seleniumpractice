package day12loops;

public class ReverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 345, rev = 0, temp;
		System.out.println("Actual Number" + num);
		for (; num > 0;) {
			temp = num % 10;
			rev = rev * 10 + temp;
			num = num / 10;
			{

			}
			System.out.println("Reverse number is" + rev);
		}
		
	}

}
