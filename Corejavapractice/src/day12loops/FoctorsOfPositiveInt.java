package day12loops;

public class FoctorsOfPositiveInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number=5;
		for(int i=1;i<=number;i++){
			if(number%i==0){
				System.out.println(i);
			}
		}

	}

}
