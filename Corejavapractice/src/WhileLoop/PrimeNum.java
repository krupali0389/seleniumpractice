package WhileLoop;

public class PrimeNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2,count=0;
		int num=4;
		System.out.println("Enter n value:");
		while(i<=num/2){
			if(num%i==0){
				count++;
				
			}
			i++;
		}
		if(count==0){
			System.out.println("Number is Prime");
		}else{
			System.out.println("Number is not Prime");
		}

	}

}
