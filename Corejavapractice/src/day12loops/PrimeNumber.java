package day12loops;

public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=17;
		int temp=0;
		for(int i=2;i<=num-1;i++){
			if(num%i==0){
				temp=temp+1;
			
			}
		}
		if(temp>0){
			System.out.println("not prime");
		}else{
			System.out.println("prime");
		}
			
		
		
				
		}
			
		}
		

	


