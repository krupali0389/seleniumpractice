package ArrayExamples;

public class Example3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]={23,3,5,7,8,456,4};
		double sum=0;
		double avg;
		for(int num:a){
			sum=sum+num;}
			System.out.println(sum);
			avg=sum/a.length ;
			System.out.println(avg);
		}

	}


