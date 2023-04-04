package WhileLoop;

public class PalindromeNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum=0,temp;
		int n=33;
		while(n>0){
			i=n%10;
			sum=(sum*10)+i;
			n=n/10;
			
			{	
		if(temp==sum)
		{
			System.out.println("its palidrom");}
		else
			System.out.println("its not palidrom");

	}
		}
	}


