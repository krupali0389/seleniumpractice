package day12loops;

public class CountNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ct=0;
		for(int num=123456;num>0;num=num/10)
		{
			ct++;
		}
		{
			System.out.println("Digit count is:"+ct);
		}

	}

}
