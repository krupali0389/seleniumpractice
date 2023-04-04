package ArrayExamples;
import java.util.Arrays;
public class Example2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]={1,2,3,5,4,89,67,30};
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		int b[]=Arrays.copyOf(a,a.length);
		System.out.println(b);
			
		}
		
		
	}
}
		

	


